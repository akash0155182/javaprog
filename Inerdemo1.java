class Outer
{
    private int x=10;
    void display()
    {
        System.out.println("in display of outer class\nx="+x);
    }
    class Inner
    {
        int y=20;
        void show()
        {
            System.out.println("y="+y);
            System.out.println("x="+x);
        }
    }

}
class Inerdemo1
{
    public static void main(String []args)
    {
        Outer O=new Outer();
        O.display();
        Outer.Inner inn=O.new Inner();
        inn.show();
    }
}
