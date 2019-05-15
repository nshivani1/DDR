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

/**
 * LArrow represents the stationary left arrow
 */
public class LArrow extends JComponent
{	
	private int[] x2;
	private int[] y2;
	
	/*
	 * draws the stationary left arrow
	 * @param g the Graphics object
	 */
   public void draw(Graphics g)
   {  
	  Graphics2D g2 = (Graphics2D) g;
	  g2.setColor(Color.BLACK);

	
	  g2.setStroke(new BasicStroke(3));
      
      Line2D.Double lin1 = new Line2D.Double(5, 125+150+200,  25, 105+150+200);
      g2.draw(lin1);

      Line2D.Double lin2 = new Line2D.Double(25,105+150+200, 25, 115+150+200);
      g2.draw(lin2);
      
      
      Line2D.Double lin3 = new Line2D.Double(25, 115+150+200,  55, 115+150+200);
      g2.draw(lin3);

      Line2D.Double lin4 = new Line2D.Double(55,115+150+200, 55, 135+150+200);
      g2.draw(lin4);
      
      
      Line2D.Double lin5 = new Line2D.Double(55, 135+150+200,  25, 135+150+200);
      g2.draw(lin5);

      Line2D.Double lin6 = new Line2D.Double(25,135+150+200, 25, 145+150+200);
      g2.draw(lin6);
      
      Line2D.Double lin7 = new Line2D.Double(25,145+150+200,5,125+150+200);
      g2.draw(lin7);
      
      int x2[] = {5,25,25,55,55,25,25,5};
 
      int y2[] = {275+200,255+200,265+200,265+200,285+200,285+200,295+200,275+200};
      
      g2.setColor(Color.WHITE);
      g2.fillPolygon(x2,y2,8);
      
   }
   
}