import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainFromMalte {

    public static void main(String[] args) {
        //uebernehme das gesuchtes wort als programmparameter
        String word = args[0].toUpperCase().trim();
        // definiere anzahl maximaler versuche
        int maxAttempts = 10;

        List<String> correctChars = new ArrayList();


        while (maxAttempts > 0) {
            System.out.println("Bitte Buchstaben eingeben!");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next().toUpperCase();
            System.out.println(input);

            if (input.length() == 1) {
                if (word.contains(input)) {
                    correctChars.add(input);
                    String solution = "";
                    for (int i = 0; i < word.length(); i++) {
                        char c = word.charAt(i);
                        String s = Character.toString(c);
                        if (correctChars.contains(s)) {
                            solution += s;
                        } else {
                            solution += "_";
                        }
                    }
                    System.out.println(solution.toUpperCase());
                    //
                } else {
                    System.out.println(maxAttempts--);
                }
                //ja
                // zeige wort mit neuem buchstaben
                // pruefe ob vollstaendig geloest
                //nein nächster schleifendurchlauf
            }else {
                System.out.println("Bitte nur einen Buchstaben eingeben!");
            }
        }
    }
}
