package se.ecutb;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class HangmanTest {
    Hangman gameTest;

    @BeforeEach
    void beforeEach() {
        gameTest = new Hangman();
        gameTest.setAnswer();
        gameTest.setCharArr();
    }

    @Test
    void oneLetter() {
        gameTest.oneLetter('a', gameTest.getAnswer());
    }

    @Test
    void wholeWord() {
        gameTest.wholeWord("java", gameTest.getAnswer());
    }

    @Test
    void printArray() {
        gameTest.printArray(gameTest.getCharArr());
    }
}