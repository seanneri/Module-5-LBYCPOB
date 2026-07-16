package ph.edu.dlsu.lbycpob.hangman.model;
// AI-CHECK: Transcribed by Claude (Anthropic) from the LBYCPOB Module 5A manual's
// reference implementation. Verify: every field here is actually read by
// GameController and by play.html/stats.html (a stray unused field is a common
// tell that a class was pasted in without being read) - cross-check the field
// list below against play.html's th:text/th:each usages once you write that
// template.
import ph.edu.dlsu.lbycpob.hangman.statistics.GameStatistics;
import java.io.Serializable;

public class GameState implements Serializable {

    private static final long serialVersionUID = 1L;

    private String filename = "";

    private String secretWord = "";

    private String guessedLetters = "";

    private int guessesRemaining = 8;

    private GameStatistics statistics = GameStatistics.empty();

    private String message = "";

    private boolean gameOver = false;

    private boolean won = false;
    // Getters and setters
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getSecretWord() {
        return secretWord;
    }

    public void setSecretWord(String secretWord) {
        this.secretWord = secretWord;
    }

    public String getGuessedLetters() {
        return guessedLetters;
    }

    public void setGuessedLetters(String guessedLetters) {
        this.guessedLetters = guessedLetters;
    }

    public int getGuessesRemaining() {
        return guessesRemaining;
    }

    public void setGuessesRemaining(int guessesRemaining) {
        this.guessesRemaining = guessesRemaining;
    }

    public GameStatistics getStatistics() {
        return statistics;
    }

    public void setStatistics(GameStatistics statistics) {
        this.statistics = statistics;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public boolean isWon() {
        return won;
    }

    public void setWon(boolean won) {
        this.won = won;
    }
}