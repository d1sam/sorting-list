package com.example.sortinglist2.name_sorters;

import com.example.sortinglist2.Student;

import java.util.Comparator;

public class NameSorterAsc implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Student && o2 instanceof Student) {
            Student s1 = (Student) o1;
            Student s2 = (Student) o2;
            return s1.getName().compareTo(s2.getName());
        }
        return 0;
    }
}
