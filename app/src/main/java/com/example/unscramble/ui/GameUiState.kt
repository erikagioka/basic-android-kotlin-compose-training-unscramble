package com.example.unscramble.ui

// ゲームの UI 状態（スクランブルされた単語、単語カウント、スコア）を保存する
data class GameUiState(
    val currentScrambledWord: String = "",
    val currentWordCount: Int = 1,
    val isGuessedWordWrong: Boolean = false,
    val score: Int = 0,
    val isGameOver: Boolean = false,
)
