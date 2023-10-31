package AccessModifiers.ClassModiers;

import java.sql.Date;

public class Company {

  public void employeEnroled() {
    System.out.println("Employee is enroled");
  }

  // create default method
  void printName() {
    System.out.println("My name is abdifitah");
  }

  private void printCurrentData() {
    Date date = new Date(0);
    System.out.println(date.getTime());
  }

  public static void main(String[] args) {
    Company company = new Company();

    // we can access the default withing the calss
    // using instance{non static method} or calssname
    // [with static methods]
    company.printName();
  }

}
