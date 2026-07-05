import java.util.*;
public class Substr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1 and string 2: ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        if(str1.contains(str2)){
            int a = str1.indexOf(str2);
            System.out.println("The string 1 contains string 2 at index "+a);
        }
        else{
            System.out.println("The string 1 does not contain string 2");
        }
    }
}
