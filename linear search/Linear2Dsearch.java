import java.util.Scanner;
public class Linear2Dsearch {
    public static void main(String[] args){
        int target;
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the 2D array");
        for(int i = 0; i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j] = in.nextInt();
            }
        }
        //show the 2D array
        System.out.println("The 2D array:");
        for(int i = 0; i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Enter the target element to search:");
        target = in.nextInt();
        for(int i = 0; i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j] == target){
                    System.out.println("Found at Index: " + i + " " + j);
                }
            }
        }
             

    }
    
}
