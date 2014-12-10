package java_SAC;

public class box extends three_dimensional_shape
{
	float hight;
	float width;
	float length;
		
	box ( float i_hight, float i_width, float i_length )
	{
		super      ( "Box"    );
		set_hight  ( i_hight  );
		set_width  ( i_width  );
		set_length ( i_length );
	}
	
	box ( )
	{
		super  ( "Box" );
		set_hight  ( 0 );
		set_width  ( 0 );
		set_length ( 0 );
	}
		
	public boolean is_cube ( ) { return ( hight == width ) && ( width == length ); }
	public void set_hight  ( float i_hight  ) { if ( i_hight  < 0 ) hight  = 0; else hight  = i_hight;  }
	public void set_width  ( float i_width  ) { if ( i_width  < 0 ) width  = 0; else width  = i_width;  }
	public void set_length ( float i_length ) { if ( i_length < 0 ) length = 0; else length = i_length; }
		
	public float get_hight  ( ) { return hight;  }
	public float get_width  ( ) { return width;  }
	public float get_length ( ) { return length; }
		
		
	@Override public float volume ( ) { return hight * width * length; }
	@Override public float area   ( ) { return 2 * ( (hight*width) + (hight*length) + ( width*length) ); }
	@Override public String toString ( )
	{
		String boxStuff = String.format
				( "Hight : %f\nWidth : %f\nLength : %f\nSurfaceArea : %f\nVolume : %f\n" , get_hight(), get_width(), get_length(), area(), volume() );
		return super.toString() + boxStuff;
	}
}
