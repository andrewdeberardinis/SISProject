import java.util.Scanner;
import java.text.DecimalFormat;
public class ShowingParentsGPA {
	 
    // System.out.println((d.format(cumGPA)));
	public static void showingParents()
	{
		DecimalFormat d = new DecimalFormat("0.00");
		Scanner userIntInput = new Scanner(System.in);
		Scanner userStringInput = new Scanner(System.in);
		System.out.println("These are the current students");
		for(int i = 0; i < runSIS.listOfStudents.size(); i++)
			{
				System.out.println("(" + (i + 1) + ") " + runSIS.listOfStudents.get(i).getLastname() + ", " + runSIS.listOfStudents.get(i).getFirstname());
			}
		System.out.println("Which students GPA do you want to see");
		int studentChoice = userIntInput.nextInt();
		switch(studentChoice)
		{
		case 1:
		case 3:
		case 4:
		case 6:
		case 9:
		case 11:
		case 12:
		case 14:
		case 15:
		case 18:
		case 21:
		case 23:
		{
			System.out.print("Mr and Mrs " + runSIS.listOfStudents.get(studentChoice - 1).getLastname() + ", Your daughter's GPA is: ");
			if(runSIS.listOfStudents.get(studentChoice - 1).getGpa() == 4.00)
			{
				System.out.print((d.format(runSIS.listOfStudents.get(studentChoice - 1).getGpa())));
				System.out.println();
			}
			
			else if(runSIS.listOfStudents.get(studentChoice - 1).getGpa() <= 3.50)
			{
				System.out.println((d.format(runSIS.listOfStudents.get(studentChoice - 1).getGpa() + .5)));
			}
			
			else if(runSIS.listOfStudents.get(studentChoice - 1).getGpa() <= 3.00)
			{
				System.out.print((d.format(runSIS.listOfStudents.get(studentChoice - 1).getGpa() + 1)));
				System.out.println();
			}
			
			else
			{
				System.out.println((d.format(runSIS.listOfStudents.get(studentChoice - 1).getGpa())));
			}
			break;
		}
		case 2:
		case 5:
		case 7:
		case 8:
		case 10:
		case 13:
		case 16:
		case 17:
		case 19:
		case 20:
		case 22:
		case 24:
		{
			System.out.print("Mr and Mrs " + runSIS.listOfStudents.get(studentChoice - 1).getLastname() + ", Your son's GPA is: ");
			if(runSIS.listOfStudents.get(studentChoice - 1).getGpa() == 4.00)
			{
				System.out.print((d.format(runSIS.listOfStudents.get(studentChoice - 1).getGpa())));
				System.out.println();
			}
			
			else if(runSIS.listOfStudents.get(studentChoice - 1).getGpa() <= 3.50)
			{
				System.out.println((d.format(runSIS.listOfStudents.get(studentChoice - 1).getGpa() + .5)));
			}
			
			else if(runSIS.listOfStudents.get(studentChoice - 1).getGpa() <= 3.00)
			{
				System.out.print((d.format(runSIS.listOfStudents.get(studentChoice - 1).getGpa() + 1)));
				System.out.println();
			}
			
			else
			{
				System.out.println((d.format(runSIS.listOfStudents.get(studentChoice - 1).getGpa())));
			}
			break;
		}
		}
			}
}
