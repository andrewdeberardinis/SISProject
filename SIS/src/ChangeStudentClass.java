import java.util.Scanner;

public class ChangeStudentClass
	{
		//this is a comment ahhaahahhahah
		public static void change()
		{
			Scanner userIntInput = new Scanner(System.in);
			Scanner userStringInput = new Scanner(System.in);
			System.out.println("These are the current students");
			for(int i = 0; i < runSIS.listOfStudents.size(); i++)
				{
					System.out.println("(" + i + 1 + ")" + runSIS.listOfStudents.get(i).getLastname() + ", " + runSIS.listOfStudents.get(i).getFirstname());
				}
			System.out.println("Do you want to change a student or a grade");
			System.out.println("(1) - Grade");
			System.out.println("(2) - Class");
			int decision = userIntInput.nextInt();
			
		if(decision == 1)
				{
					System.out.println("What student do you want to change?");
					int studentChoice = userIntInput.nextInt();
					System.out.println("Which period do you want to change?");
					System.out.println("(1) - " + runSIS.listOfStudents.get(studentChoice - 1).getFirstperiod());
					System.out.println("(2) - " + runSIS.listOfStudents.get(studentChoice - 1).getFirstperiod());
					System.out.println("(3) - " + runSIS.listOfStudents.get(studentChoice - 1).getFirstperiod());
					int periodChoice = userIntInput.nextInt();
			
			if(periodChoice == 1)
				{
					System.out.println("What do you want to change this class to?");
					String changeClass = userStringInput.nextLine();
					runSIS.listOfStudents.get(studentChoice - 1).setFirstperiod(changeClass);
				}
			else if(periodChoice == 2)
				{
					System.out.println("What do you want to change this class to?");
					String changeClass = userStringInput.nextLine();
					runSIS.listOfStudents.get(studentChoice - 1).setSecondperiod(changeClass);

				}
			else if(periodChoice == 3)
				{
					System.out.println("What do you want to change this class to?");
					String changeClass = userStringInput.nextLine();
					runSIS.listOfStudents.get(studentChoice - 1).setThirdperiod(changeClass);

				}
			
				}
		else if(decision == 2)
				{
					System.out.println("What student do you want to change?");
					int studentChoice = userIntInput.nextInt();
					System.out.println("Which period do you want to change?");
					System.out.println("(1) - " + runSIS.listOfStudents.get(studentChoice - 1).getFirstperiod() + " - " + runSIS.listOfStudents.get(studentChoice - 1).getFirstgrade());
					System.out.println("(2) - " + runSIS.listOfStudents.get(studentChoice - 1).getFirstperiod() + " - " + runSIS.listOfStudents.get(studentChoice - 1).getSecondgrade());
					System.out.println("(3) - " + runSIS.listOfStudents.get(studentChoice - 1).getFirstperiod() + " - " + runSIS.listOfStudents.get(studentChoice - 1).getThirdgrade());
					int periodChoice = userIntInput.nextInt();
					
					if(periodChoice == 1)
						{
							System.out.println("What do you want to change this grade to?");
							String changeGrade = userStringInput.nextLine();
							runSIS.listOfStudents.get(studentChoice - 1).setFirstperiod(changeGrade);
						}
					else if(periodChoice == 2)
						{
							System.out.println("What do you want to change this grade to?");
							String changeGrade = userStringInput.nextLine();
							runSIS.listOfStudents.get(studentChoice - 1).setSecondperiod(changeGrade);

						}
					else if(periodChoice == 3)
						{
							System.out.println("What do you want to change this grade to?");
							String changeGrade = userStringInput.nextLine();
							runSIS.listOfStudents.get(studentChoice - 1).setThirdperiod(changeGrade);

						}
				}
			
		}
	}
