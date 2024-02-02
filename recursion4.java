public class recursion4 {
    public static int calcfactorial(int n){
        if(n==1){
            return 1;
        }
        int new_1 = calcfactorial(n-1);
        int new_2 = n* new_1;
        return new_2;
    }
    public static void main(String args[]){
        int n=5;
        int ans=calcfactorial(n);
        System.out.println(ans);

    }
    
}
