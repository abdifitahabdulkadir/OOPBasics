package NonAcessModifiers;

public class CreditCardPayment extends Payment {

  long cardNumber;
  float amount;
  String cardHolderName;

  CreditCardPayment(long cardNo, String cardHolderName) {
    this.cardHolderName = cardHolderName;
    cardNumber = cardNo;

  }

  private float balance = 600;

  @Override
  public void pay(float amount) {
    this.amount = amount;
    balance = balance - amount;
    System.out.println("successfully paid amount of " + amount);
  }

  float getBalance() {
    return balance;
  }

  @Override
  public void cancel() {
    System.out.println("the payment has been calceled");
  }

  @Override
  public void verifiy() {
    System.out.println("the payment has beene verified");
  }

  @Override
  public void getPaymentDetials() {
    System.out.println("paymet amount : " + this.amount);
    System.out.println("the payment card no number" + this.cardHolderName);
    System.out.println("balance is " + this.balance);
    System.out.println("status: succed ");
  }

}
