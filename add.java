import java.util.Scanner;
public class add {
    public static int add(int a,int b){
        int add = a +  b;
        return add;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter first number");
        int a=sc.nextInt();
        // System.out.println("Enter first number");
        System.out.println("Enter second number");
        int b=sc.nextInt();
        // System.out.println("Enter second number");

        int add=add(a,b);
        System.out.println("The sum of a and b= "+add);

    }
    
}
