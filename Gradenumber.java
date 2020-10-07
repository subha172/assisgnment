package assign;

public class Gradenumber {
	public static void main(String[] args) {
		char grade;
		grade='A';
		grade='B';
		grade='C';
		grade='D';
		grade='F';
		System.out.println("Enter the grade"+grade);
		
		  switch(grade) {
	         case 'A' :
	            System.out.println("Excellent!");
	            break;
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
	
	}

