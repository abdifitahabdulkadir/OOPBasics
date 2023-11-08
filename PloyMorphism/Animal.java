package PloyMorphism;

import java.util.ArrayList;

public class Animal {

  // attrabutees
  private String name;
  private int age;
  private int hight;
  private int colour;

  // methods
  public void move() {
    /// will be override by child class to extend
    // how does it move.
  }

  public void Walk() {
    /// will be override by child class to extend
    // how does it walk.
  }

  public void eat() {
    /// will be override by child class to extend
    // how does it eat.
  }

  public void sleep() {
    /// will be override by child class to extend
    // how does it sleep.
  }

}

class Cat extends Animal {

  // override move
  @Override
  public void move() {
    System.out.println("that cat has moved");
  }

  // override move
  @Override
  public void sleep() {
    System.out.println("that is sleeping...");
  }

  // add meow()-- sound of cat
  public void meow() {
    System.out.println("the cat has meowed....");
  }
}

class Department {
  private String departmentId;
  private String departmentName;
  private String createdAt;

  Department(String departmentId, String departmentName, String createdAt) {
    this.departmentId = departmentId;
    this.departmentName = departmentName;
    this.createdAt = createdAt;
  }
}

// teacher class
class Teacher {
  private String name;
  private String age;
  private String phone;
  private String dateOfBirth;

}

// college class
class College {
  private String name;
  private String location;
  private String createdAt;
  private ArrayList<Department> departments;

  // constructor to initliase all thes fields at runtime.
  College(String name,
      String location,
      String createdAt) {
    this.name = name;
    this.location = location;
    this.createdAt = createdAt;
  }

  public void addDepartment(Department department) {
    departments.add(department);
  }

  public void removeDepartment(Department department) {
    departments.remove(department);
  }

  public ArrayList<Department> getDepartments() {
    return departments;
  }

}
