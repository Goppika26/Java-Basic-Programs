/*write a program to print first 50 natural numbers and skip all divisible 5 values.

input = 50
output = 1 2 3 4 6 7 8 9 11 12 13 14 16....49*/
import java.util.*;
public class Naturalno {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 50;
        System.out.println("The first 50 natural numbers that are not divisible by 5 are ");
        for(int i = 1; i < n; i++){
            if(i%5 == 0){
                continue;
            }
            else{
                System.out.print(i + " ");
            }
        }
    }
}
