import java.io.*;
import java.util.*;

public class Whatchamacallit {
   public String[][] matrix;
   public boolean solved = false;
   
   // creates n-by-n Whatchamacallit with no open spots
   public Whatchamacallit(int n){
      matrix = new String[n][n];
      for(int i = 0; i < matrix.length; i++){
         for(int o = 0; o < matrix[i].length; o++){
            matrix[i][o] = "X";
         }
      }
   }
   
   // opens the spot (r, c) if it is not open already
   public void open(int r, int c){
      if((!isOpen(r, c)) && (!isFull(r, c))){
         matrix[r][c] = "O";
         fillPoint(r, c);
      }
   }  
   
   // returns true if the spot (r, c) is open, false otherwise
   public boolean isOpen(int r, int c){
      if(matrix[r][c].equals("O")){
         return true;
      } else {
         return false;
      }  
   }
   
   // returns true if the spot (r, c) is full, false otherwise
   public boolean isFull(int r, int c){
      if(matrix[r][c].equals("F")){
         return true;
      } else {
         return false;
      }
   }
   
   // returns the number of open spots
   public int numberOfOpenSpots(){
      int count = 0;
      for(int i = 0; i < matrix.length; i++){
         for(int o = 0; o < matrix[i].length; o++){
            if(isOpen(i, o) || isFull(i, o)){
               count++;
            }
         }
      }
      return count;
   }
   
   public void fillPoint(int r, int c){
      if(isOpen(r, c)){
      if(r - 1 >= 0 && r <= matrix.length - 1 && c >= 0 && c <= matrix.length - 1){
         if(matrix[r - 1][c].equals("F")){
            matrix[r][c] = "F";
         }
      }
      
      if(r >= 0 && r + 1 <= matrix.length - 1 && c >= 0 && c <= matrix.length - 1){
         if(matrix[r + 1][c].equals("F")){
            matrix[r][c] = "F";
         }
      }
      
      if(r >= 0 && r <= matrix.length - 1 && c - 1 >= 0 && c <= matrix.length - 1){
         if(matrix[r][c - 1].equals("F")){
            matrix[r][c] = "F";
         }
      }
      
      if(r >= 0 && r <= matrix.length - 1 && c >= 0 && c + 1 <= matrix.length - 1){
         if(matrix[r][c + 1].equals("F")){
            matrix[r][c] = "F";
         }
      }
      if(r == matrix.length - 1){
         matrix[r][c] = "F";
      }
      }
   }
   
   // returns true if there exists an orthagonal path from the // bottom row to the top row, false otherwise
   public boolean connection(){
      for(int i = 0; i < matrix.length; i++){
         if(isFull(0, i)){
            return true;
         }
      }
      return false;
   }
   
   public static int run(int n){
      Whatchamacallit m = new Whatchamacallit(n);
      while(!m.solved){
         m.open(((int)(Math.random() * m.matrix.length)), ((int)(Math.random() * m.matrix.length)));
         for(int i = 0; i < m.matrix.length; i++){
            for(int o = 0; o < m.matrix[i].length; o++){
               m.fillPoint(i, o);
            }
         }
         m.solved = m.connection();
      }
      return m.numberOfOpenSpots();
   }
   
   // unit test (required)
}