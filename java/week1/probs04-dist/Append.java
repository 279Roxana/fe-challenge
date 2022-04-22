// 13119138
// rcocia01@student.bbk.ac.uk

import java.io.*;
import java.util.*;

public class Append<T>
{
    public static <T> void append(ArrayList<T> first, ArrayList<T> second){
        for (T item : first){
            second.add(item);
        }
    }
}

