/*6) Reverse a Number
	input = 341
	output = 143

	input = 976
	output = 679*/
import java.util.*;
public class Reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to reverse: ");
        int n = sc.nextInt();
        int rev = 0, rem = 0;
        while(n > 0){
            rem = n % 10;
            rev = (rev*10)+rem;
            n = n/10;
        }
        System.out.println("The reversed number is "+ rev);
    }
    
}
