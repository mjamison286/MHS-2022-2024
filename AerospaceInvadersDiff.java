import java.util.*;
import java.io.*;

public class AerospaceInvadersDiff{
   public void go(){
      File file;
      Scanner scan;
      try{
         file = new File("1.in");
         scan = new Scanner(file);
         int cases = scan.nextInt();
         for(int i = 0; i < cases; i++){
            PriorityQueue<Ship> queue = new PriorityQueue<Ship>();
            
            int shipCount = scan.nextInt();
            scan.nextLine();
            for(int o = 0; o < shipCount; o++){
               String ship = scan.nextLine();
               String[] nameCoord = ship.split(":");
               String[] nameclass = new String[2];
               String[] coordxy = new String [2];
               nameclass = nameCoord[0].split("_");
               coordxy = nameCoord[1].split(",");
               Ship shipacc = new Ship(nameclass[0], nameclass[1], Integer.parseInt(coordxy[0]), Integer.parseInt(coordxy[1]));
               queue.add(shipacc);
            }
            
            while(queue.peek() != null){
               queue.peek().destroy(queue);
               Iterator it = queue.iterator();
               while(it.hasNext()){
                  Ship hello = (Ship) it.next();
                  hello.step();
               }
            }
         }
      } catch(Exception e){
         e.printStackTrace();
      }
   }
   
   public class Ship implements Comparable{
      String name;
      String clas;
      int x;
      int y;
      
      public Ship(String nm, String cl, int xcoord, int ycoord){
         name = nm;
         clas = cl;
         x = xcoord;
         y = ycoord;
      }
      
      public int getX(){
         return x;
      }
      
      public int getY(){
         return y;
      }
      
      public String getName(){
         return name;
      }
      
      public int compareTo(Object obj){
         Ship sh = (Ship)obj;
         if(x == sh.getX()){
            if(y > sh.getY()){
               return 1;
            } else {
               return -1;
            }
         } else {
            if(x > sh.getX()){
               return 1;
            } else {
               return -1;
            }
         }
      }
      
      public void step(){
         if(clas.equals("A")){
            x -= 10;
         } else if(clas.equals("B")){
            x-= 20;
         } else if(clas.equals("C")){
            x -= 30;
         } else {
            System.out.println("big problem with classes of ships");
         }
      }
      
      public void destroy(PriorityQueue<Ship> pqs){
         pqs.poll();
         System.out.println("Destroyed Ship: " + name + " xLoc: " + x);
      }
   }
}