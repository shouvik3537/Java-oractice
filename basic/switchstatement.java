import java.util.Scanner;
public class switchstatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        switch(n){
            case 1 : System.out.println("one");
            break;
            case 2 : System.out.println("second");
            break;
            case 3: System.out.println("thrid");
            break;
            default : System.out.println("wrong");
            
        }
    }
}
