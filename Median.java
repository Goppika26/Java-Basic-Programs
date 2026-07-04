import java.util.*;
public class Median{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        if(n%2 != 0){
            System.out.println(arr[n/2]);
        }
        else{
            double a = arr[n/2];
            double b = arr[(n/2) - 1];
            double c = (a+b)/2;
            System.out.println(c);
        }

    }
}