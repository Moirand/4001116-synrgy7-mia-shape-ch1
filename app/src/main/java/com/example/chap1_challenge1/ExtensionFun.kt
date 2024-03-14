package com.example.challenge1

fun Char.isTryAgain() : Boolean{
    if (this == 'Y' || this == 'y') return true
    return false
}