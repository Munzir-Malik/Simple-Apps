/*********************      This is ATM simultion program       *********************/
//In this app i tried to applicat most of the basics of Java language.
// You will find the details in the README file.
// Enioy :

import java.util.Scanner;

public class ATM {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int balance = 1000, amount, choice;

    System.out.println("Welcome to \'Munzir\' ATM... \n");

    while (true) {
      System.out.println("1. Check Balance\n" + "2. Deposit Money\n" + "3. Withdraw Money\n" + "4. Exit");
      System.out.print("Please choose an option: ");

      choice = input.nextInt();
      switch (choice) {
        case 1: 
          System.out.println("Your current balance is: " +balance);
          break;
      
        case 2: 
          System.out.println("Enter the amount to deposit: ");
          amount = input.nextInt();
          balance = balance + amount;
          System.out.println("Your curent balance is: " + balance);
          break;
      
        case 3: 
          System.out.println("Enter the amount to withdraw: ");
          amount = input.nextInt();
          if(amount > balance) {
            System.out.println("You have not enough balance.");
            System.out.println( "\"Check your balance or depsite some money and try again.\"");
            continue;
          }
          else {
            balance = balance - amount;
            System.out.println("Your curent balance is: " + balance);
          }
          break;
      
        case 4: 
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
