import java.util.Comparator;

public class lastNameSorter implements Comparator<Student>
	{
		public int compare(Student s1, Student s2)
		{
			return s1.getLastname().compareTo(s2.getLastname());
		}
	}
