/*6) Armstrong number 
    1)	input = 153 =>  1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 
	output = Armstrong
    2)  input = 370: 3^3 + 7^3 + 0^3 = 27 + 343 + 0 = 370 
	output = Armstrong
    3)  input 120 =>
	output = not Armstrong
    4)  input = 407: 4^3 + 0^3 + 7^3 = 64 + 0 + 343 = 407 
	output = Armstrong
    5)  input = 1634 => 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1634 
	output = Armstrong */
import java.util.*;
import java.math.*;
public class Armstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is armstrong or not: ");
        int n = sc.nextInt();
        int original = n;
        int value = 0;
        int digits = String.valueOf(n).length();
        while(n > 0){
            int digit = n % 10;
            value += Math.pow(digit, digits);
            n = n/10;
        }
        if(value == original){
            System.out.println("It is an armstrong number");
        }
        else{
            System.out.println("It is not an armstrong number");
        }
    }
}
