public class recursion3 {
    public static void printsum(int i,int n, int sum){
        if(i==n){
            sum=i+1;
            System.out.println(sum);
            return;
        }
        sum=i+1;
        printsum(i+1, n, sum);
        System.out.println(i);
    }
    public static void main(String args[]){
        printsum(1,4,0);


    }
    
}
