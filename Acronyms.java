import java.util.*;
import java.io.*;

public class Acronyms{
   static Map<String, String> acronymMap = new HashMap<String, String>();
   static ArrayList<String> acroList = new ArrayList<String>();
   public static void main(String[] args){
      File file;
      Scanner scan;
      try{
         file = new File("Acronyms.txt");
         scan = new Scanner(file);
         int acronymCount = scan.nextInt();
         scan.nextLine();
         for(int i = 0; i < acronymCount; i++){
            String str = scan.nextLine();
            String[] strarr = str.split(" - ");
            acronymMap.put(strarr[0], strarr[1]);
            acroList.add(strarr[0]);
         }
         System.out.println("============ Map Contents ============" + "\n");
         for(int i = 0; i < acronymMap.size(); i++){
            System.out.println(acroList.get(i) + "=" + acronymMap.get(acroList.get(i)));
         }
         System.out.println();
         System.out.println("============ Read Lines ==============" + "\n");
         acroList.clear();
         while(scan.hasNextLine()){
            acroList.add(" " + scan.nextLine());
         }
         Object[] keyArr = acronymMap.keySet().toArray();
         String[] arr = new String[keyArr.length];
         String[] iterator = new String[arr.length];
         for(int i = 0; i < arr.length; i++){
            arr[i] = (String) keyArr[i];
            iterator[i] = " " + arr[i];
         }
         for(int i = 0; i < acroList.size(); i++){
            String str = acroList.get(i);
            for(int o = 0; o < arr.length; o++){
               if(str.contains(iterator[o])){
                  str = str.substring(0, str.indexOf(iterator[o])) + " " + acronymMap.get(arr[o]) + str.substring(str.indexOf(iterator[o]) + iterator[o].length());
               }
            }
            System.out.println(str);
         }
      } catch(IOException e){
         e.printStackTrace();
      }
   }
}