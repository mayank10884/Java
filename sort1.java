 import java.util.*;
public class sort1 {
    public static void Array(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        }
        public static void main(String args[]){
        // int arr[] = { 7,8,3,1,2 };
        int arr[6]=
        Scanner sc=new Scanner(System.in);
        int arr=sc.nextInt();

        //Bubble Sort
        for(int i=0;i<arr.-1;i++){
            for(int j=0; j<arr.length-i-1;j++){

                if(arr[j]>arr[j+1]){

                    //Swap
                    int temp = arr[j];
                    arr [j] = arr[j+1];
                    arr [j+1]=temp;

                }

            }
        }
        System.out.println(arr);
    }
}
     
    

