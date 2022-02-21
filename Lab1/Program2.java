import java.util.*;

class Program2
{
public static void main(String args[])
	{
Scanner sc = new Scanner(System.in);

		System.out.println("Select oneby pressing 1 or 2 or 3");
		System.out.println("1.Red 2.Yellow 3.Green");

int select = sc.nextInt();
	
switch(select)
{
case 1: System.out.println("Stop");
break;

case 2: System.out.println("Ready");
break;

case 3: System.out.println("Go");	
break;
}
}
}