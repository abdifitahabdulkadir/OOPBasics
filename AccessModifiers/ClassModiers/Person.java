package AccessModifiers.ClassModiers;

public class Person {

  String name;
  String age;

  protected void setName(String name) {
    this.name = name;
    System.out.println("your name is " + this.name);
  }

}
