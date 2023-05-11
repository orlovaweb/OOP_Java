import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.FileRepo;
import Model.Model;
import Model.ModelHash;
import Model.Student;
import View.View;
import View.ViewEn;

public class App {

   public static void main(String[] args) throws Exception {
      // создаем список студентов
      // List<Student> students = new ArrayList<Student>();
      Student s1 = new Student("Сергей", "Иванов", 21, (long) 101);
      Student s2 = new Student("Андрей", "Сидоров", 22, (long) 111);
      Student s3 = new Student("Иван", "Петров", 22, (long) 121);
      Student s4 = new Student("Игорь", "Иванов", 23, (long) 301);
      Student s5 = new Student("Даша", "Цветкова", 25, (long) 171);
      Student s6 = new Student("Лена", "Незабудкина", 23, (long) 104);
      // students.add(s1);
      // students.add(s2);
      // students.add(s3);
      // students.add(s4);
      // students.add(s5);
      // students.add(s6);
      HashMap<Long, Student> hashStudents = new HashMap<Long, Student>();
      hashStudents.put((long) 101, s1);
      hashStudents.put((long) 111, s2);
      hashStudents.put((long) 121, s3);
      hashStudents.put((long) 301, s4);
      hashStudents.put((long) 171, s5);
      hashStudents.put((long) 104, s6);

      // FileRepo fileRepo = new FileRepo("StudentDb.txt");
      // для первого запуска, чтоб записать данные в файл
      // for(Student pers :students)
      // {
      // fileRepo.addStudent(pers);
      // }
      // fileRepo.saveAllStudentToFile();

      // Выбираем модель, с которой будем работать
      iGetModel model = new ModelHash(hashStudents);
      // iGetModel model = fileRepo;
      // iGetModel model = new Model(students);
      // Выбираем язык View
      iGetView view = new ViewEn();
      // Создаем экземпляр класса Controller с параметрами view, model
      Controller control = new Controller(view, model);
      control.run();

   }
}
