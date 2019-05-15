/*
 * Names: Timothy Situ, Nick Shivani, Pablo Romero
 * Period: 2
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.time.Duration;
import java.time.Instant;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * represents the JComponent of the actual game
 */
public class DanceTime extends JComponent implements Runnable
{
	private Arrows arrows;
	private boolean[] keys;
	private BufferedImage bImage;
	private LArrow left;
	private RArrow right;
	private UArrow up;
	private DArrow down;
	private static final long ONE_MINUTE = 60000;
	private Instant start;
	private boolean done;
	private String difficulty;
	private String score;
	
	/*
	 * constructs the component with a difficulty
	 * @param s the difficulty
	 */
	public DanceTime(String s)
	{
		difficulty = s;
		keys = new boolean[4];
		arrows = new Arrows(s);
		left = new LArrow();
		right = new RArrow();
		up = new UArrow();
		down = new DArrow();
		start = Instant.now();
		done = false;
		score = "";
		setVisible(true);
	}
	
	/*
	 * paints the component
	 * @param window the graphics object
	 */
	public void paintComponent(Graphics window)
	{
		Graphics2D twoDGraph = (Graphics2D)window;
	    bImage = (BufferedImage)(createImage(getWidth(),getHeight()));
		Graphics g = bImage.createGraphics();
		g.setColor(Color.black);
		g.fillRect(0, 0, 600, 600);
	    left.draw(g);
	    right.draw(g);
	    up.draw(g);
	    down.draw(g);
		arrows.draw(g);
		arrows.move();
		arrows.clean();
		twoDGraph.drawImage(bImage,null,0,0);
	}
	
	/*
	 * runs the moving component of the game
	 */
	public void run() 
	{
		try
   		{
	   		while(!done)
	   		{
               Thread.currentThread().sleep(5);
	           repaint();
	           Instant finish = Instant.now();
	           long timeElapsed = Duration.between(start,finish).toMillis();
	           if(timeElapsed > ONE_MINUTE)
	           {
	        	   done = true;
	           }
	        }
	   		JOptionPane.showMessageDialog(null, "Congratulations! You've completed the " + difficulty + " level. "
	   				+ "\nFinal score: " + score);
			System.exit(0);
      	}
      	catch(Exception e)
      	{
      	}
	}
	
	/*
	 * returns if an arrow was successfully cleared
	 * @param s the key that was pressed to be cleared
	 * @return if an arrow was cleared
	 */
	public boolean clear(int s)
	{
		return arrows.clear(s);
	}
	
	/*
	 * returns the arrows object
	 * @return the arrows object
	 */
	public Arrows getArrows()
	{
		return arrows;
	}
	
	/*
	 * sets the score of the game
	 * @param s the score
	 */
	public void setScore(String s)
	{
		score = s;
	}
}
