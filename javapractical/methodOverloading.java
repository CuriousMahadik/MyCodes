package javaPracticals;
class Adder{
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
    static double  add(double a,  int b,int c){
        return a+b+c;
    }
    static double add(double a,  double b,double c){
        return a+b+c;
    }
}

public class methodOverloading {
    public static void main(String[] args) {
        System.out.println(Adder.add(11,13));
        System.out.println(Adder.add(11,12,13));
        System.out.println(Adder.add(12.4,67,4));
        System.out.println(Adder.add(11.1,12.2,13.3));
    }
}
