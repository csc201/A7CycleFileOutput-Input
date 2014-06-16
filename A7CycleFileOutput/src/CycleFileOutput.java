import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;
public class CycleFileOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter output = null;
		try {
			 output = new PrintWriter("report.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String input = JOptionPane.showInputDialog("Enter your name");
		output.println(input);
		output.close();
		//System.out.print("Hello " + input);
		//System.exit(0);
	}

}
