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
			}

		public static void addStudents()
			{

			}

		public static void deleteStudents()
			{

			}

	}
