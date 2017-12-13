

import java.awt.geom.*;     // for Point2D.Double
import java.util.ArrayList; // for ArrayList
import gpdraw.*;         
// for DrawingTool

public class IrregularPolygon{
    private ArrayList <Point2D.Double> myPolygon = new ArrayList<Point2D.Double>();
    private double perimeter;
    private double area1;
    private double xFinal;
    private double yFinal;
    private double area2;
    private double area;
    private double xFinal2;
    private double yFinal2;
    private double total;
    
    private DrawingTool myPencil;
    private SketchPad myPaper;

    // constructors
    public IrregularPolygon() 
    {
        myPaper = new SketchPad(500,500);
        myPencil = new DrawingTool(myPaper);
        
        
    }
    // public methods
    public void add(Point2D.Double aPoint) 
    { 
        myPolygon.add(aPoint); 

    }
    public static String getName()
    {
        return "Hrishikesh Ingale";
    }
    

    public void draw() 
    { 
        
        Point2D.Double first = myPolygon.get(0);
        myPencil.up();
        myPencil.move(myPolygon.get(0).getX(), myPolygon.get(0).getY());
        myPencil.down();
 
        for(int i = 1; i < myPolygon.size(); i++)
        {
            myPencil.move(myPolygon.get(i).getX(), myPolygon.get(i).getY());
        }
    }

    public double perimeter() 
    { 
        for(int i = 0; i<myPolygon.size()-1; i++)
        {

            double x1 = (myPolygon.get(i).getX());
            double y1= (myPolygon.get(i).getY());
            double x2 = (myPolygon.get(i+1).getX());
            double y2 = (myPolygon.get(i+1).getY());
            double square1 = ((x2-x1) * (x2-x1));
            double square2 = ((y2-y1)*(y2-y1));
            double root = Math.sqrt(square1 + square2);
            perimeter+= root;

        }
        double x0 = (myPolygon.get(0).getX());
        double y0 = (myPolygon.get(0).getY());
        double xLast = (myPolygon.get(myPolygon.size() -1).getX());
        double yLast = (myPolygon.get(myPolygon.size() -1).getY());
        double square3 = ((xLast-x0) * (xLast-x0));
        double square4 = ((yLast-y0)*(yLast-y0));
        double root2 = Math.sqrt(square3 + square4);
        perimeter+= root2;
        
        
        return perimeter;
    }

    public double area() 
    { 
        for(int i = 0; i < myPolygon.size()-1; i++)
        {
            double X1 = (myPolygon.get(i).getX());
            double Y1 = (myPolygon.get(i).getY());
            double X2 = (myPolygon.get(i + 1).getX());
            double Y2 = (myPolygon.get(i + 1).getY());
            total += (X1 * Y2 - Y1 * X2);
        }
        double abs = Math.abs(0.5 * total);
        return abs;
    }
    //public boolean checkIfPolygon()
    //{
    //  for( 
    //}

}
