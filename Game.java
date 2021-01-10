import java.util.Random;

public class Game {
    private Melody sol;
    private SuggestionListNode head;

    public Game(Melody sol){
        this.sol = sol;
        this.head = head;
    }

    public Game(){
        Random r = new Random();
        char[] arr = new char[5];
        for (int i=0; i<5; i++){
            int num = (r.nextInt(7));
            arr[i] = (char)('A' + num);
        }
        Melody randomSol = new Melody(arr);
        sol = randomSol;
    }

    public boolean suggestMelody(Melody suggestion){
        Suggestion input = new Suggestion(suggestion, sol);
        SuggestionListNode node = new SuggestionListNode(input, head);
        head = node;
        return input.isCorrect();
    }

    public SuggestionListNode getHistory() { return head; } 
    public Melody getSolution() { return sol; }
}