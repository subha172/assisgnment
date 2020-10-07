package assign;
import java.util.Scanner;
public class Triangle {

public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	  int a, b, c, sum;
	  System.out.println("Enter three angles of a triangle: ");
	   a=sc.nextInt();
	   b=sc.nextInt();
	   c=sc.nextInt();
	   sum = a+b+c;

	    if (sum == 180)
	        System.out.println("Triangle is valid");
	    else
	        System.out.println("Triangle is not valid");

}
}
