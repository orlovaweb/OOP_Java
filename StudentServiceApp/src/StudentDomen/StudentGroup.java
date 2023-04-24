package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> students;
    private long groupID;

    public StudentGroup(List<Student> students, long groupID) {
        this.students = students;
        this.groupID = groupID;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public long getGroupID() {
        return groupID;
    }

    public void setGroupID(long groupID) {
        this.groupID = groupID;
    }

    // @Override
    // public Iterator<Student> iterator() {
    // return new StudentGroupIterator(students);
    // }

    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < students.size();
            }

            @Override
            public Student next() {
                if (!hasNext()) {
                    return null;
                }
                // counter++;
                return students.get(index++);
            }

        };
    }

    @Override
    public int compareTo(StudentGroup o) {
        if (this.students.size() == o.getStudents().size()) {
            return 0;
        }
        if (this.students.size() < o.getStudents().size()) {
            return -1;
        }
        return 1;
    }

}
