import java.util.Scanner;
public class length {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        String firstname="Mayank";
        String lastname="Kumar";
        String fullname=firstname + lastname;
        System.out.println(fullname.length());

        //charat
        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }


    }
}
