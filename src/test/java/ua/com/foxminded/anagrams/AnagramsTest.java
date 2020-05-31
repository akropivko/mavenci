package test.java.ua.com.foxminded.anagrams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.ua.com.foxminded.anagrams.Anagrams;

import org.junit.jupiter.api.Assertions;

class AnagramsTest {

    Anagrams anagrams = new Anagrams();

    @Test
    void reverseLettersOnly_shouldThrowIllegalArgumentException_whenInputIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            anagrams.reverseLettersOnly(null);
        });
    }

    @Test
    void reverseWordLettersOnly_shouldReturnTheSame_whenInputIsOneSpecialCharacter() {
        String expected = "@";
        String actual = anagrams.reverseWordLettersOnly("@");
        assertEquals(expected, actual);
    }

    @Test
    void reverseWordLettersOnly_shouldReturnTheSame_whenInputIsOneLetter() {
        String expected = "q";
        String actual = anagrams.reverseWordLettersOnly("q");
        assertEquals(expected, actual);
    }

    @Test
    void reverseWordLettersOnly_shouldReturnEmptyString_whenInputIsEmptyString() {
        String expected = "";
        String actual = anagrams.reverseWordLettersOnly("");
        assertEquals(expected, actual);
    }

    @Test
    void reverseWordLettersOnly_shouldReturnTheSame_whenInputIsNumbersAndSpecialCharacters() {
        String expected = "1@2#";
        String actual = anagrams.reverseWordLettersOnly("1@2#");
        assertEquals(expected, actual);
    }

    @Test
    void reverseWordLettersOnly_shouldReverseEveryWord_whenInputIsLettersOnly() {
        String expected = "rewq";
        String actual = anagrams.reverseWordLettersOnly("qwer");
        assertEquals(expected, actual);
    }

    @Test
    void reverseWordLettersOnly_shouldReverseLetters_whenInputIsLettersAndNumberAndSpecialCharacters() {
        String expected = "q1w#er";
        String actual = anagrams.reverseWordLettersOnly("r1e#wq");
        assertEquals(expected, actual);
    }

    @Test
    void reverseLettersOnly_shouldReverseEveryWord_whenInputIsFewWordsLettersOnly() {
        String expected = "rewq rewq";
        String actual = anagrams.reverseLettersOnly("qwer qwer");
        assertEquals(expected, actual);
    }

    @Test
    void reverseLettersOnly_shouldReturnTheSame_whenInputIsFewSpaces() {
        String expected = "     ";
        String actual = anagrams.reverseLettersOnly("     ");
        assertEquals(expected, actual);
    }

    @Test
    void reverseLettersOnly_shouldReturnTheSame_whenInputIsOneNumber() {
        String expected = "5";
        String actual = anagrams.reverseLettersOnly("5");
        assertEquals(expected, actual);
    }

    @Test
    void reverseLettersOnly_shouldReturnTheSameLetters_whenInputIsTheSameLetterSeveralTimes() {
        String expected = "wwwww";
        String actual = anagrams.reverseLettersOnly("wwwww");
        assertEquals(expected, actual);
    }

    @Test
    void reverseLettersOnly_shouldReturnTheSameNumbers_whenInputIsTheSameNumberSeveralTimes() {
        String expected = "55555";
        String actual = anagrams.reverseLettersOnly("55555");
        assertEquals(expected, actual);
    }

    @Test
    void reverseLettersOnly_shouldReturnTheSameLettersInReverse_whenInputIsOneLetterUpperLowerCase() {
        String expected = "QqQqQq";
        String actual = anagrams.reverseLettersOnly("qQqQqQ");
        assertEquals(expected, actual);
    }

    @Test
    void reverseLettersOnly_shouldReturnTheSame_whenInputIsSpecialCharactersOnly() {
        String expected = "!@#$%^";
        String actual = anagrams.reverseLettersOnly("!@#$%^");
        assertEquals(expected, actual);
    }

    @Test
    void reverseLettersOnly_shouldReturnTheSame_whenInputIsNumbersAndSpecialCharacters() {
        String expected = "111!@#222$%^333";
        String actual = anagrams.reverseLettersOnly("111!@#222$%^333");
        assertEquals(expected, actual);
    }

    @Test
    void reverseLettersOnly_shouldReversAllWords_whenInputIsLetters() {
        String expected = "drowtsrif drowces drowht";
        String actual = anagrams.reverseLettersOnly("firstword secword thword");
        assertEquals(expected, actual);
    }

    @Test
    void reverseLettersOnly_shouldReverseAllLettersInWords_whenInputIsLettersAndNumbers() {
        String expected = "q1wer q2wer q3Wer";
        String actual = anagrams.reverseLettersOnly("r1ewq r2ewq r3eWq");
        assertEquals(expected, actual);
    }

    @Test
    void reverseLettersOnly_shouldReverseAllLettersInWords_whenInputIsLettersNumbersSpecialCharacters() {
        String expected = "q1w#er q2w^er q3W^er";
        String actual = anagrams.reverseLettersOnly("r1e#wq r2e^wq r3e^Wq");
        assertEquals(expected, actual);
    }

    @Test
    void reverseLettersOnly_shouldReverseLettersInEveryWord_whenInputIsWordsSeparatedWithFewSpaces() {
        String expected = "wq2q3    wer3ew     re2wrew";
        String actual = anagrams.reverseLettersOnly("qq2w3    wer3ew     we2rwer");
        assertEquals(expected, actual);
    }

}
