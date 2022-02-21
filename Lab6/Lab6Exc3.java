import java.util.*;
 public class Lab6Exc3
{
 public static HashMap getSquares(int[] array){
 HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
for(int n: array)
{
map.put(n,n*n);
}
return map;
}
public static void main(String[] args)
{
int array[]=new int[]{1,3,5,7,9,2,4,};
HashMap<Integer,Integer> map=getSquares(array);
Iterator<Integer> it=map.keySet().iterator();
while(it.hasNext()){
Integer key=it.next();
System.out.println(key+":-"+map.get(key));
}
}
}

