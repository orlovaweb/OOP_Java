package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentFlow implements Iterable<StudentGroup> {
  private List<StudentGroup> flow;

  public StudentFlow(List<StudentGroup> flow) {
    this.flow = flow;
  }

  public List<StudentGroup> getFlow() {
    return flow;
  }

  public void setFlow(List<StudentGroup> flow) {
    this.flow = flow;
  }

  @Override
  public Iterator<StudentGroup> iterator() {
    return new Iterator<StudentGroup>() {
      private int index = 0;

      @Override
      public boolean hasNext() {
        return index < flow.size();
      }

      @Override
      public StudentGroup next() {
        if (!hasNext()) {
          return null;
        }
        // counter++;
        return flow.get(index++);
      }

    };
  }
}
