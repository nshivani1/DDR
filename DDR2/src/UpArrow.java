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
 * UpArrow represents the moving up key moving arrows
 */
public class UpArrow extends JComponent
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
	public UpArrow(int x3, int y3)
	{
		x = x3;
		y = y3;
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
      tip +=dy;
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
      tip = y + 100-175;
      Line2D.Double line1 = new Line2D.Double(x+60+92-20, y+120-175,  x+80+92-20, y+100-175);
      g2.draw(line1);

      Line2D.Double line2 = new Line2D.Double(x+80+92-20,y+100-175, x+100+92-20, y+120-175);
      g2.draw(line2);
      
      
      Line2D.Double line3 = new Line2D.Double(x+100+92-20, y+120-175,  x+90+92-20, y+120-175);
      g2.draw(line3);

      Line2D.Double line4 = new Line2D.Double(x+90+92-20,y+120-175, x+90+92-20, y+150-175);
      g2.draw(line4);
      
      
      Line2D.Double line5 = new Line2D.Double(x+90+92-20, y+150-175,  x+70+92-20, y+150-175);
      g2.draw(line5);

      Line2D.Double line6 = new Line2D.Double(x+70+92-20,y+150-175, x+70+92-20, y+120-175);
      g2.draw(line6);
      
      Line2D.Double line7 = new Line2D.Double(x+70+92-20,y+120-175,x+60+92-20,y+120-175);
      g2.draw(line7);
      
      int x1[] = {x+60+92-20,x+81+92-20,x+100+92-20,x+90+92-20,x+90+92-20,x+70+92-20,x+70+92-20,x+60+92-20,x+80+92-20};
 
      int y1[] = {y+119-175,y+100-175,y+120-175,y+120-175,y+150-175,y+150-175,y+120-175,y+120-175,y+100-175};
      
	   g2.setColor(new Color((int)(Math.random() * 0x1000000)));
       g2.fillPolygon(x1,y1,9);
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
