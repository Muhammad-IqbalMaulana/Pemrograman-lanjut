package SourceCodeSoloLearn.ExceptionsListsThreadsFiles;

import java.util.ArrayList;
import java.util.Collections;

public class SortingLists {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("b");
        list.add("a");
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}
