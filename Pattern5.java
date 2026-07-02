/*To get a pattern like this
5
44
333
2222
11111*/
public class Pattern5 {
    public static void main(String args[]){
        int n = 5;
        for(int i = 5; i >= 1; i--){
            for(int j = 5; j >= i; j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
