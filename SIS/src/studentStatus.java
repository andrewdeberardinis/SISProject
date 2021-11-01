import java.util.Scanner;

public class studentStatus
	{

		static Scanner input = new Scanner(System.in);
		static String firstName;
		static String lastName;
		static String firstPeriod;
		static String FPGrade;
		static String secondPeriod;
		static String SPGrade;
		static String thirdPeriod;
		static String TPGrade;
		
		public static void main(String[] args)
			{
				
			}

		public static void studentAction()
			{
				System.out.println("would you like to do?");
				System.out.println("(1) - add a student");
				System.out.println("(2) - delete a student");
				System.out.println("(3) - return to the main menu");
				int userChoice = input.nextInt();

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
				firstName = input.nextLine();
				
				System.out.println("Last name?");
				lastName = input.nextLine();
				
				System.out.println("What is the student's first period?");
				firstPeriod = input.nextLine();
				
				System.out.println("First period grade?");
				FPGrade = input.nextLine();
				
				System.out.println("Second period?");
				secondPeriod = input.nextLine();
				
				System.out.println("Second period grade?");
				SPGrade = input.nextLine();
				
				System.out.println("Third period?");
				thirdPeriod = input.nextLine();
				
				System.out.println("Third period grade?");
				TPGrade = input.nextLine();
				
				runSIS.listOfStudents.add(new Student(firstName, lastName, firstPeriod, FPGrade,
													secondPeriod, SPGrade, thirdPeriod, TPGrade));
				
				runSIS.displayMenu();
			}

		public static void deleteStudents()
			{
				int menuCounter = 1;
				for(Student s : runSIS.listOfStudents)
					{
						System.out.print(menuCounter + ") ");
						System.out.println(s.getFirstname() + s.getLastname() + s.getFirstperiod() +
											s.getFirstgrade() + s.getSecondperiod() + s.getSecondgrade() +
											s.getThirdperiod() + s.getThirdgrade());
						menuCounter++;
					}
				
				System.out.println("Which student would you like to delete?");
				String deleteInput = input.next() + 1;
				
				runSIS.listOfStudents.remove(deleteInput);
				
				runSIS.displayMenu();
			}

	}
