package org.linagora.collection;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SuppressDuplicateTest {

    /**
     * The main goal of this kata is to delete duplicates from a list
     */

    private SuppressDuplicate testee;

    @Before
    public void setup() {
        testee = new SuppressDuplicate();
    }

    @Test
    public void suppressShouldReturnEmptyWhenEmpty() {
        List<Integer> output = testee.suppress(new ArrayList<String>());
        assertThat(output).isEmpty();
    }

    @Test
    public void suppressShouldReturnOneElementWhenOneElement() {
        List<Integer> output = testee.suppress(new ArrayList<String>());
        output.add(1);

        assertThat(output).containsOnlyOnce(1);
    }

    @Test
    public void suppressShouldReturnTwoElementsWhenTwoDifferentElements() {
        List<Integer> output = testee.suppress(new ArrayList<String>());
        output.add(1);
        output.add(2);

        assertThat(output).containsOnlyOnce(1, 2);
    }

    @Test
    public void suppressShouldReturnOneElementWhenTwoEqualsElements() {
        List<Integer> output = testee.suppress(new ArrayList<String>());
        output.add(1);
        output.add(1);

        assertThat(output).containsOnlyOnce(1);
    }

    @Test
    public void suppressShouldReturnElementOnceWhenMixedElements() {
        List<Integer> output = testee.suppress(new ArrayList<String>());
        output.add(1);
        output.add(2);
        output.add(1);
        output.add(3);
        output.add(4);
        output.add(2);
        output.add(1);

        assertThat(output).containsOnlyOnce(1, 2, 3, 4);
    }
}
