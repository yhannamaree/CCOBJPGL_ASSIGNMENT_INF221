public class Exercise1 {

    static boolean iwillNotCheat = false;
    static boolean iWillWin = false;

    public static void main(String[] args) {

        // Precondition
        assert iwillNotCheat == true : "Wag 'yan";

        enterCompetition();

        // Postcondition
        assert iWillWin == true : "Kaya mo namam yan e";

    }

    static void enterCompetition() {
        iWillWin = false;
    }

}
