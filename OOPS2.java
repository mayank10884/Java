class Student{
    String age;
    String name;

    public void work(){
        System.out.println("He is Busy in coding");
        System.out.println(this.name);
        System.out.println(this.age);
        
        
    }
    // public void printname(){
    //     System.out.println(this.name);
    // }
    // public void printage(){
    //     System.out.println(this.age);
    // }
}
public class OOPS2 {
    public static void main(String args[]){
        Student Student1=new Student();
        Student1.age="19";
        Student1.name="Mayank";

        Student1.work();
        // Student1.printname();
        // Student1.printage();

        
    }
    
}
