import java.util.*;
public class Minimum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int min = 0, rem = 0;
        while(n > 0){
            rem = n % 10;
            min = min < rem ? min : rem;
            n = n / 10;
        }
        System.out.println("The minimum number is "+ rem);
    }
    
}
