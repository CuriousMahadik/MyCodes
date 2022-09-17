

public class commandLine {
    public static void main(String args[ ])
    {
        System.out.println("The command line arguments are");
        for (int x = 0; x < args.length; x++)
            System.out.println("args[" + x + "]: " + args[ x ]);
    }
}