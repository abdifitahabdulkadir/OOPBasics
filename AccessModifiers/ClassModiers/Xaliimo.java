package AccessModifiers.ClassModiers;

public class Xaliimo extends Person {

  public static void main(String[] args) {
    Person person = new Person();

    person.setName("Ahmed faarah");

    // we can create instance of person parent calss
    // using subcalss refernce
    Person xaliimo = new Xaliimo();
    xaliimo.setName("faadumo");
  }

}
