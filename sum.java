import java.util.*;
public class sum {
    public static int add(int a,int b){
        int add=a+b;
        return add;
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int add = add(a,b);
        System.out.println(add);
    }
    
}
