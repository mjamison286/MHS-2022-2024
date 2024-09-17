import java.util.*;
import java.io.*;

public class WeightedObject{
   private int value;
   private int weight;
   public WeightedObject(int v, int w){
      value = v;
      weight = w;
   }
   
   public int getValue(){
      return value;
   }
   
   public int getWeight(){
      return weight;
   }
}