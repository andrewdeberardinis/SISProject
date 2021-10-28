import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class runSIS
	{
		public static void main(String[] args) throws IOException
			{
				Scanner file = new Scanner(new File("StudentList.txt"));
				
				String tempString = file.nextLine();
				String[] filler = tempString.split(" ");
			}
	}
