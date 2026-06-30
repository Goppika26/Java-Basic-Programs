/*1) Sum of digits from number
	input = 123
   	output = 6*/
import java.util.*;
public class Sumdigit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to add their digits: ");
        int n = sc.nextInt();
        int res = 0;
        while(n > 0){
            res += n %10;
            n = n / 10;
        }
        System.out.println("The sum of digits is "+ res);
    }
}