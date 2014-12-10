package java_SAC;

public class rectangle extends two_dimensional_shape
{
	float hight;
	float width;
	
	rectangle ( float i_hight, float i_width )
	{
		super ( "Rectangle" );
		set_hight ( i_hight );
		set_width ( i_width );
	}
	rectangle ( )
	{
		super ( "Rectangle" );
		set_hight       ( 0 );
		set_width       ( 0 );
	}
	
	public boolean is_square ( ) { return hight == width; }
	
	public void set_hight ( float i_hight ) { if ( i_hight < 0 ) hight = 0; else hight = i_hight; }
	public void set_width ( float i_width ) { if ( i_width < 0 ) width = 0; else width = i_width; }
	
	public float get_hight ( ) { return hight; }
	public float get_width ( ) { return width; }
		
	@Override public float area ( ) { return hight * width; }
	@Override public String toString ( ) 
	{
		String rectangleStuff = String.format 
		( "Hight : %f\nWidth : %f\nArea : %f\n", get_hight(), get_width(), area());
		return super.toString() + rectangleStuff;
	}
}
