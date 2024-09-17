import java.util.*;
import java.io.*;
public class CaughtSpeeding {
   public static void main(String [] args) throws IOException{
      try (Scanner in = new Scanner(System.in)){
         int testCases = Integer.parseInt(in.nextLine());
         for (int i = 0; i < testCases; i++){
            int t = in.nextInt();
            boolean birthday = in.nextBoolean();
            if((t <= 60 && !birthday) || (t <= 65 && birthday)){
               System.out.println("no ticket");
            } else if((t > 60 && t <= 80 && !birthday) || (t > 65 && t <= 85 && birthday)){
               System.out.println("small ticket");
            } else if((t > 80 && !birthday) || (t > 85 && birthday)){
               System.out.println("big ticket");
            }
         }
      }
   }
}