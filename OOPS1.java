class Car{
    String power;
    String price;

    public void drive(){
        System.out.println("I LOVE CARS");
    }
    public void Printpower(){
        System.out.println(this.power);
    }
}
public class OOPS1 {
    public static void main(String args[]){
        Car Car1=new Car();
        Car1.power="5468hp";
        Car1.price="52Lakh";

        // Car1.drive();
        Car1.Printpower();

    }
    
}
