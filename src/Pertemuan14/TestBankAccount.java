package Pertemuan14;

//File: TestBankAccount.java
public class TestBankAccount {
 public static void main(String[] args) {
     SavingsAccount sa = new SavingsAccount("12345678");
     sa.deposit(1000);
     sa.showDetailedInfo();
 }
}

