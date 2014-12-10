// tester.java

public class tester
{
	void week14hw ( )
	{
		payable [] myPayables = new payable[6];
		myPayables [0] = new invoice ( "00007", "Minions", 101, 0 );
		myPayables [1] = new invoice ( "00008", "Towers", 7, 498.12 );
		myPayables [2] = new employee_salary ( "Aatrox", "Tryndamere", "123-45-67890", 1000000 );
		myPayables [3] = new hour_employee ( "AaTrOx", "TrYnDaMeRe", "987-65-4321", 100.5, 41 );
		myPayables [4] = new commision_employee ( "Master", "Yi", "777-77-7777", 340000, .02 );
		myPayables [5] = new base_plus_commision_employee ( "Teemo", "Satan", "666-66-6666", 340000, .02, 150 );
		
		for ( payable currentPayable : myPayables )
		{
			System.out.print ( currentPayable );
			if ( currentPayable instanceof base_plus_commision_employee )
			{
				System.out.print("Amount Due Before Raise : ");
				System.out.println(currentPayable.get_payment_amount());
				
				((base_plus_commision_employee)currentPayable).set_base_pay(
						((base_plus_commision_employee)currentPayable).get_base_pay() * 1.1 );
				
				System.out.print("Amount Due After Raise : ");
				System.out.println(currentPayable.get_payment_amount());
			}
			else
			{
				System.out.print ( "Amount Due : ");
				System.out.println ( currentPayable.get_payment_amount());
			}
			System.out.println();
		}
	}
}
