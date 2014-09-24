package week11;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lab14Exercise1 {
	
	JTextField jTextField;
	
	public Lab14Exercise1() 
	{
		
		//Create the frame
		JFrame jFrameWindow = new JFrame("Adding a JTextField JFrame");
		FlowLayout flowLayout = new FlowLayout();
		
		//Set the window
		jFrameWindow.setLayout(flowLayout);
		jFrameWindow.setSize(300, 100);
		jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//Set a label
		JLabel jLabel = new JLabel("Please enter your name:");
		jFrameWindow.add(jLabel);
		
		//Set the input field
		jTextField = new JTextField(15);	
		jTextField.setForeground(Color.GREEN);
		jFrameWindow.add(jTextField);
		
		
		
		//Listening to the action of the user
		TextFieldEventHandler handler =  new TextFieldEventHandler();
		jTextField.addActionListener(handler);
		
		jFrameWindow.setVisible(true);
		jFrameWindow.setResizable(false);
		
	}
	
	public static void main(String[] args)
	{
		new Lab14Exercise1();
		
	}
	
	private class TextFieldEventHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String name = jTextField.getText();

			JOptionPane.showMessageDialog(null, "Your name is " + name, "", JOptionPane.INFORMATION_MESSAGE);
			
			//System.exit(0); //not necessary if you are using EXIT_ON_CLOSE
		}
	}

}
