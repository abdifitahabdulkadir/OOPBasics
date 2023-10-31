package BasicRequests;

class FanExmaple {

  // instance variables
  private boolean isFanOn;
  public int number = 0;
  public static String name;

  // static method
  public static void staticMethod() {
    int localvaibale = 200;
    System.out.println("value of inside static method : " + localvaibale);
  }

  public void intialize() {
    name = "Abdifitah Abdulkadir";
  }

  public void turnOn() {
    number = 1;
    isFanOn = true;
    System.out.println("the fan is on now");
  }

  public void turnOff() {
    isFanOn = false;
    System.out.println("the fun is off now");
  }

  public FanExmaple() {
    System.out.println("I am default constructor");
  }

}

public class Fan {

  public static void main(String[] args) {
    FanExmaple _FanExmaple = new FanExmaple();
    _FanExmaple.turnOff();

    _FanExmaple.turnOn();

    System.out.println("print static variables");
    _FanExmaple.intialize();
    System.out.println("static value after first object" + FanExmaple.name);
    System.out.println("number value after first obejct" + _FanExmaple.number);
    FanExmaple.staticMethod();
    FanExmaple _FanExmaple2 = new FanExmaple();
    _FanExmaple2.intialize();
    System.out.println("static value after second object" + FanExmaple.name);
    System.out.println("number value after second object " + _FanExmaple2.number);
    FanExmaple.staticMethod();

  }

}
