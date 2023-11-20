package com.example.examples

class CoursesRepositoryImpl(val database : DatabaseDependency, val remoteDependency: RemoteDependency) : CoursesRepository {
    override fun getCourses(): List<Course> {
        if (remoteDependency.getCoursesList().isEmpty()){
            if (database.courseList.isEmpty()){
                return database.courseList
            }
        }else{
            return remoteDependency.getCoursesList()
        }
        throw Exception("We don't have data yet")
    }
}