package day03;

public class Caesar extends Encryption {

    private final static int CHAR_MIN_VALUE = 'A';
    private final static int CHAR_MAX_VALUE = 'Z';
    private final static int ALPHABET_LENGTH = 'Z' - 'A' + 1;
    private final int offset;

    public Caesar(int offset) {
        this.offset = offset;
    }

    @Override
    public String encrypt(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            result.append(encryptChar(c));
        }
        return result.toString();
    }

    private char encryptChar(char c) {
        if (!Character.isAlphabetic(c)) { return c; }
        if (Character.toUpperCase(c) + offset > CHAR_MAX_VALUE) { c -= ALPHABET_LENGTH; }
        else if (Character.toUpperCase(c) + offset < CHAR_MIN_VALUE) { c += ALPHABET_LENGTH; }
        c += offset;
        return c;
    }
}
