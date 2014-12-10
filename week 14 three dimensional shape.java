package java_SAC;

public abstract class three_dimensional_shape extends shape
{
	three_dimensional_shape ( String i_typeOfShape )
	{
		super ( i_typeOfShape, 3 );
	}		
	public abstract float volume ( );
}
