# ATM Simulation Program 🏧

A simple Java application that simulates basic ATM functions like checking balance, depositing money, and withdrawing money.

This is a simple ATM simulation program written in Java. The program allows users to check their balance, deposit money, withdraw money, and exit the system.
It includes several basic concepts of Java, such as encapsulation, methods, and user input handling.

## Enhancements
As part of continuous learning and improvement, the following enhancements have been made to practice in:

Encapsulation:

The balance and transactionLimit variables have been encapsulated by declaring them as private and providing public getter and setter methods to interact with them. This helps protect the integrity of the data.

Methods:

The code has been refactored to include separate methods for clear screen, checking the balance, depositing money, and withdrawing money. This makes the code more modular and easier to maintain or extend in the future.

User Feedback:

The program now includes more descriptive messages and error handling, providing users with clear feedback if they attempt invalid transactions (e.g., exceeding the transaction limit or trying to withdraw more than the available balance).

## Installation and Setup
- Clone the Repository using bash terminal
git clone <repository-url>
-open "ATM.java" file using your code editor:
Make sure you have installed JDK in you device
-Compile and run the Program by writting these two lines in the code editor`s terminal: 
javac ATM.java
java ATM

## How to Use
- Check Balance:
Select option 1 from the menu to view your current balance.

- Deposit Money:
Select option 2 to deposit money into your account. Enter the amount you wish to deposit. Note that the amount should not exceed the transaction limit.

- Withdraw Money:
Select option 3 to withdraw money from your account. Enter the amount you wish to withdraw. The program will check if the amount is within the transaction limit and if you have sufficient balance before completing the transaction.

- Exit:
Select option 4 to exit the program.

## Contribution
If you have suggestions or improvements, feel free to fork the repository and submit a pull request.


Contact 📬
For any questions or suggestions:
GitHub: Munzir-Malik

Enjoy using the program! 😊