package NonAcessModifiers;

// removed final
abstract class Animal {

  public void hello() {
    System.out.println("Hello good day sir");
  }

  abstract public void abstractBoy();

  public void sayGoodBay() {
    System.out.println("Hey good aby to anyone");
  }

  public final void finalMethod() {
    System.out.println("I am final method");
  }
}

class Cat extends Animal {

  @Override
  public void abstractBoy() {
    System.out.println("Iam abstrac boy");
  }//

}

public class FinalExample {

  public static void main(String[] args) {

    // example for final variable
    final String name = "Abdifitah Abdulkaidr Mohamed";

    Animal animal = new Cat();
    animal.hello();
    animal.sayGoodBay();
    animal.abstractBoy();

  }

}
