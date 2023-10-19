package DEA;

public class DEA {

    enum State {
        START,
        BY,
        BW,
        ERROR
    }

    private static State state = State.START;

    public static void consume(char c) {
        switch (state) {
            case START:
                if (c == 'B')
                    state = State.START;
                else if (c == 'W')
                    state = State.BW;
                else if (c == 'Y')
                    state = State.BY;
                else
                    state = State.ERROR;
            default:
                state = State.ERROR;
        }

    }

    public static Boolean runDEA(String input) {
        for (int i = 0; i < 2; i++) {
            System.out.println(input.charAt(i));
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
