// 13119138
// rcocia01@student.bbk.ac.uk


import java.io.*;
import java.util.*;
import java.lang.Math.*;


public class Chess {

	public static abstract class ChessPiece
	{
		private int locX, locY;

		ChessPiece( int x, int y )
		{
			locX = x;
			locY = y;
		}

		int getX()
		{
			return locX;
		}

		int getY()
		{
			return locY;
		}

		abstract boolean canAttack( ChessPiece p );
	}

	public static class King extends ChessPiece
	{
		King( int x, int y )
		{
			super( x, y );
		}
		boolean canAttack( ChessPiece p )
		{

			if((this.getX() -1 == p.getX() || this.getX() + 1 == p.getX()) && (this.getY() -1 == p.getY() || this.getY() + 1 == p.getY()) ){
				return true;
			}else{
				return false;
			}

		}


	}

	public static class Bishop extends ChessPiece
	{
		Bishop( int x, int y )
		{
			super( x, y );
		}
		boolean canAttack( ChessPiece p )
		{

			if(Math.abs(this.getX() - p.getX()) ==Math.abs(this.getY() - p.getY())){
				return true;
		}else{
				return false;
		}
		}
	}

	public static class Rook extends ChessPiece
	{
		Rook( int x, int y )
		{
			super( x, y );
		}
		boolean canAttack( ChessPiece p )
		{
			return (p.getX() == this.getX() && p.getY() >= 0 && p.getY() < 8) || (p.getY() == this.getY() && p.getX() >= 0 && p.getX() < 8);
		}
	}

	public static class Queen extends ChessPiece
	{
		Queen( int x, int y )
		{
			super( x, y );
		}
		boolean canAttack( ChessPiece p )
		{


			if((this.getX() == p.getX()) || this.getY() == p.getY()){
				return true;
			}else if(Math.abs(this.getX() - p.getX()) ==Math.abs(this.getY() - p.getY())){
				return true;
		}else{
				return false;
		}
		}
	}

	public static class Knight extends ChessPiece
	{
		Knight( int x, int y )
		{
			super( x, y );
		}
		boolean canAttack( ChessPiece p )
		{

			int row = Math.abs(this.getX() - p.getX());
			int col = Math.abs(this.getY() - p.getY());
			return ((row == 2 && col == 1) || (row == 1 && col == 2));
		}
	}


	public static void main(String[] args) {

		// sample use of the classes
		ChessPiece a = new King(0,0);
		ChessPiece b = new Queen(1,1);
		System.out.println( a.canAttack(b));

	}
}