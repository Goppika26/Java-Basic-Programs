import java.util.*;
public class Zeros
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of m: ");
		int m = sc.nextInt();
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		for(int i = m; i <= n; i++){
		    if(m >= 0 && n < 10){
		        if(i >= 0 && i < 10){
		            System.out.print(i+" ");
		        }
		        
		    }
		    else if(m >= 0 && n <= 10){
		        if(i >= 0 && i < 10){
		            System.out.print("0"+i+" ");
		        }
		        else{
		            System.out.print(i);
		        }
		        
		    }
		     else if(m >= 0 && n < 100){
		        if(i >= 0 && i < 10){
		            System.out.print("0"+i+" ");
		        }
		        else if(i >= 10 && i < 100){
		            System.out.print(i+" ");
		        }
		        
		    }
		    else if(m >= 0 && n <= 100){
		        if(i >= 0 && i < 10){
		            System.out.print("00"+i+" ");
		        }
		        else if(i >= 10 && i < 100){
		            System.out.print("0"+i+" ");
		        }
		        else{
		            System.out.print(i);
		        }
		    }
		    else if(m >= 0 && n < 1000){
		        if(i>=0 && i < 10){
		            System.out.print("00"+i+" ");
		        }
		        else if(i >= 10 && i < 100){
		            System.out.print("0"+i+" ");
		        }
		        else if(i >= 100 && i < 1000){
		            System.out.print(i+" ");
		        }
		    }
		}
	}
}