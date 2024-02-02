import java.util.Scanner;
public class array5 {
    public static void main (String args[]){
        Scanner sc= new Scanner (System.in);
        int row=sc.nextInt();
        int coloum=sc.nextInt();

        int numbers[][]=new int[row][coloum];

        //Input
        for(int i=0;i<row;i++){
            for(int j=0;j<coloum;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt();

        //Output
        for(int i=0;i<row;i++){
            for(int j=0;j<coloum;j++){
                if (numbers[i][j]==x){
                    System.out.println("X is found("+ i +","+ j +")");
                }

            }
        }
    }
    
}
