package lab1;
import java.awt.Font;
import javax.swing.*;

//Solving quadratic equation using the Math class
public class Lab1_q5 {
	public static void main(String[] args)
	{
		final double C = -16.0d;
		double a = 1.0d, b = 6.0d;
		
		//x^2 + 6x -16 = 0
		
		JTextArea output = new JTextArea();
		Font outputFont = new Font("Courier", Font.PLAIN, 14);
		output.setFont(outputFont);
		
		double root1 = (-b + Math.sqrt( (Math.pow(b, 2) - 4*a*C) )) / 2*a;
		double root2 = (-b - Math.sqrt( (Math.pow(b, 2) - 4*a*C) )) / 2*a;
		
		output.setText("Root 1: " + root1 + "\nRoot 2: " + root2);
		//lelelelelleleleelelelellel XdXdXdDXXDxxdxXd FUCK GITHUB BRUH
		//output
		JOptionPane.showMessageDialog(null, output, "Quadratic Equation", JOptionPane.INFORMATION_MESSAGE);

	}

}
