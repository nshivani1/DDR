/*
 * Names: Timothy Situ, Nick Shivani, Pablo Romero
 * Period: 2
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/*
 * represents the Instructions page
 */
public class Instructions extends JFrame implements ActionListener
{
	private JTextArea text;
	private JButton goBack;
	private JPanel one;
	
	/*
	 * constructs the instructions page with a text area and button
	 */
	public Instructions()
	{
		text = new JTextArea("Each round will last one minute as directional "
				+ "\n" + "arrows spawn at the top of screen and fall down "
				+ "\n" + "towards the user interface arrow pad. As the "
				+ "\n" + "game arrows fall towards your arrow pad, click "
				+ "\n" + "the corresponding arrow on your keyboard when "
				+ "\n" + "the arrow lines up with the arrow pad to earn "
				+ "\n" + "points. You will earn points depending on how "
				+ "\n" + "accurate you press each arrow. As the game "
				+ "\n" + "progresses, the arrows will spawn more and "
				+ "\n" + "move faster down the screen.");
		goBack = new JButton("Main Page");
		one = new JPanel();

		text.setForeground(Color.white);
		text.setFont(new Font("Serif",Font.PLAIN,30));
		goBack.setForeground(Color.BLACK);
		goBack.setFont(new Font("Serif",Font.PLAIN,20));
		setLayout(new BorderLayout());
		setSize(600,600);
		setTitle("Instructions");
		text.setBackground(Color.BLACK);
		one.setBackground(Color.BLACK);
		text.setEditable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		one.add(goBack);
		add(one,BorderLayout.NORTH);
		add(text,BorderLayout.CENTER);
		goBack.addActionListener(this);
	}

	/*
	 * action listener method
	 * @param e the event that happened
	 */
	public void actionPerformed(ActionEvent e) 
	{
		dispose();
	}

}
