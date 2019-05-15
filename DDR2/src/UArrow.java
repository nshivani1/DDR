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
public class UArrow extends JComponent
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
	  
	  Line2D.Double lin1 = new Line2D.Double(80+92-20, 250+200,  60+92-20, 270+200);
      g2.draw(lin1);

      Line2D.Double lin2 = new Line2D.Double(100+92-20,270+200, 80+92-20, 250+200);
      g2.draw(lin2);
      
      
      Line2D.Double lin3 = new Line2D.Double(60+92-20, 270+200,  70+92-20, 270+200);
      g2.draw(lin3);

      Line2D.Double lin4 = new Line2D.Double(100+92-20,270+200, 90+92-20, 270+200);
      g2.draw(lin4);
      
      
      Line2D.Double lin5 = new Line2D.Double(70+92-20, 270+200,  70+92-20, 300+200);
      g2.draw(lin5);

      Line2D.Double lin6 = new Line2D.Double(90+92-20,270+200, 90+92-20, 300+200);
      g2.draw(lin6);
      
      Line2D.Double lin7 = new Line2D.Double(70+92-20,300+200,90+92-20,300+200);
      g2.draw(lin7);
          

      
      int x2[] = {61+92-20,80+92-20,100+92-20,90+92-20,90+92-20,71+92-20,71+92-20,61+92-20,80+92-20};
      	
      int y2[] = {270+200,251+200,270+200,270+200,300+200,300+200,270+200,270+200,250+200};
      g2.setColor(Color.WHITE);
   
      g2.fillPolygon(x2,y2,9);
   }
}