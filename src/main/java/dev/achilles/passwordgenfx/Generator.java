package dev.achilles.passwordgenfx;

public class Generator {
    Alphabet alphabet;

    public Generator(boolean includeUpper, boolean includeLower, boolean includeNumber, boolean includeSymbol) {
        alphabet = new Alphabet(includeUpper, includeLower, includeNumber, includeSymbol);
    }



    public  String generatePassword(int length) {
        StringBuilder str = new StringBuilder("");


        int max = alphabet.getAlphabet().length() - 1;

        for (int i = 0; i < length; i++) {
            int index = ((int) (Math.random() * max));
            str.append(alphabet.getAlphabet().charAt(index));
        }

        return str.toString();
    }
}
