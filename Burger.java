import java.util.*;

public class Burger implements Food, Comparable{
   private String category;
   private int cals;
   private boolean cooked;
   
   public Burger(){
      category = "junk";
      cals = 800;
      cooked = true;
   }
   
   public boolean eat(){
      return true;
   }
   
   public int getCal(){
      return cals;
   }  
   
   public String getCategory(){
      return category;
   }
   
   public boolean isCooked(){
      return cooked;
   }
   
   public int compareTo(Object o){
      Burger x = (Burger) o;
      return this.category.compareTo(x.getCategory());
   }
}