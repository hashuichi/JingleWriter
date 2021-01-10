public class Melody {
    private char[] note;
    
    public Melody(char[] note){
        this.note = note;
    }

    public char getNote(int i) { return note[i]; }

    public String toString() {
        return note[0] + " " + note[1] + " " + note[2] + " " + note[3] + " " + note[4];
    }

    public int getNumSamePosition(Melody other){
        int countSamePos = 0;
        for (int i=0; i<5; i++){
            if (this.note[i] == other.note[i]){
                countSamePos++;
            }
        }
        return countSamePos;
    }

    public int getNumSameNoPosition(Melody other){
        int countSameNoPos = 0;
        for (char c='A'; c<='G'; c++){
            int countThis = 0;
            int countOther = 0;
            // Finds the number of occurances of one note in each melody
            for (int i=0; i<=4; i++){
                if (c==this.note[i]){ countThis++; }
                if (c==other.note[i]){ countOther++; }              
            }
            // Adds the lower number of occurences to the total count 
            if (countThis<countOther){
                countSameNoPos += countThis;
            } else {
                countSameNoPos += countOther;
            }
        }
        return countSameNoPos;
    }
}