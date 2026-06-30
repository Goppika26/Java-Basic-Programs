/*Find Largest digit from the number
	input = 56318
	output = 8*/
import java.util.*;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a num: ");
        int num = sc.nextInt(); //5631
        int max = 0, rem = 0;
        while(num > 0){ // 0
            rem = num % 10; // 5
            max = max > rem ? max : rem; // 6
            num = num / 10;
        }
        System.out.println(max);
    }
}