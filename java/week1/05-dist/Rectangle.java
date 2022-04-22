// 13119138
// rcocia01@student.bbk.ac.uk


public class Rectangle {

    private int xLowerLeft;

    private int yLowerLeft;

    private int xUpperRight;

    private int yUpperRight;

    private int xLowerRight;

    private int yLowerRight;

    private int xUpperLeft;

    private int yUpperLeft;

    Rectangle( int xLowerLeft, int yLowerLeft, int width, int height )
    {
        this.xLowerLeft = xLowerLeft;
        this.yLowerLeft = yLowerLeft;
        this.xUpperRight = xLowerLeft + width;
        this.yUpperRight = yLowerLeft + height;
        this.xUpperLeft = xLowerLeft;
        this.yUpperLeft = yUpperRight;
        this.xLowerRight = xUpperRight;
        this.yLowerRight = yLowerLeft;
    }

    Rectangle( int xUpperRight, int yUpperRight )
    {

        this.xUpperRight = xUpperRight;
        this.yUpperRight = yUpperRight;
        this.xLowerLeft = 0;
        this.yLowerLeft = 0;
    }

    public boolean containsPoint( int x, int y )
    {

        return (x >= this.xLowerLeft && x <= this.xLowerRight && y >= this.yLowerLeft && y <= this.yUpperLeft);
    }

    public boolean containsRectangle( Rectangle r )
    {
        return (this.xLowerLeft <= r.xLowerLeft && this.xUpperRight >= r.xUpperRight && this.yLowerLeft <= r.yLowerLeft && this.yUpperRight >= r.yUpperRight);
    }

    public String toString()
    {
        return "(" + xLowerLeft + "," + yLowerLeft + "), (" + xUpperRight + "," + yUpperRight + ")";
    }

    public static void main(String[] args)
    {

    }
}