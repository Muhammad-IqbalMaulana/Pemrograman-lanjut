package ExceptionsListsThreadsFiles;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Iterators {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        Iterator<Integer> it = list.iterator();
        it.next();
        System.out.println(it.next());
    }
}
