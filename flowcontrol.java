package Lab1;
import java.util.Scanner;
class flowcontrol {
	public static void main(String[] args) {
	int input = 0;
	

	
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the number: ");
		  input = sc.nextInt();
		  
		  int number = input;
		  int counter = 0;
		  
		  while(number>0) {
			  int t = number%10;
			  System.out.println("Cube of " +t+ " is " +(t*t*t));
			  counter = counter +1;
			  number = number/10;
			  
		  }
	

	}

}
