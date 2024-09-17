import java.util.Map;
import java.util.TreeMap;

public class Graph
{
	private TreeMap<String, String> map;
	private boolean yahOrNay;

	public Graph(String line)
	{
      
	}

	public boolean contains(String letter)
	{
	   if(map.containsKey(letter)){
         return true;
      } else {return false;}
	}

	public void check(String first, String second, String placesUsed)
	{
      if(map.get(first).equals(second) || map.get(second).equals(first)){
         yahOrNay = true;
      } else {
         
      }
	}

	public String toString()
	{
		return "";
	}
}