package Pertemuan14;

//File: TestCounter.java
public class TestCounter {
 public static void main(String[] args) {
     new Counter();
     new Counter();
     new Counter();

     System.out.println("Total objects created: " + Counter.getInstanceCount());
 }
}

