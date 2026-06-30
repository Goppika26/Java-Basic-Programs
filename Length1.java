/*Find the length of the number
	input = 52357
	output = 5*/
import java.util.*;

public class Length1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        while(n > 0){
            count += 1;
            n = n / 10;
        }
        System.out.println("The length of the number is "+ count);
    }
    

}
