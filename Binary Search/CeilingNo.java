import java.util.Scanner;
public class CeilingNo{

    public static void main(String[] args){
        int[] arr = {2,5,8,10,14,15,19,25};
        Scanner in = new Scanner(System.in);
        System.out.println("enter the target element");
        int x = in.nextInt();
        int index = FindCeiling(arr,x);
        System.out.println(arr[index]);
        in.close();
    }
    static int FindCeiling(int ar[], int target){
        int mid=0,end,start;
        start = 0; end = ar.length-1;
        while(start<=end){
            mid = (start+end)/2;
            if(ar[mid] == target){
                return mid;
            }
            else if(target<ar[mid]){
                end = mid-1;
            }
            else{
                start = mid + 1;
            }
            
        }
        if(ar[mid]<target){
          return mid + 1;      
        }
        return mid;
    }

}