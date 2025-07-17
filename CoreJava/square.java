class chaukon
{
    int side;
    public int area()
    {
        return side*side;
    }
    public int perimeter()
        {
            return 4*side;
        }
    
}
public class square {
    public static void main(String[] args) {
        chaukon square1 = new chaukon();
        square1.side = 5;
        System.out.println(square1.area());
        System.out.println(square1.perimeter());
    }
}
