/*Find the Factorial of a Number
ip : 3 // 3*2*1 4 => 4*3*2*1
op : 6*/
import java.util.*;
public class Factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int n = sc.nextInt();
        int value = 1;
        for(int i = 1; i <= n; i++){
            value *= i;
        }
        System.out.print("The factorial of " +n+" is "+value +" ");
    }
    
}
