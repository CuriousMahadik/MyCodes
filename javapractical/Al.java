
package javaPracticals;
import java.util.*;

class RevArrayList {
    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> b) {
        int i = (b.size() - 1);
        ArrayList<Integer> c = new ArrayList<Integer>();
        while (i >= 0) {
            c.add(b.get(i));
            i--;
        }
        return c;
    }
}

public class Al {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        System.out.println("Given ArrayList is "+ a);
        System.out.println("Reverse  Array List is " + RevArrayList.reverseArrayList(a));

    }
}

