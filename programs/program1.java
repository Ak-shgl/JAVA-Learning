import java.util.Scanner;
public class program1
{
public static void main(String args[])
{
 Scanner s1=new Scanner(System.in);
            float a,b,s,m,d,sub;
            System.out.println("Enter two number");
            a=s1.nextFloat();
            b=s1.nextFloat();
            s=a+b;
            m=a*b;
            d=a/b;
            sub=a-b;
            System.out.println("sum="+s);
            System.out.println("multiply="+m);
            System.out.println("divide="+d);
            System.out.println("subtraction="+sub);
           }
}