package NonAcessModifiers;

public class Main {

  public static void main(String[] args) {

    CreditCardPayment creditCardPayment = new CreditCardPayment(
        2020040020,
        "Abdifitah");

    creditCardPayment.pay(200);
    creditCardPayment.getBalance();
    creditCardPayment.getPaymentDetials();
  }

}
