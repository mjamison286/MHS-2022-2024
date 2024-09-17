import java.util.*;
import java.io.*;
public class EvenOdd {
   public static void main(String [] args) throws IOException{
      try (Scanner in = new Scanner(System.in)){
         int testCases = Integer.parseInt(in.nextLine());
         for (int i = 0; i < testCases; i++){
            int t = in.nextInt();
            if(t % 2 == 0){
               System.out.println("EVEN");
            } else {
               System.out.println("ODD");
            }
         }
      }
   }
}