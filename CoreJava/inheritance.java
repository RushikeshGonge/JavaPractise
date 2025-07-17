 class Base{
    int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am printme function");
    }
}
class Derived extends Base{
    int y;
    int getY()
    {
        return y;
    }
    void setY(int y)
    {
        this.y = y;
    }
}
public class inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(4);
        System.out.println("This is from base class");
        System.out.println(b.getX());

        Derived d = new Derived();
        d.setX(32);
        d.setY(12);
        System.out.println("This is from derived class");
        System.out.println("X = "+d.getX());
        System.out.println("Y = "+ d.getY());
    }
}
