import java.util.*;

public class HelloWorldCQA{
   public static void main(String[] args){
      try(Scanner scan = new Scanner(System.in)){
         int cases = Integer.parseInt(scan.nextLine());
         for(int i = 0; i < cases; i++){
            System.out.println(scan.nextLine());
         }
      }
   }
}