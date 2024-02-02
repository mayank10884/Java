import java.util.Scanner;
public class sorting4 {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //Bubble sort
    public static void main(String args[]){
        int arr[]={7,8,1,9,3,5,7,2,1,11,4};

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){

                
            //Swap
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;

            }

        }
    
        printarr(arr);
 }
    }
    
}
