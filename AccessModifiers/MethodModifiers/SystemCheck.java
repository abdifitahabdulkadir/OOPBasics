package AccessModifiers.MethodModifiers;

// importing the calssmodifer pakcage to access company class

import AccessModifiers.ClassModiers.Company;

public class SystemCheck {

  public static void main(String[] args) {
    Company company = new Company();

    company.employeEnroled();

    // tyring to call the default method
    // i cnot not call .

    // tryaing to call private method insde the compy
    // is not coming
  }

}
