import java.util.*;
import java.io.*;

public class Assignment4{
   static Scanner scanner = new Scanner(System.in);
   static String input = "";
   
   public static void main(String args[]){
      System.out.println("Enter a message. ");
      input = scanner.nextLine();
      System.out.println(algorithm1(input));
      System.out.println(algorithm2(input));
   }
   
   public static String algorithm1(String str){
      String res = "";
      int letterCount = 0;
      for(int i = 0; i <= str.length() - 1; i++){
         int count = 0;
         for(int j = 0; j <= str.length() - 1; j++){
            for(int k = 0; k <= str.length() - 1; k++){
               if(str.substring(i, i + 1).toLowerCase().equals(str.substring(k, k + 1).toLowerCase())){
                  count++;
               }
            }
         }  
            if(str.substring(i, i + 1).equals(" ")){
               res += "";
            } else if(str.indexOf(str.substring(i, i + 1).toLowerCase()) == i){
               res += (count / str.length()) + str.substring(i, i + 1);
               letterCount++;
            } else { 
               res += "";
               
            }
      }
      System.out.println("There are " + letterCount + " unique characters.");
      System.out.println("The result string is " + (str.length() - res.length()) + " letters shorter than the input string.");
      return res;
   }
   
   public static String algorithm2(String str){
      String lwr = "";
      String res = "";
      int count = 1;
      int vowelCount = 0;
      int letterCount = 0;
      for(int i = 0; i <= str.length() - 1; i++){
         if(i == 0 || i == str.length() - 1){
            if(i == 0){
               lwr += str.substring(i, i + 1);
            } else {
               if(str.substring(i, i + 1).toLowerCase().equals("a") ||
               str.substring(i, i + 1).toLowerCase().equals("e") ||
               str.substring(i, i + 1).toLowerCase().equals("i") ||
               str.substring(i, i + 1).toLowerCase().equals("o") ||
               str.substring(i, i + 1).toLowerCase().equals("u")){
                  lwr += "";
                  vowelCount++;
               } else {
                  lwr += str.substring(i);
               }
            }
         } else {
            if(str.substring(i, i + 2).toLowerCase().equals(" a") ||
            str.substring(i, i + 2).toLowerCase().equals(" e") || 
            str.substring(i, i + 2).toLowerCase().equals(" i") || 
            str.substring(i, i + 2).toLowerCase().equals(" o") ||
            str.substring(i, i + 2).toLowerCase().equals(" u")){
               lwr += str.substring(i, i + 2);
               count--;
            } else {
               if(str.substring(i, i + 1).toLowerCase().equals("a") ||
               str.substring(i, i + 1).toLowerCase().equals("e") ||
               str.substring(i, i + 1).toLowerCase().equals("i") ||
               str.substring(i, i + 1).toLowerCase().equals("o") ||
               str.substring(i, i + 1).toLowerCase().equals("u")){
                  lwr += "";
                  vowelCount++;
               } else {
                  if(count != 1){
                     lwr += "";
                     count = 1;
                  } else {
                     lwr += str.substring(i, i + count);
                  }
               }
            }
         }
      }
      for(int j = 0; j <= lwr.length(); j++){
         if(j <= lwr.length() - 1){
            if(lwr.substring(j, j + 1).equals(" ")){
               res += " ";
            } else if(lwr.indexOf(lwr.substring(j, j + 1)) != j){
               res += "";
               letterCount++;
            } else {
               res += lwr.substring(j, j + 1);
            }
         } else {
            if(lwr.indexOf(lwr.substring(j)) != j){
               res += "";
               letterCount++;
            } else {
               res += lwr.substring(j, j + 1);
            }

         }
      }
      System.out.println(vowelCount + " vowels removed.");
      System.out.println((letterCount - 1) + " letters removed.");
      System.out.println("The result string is " + (str.length() - res.length()) + " letters shorter than the input string.");
      return res;
   }
}