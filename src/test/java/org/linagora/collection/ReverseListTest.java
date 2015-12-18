package org.linagora.collection;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class ReverseListTest {

    /**
     * The main goal of this Kata is to reverse an input list.
     * 
     * To achieve this task, you may iterate several times:
     *  - using the Java 7 API only
     *  - using Guava only
     *  - using the Java 8 Stream API only
     */

    private ReverseList testee;

    @Before
    public void setup() {
        testee = new ReverseList();
    }

    @Test
    public void reverseShouldReturnEmptyWhenEmpty() {
        assertThat(testee.reverse(new ArrayList<String>())).isEmpty();
    }

    @Test
    public void reverseShouldReturnOneElementWhenOneElement() {
        ArrayList<String> input = new ArrayList<String>();
        input.add("1");
        assertThat(testee.reverse(input)).containsExactly("1");
    }

    @Test
    public void reverseShouldReturnReverseWhenTwoElements() {
        ArrayList<String> input = new ArrayList<String>();
        input.add("1");
        input.add("2");
        assertThat(testee.reverse(input)).containsExactly("2", "1");
    }

    @Test
    public void reverseShouldReturnReverseWhenMultipleElements() {
        ArrayList<String> input = new ArrayList<String>();
        input.add("1");
        input.add("2");
        input.add("3");
        input.add("4");
        input.add("5");
        assertThat(testee.reverse(input)).containsExactly("5", "4", "3", "2", "1");
    }
}
