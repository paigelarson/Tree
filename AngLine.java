import objectdraw.*;

/**
* AngLine is an implementation of a drawable line object.
*
* @author Jonathan Kallay
* @version 1.1 last update 12/04/2001 by Kim Bruce
*/
public class AngLine extends Line
{
/**
* Creates a new Line object.
* @param start the starting point of the line.
* @param length the length of the line.
* @param radianAngle the angle the line makes with the horizontal
* @param c the canvas in which the line is created.
*/
public AngLine(Location start, double length, double radianAngle,
DrawingCanvas canvas)
{
super(start,new Location(start.getX() + length*Math.cos(radianAngle),
start.getY() - length*Math.sin(radianAngle)),
canvas);
}
}
