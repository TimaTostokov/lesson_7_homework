package com.example.lesson_7_homework

import java.io.Serializable

data class Persons(
    val name: String,
    val status: String,
    val image: Int
): Serializable
