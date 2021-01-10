import java.util.Scanner;

public class JingleWriterCli {

    public static void main(String[] args) {     
        Game game = new Game();
        playGame(game);
    }

    public static void playGame(Game game) {
        boolean gameOngoing = true;
        while (gameOngoing) {
            System.out.println("History:");
            if (game.getHistory() != null) {
                for (SuggestionListNode cursor = game.getHistory(); cursor != null; cursor = cursor.getNext()) {
                    System.out.println(cursor.getSuggestion());
                }
            } else {
                System.out.println("No History");
            }
            Scanner kb = new Scanner(System.in);
            System.out.println("Enter melody:");
            //Reading the user's input then converting it into a char array
            String input = kb.nextLine();
            char[] arr = input.replaceAll(" ","").toCharArray();
            Melody melody = new Melody(arr);
            if (game.suggestMelody(melody)) {
                System.out.println("Congratulations!");
                gameOngoing = false;
            }
        }
    }

}
