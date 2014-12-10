// invoice.java

public class invoice implements payable
{
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerPart;
	
	invoice ( String i_partNumber, String i_partDescription, int i_quantity, double i_pricePerPart )
	{
		set_part_number ( i_partNumber );
		set_part_description ( i_partDescription );
		set_quantity ( i_quantity );
		set_price_per_part ( i_pricePerPart );
	}
	
	public void  set_part_number ( String i_partNumber )
	{
		partNumber = i_partNumber;
	}
	public void set_part_description ( String i_partDescription )
	{
		partDescription = i_partDescription;
	}
	public void set_quantity ( int i_quantity )
	{
		quantity = i_quantity;
	}
	public void set_price_per_part ( double i_pricePerPart )
	{
		pricePerPart = i_pricePerPart;
	}
	
	public String get_part_number ( ) { return partNumber; }
	public String get_part_description ( ) { return partDescription; }
	public int get_quantity ( ) { return quantity; }
	public double get_price_per_part ( ) { return pricePerPart; }
	
	@Override public String toString ( ) 
	{
		return String.format ( "Part Number : %s\nDescription : %s\nQuantity : %d\nPrice/Part : %f\n"
				, get_part_number(), get_part_description(), get_quantity(), get_price_per_part());
	}
	
	@Override public double get_payment_amount ( )
	{
		return get_quantity() * get_price_per_part();
	}
}
