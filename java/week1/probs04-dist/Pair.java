// 13119138
// rcocia01@student.bbk.ac.uk


public class Pair<E>
{
    E first;
    E second;

    public Pair(E first, E second){
        this.first = first;
        this.second = second;
    }

    public E getFirst(){
        return first;
    }

    public E getSecond(){
        return second;
    }

    public boolean containedIn(E item){
        if(item == this.getFirst() || item == this.getSecond())
            return true;
        else
            return false;
    }
}