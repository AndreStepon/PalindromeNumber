import java.util.Scanner;

public class Palindromes {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to check if it is Palindrome number: ");

        int originalNumber = sc.nextInt();
        
        int reversedNumber = 0;
        int tempNumber = originalNumber;
        while (tempNumber > 0) {
        	int remainder = tempNumber %10;
        	reversedNumber = reversedNumber * 10 + remainder;
        	tempNumber = tempNumber / 10;
        	
        }
        if (originalNumber == reversedNumber) 
        	System.out.println("Number is Palindrome number");
        	else
        		System.out.println("Number is NOT Palindrome number");
        }
        	
        
	}


