import java.util.*;
import java.io.*;

public class Kid implements Human, Comparable{
   public String name = "";
   public void move(){
      System.out.println(true);
   }
   
   public String isName(String s){
      if(s.equals(name)){
         return s;
      } else {
         return "nah";
      }
   }
   
   public int getAge(){
      return 1;
   }
   
   public int compareTo(Object o){
      Kid x = (Kid) o;
      return x.name.compareTo(this.name);
   }
}