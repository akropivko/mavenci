package ua.com.foxminded.anagrams;

public class Application {

    public static void main(String[] args) {

        final String[] STRINGS_TO_TEST = { "a1bcd efg!h", "DQ2w3eec 4r5t6y3e", 
                                            "FQ2w3e4r 6yt7u8ie", "   ", null,
                                            "qq22ww33 3e44rrTT" };

        Anagrams anagram = new Anagrams();
        
        for (String str : STRINGS_TO_TEST) {
            System.out.println("Initial string:" + str);
            try {
                System.out.println("Reverse string:" + anagram.reverseLettersOnly(str) + "\n");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + "\n");
            }

        }
    }

}
