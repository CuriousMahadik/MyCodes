package javaPracticals;

public class constructorChaining {
    constructorChaining(){
        this(2);
        System.out.println("In the default Constructor");
    }
    constructorChaining(int x){
        this(3,4);
        System.out.println("In 1 parameter constructor");
        System.out.println( " The value of the parameter is "+ x);
    }
    constructorChaining(int x,int y){
        System.out.println("In 2 parameter constructor");
        System.out.println("The addition of the 2 parameter is "+ (x+y));
    }

    public static void main(String[] args) {
        new constructorChaining();
    }
}
