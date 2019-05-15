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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * represents the main frame that allows the user to start the game, look at instructions, or quit
 */
public class MainPage extends JFrame implements ActionListener, WindowListener
{
	private JLabel DDR;
	private JButton startGame;
	private JButton instructions;
	private JButton exit;
	private GridLayout grid;
	private JPanel top;
	private JPanel t;
	private JPanel one;
	private JPanel two;
	private Instructions iPage;
	private GamePage gPage;
	
	/*
	 * constructs the main with buttons and labels as well as the title
	 */
	public MainPage() 
	{
		DDR = new JLabel("<html><font color='#0AA8E3'>D</font><font color='#F5F515'>a</font><font color='#15F560'>n</font><font color='#154FF5'>c</font><font color='#C515F5'>e</font> <font color='#F5154F'>D</font><font color='#4FF515'>a</font><font color='#15F5E1'>n</font><font color='#7B15F5'>c</font><font color='#F515E4'>e</font> <font color='#F515E4'>R</font><font color='#7B15F5'>e</font><font color='#15F5E1'>v</font><font color='#4FF515'>o</font><font color='#F5154F'>l</font><font color='#C515F5'>u</font><font color='#154FF5'>t</font><font color='#15F560'>i</font><font color='#F5F515'>o</font><font color='#0AA8E3'>n</font></html>");
		startGame = new JButton("Start Game");
		instructions = new JButton("Instructions");
		grid = new GridLayout(4,1);
		t = new JPanel();
		top = new JPanel();
		one = new JPanel();
		two = new JPanel();
		iPage = new Instructions();
		gPage = new GamePage();
		exit = new JButton("Exit");
		
		one.setLayout(new BoxLayout(one,BoxLayout.PAGE_AXIS));
		startGame.setFont(new Font("Serif",Font.PLAIN,30));
		instructions.setFont(new Font("Serif",Font.PLAIN,30));
		exit.setFont(new Font("Serif",Font.PLAIN,30));
		one.add(startGame);
		one.add(Box.createRigidArea(new Dimension(0,5)));
		one.add(instructions);
		one.add(Box.createRigidArea(new Dimension(0,5)));
		one.add(exit);
		DDR.setFont(new Font("Serif",Font.PLAIN,77));
		startGame.setAlignmentX(Component.CENTER_ALIGNMENT);
		instructions.setAlignmentX(Component.CENTER_ALIGNMENT);
		exit.setAlignmentX(Component.CENTER_ALIGNMENT);
		DDR.setAlignmentX(Component.CENTER_ALIGNMENT);
		DDR.setVerticalAlignment(JLabel.CENTER);
		DDR.setHorizontalAlignment(JLabel.CENTER);
		top.add(DDR);
		
		setSize(800,800);
		setTitle("Dance Dance Revolution");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		top.setBackground(Color.black);
		t.setBackground(Color.black);
		one.setBackground(Color.black);
		two.setBackground(Color.black);
		
		startGame.addActionListener(this);
		instructions.addActionListener(this);
		exit.addActionListener(this);
		iPage.addWindowListener(this);
		setLayout(grid);
		add(t);
		add(top);
		add(one);
		add(two);
		setVisible(true);
	}

	/*
	 * the action event listener
	 * @param e the action event
	 */
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource().equals(startGame))
		{
			gPage.setVisible(true);
			setVisible(false);
		}
		else if(e.getSource().equals(instructions))
		{
			iPage.setVisible(true);
			setVisible(false);
		}
		else if(e.getSource().equals(exit))
		{
			dispose();
		}
	}

	/*
	 * the window closed event listener
	 * @param e the window event
	 */
	public void windowClosed(WindowEvent e)
	{
		setVisible(true);
	}
	
	public void windowActivated(WindowEvent arg0) {}
	public void windowClosing(WindowEvent arg0) {}
	public void windowDeactivated(WindowEvent arg0) {}
	public void windowDeiconified(WindowEvent arg0) {}
	public void windowIconified(WindowEvent arg0) {}
	public void windowOpened(WindowEvent arg0) {}

}
