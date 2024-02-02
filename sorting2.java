import java.util.Scanner;
public class sorting2{

    public static void printArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={7,6,1,3,0,2};

        //Bubble Sort
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){

                    //  Swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }

        }
        printArray(arr);

    }
}