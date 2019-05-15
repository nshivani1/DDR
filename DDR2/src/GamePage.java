/*
 * Names: Timothy Situ, Nick Shivani, Pablo Romero
 * Period: 2
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/*
 * constructs the game page that allows a user to choose the difficulty
 */
public class GamePage extends JFrame implements ActionListener,KeyListener
{
	private JButton easy,medium,hard;
	private JPanel one,two,three,grid,space,space2,score;
	private JTextArea text,t;
	private DanceTime start;
	private Scoreboard s;
	private int num;
	private String word;
	
	/*
	 * constructs the game page with 3 different difficulties
	 */
	public GamePage() 
	{
		start = null;
		easy = new JButton("Easy");
		medium = new JButton("Medium");
		hard = new JButton("Hard");
		one = new JPanel();
		two = new JPanel();
		three = new JPanel();
		space = new JPanel();
		space2 = new JPanel();
		text = new JTextArea("     Choose your difficulty: ");
		grid = new JPanel(new GridLayout(3,1));
		word = "";
		text.setFont(new Font("Serif",Font.PLAIN,50));
		one.setLayout(new BoxLayout(one,BoxLayout.PAGE_AXIS));
		text.setForeground(Color.WHITE);
		text.setOpaque(false);
		text.setAlignmentX(Component.CENTER_ALIGNMENT);
		text.setAlignmentY(Component.CENTER_ALIGNMENT);
		one.add(easy);
		one.add(medium);
		one.add(hard);
		easy.setAlignmentX(Component.CENTER_ALIGNMENT);
		medium.setAlignmentX(Component.CENTER_ALIGNMENT);
		hard.setAlignmentX(Component.CENTER_ALIGNMENT);
		easy.setAlignmentY(Component.CENTER_ALIGNMENT);
		medium.setAlignmentY(Component.CENTER_ALIGNMENT);
		hard.setAlignmentY(Component.CENTER_ALIGNMENT);
		easy.setFont(new Font("Serif",Font.PLAIN,30));
		medium.setFont(new Font("Serif",Font.PLAIN,30));
		hard.setFont(new Font("Serif",Font.PLAIN,30));
		one.setOpaque(false);
		two.setOpaque(false);
		three.setOpaque(false);
		space.setOpaque(false);
		space2.setOpaque(false);
		grid.add(space);
		grid.add(one);
		grid.setOpaque(false);
		setSize(600,600);
		setTitle("Dance Dance Revolution");
		ImageIcon imageIcon = new ImageIcon("rainbow.jpg");
		Image image = imageIcon.getImage().getScaledInstance(600,600,Image.SCALE_DEFAULT);
		imageIcon = new ImageIcon(image);
		setContentPane(new JLabel(imageIcon));
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setLayout(new BorderLayout());
		add(text,BorderLayout.NORTH);
		add(grid,BorderLayout.CENTER);
		easy.addActionListener(this);
		medium.addActionListener(this);
		hard.addActionListener(this);
		addKeyListener(this);
		setFocusable(true);
	}

	/*
	 * action performed listener
	 * @param e the action that happened
	 */
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource().equals(easy))
		{
			start = new DanceTime("easy");
		}
		else if(e.getSource().equals(medium))
		{
			start = new DanceTime("medium");
		}
		else
		{
			start = new DanceTime("hard");
		}
		getContentPane().removeAll();
		getContentPane().revalidate();
		getContentPane().repaint();
		getContentPane().setLayout(new BorderLayout());
		((Component)start).setFocusable(true);
		getContentPane().add(start,BorderLayout.CENTER);
		s = new Scoreboard(start.getArrows());
		score = new JPanel(new GridLayout(1,1));
		t = new JTextArea(toString(),10,16);
		t.setBackground(Color.black);
		t.setForeground(Color.white);
		score.add(t);
		score.setOpaque(false);
		getContentPane().add(score,BorderLayout.EAST);
		start.addKeyListener(this);
		start.setFocusable(true);
		new Thread(start).start();
	}
	
	public void keyReleased(KeyEvent e)	{}
	public void keyTyped(KeyEvent arg0) {}
	/*
	 * key pressed listener
	 * @param e the key event that was pressed
	 */
	public void keyPressed(KeyEvent e) 
	{
		if(start != null)
		{
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
			{
				 s.scoreTracker(0);
				 t.setText(toString());
				 start.setScore(s.getScore() + "");
			}
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			{
				
				s.scoreTracker(3);
				t.setText(toString());
				start.setScore(s.getScore() + "");
			}
			if (e.getKeyCode() == KeyEvent.VK_UP)
			{
				s.scoreTracker(1);
				t.setText(toString());
				start.setScore(s.getScore() + "");
			}
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
			{
				
				s.scoreTracker(2);
				t.setText(toString());
				start.setScore(s.getScore() + "");
			}
			start.repaint();
		}
	}
	
	/*
	 * toString returns the score and word for each key pressed
	 * @return the string with the score and word
	 */
	public String toString()
	{
		return "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + "                      " + s.getScore() + "\n" + "                      " + s.getWord();
	}
}
