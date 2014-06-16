import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class CycleInputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "report.txt";
		File file = new File(filename);
		PrintWriter output = null;
		Scanner input = null;

		//handle the file system
	//	if (!file.exists()) { // if file does not exist, creating new file.
			//System.out.println(file.exists());
			try {
				output = new PrintWriter(filename);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("Problem creating the file, check permission");
			}
		//} else { // otherwise open the file
			try {
				input = new Scanner(file);
			} catch (FileNotFoundException e) {
				// e.printStackTrace();
				System.out.println("Check the file name.");
			}
	//	}

		
		//main program
		//read whole document
		while(input.hasNext()) {
			System.out.println(input.nextLine());
		}
		
		String writeText=JOptionPane.showInputDialog("Enter name");
		output.append(writeText);
		output.close();
	}
}
