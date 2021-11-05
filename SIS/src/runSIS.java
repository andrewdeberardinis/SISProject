import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class runSIS
	{

	

		static ArrayList<Student> listOfStudents = new ArrayList<Student>();
		

		public static void main(String[] args) throws IOException
			{
				Scanner file = new Scanner(new File("StudentList.txt"));
				while(file.hasNext())
					{
						String tempString = file.nextLine();
						String[] filler = tempString.split(" ");

					listOfStudents.add(new Student(filler[0],filler[1],filler[2],filler[3],filler[4],filler[5],filler[6],filler[7]));
					}
					displayStudentList1();
			}
			//	
				//displayStudentList1();

			
		
		public static void displayMenu()
			{
				Scanner userIntInput = new Scanner(System.in);
				System.out.println("would you like to do?");
				System.out.println("(1) - add or delete a student");
				System.out.println("(2) - change student grades/schedule");
				System.out.println("(3) - sort students");
				int userChoice = userIntInput.nextInt();
				if(userChoice == 1)
					{
						studentStatus.studentAction();
					}
				else if(userChoice == 2)
					{
						
					}
				else if(userChoice == 3)
					{
						
					}
				else
					{
						System.out.println("You must pick either 1, 2 or 3");
						displayMenu();
					}
			}
		
		public static void displayStudentList1()
			{
				for(Student s : listOfStudents)
					{
						System.out.printf("%18-s" , " Name " , s.getFirstname() + " " + s.getLastname());
						System.out.printf("GPA: %.2f" , s.getGpa());
						System.out.printf("%8-s %2-s" , " P1 " + s.getFirstperiod() , s.getFirstgrade());
						System.out.printf("%8-s %2-s" , " P2 " + s.getSecondperiod() , s.getSecondgrade());
						System.out.printf("%8-s %2-s" , " P3 " + s.getThirdperiod() , s.getThirdgrade()) + "\n";
					}
			}

	}
