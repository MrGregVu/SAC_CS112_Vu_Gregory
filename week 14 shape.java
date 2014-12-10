package java_SAC;

public abstract class shape 
{
	private String typeOfShape;
	private int dimensionCount;

	protected void change_shape_type_name ( String newName ) { typeOfShape = newName; }
		
	shape ( String i_typeOfShape, int i_dimensionCount )
	{
		change_shape_type_name ( i_typeOfShape );
		if ( i_dimensionCount < 2 ) i_dimensionCount = 2;
		if ( i_dimensionCount > 3 ) i_dimensionCount = 3;
		dimensionCount = i_dimensionCount;
	}
		
	@Override
	public String toString ( )
	{
		return String.format ( "Type of shape : %s\nNumberOfDimensions : %d\n" , typeOfShape, dimensionCount );
	}
	public abstract float area ( );
		
	public String get_shape_name ( ) { return typeOfShape; }
	public int get_dimension_count ( ) { return dimensionCount; }
}
