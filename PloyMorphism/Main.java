package PloyMorphism;

class MethodOverloading {

  public void dispalyName(String name) {
    System.out.println(name);

  }

  public void dispalyName(int age) {
    System.out.println(age);
  }

}

public class Main {

  public static void main(String[] args) {

    MethodOverloading methodOverloading = new MethodOverloading();

    // display fucntion with string signature
    methodOverloading.dispalyName("Abdifitah");

    // method for displya iwth int paramater signature
    methodOverloading.dispalyName(20);

  }
}
