import java.util.*;

public class FruitBowl implements Food, Comparable{

   private String category;
   private int cals;
   private boolean cooked;
   
   public FruitBowl(){
      category = "healthy";
      cals = 500;
      cooked = false;
   }  
   
   public boolean eat(){
      return true;
   }
   
   public boolean isCooked(){
      return cooked;
   }
   
   public int getCal(){
      return cals;
   }
   
   public String getCategory(){
      return category;
   }
   
   public int compareTo(Object o){
      FruitBowl x = (FruitBowl) o;
      return this.category.compareTo(x.getCategory());
   }
}