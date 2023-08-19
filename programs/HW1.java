import java.util.*;

public class HW1 {

	public static void main(String args[]) {
		Scanner s1 = new Scanner(System.in);
		float a, b, c, d, e, m;
		System.out.println("Enter Numbers of 5 subject and get Marks percentge");
		a = s1.nextFloat();
		b = s1.nextFloat();
		c = s1.nextFloat();
		d = s1.nextFloat();
		e = s1.nextFloat();
		m = (a+b+c+d+e)*100/500;

	System.out.println("Percentage="+m);
	}
}
