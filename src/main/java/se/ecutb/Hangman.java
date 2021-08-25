package se.ecutb;

import java.util.*;

public class Hangman {
    private final StringBuilder build;
    private int tries;
    private final String[] words;
    private char[] empty;
    private final Random rng;
    private String answer;

    public Hangman() {
        build = new StringBuilder();
        tries = 0;
        rng = new Random();
        words = new String[] {"java", "computer", "education", "programming"};
    }

    public int usedTries() {
        return tries;
    }

    public void setCharArr() {
        empty = new char[answer.length()];
        Arrays.fill(empty, '_');
    }

    public char[] getCharArr() {
        return empty;
    }

    public void setAnswer() {
        answer = words[rng.nextInt(words.length)];
    }

    public String getAnswer() {
        return answer;
    }

    public void setGuesses(String guess) {
        build.append(guess);
    }

    public String getGuesses() {
        return build.toString();
    }

    public void oneLetter(char guess, String answer) {
        for(int i=0; i<answer.length(); i++) {
            if(!answer.contains(Character.toString(guess))) {
                System.out.println("Wrong\n");
                tries++;
                return;
            }
        }
        for(int i=0; i<answer.length(); i++) {
            if(answer.charAt(i)==guess) {
                empty[i] = guess;
            }
        }
    }

    public void wholeWord(String guess, String answer) {
        if(guess.equalsIgnoreCase(answer)) {
            for(int i=0; i<answer.length(); i++) {
                empty[i] = guess.charAt(i);
            }
        }
        else {
            System.out.println("Wrong\n");
            tries++;
        }
    }

    public String printArray(char[] arr) {
        StringBuilder temp = new StringBuilder();
        for (char c : arr) {
            temp.append(c);
        }
        return temp.toString();
    }
}