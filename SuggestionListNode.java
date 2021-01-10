public class SuggestionListNode {
    private Suggestion payload;
    private SuggestionListNode next;
    
    public SuggestionListNode(Suggestion payload, SuggestionListNode next){
        this.payload = payload;
        this.next = next;
    }

    public Suggestion getSuggestion() { return payload; }
    public SuggestionListNode getNext() { return next; }
}