import java.util.*;
class Aadi
{
    public static void main(String [] args)
    {
        int a,b,ch;
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter First Number");
    a=sc.nextInt();
    System.out.println("Enter Second Number");
    b=sc.nextInt();
    System.out.println("Enter your Choice 1-> Add 2-> Subtract 3-> Multiply 4-> Divide \n Enter your Choice");
    ch=sc.nextInt();
    if(ch==1)
    System.out.println("Addition="+(a+b));
     if(ch==2)
    System.out.println("Subtract="+(a-b));
     if(ch==3)
    System.out.println("Multiply="+(a*b));
     if(ch==4)
    System.out.println("Divide="+(a/b));
    else
    System.out.println("Invalid Choice");
    }
}