/*To get a pattern like this
******
******
******
******
******
*******/
public class Pattern1 {
    public static void main(String args[]){
        int ip = 5;
        for(int i = 0; i <= ip; i++){
            for(int j = 0; j <= ip; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
