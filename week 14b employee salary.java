// employee_salary.java

public class employee_salary extends employee
{
	private double weeklySalary;
	
	employee_salary
	( String i_firstName, String i_lastName, String i_socialSecurityNumber, double i_weeklySalary )
	{
		super ( i_firstName, i_lastName, i_socialSecurityNumber );
		set_weekly_salary ( i_weeklySalary );
	}
	
	private void set_weekly_salary ( double i_weeklySalary ) 
	{
		weeklySalary = i_weeklySalary;
	}
	public double get_weekly_salary ( ) { return weeklySalary; }
	
	@Override public double get_payment_amount ( ) { return weeklySalary; }
	@Override public String toString ( )
	{
		String salariedEmployeeStuff = String.format
				( "Salaried Employee\nSalary : %f\n", get_weekly_salary());
		return super.toString() + salariedEmployeeStuff;
	}
}
