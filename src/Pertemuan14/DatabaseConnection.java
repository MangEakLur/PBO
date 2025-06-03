package Pertemuan14;

//File: DatabaseConnection.java
public class DatabaseConnection {
 public static String connectionString;

 static {
     // Static block dieksekusi hanya sekali saat class pertama kali diload
     connectionString = "jdbc:mysql://localhost:3306/mydatabase";
     System.out.println("Database connection initialized.");
 }
}

