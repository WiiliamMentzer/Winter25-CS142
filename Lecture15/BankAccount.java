// Each BankAccount object represents one user's account
// information including name and balance of money.
public class BankAccount {
  String name;
  double balance;

  public void deposit(double amount) {
    balance = balance + amount;
  }

  public void withdraw(double amount) {
    if(balance - (amount + transactionFee()) > 0) {
    balance = balance - (amount + transactionFee());
    } else {
      System.out.println(name + " you are too broke to withdraw " + amount);
    }
  }

  public double transactionFee(){
    double transactionFeeCost = 5.00;
    return transactionFeeCost;
  }

  public void transfer(BankAccount reciever, double amount){

    if (this.balance - (amount + transactionFee()) > 0){
      reciever.balance += amount;
      this.balance -= amount + transactionFee();
    } else{
      System.out.println(name + " you are too broke to transfer " + amount + " to " + reciever.name);
    }
  }

  public String toString(){
    String tempString = name + ", " + Double.toString(balance);
    return tempString;
  }
}
