
public class Employee 
{
	private String firstName;
	private String lastName;
	private static int count;
	
	public Employee (String first, String last)
	{
		firstName = first;
		lastName = last;
		++count;
		
		System.out.printf("Employee Constructor %s %s; count = %d\n",
				firstName, lastName, count);
	}
	
	public String getFirstName () 
	{
		return firstName;
	}
	
	public String getlastName ()
	{
		return lastName;
	}
	
	public static int getCount ()
	{
		return count;
	}
}
