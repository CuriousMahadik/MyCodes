package javaPracticals;

import java.util.*;

class salary{
    public static void main(String args[]){
        float i=0;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter employee name");
        String empname=s.nextLine();

        System.out.println("Enter id of employee");
        int empno=s.nextInt();
        System.out.println("Enter emp basic salary");
        float ba=s.nextInt();
        float da=(ba*70)/100;
        float hra=(ba*30)/100;
        float gs=ba+da+hra;

        if(gs<=500000f){
            i=0;}

        else if(gs>500000f&&gs<=1000000f){

            i=(1000+((gs-500000f)*20)/100);}

        else if(gs>1000000f){
            i=(110000f+((gs-1000000f)*30)/100);}

        System.out.println( "The DA is "+da);
        System.out.println("The HRA is"+ hra);
        System.out.println("The gross salary is "+ gs);
        System.out.println("The income tax is"+ i);
        System.out.println("The net salary is "+ba);

    }
}
