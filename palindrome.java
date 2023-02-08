import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("input a number");
        int n = in.nextInt();
        int x = swapnum(n);
        if(n == x){
            System.out.println("Its a palindrom number");
        }
        else 
        System.out.println("its not a palindrome number");
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
