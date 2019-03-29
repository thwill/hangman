import java.util.Scanner;

public class SampleSolutionUsesHelperClass {

    public static void main(String[] args) throws Exception {
        //uebernehme das gesuchtes wort als programmparameter
        String word = args[0].toUpperCase();
        // definiere anzahl maximaler versuche
        int maxAttempts = 10;
        // hilfsklasse
        SearchWord suchwort = new SearchWord(word);
        while (maxAttempts > 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Gib einen Buschstaben ein und tippe Enter : ");
            String s = scanner.next();
            // pruefe die laenge der eingabe
            if (s.length() != 1 ) {
                System.out.println("Nur einen !");
                continue;
            }
            // pruefe auf treffer
            if (suchwort.hit(s)) {
                suchwort.addBuchstabe(s);
                System.out.println(suchwort);
                //pruefe auf vollstaendig geloest
                if (suchwort.checkForWin()) {
                    System.out.println("HURRA GEWONNEN !");
                    break;
                }
            } else {
                maxAttempts--;
                System.out.println(maxAttempts + " Versuche übrig");
            }
        }
    }
}
