public class Drone{
   private double xPos;
   private double yPos;
   private int alt;
   private String name;
   
   public Drone(){
      alt = 0;
      xPos = 10;
      yPos = 5;
      name = "W-1-N";
   }
   
   public Drone(String nm, double x, double y, int a){
      alt = Math.abs(a);
      xPos = Math.abs(x);
      yPos = Math.abs(y);
      name = nm;
   }
   
   void flyTo(double x, double y){
      xPos = Math.abs(x);
      yPos = Math.abs(y);
   }
   
   void climb(int f){
      alt += f;
   }
   
   void dive(int f){
      if(f > alt || f == alt){
         alt = 0;
      } else {
         alt -= f;
      }
   }
   
   int getAlt(){
      return alt;
   }
   
   double getXCoordinate(){
      return xPos;
   }
   
   double getYCoordinate(){
      return yPos;
   }
   
   double distTo(Drone other){
      double xPos2 = other.getXCoordinate();
      double yPos2 = other.getYCoordinate();            
      double xDiff = xPos2 - xPos;
      double yDiff = yPos2 - yPos;
      double dist = Math.sqrt((xDiff * xDiff) + (yDiff * yDiff));
      return dist;
   }
   
   public String toString(){
      return name + " @ (" + xPos + ", " + yPos + ") Altitude of " + alt + " feet. "; 
   }
}