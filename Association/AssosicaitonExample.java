package Association;

import java.util.ArrayList;

// teacher has subject eihter 0 or more
class Teacher {
  private String teacherId;
  private String name;
  private int age;
  private ArrayList<String> subjects;

  Teacher(String teacherId, String name, int age, String subject) {
    this.age = age;
    this.name = name;
    this.subjects.add(subject);
    this.teacherId = teacherId;

    System.out.println("I maher inside teahcer");
  }

  @Override
  public String toString() {
    return "Teacher [teacherId=" + teacherId + ", name=" + name + ", age=" + age + ", subjects=" + subjects + "]";
  }

}

// college has teacher and departments but now let us go subject
class Colledge {
  private String name;
  private ArrayList<Teacher> teachers;

  Colledge(String name, Teacher teacher) {
    this.name = name;
    teachers.add(teacher);
  }

  @Override
  public String toString() {
    return "Colledge [name=" + name + ", teachers=" + teachers + "]";
  }

}

public class AssosicaitonExample {

  public static void main(String[] args) {

    // let us create teacher
    Teacher teacher = new Teacher("204", "Abdulahi ", 20, "java");

    Colledge colledge = new Colledge("Gardi Colledge", teacher);

  }
}