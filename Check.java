import java.util.*;
class Check
{
    public static  void main(String args [])
    {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        a=sc.nextInt();
        if(a>0)
        System.out.println("Positive Number");
        else
        if(a<0)
        System.out.println("Negative Number");
        else
        System.out.println(" Number is Zero");
    }
}
