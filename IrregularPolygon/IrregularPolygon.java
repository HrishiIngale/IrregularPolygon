
import java.awt.geom.*;     // for Point2D.Double
import java.util.ArrayList; // for ArrayList
import gpdraw.*;         
// for DrawingTool

public class IrregularPolygon{
    private ArrayList <Point2D.Double> myPolygon;
    private double perimeter;
    private double area1;
    private double xFinal;
    private double yFinal;
    private double area2;
    private double area;
     private double xFinal2;
    private double yFinal2;

    // constructors
    public IrregularPolygon() 
    {

    }
    // public methods
    public void add(Point2D.Double aPoint) 
    { 
        myPolygon.add(aPoint); 

    }

    public void draw() 
    { 
    }

    public double perimeter() 
    { 
        for(int i = 0; i<myPolygon.size(); i++)
        {
            
            double x1 = (myPolygon.get(i).getX());
            double y1= (myPolygon.get(i).getX());
            double x2 = (myPolygon.get(i+1).getX());
            double y2 = (myPolygon.get(i+1).getY());
            double square1 = ((x2-x1) * (x2-x1));
            double square2 = ((y2-y1)*(y2-y1));
            double root = Math.sqrt(square1 + square2);
            perimeter+= root;

        }
        return perimeter;
    }

    public double area() 
    { 
        for(int z =0; z <myPolygon.size(); z++)
        
        {
            double x1 = (myPolygon.get(z).getX() * (myPolygon.get(z+1).getY()));
            area1 = area1+ x1;
        } 
        xFinal = (myPolygon.get(myPolygon.size()-1).getX());
        yFinal = (myPolygon.get(0).getY());
        area1 = area1 +(xFinal * yFinal);
        for(int v =0; v <myPolygon.size(); v++)
        
        {
            double y1 = (myPolygon.get(v).getY() * (myPolygon.get(v+1).getX()));
            area2 = area1+ y1;
        } 
        yFinal2 =  (myPolygon.get(myPolygon.size()-1).getY());
        xFinal2 = (myPolygon.get(0).getX());
        area2 = area2 + (xFinal2 * yFinal2);
        area = Math.abs(0.5*(area1-area2));
        return area;
    }
    public boolean checkIfPolygon()
   {
       for( 
   }
    
}