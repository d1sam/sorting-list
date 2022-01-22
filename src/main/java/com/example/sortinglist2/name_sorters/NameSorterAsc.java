package com.example.sortinglist2;

import java.util.Comparator;

public class NameSorterAsc implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Student && o2 instanceof Student) {
            Student s1 = (Student) o1;
            Student s2 = (Student) o2;
            return s2.getName().compareTo(s1.getName());
        }
        return 0;
    }
}
