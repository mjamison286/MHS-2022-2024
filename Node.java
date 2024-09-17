import java.util.*;
import java.io.*;

public class Node{
   private Comparable data;
   private Node left;
   private Node right;
   
   public Node(Comparable dat, Node lft, Node rt){
      data=dat;
      left=lft;
      right=rt;
   }
   
   public Comparable getValue(){
      return data;
   }
   
   public Node getLeft(){
      return left;
   }
   
   public Node getRight(){
      return right;
   }
   
   public void setLeft(Node n){
      left = n;
   }
}

