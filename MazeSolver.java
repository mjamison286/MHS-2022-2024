import java.util.*;
import java.io.*;

public class MazeSolver{
   private int steps;
   private boolean solved;
   private ArrayList<String> path;
   
   public MazeSolver(char[][] m){
      steps = 0;
      solved = false;
      for(int i = 0; i < m.length; i++){
         for(int o = 0; o < m[i].length; o++){
            if(m[i][o] == 'S'){
               maze(0, 0, m, solved, steps, path);
            }
         }
      }
   }

   private void maze(int r, int c, char[][] m, boolean sol, int s, ArrayList<String> p){
      if(r > -1 && r < m.length && c > -1 && c < m[r].length && m[r][c] != 'x' && !sol){
         p.add(r + ", " + c);
         if(m[r][c] == 'E'){
            sol = true;
            steps = s;
            path = p;
         }
         m[r][c] = 'x';
         maze(r - 1, c, m, sol, s + 1, path);
         maze(r + 1, c, m, sol, s + 1, path);
         maze(r, c - 1, m, sol, s + 1, path);
         maze(r, c + 1, m, sol, s + 1, path);
         m[r][c] = '.';
      }
   }
   
   public int getSteps(){
      return steps;
   }
   
   public boolean getSolved(){
      return solved;
   }
   
   public ArrayList<String> getPath(){
      return path;
   }
}