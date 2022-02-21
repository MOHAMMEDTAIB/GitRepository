class SecondSmallestInArray{
 public static int getsecondsmallest(int[]a,int total)
{
 int temp;
for(int i=0;i<total;i++)
{
for(int j=i+1;j<total;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
return a[1];
}
public static void main(String args[])
{
int a[]={1,5,6,2,7};
int b[]={55,98,22,11,56};
System.out.println("Second smallest:"+getsecondsmallest(a,5));
System.out.println("Second smallest:"+getsecondsmallest(b,5));
}
}

