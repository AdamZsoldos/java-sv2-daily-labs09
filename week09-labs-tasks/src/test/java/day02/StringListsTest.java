package day02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListsTest {

    @Test
    void testGetShortestWords() {
        List<String> words = Arrays.asList("aaa", "aa", "bb", "cccc", "dd");
        List<String> expected = Arrays.asList("aa", "bb", "dd");
        assertEquals(expected, new StringLists().getShortestWords(words));
    }
}
