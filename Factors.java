/*5) Count the Number of Factors of a Given Number from 1 to number itself
	input = 12
	Output: 6

	input = 5
	output = 2*/
import java.util.*;
public class Factors {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its number of factors: ");
        int n = sc.nextInt();
            int rem = 0; 
            for(int i = 1; i <= n/2; i++){
            if(n%i == 0){
                rem += 1;
            }
        }
        System.out.println("The factors of the number are "+ rem);
    }
}
