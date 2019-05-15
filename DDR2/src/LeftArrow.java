/*
 * Names: Timothy Situ, Nick Shivani, Pablo Romero
 * Period: 2
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;
import javax.swing.JPanel;
import javax.swing.JComponent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;
import java.io.*;
import java.util.*;

/*
 * LeftArrow represents the moving left key moving arrows
 */
public class LeftArrow extends JComponent
{	
	private int[] x1;
	private int[] y1;
	private int[] x2;
	private int[] y2;
	private int x;
	private int y;
	private int tip;
	
	/*
	 * Constructs a LeftArrow
	 * @param x3 the x value
	 * @param y3 the y value
	 */
	public LeftArrow(int x3, int y3)
	{
		y = y3;
		x = x3;
	}
	
	/*
	 * move moves the arrow
	 * @param dx how much to move it in the x direction
	 * @param dy how much to move it in the y direction
	 */
	public void move(int dx, int dy)
    {
      x += dx;
      y += dy;
      tip += dy;
    }
	
	/*
	 * getY returns the y value of the arrow
	 * @return the y value of the arrow
	 */
	public int getY()
	{
		return y;
	}

	/*
	 * draws all components of the LeftArrow
	 * @param g the Graphics object
	 */
    public void draw(Graphics g)
    {  
	  Graphics2D g2 = (Graphics2D) g;
	  g2.setStroke(new BasicStroke(2));
	  g2.setColor(Color.BLACK);
	  tip = y + 125 - 175;	
      Line2D.Double line1 = new Line2D.Double(x+5, y+125-175,  x+25, y+105-175);
      g2.draw(line1);

      Line2D.Double line2 = new Line2D.Double(x+25,y+105-175, x+25, y+115-175);
      g2.draw(line2);
      
      
      Line2D.Double line3 = new Line2D.Double(x+25, y+115-175,  x+55, y+115-175);
      g2.draw(line3);

      Line2D.Double line4 = new Line2D.Double(x+55,y+115-175, x+55, y+135-175);
      g2.draw(line4);
      
      
      Line2D.Double line5 = new Line2D.Double(x+55, y+135-175,  x+25, y+135-175);
      g2.draw(line5);

      Line2D.Double line6 = new Line2D.Double(x+25,y+135-175, x+25, y+145-175);
      g2.draw(line6);
      
      Line2D.Double line7 = new Line2D.Double(x+25,y+145-175,x+5,y+125-175);
      g2.draw(line7);
      
      int x1[] = {x+5,x+25,x+25,x+55,x+55,x+25,x+25,x+5};
 
      int y1[] = {y+125-175,y+105-175,y+115-175,y+115-175,y+135-175,y+135-175,y+145-175,y+125-175};
      
      g2.setColor(Color.WHITE);
      g2.setColor(new Color((int)(Math.random() * 0x1000000)));
      g2.fillPolygon(x1,y1,8);
	 }
	
     /*
      * getTip returns the y value of the tip
      * @return the y value of the tip
      */
	 public int getTip()
	 {
		return tip;
	 } 
	

}