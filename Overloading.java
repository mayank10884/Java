//Method Overloading
class compilersum{
    void add(int x,int y){
        int z= x+ y;
        System.out.println("Sum of two number.="+z);
    }
    void add(int x,int y,int z){
        int w=x+y+z;
        System.out.println("Sum of three number.="+w);
    }
}
public class Overloading {
    public static void main (String args[]){
        compilersum ob =new compilersum();
        ob.add(10,20);
        ob.add(10,20,30);

    }
    
}
