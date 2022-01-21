
import java.awt.*;
import objectdraw.*;


public class Broccoli implements BroccoliPart
{
    BroccoliPart left;
    BroccoliPart center;
    BroccoliPart right;
    
    AngLine stem;
    // private instance variables:

    
    public Broccoli(Location startCoords, double size, double direction, DrawingCanvas canvas)
    {   // draw stem and color green
         stem= new AngLine(startCoords, size, direction, canvas);
         stem.setColor(Color.green);
        
        Location destCoords= stem.getEnd();
        
        if(size>25)
        {
            center= new Broccoli(destCoords, size*.8, direction, canvas);
            
            
            left= new Broccoli(destCoords, size*.8, direction-(Math.PI/9.0), canvas);
            
            right= new Broccoli(destCoords, size*.8, direction+(Math.PI/9.0), canvas);
        }
        else
        {
            center= new Flower(destCoords,size, direction,canvas);
        
            left= new Flower(destCoords, size*.8, direction-(Math.PI/9.0), canvas);
            
            right= new Flower(destCoords, size*.8, direction+(Math.PI/9.0), canvas);
        }
        
    }
    
  
           
}

