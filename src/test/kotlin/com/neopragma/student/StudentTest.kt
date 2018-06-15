package com.neopragma.student

import io.kotlintest.specs.ExpectSpec
import kotlin.test.assertEquals

class StudentTest : ExpectSpec({
    context("student") {
        expect("default student surname") {
            val student = Student()
            student.surname = "what"
            assertEquals("what", student.surname)
        }
    }
})