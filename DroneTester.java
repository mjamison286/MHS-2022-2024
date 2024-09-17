class DroneTester{
   public static void main(String[] args){
      Drone drone = new Drone("tht", 0, 0, 5);
      drone.flyTo(5, 5);
      drone.climb(9);
      drone.dive(10);
      System.out.println(drone);
      Drone done2 = new Drone("drone2", 5, 5, 5);
      System.out.println(drone.distTo(done2));
   }   
}