
import java.util.*;

public class JavaInternalHash
{
  public static void main(String[] args)
  {
    ArrayList<Integer> list = new ArrayList<Integer>();
    HashSet <Integer> hset=new HashSet<Integer>();
    int co=0;
    for(int i=0;i<100000000;i++)
    {
      int key = hash(i);
      if (hset.contains(key)){
      	co++;
        System.out.println(i+" "+key);
      }
      else{
      	hset.add(key);
      }
    
    }
    System.out.println(co);
  }
  static int badHash(int h){
	  return 1;
  }
  static int hash(int h) {
    // This function ensures that hashCodes that differ only by
    // constant multiples at each bit position have a bounded
    // number of collisions (approximately 8 at default load factor).
    h ^= (h >>> 20) ^ (h >>> 12);
    return h ^ (h >>> 7) ^ (h >>> 4);
}
}