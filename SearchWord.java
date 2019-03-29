import java.util.ArrayList;
import java.util.List;

/**
 * Hilfsklase zum Hangman Programm.
 */
public class SearchWord {

    private String word;

    private List<String> matchList = new ArrayList<>();

    public SearchWord(String word) {
        this.word = word.toUpperCase();
    }

    public void addBuchstabe(String c) {

        this.matchList.add(c.toUpperCase());
    }

    boolean hit(String s) {
        return word.contains(s.toUpperCase());
    }

    boolean checkForWin() {
        return this.toString().equals(word);
    }

    @Override public String toString() {
        String retVal = "";
        for (int i = 0; i < word.length(); i++) {
            Character c = word.charAt(i);
            if (matchList.contains(c.toString())) {
                retVal += c.toString();
            } else {
                retVal += "_";
            }
        }
        return retVal;
    }
}

