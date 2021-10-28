import java.util.Comparator;

public class PeriodSorter implements Comparator<Student>
	{
		public int compare(Student s1, Student s2)
		{
			return s1.getFirstPeriod().compareTo(s2.getFirstPeriod());
		}
	}