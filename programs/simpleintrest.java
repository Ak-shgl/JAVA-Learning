import java.util.Scanner;
public class simpleintrest {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		float a,b,c,SI;
		System.out.println("Enter Amount, Rate of intrest, Time Period");
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		SI = (a*b*c)/100;
		
		System.out.println("Intrest="+SI);


}
}