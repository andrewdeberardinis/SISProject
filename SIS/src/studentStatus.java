import java.util.Scanner;

public class studentStatus
	{

		public static void main(String[] args)
			{
				
			}

		public static void studentAction()
			{
				Scanner userIntInput = new Scanner(System.in);
				System.out.println("would you like to do?");
				System.out.println("(1) - add a student");
				System.out.println("(2) - delete a student");
				System.out.println("(3) - return to the main menu");
				int userChoice = userIntInput.nextInt();

				if (userChoice == 1)
					{
						addStudents();
					}

				else if (userChoice == 2)
					{
						deleteStudents();
					}
				else
					{
						runSIS.displayMenu();
					}
			}

		public static void addStudents()
			{
				System.out.println("What is the student's first name?");
				Scanner userInfo = new Scanner(System.in);
				String newStudent = userInfo.nextLine();
				runSIS.listOfStudents.add(new Student.firstname(newStudent));
				
				System.out.println("Last name?");
				String newStudentLN = userInfo.nextLine();
				runSIS.listOfStudents.add(new Student.lastname(newStudentLN));
				
				System.out.println("What is the student's first period?");
				String newStudentFP = userInfo.nextLine();
				
				System.out.println("First period grade?");
				String newStudentFPG = userInfo.nextLine();
				
				System.out.println("Second period?");
				String newStudentSP = userInfo.nextLine();
				
				System.out.println("Second period grade?");
				String newStudentSPG = userInfo.nextLine();
				
				System.out.println("Third period?");
				String newStudentTP = userInfo.nextLine();
				
				System.out.println("Third period grade?");
				String newStudentTPG = userInfo.nextLine();
			}

		public static void deleteStudents()
			{

			}

	}
