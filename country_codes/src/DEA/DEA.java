package DEA;

public class DEA {

    enum State {
        START,
        BY,
        BW,
        ERROR
    }

    private static State state;

    public static void main(String[] args) {
        System.out.println(runDEA("BY"));
    }

    public static void consume(char c) {
        System.out.println("State: " + state + " Input: " + c);
        if (state == State.START) {
            if (c == 'B')
                state = State.START;
            else if (c == 'W')
                state = State.BW;
            else if (c == 'Y')
                state = State.BY;
            else
                state = State.ERROR;
        } else {
            state = State.ERROR;
        }

    }

    public static Boolean runDEA(String input) {
        state = State.START;

        for (int i = 0; i < 2; i++) {
            char c = input.charAt(i);
            consume(c);
        }
        if (state == State.BY || state == State.BW) {
            return true;
        } else {
            return false;
        }
    }
}
