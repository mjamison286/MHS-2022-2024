public class BaseballPlayer {

   private String lastName;
   private int playerNumber;
   private String teamName;
   private int homeRuns;
   private int doubles;
   private int hits;

   public BaseballPlayer(String nm, String tm, int plyrnum, int hrs){
      lastName = nm;
      teamName = tm;
      playerNumber = plyrnum;
      homeRuns = hrs;
   }
   
   public String toString(){
      return lastName + ", number " + playerNumber + " for the " + teamName + ", has " + homeRuns + " home runs!" + "\n"; 
   }




}