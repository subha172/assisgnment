package assign;
import java.util.Scanner;

public class Gradesys {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      int n;int count=1;
	      float num,average,sum = 0;
	      System.out.println("Enter the value of n");
	      n =sc.nextInt();
	      while(count<=n) {
	    	  System.out.println("Enter the" +count+ "number\n");
	    	  num=sc.nextInt();
	    	  sum=sum+num;
	    	  ++count;
	      }
	      average=sum/n;
	      System.out.println("Average of the number" + average);
	      char grade;

	      if(average>=90){
	         grade = 'A';
	      }else if(average>=80 && average<89){
	         grade = 'B';
	      }
	      else if(average>=70 && average<79){
	         grade = 'C';
	      }
	      else if(average>=60 && average<69) {
	         grade = 'D';
	      }
	      else {
	    	  grade='F';
	      }
	      System.out.println(grade);
	}
}
	    //  switch(grade) {
	       //  case 'A' :
	         //   System.out.println("Excellent!");
	          /*  break;
	         case 'B' :
	         case 'C' :
	            System.out.println("Well done");
	            break;
	         case 'D' :
	            System.out.println("You passed");
	         case 'F' :
	            System.out.println("Better try again");
	            break;
	         default :
	         System.out.println("Invalid grade");
	      }
	      System.out.println("Your grade is " + grade);
	   }
	
	}*/


