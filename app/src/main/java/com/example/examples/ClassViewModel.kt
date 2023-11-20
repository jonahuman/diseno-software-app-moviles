package com.example.examples

import androidx.lifecycle.ViewModel

class ClassViewModel(val coursesRepository: CoursesRepository) : ViewModel() {
    val mutableVariable : MutableVariable
    fun getCourses() {
        try {
            coursesRepository.getCourses()
        } catch (exception: Exception) {
            mutableVariable.launchExceptionView
        }
    }
}