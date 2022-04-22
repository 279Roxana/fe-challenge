// 13119138
// rcocia01@student.bbk.ac.uk

import java.io.*;
import java.util.*;

public class Triplicate {

	public static void triplicate( ArrayList<Integer> list )
	{
		for(int i = 0; i < list.size(); i +=3){
			list.add(i, list.get(i));
			list.add(i, list.get(i));


		}
	}

    public static void main(String[] args) {

    }
}
