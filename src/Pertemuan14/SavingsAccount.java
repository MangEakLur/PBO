package Pertemuan14;

//File: SavingsAccount.java
public class SavingsAccount extends BankAccount {
 public SavingsAccount(String accountNumber) {
     super(accountNumber);
 }

 // ERROR: Cannot override the final method from BankAccount
 /*
 @Override
 public void displayAccountInfo() {
     System.out.println("Trying to override final method"); // ← Error
 }
 */

 // Solusi: Buat method baru untuk kebutuhan khusus
 public void showDetailedInfo() {
     super.displayAccountInfo(); // Memanggil method final
     System.out.println("Interest Rate: 3.5%");
 }
}

