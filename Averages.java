import java.util.*;
import java.io.*;

public class Averages{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      System.out.println("How many grades do you have? ");
      int[] grades = new int [scan.nextInt()];
      int total = 0;
      for(int i = 0; i < grades.length; i++){
         System.out.println("Enter a grade. ");
         grades[i] = scan.nextInt();
         total += grades[i];
      }
      System.out.println("Your average is " + total / grades.length);
   }
}