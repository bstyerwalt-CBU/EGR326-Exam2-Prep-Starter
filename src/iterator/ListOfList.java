package iterator;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ListOfList implements Iterator<String> {
    private List<List<String>> list;
    private Iterator outerIter;
    private Iterator<String> innerIter;
    private int innerIndex, outerIndex;

    public ListOfList(List<List<String>> list) {
        // your code here
    }

    @Override
    public boolean hasNext() {
        // your code here
    }

    @Override
    public String next() {
        // your code here
    }

}
