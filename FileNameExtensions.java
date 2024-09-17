import java.util.*;
import java.io.*;
public class FileNameExtensions {
   public static void main(String [] args) throws IOException{
      try (Scanner in = new Scanner(System.in)){
         int testCases = Integer.parseInt(in.nextLine());
         int txtcount = 0;
         int doccount = 0;
         int outcount = 0;
         int socount = 0;
         int dllcount = 0;
         for (int i = 0; i < testCases; i++){
            String t = in.nextLine();
            if(t.indexOf("txt") != -1){
               txtcount++;
            } else if(t.indexOf("doc") != -1){
               doccount++;
            } else if(t.indexOf("out") != -1){
               outcount++;
            } else if(t.indexOf("so") != -1){
               socount++;
            } else if(t.indexOf("dll") != -1){
               dllcount++;
            }
         }
         System.out.println("txt " + txtcount);
         System.out.println("doc " + doccount);
         System.out.println("out " + outcount);
         System.out.println("so " + socount);
         System.out.println("dll " + dllcount);
      }
   }
}