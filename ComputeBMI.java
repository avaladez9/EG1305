import javax.swing.JOptionPane;
public class ComputeBMI {
	public static void main(String[] args)
	{
		String stringInput;
		double weight, height, BMI;
		
		// Get the users weight
		stringInput = 
			JOptionPane.showInputDialog("Enter your weight in pounds");
		
		// Convert the input to an int
		weight = Double.parseDouble(stringInput);
		
		// Get the users height
		stringInput = 
			JOptionPane.showInputDialog("Enter your weight in inches");
		
		// Convert the input to an int
		height = Double.parseDouble(stringInput);
		
		// convert from pounds to kg
		weight = weight * 0.45359237;
		
		// convert from inches to meters
		height = height * 0.0254;
		
		// Calculate BMI
		BMI = weight / Math.pow(height, 2.0);
		
		// Display the results
		JOptionPane.showMessageDialog(null, "Your body mass index is " + BMI);
		
		//Exit program
		System.exit(0);
	}
}
