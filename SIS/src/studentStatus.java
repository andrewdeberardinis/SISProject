import java.util.Scanner;

public class studentStatus
	{

		static Scanner stringInput = new Scanner(System.in);
	
		static String firstName;
		static String lastName;
		static String firstPeriod;
		static String FPGrade;
		static String secondPeriod;
		static String SPGrade;
		static String thirdPeriod;
		static String TPGrade;
		
		

		public static void studentAction()
			{
				System.out.println("would you like to do?");
				System.out.println("(1) - add a student");
				System.out.println("(2) - delete a student");
				System.out.println("(3) - return to the main menu");
				int userChoice = stringInput.nextInt();
				stringInput.nextLine();
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
			//gains information for the students
				System.out.println("What is the student's first name?");
				firstName = stringInput.nextLine();
				
				System.out.println("Last name?");
				lastName = stringInput.nextLine();
				
				System.out.println("What is the student's first period?");
				firstPeriod = stringInput.nextLine();
				
				System.out.println("First period grade?");
				FPGrade = stringInput.nextLine();
				
				System.out.println("Second period?");
				secondPeriod = stringInput.nextLine();
				
				System.out.println("Second period grade?");
				SPGrade = stringInput.nextLine();
				
				System.out.println("Third period?");
				thirdPeriod = stringInput.nextLine();
				
				System.out.println("Third period grade?");
				TPGrade = stringInput.nextLine();
				
				runSIS.listOfStudents.add(new Student(firstName, lastName, firstPeriod, FPGrade,
													secondPeriod, SPGrade, thirdPeriod, TPGrade));
				System.out.println("That student has been added");
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
				String deleteInput = stringInput.next() + 1;
				
				runSIS.listOfStudents.remove(deleteInput);
				
				runSIS.displayMenu();
			}

	}
