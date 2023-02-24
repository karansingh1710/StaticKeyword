class Demo1{
    static int a;//This will execute first
    static int b;//This will execute second
    int m;//This will execute at the time of instantiation
    int n;//This will execute at the time of instantiation
    static{//This will execute third
        a=10;
        b=20;
        System.out.println("Control in static block");
    }
    {///This will execute at the time of instantiation
        m=100;
        n=200;
        System.out.println("Control in non static block");
    }
    static void disp1(){
        System.out.println("Value of static var "+a);
        System.out.println("Value of static var "+b);
    }
    void disp2(){
        System.out.println("Value of Instance var "+m);
        System.out.println("Value of Instance var "+n);
    }
}
public class Demo {
    public static void main(String[] args) {
    Demo1 d=new Demo1();
//    Demo1.disp1();
//    d.disp2();
    }
}
