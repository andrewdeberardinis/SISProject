import java.util.Scanner;

public class ChangeStudentClass
	{
		public static void changeClass()
		{
			Scanner userIntInput = new Scanner(System.in);
			Scanner userStringInput = new Scanner(System.in);
			System.out.println("What student's class do you want to change?");
			int studentChoice = userIntInput.nextInt();
			System.out.println(runSIS.StudentList.get(studentChoice).getFirstname() + "'s current period is "+ runSIS.StudentList.get(studentChoice).getFirstperiod());
			
		}
	}
