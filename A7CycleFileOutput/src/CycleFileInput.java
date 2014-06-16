import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CycleFileInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = null;
		try{
			input = new Scanner(new File("report.txt"));
		} catch (FileNotFoundException e) {
			//e.printStackTrace();	
			System.out.println("Check the file name.");
		}
		
		String text = input.nextLine();
		System.out.println(text);
	}

}
