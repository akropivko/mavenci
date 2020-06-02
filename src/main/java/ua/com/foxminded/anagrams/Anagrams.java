package ua.com.foxminded.anagrams;

import java.util.StringJoiner;

public class Anagrams {

    static final String WORD_SEPARATOR = " ";

    public String reverseLettersOnly(String initial) {
        
        if (initial == null) {
            throw new IllegalArgumentException("Initial string is null");
        }
        
        if (initial.trim().isEmpty()) {
            return initial;
        }
        
        StringJoiner stringJoiner = new StringJoiner(WORD_SEPARATOR);

        String[] words = initial.split(WORD_SEPARATOR);
     
        for (String word : words) {
            stringJoiner.add(reverseWordLettersOnly(word));
        }
        return stringJoiner.toString();
    }

    public String reverseWordLettersOnly(String initialWord) {
        char[] chars = initialWord.toCharArray();

        for (int pointerFromBegin = 0, pointerFromEnd = initialWord.length() - 1; 
                                            pointerFromBegin < pointerFromEnd;) {

            if (!Character.isLetter(chars[pointerFromBegin])) {
                pointerFromBegin++;
                continue;
            } else if (!Character.isLetter(chars[pointerFromEnd])) {
                pointerFromEnd--;
                continue;
            }

            char tmp = chars[pointerFromBegin];
            chars[pointerFromBegin] = chars[pointerFromEnd];
            chars[pointerFromEnd] = tmp;
            pointerFromBegin++;
            pointerFromEnd--;

        }
        return String.valueOf(chars);
    }
    some error

}
