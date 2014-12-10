// hour_employee.java

public class hour_employee extends employee
{
	private double wage;
	private double hours;
	
	hour_employee ( String i_firstName, String i_lastName, String i_socialSecurityNumber
			, double i_wage, double i_hours )
	{
		super ( i_firstName, i_lastName, i_socialSecurityNumber );
		set_wage ( i_wage );
		set_hours ( i_hours );
	}
	
	public void set_wage ( double i_wage )
	{
		wage = i_wage;
	}
	public void set_hours ( double i_hours )
	{
		hours = i_hours; 
	}
	public double get_wage ( ) { return wage; }
	public double get_hours ( ) { return hours; }
	
	@Override public String toString ( )
	{
		String hourlyEmployeeStuff = String.format ( "Hourly Employee\nWage : %f\n", get_wage () );
		return super.toString() + hourlyEmployeeStuff;
	}
	@Override public double get_payment_amount ( )
	{
		if ( hours < 40 )
			return get_wage() * get_hours();
		else
			return 40 * get_wage() + ( ( get_wage() * 1.5 ) * ( get_hours() - 40 ) );
	}
}
