class Outer
{
    private int x=10;
    class Inner
    {
        int x=20;
        void show()
        {
            System.out.println("In show of inner class \n Inner x="+this.x);
            System.out.println("outer x="+Outer.this.x);
        }
    }

}
class Innerdemo2
{
    public static void main(String []args)
    {
        Outer O=new Outer();
        Outer.Inner inn=O.new Inner();
        inn.show();
    }
}
    