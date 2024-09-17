import java.util.*;
import java.io.*;

public class BasicTree{
   public BasicTree(){
      File file;
      Scanner scan;
      try{
         file = new File("BasicTree.txt");
         scan = new Scanner(file);
         
         ArrayList<Integer> list = new ArrayList<Integer>();
         
         while(scan.hasNextLine()){
            int num = scan.nextInt();
            if(!list.contains(num)){
               list.add(num);
            }
         }
         Collections.sort(list);
         int rootNum;
         if(list.size() % 2 == 0){
            rootNum = (list.size()/2);
         } else {
            rootNum = (list.size()/2 + 1);
         }
         add(list.remove(rootNum), null);
         
      } catch(IOException e){
         e.printStackTrace();
      }
   }  
   
   private Node add(Comparable val, Node tree){   
      if (tree == null){
         return new Node(val, null, null);
      }
      int dirTest = val.compareTo(tree.getValue());
      if(dirTest<0){
         tree.setLeft(add(val, tree.getLeft()));
      }else if(dirTest>0){
         tree.setRight(add(val, tree.getRight()));
      }
      return tree;
   }
}