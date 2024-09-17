import java.util.*;
import java.io.*;

public class Visualizer{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      System.out.println("What shape do you want? "); System.out.println("2 - square "); System.out.println("3 - cube "); System.out.println("4 - tesseract "); int ans = scan.nextInt();
      if(ans == 2){
         System.out.println("What dimensions will your perfect square be? ");
         int dim = scan.nextInt();
         String [][] sq = new String [dim][dim];
         System.out.println("Created a square with an area of " + (int) (Math.pow(dim, 2)));
         System.out.println("What is the x of the spot that is filled in? ");
         int x = scan.nextInt();
         System.out.println("What is the y of the spot that is filled in? ");
         int y = scan.nextInt();
         for(int i = 0; i < sq.length; i++){
            for(int j = 0; j < sq[i].length; j++){
               sq[j][i] = "-";
            }
         }
         sq[y - 1][x - 1] = "x";
         for(int i = sq.length - 1; i >= 0; i--){
            int count = 0;
            for(int j = 0; j < sq.length; j++){
               if(count % dim == 0){
                  System.out.print("\n");
               }
               System.out.print(sq[j][i] + " ");
               count++;
            }
         }
         
      } else if(ans == 3){
         System.out.println("What dimensions will your perfect cube be? ");
         int dim = scan.nextInt();
         boolean [][][] cu = new boolean [dim][dim][dim];
         System.out.println("Created a cube with an area of " + (int) (Math.pow(dim, 3)));
         
      } else if(ans == 4){
         System.out.println("What dimensions will your perfect tesseract be? ");
         int dim = scan.nextInt();
         boolean [][][][] te = new boolean [dim][dim][dim][dim];
         
      } else {
         System.out.println("Choose a different option and start over.");
      }
   }
}