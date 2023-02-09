package dev.achilles.passwordgenfx;

public class Alphabet {
    public static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    public static final String NUMBERS = "1234567890";
    public static final String SYMBOLS = "!@#$%^&*()-_=+\\/~?";

    public static StringBuilder alphabet;

    public Alphabet(boolean includeUppercase,  boolean includeLowercase, boolean includeNumbers, boolean includeSymols) {
        if (includeUppercase == false && includeLowercase == false && includeNumbers == false && includeSymols == false) {
            // an default constructor if none argument is passed
            includeUppercase = true;
            includeNumbers = true;
            includeSymols = true;

        }
        alphabet = new StringBuilder("");


        if (includeUppercase) alphabet.append(UPPERCASE_LETTERS);

        if (includeLowercase) alphabet.append(LOWERCASE_LETTERS);

        if (includeNumbers) alphabet.append(NUMBERS);

        if (includeSymols) alphabet.append(SYMBOLS);

    }

    public String getAlphabet() {
        return alphabet.toString();
    }
}
