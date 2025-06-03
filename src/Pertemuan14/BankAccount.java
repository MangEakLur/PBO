package Pertemuan14;

//File: BankAccount.java
public class BankAccount {
 private final String accountNumber; // Tidak bisa diubah setelah di-set
 protected double balance;

 public BankAccount(String accountNumber) {
     this.accountNumber = accountNumber;
     this.balance = 0;
 }

 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
     }
 }

 public final void displayAccountInfo() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Balance       : " + balance);
 }
}
