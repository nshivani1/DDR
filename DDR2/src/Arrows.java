/*
 * Names: Timothy Situ, Nick Shivani, Pablo Romero
 * Period: 2
 */

import java.awt.Graphics;
import java.awt.Image;
import java.time.Duration;
import java.time.Instant;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Timer;

/*
 * represents the complete collection of the moving arrows in queues
 */
public class Arrows
{
	private Queue<LeftArrow> left;
	private Queue<RightArrow> right;
	private Queue<UpArrow> up;
	private Queue<DownArrow> down;
	private int leftSpeed,rightSpeed,upSpeed,downSpeed;
	private double spawnSpeed;
	private String difficulty;
	private Instant start;
	private LeftArrow lastLeft;
	private RightArrow lastRight;
	private UpArrow lastUp;
	private DownArrow lastDown;
	private long time;
	
	/*
	 * constructs the Arrows class with a certain difficulty
	 * @param s the difficulty
	 */
	public Arrows(String s) 
	{
		left = new LinkedList<LeftArrow>();
		right = new LinkedList<RightArrow>();
		up = new LinkedList<UpArrow>();
		down = new LinkedList<DownArrow>();
		difficulty = s;
		switch(s)
		{
		case "easy":
			leftSpeed = rightSpeed = upSpeed = downSpeed = 1;
			spawnSpeed = 650;
			time = 55000;
			break;
		case "medium":
			leftSpeed = rightSpeed = upSpeed = downSpeed = 2;
			spawnSpeed = 300;
			time = 56000;
			break;
		case "hard":
			leftSpeed = rightSpeed = upSpeed = downSpeed = 2;
			spawnSpeed = 200;
			time = 58000;
			break;
		}
		start = Instant.now();
	}
	/*
	 * returns the difficulty
	 * @return the difficulty
	 */
	public String getDifficulty()
	{
		return difficulty;
	}
	/*
	 * clears the moving arrow based on user pressing a key
	 * @param s the left,right,up, or down arrow clicked
	 * @return if the arrow was successfully cleared
	 */
	public boolean clear(int s)
	{
		if(!left.isEmpty() && s == 0)
		{
			if(left.peek().getY() > 450)
			{
				left.remove();
				return true;
			}
		}
		else if(!up.isEmpty() && s == 1)
		{
			if(up.peek().getY() > 465)
			{
				up.remove();
				return true;
			}
		}
		else if(!down.isEmpty() && s == 2)
		{
			if(down.peek().getY() > 465)
			{
				down.remove();
				return true;
			}
		}
		else if(!right.isEmpty() && s == 3)
		{
			if(right.peek().getY() > 465)
			{
				right.remove();
				return true;
			}
		}
		return false;
	}
	/*
	 * gets rid of any arrows that move off screen
	 */
	public void clean()
	{
		if(!left.isEmpty() && left.peek().getY() > 600)
			left.remove();
		if(!right.isEmpty() && right.peek().getY() > 600)
			right.remove();
		if(!up.isEmpty() && up.peek().getY() > 600)
			up.remove();
		if(!down.isEmpty() && down.peek().getY() > 600)
			down.remove();
	}
	
	/*
	 * moves all the arrows a certain speed
	 */
	public void move()
	{
		for(LeftArrow l : left)
		{
			l.move(0,leftSpeed);
		}
		for(UpArrow l : up)
		{
			l.move(0,upSpeed);
		}
		for(DownArrow l : down)
		{
			l.move(0,downSpeed);
		}
		for(RightArrow l : right)
		{
			l.move(0,rightSpeed);
		}
	}
	/*
	 * draws and adds arrows
	 * @param g the graphics window
	 */
	public void draw(Graphics g)
	{
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start,finish).toMillis();
		if(timeElapsed < time)
		{
			if(1 == (int)(Math.random()*spawnSpeed))
			{
				if(left.isEmpty())
				{
					LeftArrow l = new LeftArrow(0,0);
					left.add(l);
					lastLeft = l;
				}
				else
				{
					int y = lastLeft.getY();
					LeftArrow l = new LeftArrow(0,0);
					if(y > 40)
					{
						left.add(l);
						lastLeft = l;
					}
				}
			}
			if(1 == (int)(Math.random()*spawnSpeed))
			{
				if(right.isEmpty())
				{
					RightArrow r = new RightArrow(0,0);
					right.add(r);
					lastRight = r;
				}
				else
				{
					int y = lastRight.getY();
					RightArrow l = new RightArrow(0,0);
					if(y > 40)
					{
						right.add(l);
						lastRight = l;
					}
				}
			}
			if(1 == (int)(Math.random()*spawnSpeed))
			{
				if(up.isEmpty())
				{
					UpArrow r = new UpArrow(0,0);
					up.add(r);
					lastUp = r;
				}
				else
				{
					int y = lastUp.getY();
					UpArrow l = new UpArrow(0,0);
					if(y > 50)
					{
						up.add(l);
						lastUp = l;
					}
				}
			}
			if(1 == (int)(Math.random()*spawnSpeed))
			{
				if(down.isEmpty())
				{
					DownArrow r = new DownArrow(0,0);
					down.add(r);
					lastDown = r;
				}
				else
				{
					int y = lastDown.getY();
					DownArrow l = new DownArrow(0,0);
					if(y > 50)
					{
						down.add(l);
						lastDown = l;
					}
				}
			}
		}
		for(LeftArrow a : left)
			a.draw(g);
		for(RightArrow l : right)
			l.draw(g);
		for(UpArrow l : up)
			l.draw(g);
		for(DownArrow l : down)
			l.draw(g);
	}
	
	/*
	 * returns the queue of left arrows
	 * @return the queue of left arrows
	 */
	public Queue<LeftArrow> getLeft()
	{
		return left;
	}

	/*
	 * returns the queue of right arrows
	 * @return the queue of right arrows
	 */
	public Queue<RightArrow> getRight()
	{
		return right;
	}

	/*
	 * returns the queue of up arrows
	 * @return the queue of up arrows
	 */
	public Queue<UpArrow> getUp()
	{
		return up;
	}

	/*
	 * returns the queue of down arrows
	 * @return the queue of down arrows
	 */
	public Queue<DownArrow> getDown()
	{
		return down;
	}
}
