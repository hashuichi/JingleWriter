public class Suggestion {
    private Melody sug;
    private Melody sol;

    public Suggestion(Melody sug, Melody sol){
        this.sug = sug;
        this.sol = sol;
    }

    public Melody getMelody() { return sug; }
    public int getNumCorrect() {
        return sug.getNumSamePosition(sol);
    }
    public int getNumOutOfOrder() {
        return sug.getNumSameNoPosition(sol) - sug.getNumSamePosition(sol); 
    }

    public boolean isCorrect(){
        for (int i=0; i<5; i++){
            if (sug.getNote(i) != sol.getNote(i)) { return false; }
        }
        return true;
    }

    public String toString() {
        return sug + " Correct " + getNumCorrect() + " Out of Order " + getNumOutOfOrder();
    }
}