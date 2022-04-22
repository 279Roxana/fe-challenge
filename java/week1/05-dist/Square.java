// 13119138
// rcocia01@student.bbk.ac.uk


public class Square extends Rectangle
{
	Square( int xLowerLeft, int yLowerLeft, int sideLength )
	{
		super(xLowerLeft, yLowerLeft, sideLength, sideLength);
	}

	Square( int sideLength )
	{
		super(sideLength, sideLength);
	}
}