import java.util.Scanner;
class Abhi
{
public static void main(String args[])
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter First Number");
a=sc.nextInt();
System.out.println("Enter Second Number");
b=sc.nextInt();
System.out.println("ENter third Number");
c=sc.nextInt();
if(a>b && a>c)
System.out.println("Max Number="+a);
if(b>a && b>c)
System.out.println("min Number="+b);
else
System.out.println("Max Number="+c);
}
}

