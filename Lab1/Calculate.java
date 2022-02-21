
class Calculate{

 static int calculatesum(int N)
{
    int sum=0;
for(int num=0;num<N;num++)
      {
      if (num % 3==0 && num%5==0)
     System.out.println(num+ "");
       }
      return sum;
}
public static void main(String [] args)
{
  int N=100;
  calculatesum(N);
  System.out.println("sum:"+N);
}
}