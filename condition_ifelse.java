import java.util.Scanner;

public class condition_ifelse {

    public static void main(String[] args) {

        int age;
        System.out.print("Enter Password:= ");
        Scanner obj = new Scanner(System.in);
        int pwd = obj.nextInt();
        if(age >= 18) //6789==2731
        {
            System.out.println("My Name: = ak-shgl");
            System.out.println("age = 34");
            System.out.println("Contanct = 8822442582");
            System.out.println("Add = GZB");
        } 
        else
        {
            System.out.println("Wrong Password...");
        }
    }
}