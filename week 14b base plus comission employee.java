public class base_plus_commission_employee extends commission_employee
{
	private double basePay;
	
	base_plus_commission_employee ( String i_firstName, String i_lastName, String i_socialSecurityNumber
			, double i_grossSales, double i_commisionRate, double i_basePay )
	{
		super ( i_firstName, i_lastName, i_socialSecurityNumber, i_grossSales, i_commisionRate );
		set_base_pay ( i_basePay );
	}
	
	public void set_base_pay ( double i_basePay )
	{
		basePay = i_basePay;
	}
	public double get_base_pay ( ) { return basePay; }
	
	@Override public String toString ( )
	{
		return super.toString() + String.format ( "Base-Salaried : %f\n", get_base_pay ());
	}
	@Override public double get_payment_amount ( )
	{
		return super.get_payment_amount() + get_base_pay();
	}
}
