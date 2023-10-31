package AccessModifiers.ClassModiers;

import AccessModifiers.ClassModiers.ThirdBranch;

public class SecondBranch {

  public static void main(String[] args) {

    // truing to acces default method of compay
    Company company = new Company();
    company.employeEnroled();

    // wow it is accessible within the package
    company.printName();

    // same for class incas we make company for default.

    ThirdBranch _thirdBranch = new ThirdBranch();

    _thirdBranch.printCurrentBranch();
  }

}
