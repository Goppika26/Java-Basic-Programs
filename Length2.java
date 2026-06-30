/*Find the length of the number
	input = 52357
	output = 5*/
import java.util.*;
public class Length2 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int length = String.valueOf(n).length();
        System.out.println("The length is: "+ length);
    }
}
