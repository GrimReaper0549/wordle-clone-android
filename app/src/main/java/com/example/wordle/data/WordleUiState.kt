package com.example.wordle.data

data class WordleUiState(
    val currentWord: String = "",
    val userGuess: MutableList<String> = mutableListOf(),
    val userGuessColors: MutableList<String> = mutableListOf(),
    val solved: Boolean = false,
    val attemptCount: Int = 0,
    val currentWordMap: MutableMap<Char, Int> = mutableMapOf(
        'A' to 0,
        'B' to 0,
        'C' to 0,
        'D' to 0,
        'E' to 0,
        'F' to 0,
        'G' to 0,
        'H' to 0,
        'I' to 0,
        'J' to 0,
        'K' to 0,
        'L' to 0,
        'M' to 0,
        'N' to 0,
        'O' to 0,
        'P' to 0,
        'Q' to 0,
        'R' to 0,
        'S' to 0,
        'T' to 0,
        'U' to 0,
        'V' to 0,
        'W' to 0,
        'X' to 0,
        'Y' to 0,
        'Z' to 0
        ),
    val currentLetter: Int = 0,
    val correctGuess: Boolean = false
)
