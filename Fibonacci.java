/*Generate the Fibonacci Sequence up to N Terms
	input = 10
	Output: 0 1 1 2 3 5 8 13 21 34 */
import java.util.*;
public class Fibonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        if(n <= 0){
            System.out.print("Enter a number that is greater than 0");
        }
        else{
            int first = 0;
            int second = 1;
            for(int i = 1; i <= n; i++){
                System.out.print(first + " ");
                int next = first + second;
                first = second;
                second = next;
            }
        }
    }
    
}
