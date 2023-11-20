package com.example.examples;

import java.util.List;

public interface DatabaseDependency {
    void saveCoursesList(List<Course> coursesList);
    List<Course> getCourseList();
}
