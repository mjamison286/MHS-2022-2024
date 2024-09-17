import java.util.*;
import java.io.*;

public class MathHomework{
   private final double[] numbers;
   
   public MathHomework(double[] nums){
      numbers = nums;
   }
   
   public String toString(){
      String res = "{";
      for(int i = 0; i < numbers.length; i++){
         res += numbers[i];
         if(i != numbers.length - 1){
            res += ", ";
         } else {
            res += "}";
         }
      }
      return res;
   }
   
   public double average(){
      double total = 0;
      for(int i = 0; i < numbers.length; i++){
         total += numbers[i];
      }
      return total / numbers.length;
   }  
   
   public double range(){
      double max = 0.0;
      double min = numbers[0];
      for(int i = 0; i < numbers.length; i++){
         if(numbers[i] > max){
            max = numbers[i];
         }
         if(numbers[i] < min){
            min = numbers[i];
         }
      }
      return max - min;
   }
   
   public int sortStatus(){
      boolean dec = false;
      boolean inc = false;
      for(int i = 0; i < numbers.length - 1; i++){
         if(numbers[i] > numbers[i + 1]){
            dec = true;
         } else if(numbers[i] < numbers[i + 1]){
            dec = false;
            inc = true;
         } else {
            inc = false;
         }
      }
      if(dec){
         return -1;
      } else if(inc){
         return 1;
      } else {
         return 0;
      }
   }
}