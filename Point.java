import java.awt.geom.Point2D;

public class Point extends Point2D.Double
{

    public Point(double x, double y)
    {
        super(x,y);
    }
    
    public String toString()
    {
        return "(" + getX() + "," + getY() +")";
    }

}