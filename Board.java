import java.util.*;
import java.io.*;

public class Board{
   
   private String[][] squares = new String[10][10];   
   
   public Board(){
      for(int row = 0; row < squares.length; row++){
         for(int col = 0; col < squares[row].length; col++){
            squares[row][col] = "-";
         }
      }
   }
   
   public String toString(){
      String re = "";
      for(int row = 0; row < squares.length; row++){
         for(int col = 0; col < squares[row].length; col++){
            re += squares[row][col] + " ";
         }
         re += "\n";
      }
      return re;
   }
   
   public boolean addShip(int row, int col, int len, boolean horizontal){
      if(horizontal){
         if(col + len < squares[0].length && col > -1 && row > -1){
            for(int i = col; i < col + len; i++){
               if(!squares[row][i].equals("-")){
                  return false;
               }
            }
            
            for(int i = col; i < col + len; i++){
               squares[row][i] = "b";
            }
            return true;
         } else {
            return false;
         }
      } else {
         if(row + len < squares.length && row > -1 && col > -1){
            for(int i = row; i < row + len; i++){
               if(!squares[i][col].equals("-")){
                  return false;
               }
            }
            
            for(int i = row; i < row + len; i++){
               squares[i][col] = "b";
            }
            return true;
         } else {
            return false;
         }
      }
   }
   
   public boolean foundShip(int len){
      int count = 0;
      for(int row = 0; row < squares.length; row++){
         for(int col = 0; col < squares[row].length; col++){
            if(squares[row][col].equals("b")){
               count++;
            } else {
               count = 0;
            }
            
            if(count >= len){
               return true;
            }
         }
      }

      count = 0;
     
      for(int col = 0; col < squares[0].length; col++){
         for(int row = 0; row < squares.length; row++){
            if(squares[row][col].equals("b")){
               count++;
            } else {
               count = 0;
            }  
            
            if(count >= len){
               return true;
            }
         }
      }
      return false;
   }
   
   public int shoot(int row, int col){
      if(row > -1 && col > -1 && row < squares.length && col < squares[row].length){
         if(squares[row][col].equals("b")){
            squares[row][col] = "x";
            return 1;
         } else if(squares[row][col].equals("-")){
            squares[row][col] = "m";
            return 0;
         } else {
            return 2;
         }
      } else {
         return -1;
      }
   }
   
   public boolean gameOver(){
      for(int row = 0; row < squares.length; row++){
         for(int col = 0; col < squares[row].length; col++){
            if(squares[row][col].equals("b")){
               return false;
            }
         }
      }
      return true;
   }  
}