import java.util.Scanner;
public class swap {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter a value");
        int n = in.nextInt();
        int swap = swapnum(n);
        System.out.println("swap number " + swap);
    }
    
    static int swapnum(int a){
        int x=0, rem;
        while(a!=0){
            rem = a%10;
            x= x*10 + rem;
            a= a/10;
        }
        return(x);
        
    }
}
