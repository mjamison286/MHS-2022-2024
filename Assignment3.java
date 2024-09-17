import java.util.*;

class Assignment3{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      String confirmation = "yes";
      String answer;
      String name;
      int ans;
      System.out.println("What is your name? ");
      name = scan.nextLine();
      System.out.println("Are you ready to crack the code, " + name + "?");
      answer = scan.nextLine();
      String yon = answer.toLowerCase();
      if(yon.equals(confirmation)){
         System.out.println("Enter a string.");
         answer = scan.nextLine();
         if(answer.length() == 5){
            System.out.println("Enter an integer");
            ans = scan.nextInt();
            if(ans == 20 || ans >= 44 && ans <= 61 && ans != 50){
               System.out.println("Enter another integer");
               ans = scan.nextInt();
               if(ans % 2 == 0 || ans % 3 == 1){
                  System.out.println("Welcome, Agent " + name + ".");
               } else {
                  System.out.println("Access Denied.");
               }
            } else {
               System.out.println("Access Denied.");
            }
         } else {
            System.out.println("Access Denied.");
         }
      } else {
         System.out.println("Access Denied.");
      }
   }
}