/*
 * Names: Timothy Situ, Nick Shivani, Pablo Romero
 * Period: 2
 */

import java.util.*;
/*
 * represents the Scoreboard display that keeps track of the score
 */
public class Scoreboard 
{
	private Map<Integer,Integer> map;
	private int score;
	private String word;
	private LeftArrow left;
	private RightArrow right;
	private DownArrow down;
	private UpArrow up;
	private Arrows arrow;
	private static int RIGHT_TIP = 475;
	private static int LEFT_TIP = 475;
	private static int UP_TIP = 450;
	private static int DOWN_TIP = 500;
	
	/*
	 * constructs a scoreboard with the arrows component
	 */
	public Scoreboard(Arrows a) 
	{
		score = 0;
		word = "";
		arrow = a;
		left = arrow.getLeft().peek();
 		right = arrow.getRight().peek();
	    down = arrow.getDown().peek();
	    up = arrow.getUp().peek();
		map = new TreeMap<Integer,Integer>();
		//Perfect
		map.put(0,1000);
		//Excellent
		map.put(1,900);
		map.put(2,800);
		//Good
		map.put(3,700);
		map.put(4,600);
		map.put(5,500);
		//Almost
		map.put(6,400);
		map.put(7,300);
		map.put(8,200);
		map.put(9,100);
		//Anything else = nothing		
	}
	
	/*
	 * calculates the new score
	 * @param s the left,right,down,or up arrow clicked
	 */
	public void scoreTracker(int s)
	{
		if(arrow.getDifficulty().equals("easy"))
		{
			if(s == 0)
			{
				left = arrow.getLeft().peek();
				boolean b = arrow.clear(0);
				if(b)
				{
					int diff = Math.abs(left.getTip() - LEFT_TIP);
					if(diff < 10)
						score+=map.get(diff);
					if(diff < 10)
					{
						switch(diff)
						{
							case 0:
								word = "Perfect";break;
							case 1:
								word = "Excellent";break;
							case 2:
								word = "Excellent";break;
							case 3:
								word = "Good";break;
							case 4:
								word = "Good";break;
							case 5:
								word = "Good";break;
							case 6:
								word = "Almost";break;
							case 7:
								word = "Almost";break;
							case 8:
								word = "Almost";break;
							case 9:
								word = "Almost";break;
						}
					}
					else
						word = "No";
				}
			}
			else if (s == 1)
			{
				up = arrow.getUp().peek();
				boolean b = arrow.clear(1);
				if(b)
				{
					int diff = Math.abs(up.getTip() - UP_TIP);
					if(diff < 10)
						score+=map.get(diff);
					if(diff < 10)
					{
						switch(diff)
						{
							case 0:
								word = "Perfect";break;
							case 1:
								word = "Excellent";break;
							case 2:
								word = "Excellent";break;
							case 3:
								word = "Good";break;
							case 4:
								word = "Good";break;
							case 5:
								word = "Good";break;
							case 6:
								word = "Almost";break;
							case 7:
								word = "Almost";break;
							case 8:
								word = "Almost";break;
							case 9:
								word = "Almost";break;
						}
					}
					else
						word = "No";
				}
			}
			else if (s == 2)
			{
				down = arrow.getDown().peek();
				boolean b = arrow.clear(2);
				if(b)
				{
					
					int diff = Math.abs(down.getTip() - DOWN_TIP);
					if(diff < 10)
						score+=map.get(diff);
					if(diff < 10)
					{
						switch(diff)
						{
							case 0:
								word = "Perfect";break;
							case 1:
								word = "Excellent";break;
							case 2:
								word = "Excellent";break;
							case 3:
								word = "Good";break;
							case 4:
								word = "Good";break;
							case 5:
								word = "Good";break;
							case 6:
								word = "Almost";break;
							case 7:
								word = "Almost";break;
							case 8:
								word = "Almost";break;
							case 9:
								word = "Almost";break;
						}
					}
					else
						word = "No";
				}
			}
			else if(s == 3)
			{
				right = arrow.getRight().peek();
				boolean b = arrow.clear(3);
				if(b)
				{
					int diff = Math.abs(right.getTip() - RIGHT_TIP);
					if(diff < 10)
						score+=map.get(diff);
					if(diff < 10)
					{
						switch(diff)
						{
							case 0:
								word = "Perfect";break;
							case 1:
								word = "Excellent";break;
							case 2:
								word = "Excellent";break;
							case 3:
								word = "Good";break;
							case 4:
								word = "Good";break;
							case 5:
								word = "Good";break;
							case 6:
								word = "Almost";break;
							case 7:
								word = "Almost";break;
							case 8:
								word = "Almost";break;
							case 9:
								word = "Almost";break;
						}
					}
					else
						word = "No";
				}
			}
					
					
		}
		if(arrow.getDifficulty().equals("medium"))
		{
			if(s == 0)
			{
				left = arrow.getLeft().peek();
				boolean b = arrow.clear(0);
				if(b)
				{
					int diff = Math.abs(left.getTip() - LEFT_TIP);
					if(diff < 10)
						score+=map.get(diff);
					if(diff < 10)
					{
						switch(diff)
						{
							case 0:
								word = "Perfect";break;
							case 1:
								word = "Excellent";break;
							case 2:
								word = "Excellent";break;
							case 3:
								word = "Good";break;
							case 4:
								word = "Good";break;
							case 5:
								word = "Good";break;
							case 6:
								word = "Almost";break;
							case 7:
								word = "Almost";break;
							case 8:
								word = "Almost";break;
							case 9:
								word = "Almost";break;
						}
					}
					else
						word = "No";
				}
			}
			else if (s == 1)
			{
				up = arrow.getUp().peek();
				boolean b = arrow.clear(1);
				if(b)
				{
					int diff = Math.abs(up.getTip() - UP_TIP);
					if(diff < 10)
						score+=map.get(diff);
					if(diff < 10)
					{
						switch(diff)
						{
							case 0:
								word = "Perfect";break;
							case 1:
								word = "Excellent";break;
							case 2:
								word = "Excellent";break;
							case 3:
								word = "Good";break;
							case 4:
								word = "Good";break;
							case 5:
								word = "Good";break;
							case 6:
								word = "Almost";break;
							case 7:
								word = "Almost";break;
							case 8:
								word = "Almost";break;
							case 9:
								word = "Almost";break;
						}
					}
					else
						word = "No";
				}
			}
			else if (s == 2)
			{
				down = arrow.getDown().peek();
				boolean b = arrow.clear(2);
				if(b)
				{
					
					int diff = Math.abs(down.getTip() - DOWN_TIP);
					if(diff < 10)
						score+=map.get(diff);
					if(diff < 10)
					{
						switch(diff)
						{
							case 0:
								word = "Perfect";break;
							case 1:
								word = "Excellent";break;
							case 2:
								word = "Excellent";break;
							case 3:
								word = "Good";break;
							case 4:
								word = "Good";break;
							case 5:
								word = "Good";break;
							case 6:
								word = "Almost";break;
							case 7:
								word = "Almost";break;
							case 8:
								word = "Almost";break;
							case 9:
								word = "Almost";break;
						}
					}
					else
						word = "No";
				}
			}
			else if(s == 3)
			{
				right = arrow.getRight().peek();
				boolean b = arrow.clear(3);
				if(b)
				{
					int diff = Math.abs(right.getTip() - RIGHT_TIP);
					if(diff < 10)
						score+=map.get(diff);
					if(diff < 10)
					{
						switch(diff)
						{
							case 0:
								word = "Perfect";break;
							case 1:
								word = "Excellent";break;
							case 2:
								word = "Excellent";break;
							case 3:
								word = "Good";break;
							case 4:
								word = "Good";break;
							case 5:
								word = "Good";break;
							case 6:
								word = "Almost";break;
							case 7:
								word = "Almost";break;
							case 8:
								word = "Almost";break;
							case 9:
								word = "Almost";break;
						}
					}
					else
						word = "No";
				}
			}
					
					
		}
		else if(arrow.getDifficulty().equals("hard"))
		{
			if(s == 0)
			{
				left = arrow.getLeft().peek();
				boolean b = arrow.clear(0);
				if(b)
				{
					int diff = Math.abs(left.getTip() - LEFT_TIP);
					if(diff < 10)
						score+=map.get(diff);
					if(diff < 10)
					{
						switch(diff)
						{
							case 0:
								word = "Perfect";break;
							case 1:
								word = "Excellent";break;
							case 2:
								word = "Excellent";break;
							case 3:
								word = "Good";break;
							case 4:
								word = "Good";break;
							case 5:
								word = "Good";break;
							case 6:
								word = "Almost";break;
							case 7:
								word = "Almost";break;
							case 8:
								word = "Almost";break;
							case 9:
								word = "Almost";break;
						}
					}
					else
						word = "No";
				}
			}
			else if (s == 1)
			{
				up = arrow.getUp().peek();
				boolean b = arrow.clear(1);
				if(b)
				{
					int diff = Math.abs(up.getTip() - UP_TIP);
					if(diff < 10)
						score+=map.get(diff);
					if(diff < 10)
					{
						switch(diff)
						{
							case 0:
								word = "Perfect";break;
							case 1:
								word = "Excellent";break;
							case 2:
								word = "Excellent";break;
							case 3:
								word = "Good";break;
							case 4:
								word = "Good";break;
							case 5:
								word = "Good";break;
							case 6:
								word = "Almost";break;
							case 7:
								word = "Almost";break;
							case 8:
								word = "Almost";break;
							case 9:
								word = "Almost";break;
						}
					}
					else
						word = "No";
				}
			}
			else if (s == 2)
			{
				down = arrow.getDown().peek();
				boolean b = arrow.clear(2);
				if(b)
				{
					
					int diff = Math.abs(down.getTip() - DOWN_TIP);
					if(diff < 10)
						score+=map.get(diff);
					if(diff < 10)
					{
						switch(diff)
						{
							case 0:
								word = "Perfect";break;
							case 1:
								word = "Excellent";break;
							case 2:
								word = "Excellent";break;
							case 3:
								word = "Good";break;
							case 4:
								word = "Good";break;
							case 5:
								word = "Good";break;
							case 6:
								word = "Almost";break;
							case 7:
								word = "Almost";break;
							case 8:
								word = "Almost";break;
							case 9:
								word = "Almost";break;
						}
					}
					else
						word = "No";
				}
			}
			else if(s == 3)
			{
				right = arrow.getRight().peek();
				boolean b = arrow.clear(3);
				if(b)
				{
					int diff = Math.abs(right.getTip() - RIGHT_TIP);
					if(diff < 10)
						score+=map.get(diff);
					if(diff < 10)
					{
						switch(diff)
						{
							case 0:
								word = "Perfect";break;
							case 1:
								word = "Excellent";break;
							case 2:
								word = "Excellent";break;
							case 3:
								word = "Good";break;
							case 4:
								word = "Good";break;
							case 5:
								word = "Good";break;
							case 6:
								word = "Almost";break;
							case 7:
								word = "Almost";break;
							case 8:
								word = "Almost";break;
							case 9:
								word = "Almost";break;
						}
					}
					else
						word = "No";
				}
			}	
		}
	}
	
	/*
	 * returns the current score
	 * @return the current score
	 */
	public int getScore()
	{
		return score;
	}
	
	/*
	 * returns the current word
	 * @return the current word
	 */
	public String getWord()
	{
		return word;
	}
}
	
	



