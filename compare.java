import java.util.Scanner;
public class compare {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //Compare Strings
        String name1="Mayank";
        String name2="Mayankk";

        //S1>s2=+ve
        //s1==s2=0
        //s1<s2=-ve

        if(name1.compareTo(name2)==-2){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        
    }
    
}
