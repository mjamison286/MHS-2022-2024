import java.util.*;
import java.io.*;

public class HistogramI{
   
   public static void main(String[] args){
      File file;
      Scanner scan;
      Map<String, Integer> histogram = new HashMap<String, Integer>();
      
      try{
         file = new File("Histogram.txt");
         scan = new Scanner(file);
         String dat = scan.nextLine(); 
         String[] datarr = dat.split(" ");
         for(int i = 0; i < datarr.length; i++){
            if(!(histogram.containsKey(datarr[i]))){
               histogram.put(datarr[i], 1);
            } else {
               histogram.put(datarr[i], histogram.get(datarr[i]) + 1);
            }
         }
         Set<String> keySet = histogram.keySet();
         String setString = keySet.toString();
         setString = setString.substring(1, setString.length() - 1);
         String[] setarr = setString.split(", ");
         for(int i = 0; i < setarr.length; i++){
            System.out.println(setarr[i] + " count = " + histogram.get(setarr[i]));
         }
      } catch(IOException e){
         e.printStackTrace();
      }
   }
}