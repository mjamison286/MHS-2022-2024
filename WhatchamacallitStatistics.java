import java.io.*;
import java.util.*;

public class WhatchamacallitStatistics{
   private int[] spots;
   private long elapsedTime;
   private double tris;
   
   public WhatchamacallitStatistics(int n, int trials){
      tris = trials;
      spots = new int[trials];
      long startTime = System.currentTimeMillis();
      for(int i = 0; i < trials; i++){
         spots[i] = Whatchamacallit.run(n);
      }
      long endTime = System.currentTimeMillis();
      elapsedTime = endTime - startTime;
   }
   
   public double mean(){
      int tot = 0;
      for(int i = 0; i < spots.length; i++){
         tot += spots[i];
      }
      return tot / tris;
   }   
   
   public double standardDeviation(){
      double mean = mean();
      double totSq = 0;
      for(int i = 0; i < spots.length; i++){
         totSq += Math.pow((spots[i] - mean), 2);
      }
      double variance = totSq / spots.length - 1;
      return Math.sqrt(variance);
   }
   
   public double confidenceLow(){
      return mean() - (standardDeviation()/Math.sqrt(tris));
   }
   
   public double confidenceHigh(){
      return mean() + (standardDeviation()/Math.sqrt(tris));  
   }
   
   public static void main(String[] args){
      WhatchamacallitStatistics w = new WhatchamacallitStatistics(10, 100);
      
      System.out.println("mean: " + w.mean());
      System.out.println("standard deviation: " + w.standardDeviation());
      System.out.println("confidence low: " + w.confidenceLow());
      System.out.println("confidence high: " + w.confidenceHigh());
      System.out.println("elapsed time: " + w.elapsedTime + " ms");
   }
}