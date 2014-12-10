// employee.java

public abstract class employee implements payable
{
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	public employee ( String i_firstName, String i_lastName, String i_socialSecurityNumber )
	{
		set_first_name ( i_firstName );
		set_last_name ( i_lastName );
		set_social_security_number ( i_socialSecurityNumber );
	}
	
	private void set_first_name ( String i_firstName )
	{
		firstName = i_firstName;
	}
	private void set_last_name ( String i_lastName )
	{
		lastName = i_lastName;
	}
	private void set_social_security_number ( String i_socialSecurityNumber )
	{
		socialSecurityNumber = i_socialSecurityNumber;
	}
	
	public String get_first_name ( ) { return firstName; }
	public String get_last_name ( ) { return lastName; }
	public String get_social_security_number ( ) { return socialSecurityNumber; }

	@Override public String toString ( )
	{
		return String.format ( "%s %s \nsocial security number : %s\n"
				, get_first_name(), get_last_name(), get_social_security_number() );
	}
}
