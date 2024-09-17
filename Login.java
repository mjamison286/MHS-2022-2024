import java.util.*;
import java.io.*;

public class Login{
   static Scanner scanner = new Scanner(System.in);
   public static void main(String[] args){
      System.out.println("Do you have an account? ");
      System.out.println("1 for yes ");
      System.out.println("2 for no ");
      int haveAcc = scanner.nextInt();
      if(haveAcc == 1){
         
      } else if(haveAcc == 2){
         try {
            File user = new File("user.txt");
            File pass = new File("pass.txt");
            if(user.createNewFile()){
               System.out.println("File created");
            }
            
            if(pass.createNewFile()){
               System.out.println("File created");
            }
         } catch(IOException e){
            System.out.println("An error occured.");
            e.printStackTrace();
         }
         System.out.println("What do you want your username to be? ");
         String newUser = "\n" + scanner.next();
         System.out.println("What do you want your password to be? ");
         String newPass = "\n" + scanner.next();
         try {
            FileWriter userWriter = new FileWriter("user.txt");
            FileWriter passWriter = new FileWriter("pass.txt");
            userWriter.write(newUser);
            userWriter.close();
            passWriter.write(newPass);
            passWriter.close();
         } catch(IOException e){
            e.printStackTrace();
         }
         System.out.println("Account created! ");
      }
   }
}