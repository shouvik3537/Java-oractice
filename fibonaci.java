import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.println("enter the length of fibonaci series");
     int n = in.nextInt();
     in.close();
     int i = 2;
     int first = 0, second = 1,temp=0;
     System.out.print("fibonaci series" + "0 1 ");
     while(i<=n){
        temp= first + second;
        first = second;
        second = temp;
        i++;
        System.out.print(temp + " ");
     }

    }
}