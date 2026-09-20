package TestDrivenDevelopment;
/*
A private constructor is used if you don't want any other class to instantiate the object to avoid subclassing. The use private constructor can be seen as implemented in the example
 */

class GFG {
    static GFG instance = null;
    public int x = 10;
    // private constructor can't be accessed outside the
    // class
    private GFG() {}
    // Factory method to provide the users with instances
    static public GFG getInstance()
    {
        if (instance == null)
            instance = new GFG();
        return instance;
    }
}
// Driver Class
class Main {
    public static void main(String args[])
    {
        GFG a = GFG.getInstance();
        GFG b = GFG.getInstance();
        a.x = a.x + 10;
        System.out.println("Value of a.x = " + a.x);
        System.out.println("Value of b.x = " + b.x);
    }
}
