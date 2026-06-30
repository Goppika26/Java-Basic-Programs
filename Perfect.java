/*4) A perfect number is a positive integer that equals the sum of its proper divisors, 
excluding the number itself. 
Exp:- 
	input 1) 6 is a perfect number because its divisors (1, 2, and 3) 
                     add up to 6 (1 + 2 + 3 = 6). output = true
	input 2) 28, where the sum of its divisors (1, 2, 4, 7, and 14) equals 28 
                     (1 + 2 + 4 + 7 + 14 = 28). output = true
	input 3) 8 => (1+2+4 = 7) output = false*/
import java.util.*;
public class Perfect
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int n = sc.nextInt();
		int count = 0;
		for(int i = 1; i <= n / 2; i++){
		    if(n %i == 0){
		        count += i;
		    }
		}
		if(count == n){
		    
		    System.out.println("It is a perfect number");
		}
		else{
		    System.out.println("Not a perfect number");
		}
	}
}