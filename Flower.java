
import java.awt.*;
import objectdraw.*;


public class Flower implements BroccoliPart
{
    // private instance variables:
    AngLine stem;
    FilledOval bud;
    
    public Flower(Location startCoords, double size, double direction, DrawingCanvas canvas)
    {   
        
         
        bud = new FilledOval(startCoords,size ,direction ,canvas);
        bud.setColor(Color.yellow);
    }
    
              
}

