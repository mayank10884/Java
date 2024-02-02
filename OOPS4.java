class Boy{
    String age;
    String name;

    public void height(){
        System.out.println("He is 5'10");
        System.out.println(this.age);
        System.out.println(this.name);
    }
}
public class OOPS4 {
    public static void main(String args[]){
        Boy boy1=new Boy();
        boy1.age="19";
        boy1.name="Mayank";

        boy1.height();
    }
    
}
