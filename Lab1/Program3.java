import java.util.*;

class Program3
{
  public static int fibonacii(int n)
{
  int n1=1;
  int n2=1;
  int n3=n1+n2;
 if(n==0)
return 0;
else if (n==1 ||n==2)
return 1;
while(n>2)
{
 n3=n1+n2;
 n1=n2;
 n2=n3;
 n--;
}
return n3;
}
public static int fibonacii1(int n)
{
  if (n==1 || n==0)
{
return 0;
}
return  fibonacii1(n-1)+fibonacii1(n-2);
}
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int res1=fibonacii(n);
 System.out.println(n+"value of fib sequence is"+res1);
 int res2=fibonacii1(n);
 System.out.println(n+"value of fib sequence is"+res2);
}
}
