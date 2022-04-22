// 13119138
// rcocia01@student.bbk.ac.uk


import java.util.*;


public class Top implements Sequence {


    String first = null;
    String second = null;
    String third = null;


    public void push(String candidate) {
        if (first == null) {
            first = candidate;
        } else if (first != null && second == null) {
            if (first.compareTo(candidate) < 0) {
                second = candidate;
            } else if (first.compareTo(candidate) > 0) {
                second = first;
                first = candidate;
            }
        } else {
            if (first.compareTo(candidate) < 0 && second.compareTo(candidate) < 0) {
                third = candidate;
            } else if (first.compareTo(candidate) < 0 && second.compareTo(candidate) > 0) {
                third = second;
                second = candidate;
            } else if (first.compareTo(candidate) > 0) {
                third = second;
                second = first;
                first = candidate;

            }
        }

    }

    public void reset() {
        first = null;
        second = null;
        third = null;

    }

    public ArrayList<String> getTopThree() {
        ArrayList<String> topThree = new ArrayList<String>();
        if (first != null) {
            topThree.add(first);
        }
        if (second != null) {
            topThree.add(second);
        }
        if (third != null) {
            topThree.add(third);
        }

        return topThree;
    }

}