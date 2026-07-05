import java.util.*;
public class Capitalize {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String a[] = str.split(" ");
        for(int i = 0; i < a.length; i++){
            char b[] = a[i].toCharArray();
            for(int j = 0; j < b.length; j++){
                if(j == 0 || j == b.length-1){
                    b[j] = Character.toUpperCase(b[j]);
                }
            }
            a[i] = new String(b);
        }
        for(String ele: a){
            System.out.print(ele+" ");
        }
    }
}
