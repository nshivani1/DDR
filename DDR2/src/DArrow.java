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
 * DArrow represents the stationary down arrow
 */
public class DArrow extends JComponent
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
	  
	  Line2D.Double lin1 = new Line2D.Double(115+141, 100+150+200,  135+141, 100+150+200);
      g2.draw(lin1);

      Line2D.Double lin2 = new Line2D.Double(135+141,100+150+200, 135+141, 130+150+200);
      g2.draw(lin2);
      
      Line2D.Double lin7 = new Line2D.Double(135+141,130+150+200,145+141,130+150+200);
      g2.draw(lin7);  
      
      Line2D.Double lin3 = new Line2D.Double(145+141, 130+150+200,  125+141, 150+150+200);
      g2.draw(lin3);

      Line2D.Double lin4 = new Line2D.Double(125+141,150+150+200, 105+141, 130+150+200);
      g2.draw(lin4);
      
      
      Line2D.Double lin5 = new Line2D.Double(105+141, 130+150+200,  115+141, 130+150+200);
      g2.draw(lin5);

      Line2D.Double lin6 = new Line2D.Double(115+141,130+150+200, 115+141, 100+150+200);
      g2.draw(lin6);
      
      int x2[] = {115+141,135+141,135+141,145+141,125+141,106+141,116+141,116+141};
 
      int y2[] = {251+200,251+200,280+200,280+200,300+200,280+200,280+200,251+200};
      
      g2.setColor(Color.WHITE);
      g2.fillPolygon(x2,y2,8);
   }
}