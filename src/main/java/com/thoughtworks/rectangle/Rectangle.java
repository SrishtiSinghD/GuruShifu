public class Rectangle
{
    private final double length;
    private final double breadth;


    public Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    } 


    public double area()
    {
        double area = length*breadth;
        return area;
    }

    public double perimeter()
    {
        double perimeter = 2*(length+breadth);
        return perimeter;
    }


}

