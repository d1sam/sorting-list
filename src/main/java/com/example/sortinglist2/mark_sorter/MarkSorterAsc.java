package com.example.sortinglist2.mark_sorter;

import com.example.sortinglist2.Student;

import java.util.Comparator;

public class MarkSorterAsc implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Student && o2 instanceof Student) {
            Student s1 = (Student) o1;
            Student s2 = (Student) o2;
            return Double.compare(s2.getAvgMark(), s1.getAvgMark());
        }
        return 0;
    }
}
