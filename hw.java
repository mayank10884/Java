import java.util.Scanner;
public class hw {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // System.out.print("Enter Row and Column Number: ");
        int row=sc.nextInt();
        int coloum=sc.nextInt();

        int[][] numbers=new int [row][coloum];
        //input
        for (int i=0;i<row;i++){
            for(int j=0;j<=coloum-1;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<coloum-1;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
