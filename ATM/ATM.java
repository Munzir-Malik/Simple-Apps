/*********************      This is ATM simultion program       *********************/
/*In this app i tried to applicat most of the basics of Java language,
  and I will improve this program while I am learning new stuff in the language to practice...*/
// You will find the details and enhancements in the README file.
// Enioy :

import java.util.Scanner;

public class ATM {
  private int balance = 1000;
  private int transactionLimit = 1000;

  //Method to view balance
  public void getBalance(){
    System.out.println("Your curent balance is: " + this.balance);
  }

  //Method to deposite money
  public void depositeMoney(int amount){
    if (amount > this.transactionLimit) {
      System.out.println("Transaction limit exceeded!");
    }
    else if(amount > 0){
      this.balance = this.balance + amount;
      System.out.println("Your curent balance is: " + this.balance);
    }
    else System.out.println("Invalid amount.");

  }
  //Method to withdraw money
  public void withdrawMoney(int amount){
    if (amount > this.transactionLimit) {
      System.out.println("Transaction limit exceeded!");
    }
    else if (amount < 0){
      System.out.println("Invalid amount.");
    }
    else if(amount > this.balance) {
      System.out.println("You have not enough balance.");
      System.out.println( "\"Check your balance or depsite some money and try again.\"");
    }
    else {
        this.balance = this.balance - amount;
        System.out.println("Your curent balance is: " + this.balance);
    }
  }

  //Method to clear screen
  public void cls(){
    for(int i = 1; i <= 50; i++){
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int choice, amount;


    Scanner input = new Scanner(System.in);

    ATM atm = new ATM();

    System.out.println("Welcome to \'Munzir\' ATM... ");

    while (true) {
      System.out.println("\n1. Check Balance\n" + "2. Deposit Money\n" + "3. Withdraw Money\n" + "4. Exit");
      System.out.println("Note: The maximum amount you can withdraw or depsoite in each process is: 1000");
      System.out.print("Please choose an option: ");

      choice = input.nextInt();
      switch (choice) {
        case 1: 
          atm.cls();
          atm.getBalance();
          break;
      
        case 2: 
          System.out.println("Enter the amount to deposit: ");
          amount = input.nextInt();
          atm.cls();
          atm.depositeMoney(amount);
          break;
      
        case 3: 
          System.out.println("Enter the amount to withdraw: ");
          amount = input.nextInt();
          atm.cls();
          atm.withdrawMoney(amount);
          break;
      
        case 4: 
        atm.cls();
          System.out.println("Thank you for using \'Munzir\' ATM. Goodbye!");
          input.close();
          return;
      
        default: 
          System.out.println("Invalid choice number");
          break;
        
      }
    
    }
  }

}
