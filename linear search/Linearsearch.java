import java.util.Scanner;
public class Linearsearch {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int[] numbs = new int[6];
        for(int i=0;i<6;i++){
            numbs[i] = in.nextInt();
        }
        in.close();
        for(int i=0;i<6;i++){
            System.out.println(numbs[i]);
        }
    }

}