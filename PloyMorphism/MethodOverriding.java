package PloyMorphism;

class Animal {

  public void showInfo() {
    System.out.println("From animal parent");
  }

  public void age() {
    System.out.println("Age is important factor");
  }
}

class Cat extends Animal {

  public void printCatName() {
    System.out.println("I am kitty kit and cat moewww");
  }

  @Override
  public void showInfo() {

    System.out.println("kaat ktty showInfo Overrided");
  }

}

public class MethodOverriding {

  public static void main(String[] args) {

    // creating parent type class object
    Animal animal = new Animal();
    animal.showInfo();

    // create pure child type
    Cat cat = new Cat();
    cat.showInfo();

    // now calling the agefucntion which i have not override
    cat.age();

    // parent reerence with chidl obejct
    Animal animalRef = new Cat();
    animalRef.age();
    animalRef.showInfo();

  }

}
