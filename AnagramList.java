import java.util.*;
import java.io.*;

public class AnagramList{

   private ArrayList<String> anagrams = new ArrayList<String>();
   
   public AnagramList(String w){
      completeAnagrams("", w);
   }
   
   public void completeAnagrams(String start, String end){
      if(end.length() != 1){
            for(int i = 0; i < end.length(); i++){
            String q  = start + end.substring(i, i + 1);
            String qq = end.substring(0, i) + end.substring(i + 1);
            System.out.println(q+qq);      
            completeAnagrams(q, qq);
            
         }
      } else {
         anagrams.add(start + end);
         sortAnagrams();
      }
   }
   
   public int searchAnagrams(String target){
      if(anagrams.contains(target)){
         for(int i = 0; i < anagrams.size() - 1; i++){
            if(anagrams.get(i).equals(target)){
               return i;
            }
         }
      } else {
         return -1;
      }
      return -1;
   }
   
   public void sortAnagrams(){
      Collections.sort(anagrams);
   }
   
   
   public String toString(){
      return anagrams.size() + anagrams.toString();
   }
}