import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;
public class array {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("enter the value");
    int n = in.nextInt();
     printall(n);

}


static void printall(int a){
    for(int i=0; i<a;i++){
        System.out.println("count");
    }
}

}