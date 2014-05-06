/*
 * Copyright 2014 Alexander Orlov <alexander.orlov@loxal.net>. All rights reserved.
 */

package net.loxal.example;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ExampleTest {
    private static final Logger LOG = LoggerFactory.getLogger(ExampleTest.class);
    static List<Character> unsortedCharacters;
    static List<Character> sortedCharacters;

    private static List<Character> createCharacters() {
        char[] randomChars = RandomStringUtils.random(1234567, "abcdefghijklmnopqrstuvwxyz").toCharArray();
        List<Character> randomCharacters = Arrays.asList(ArrayUtils.toObject(randomChars));
        List<Character> characters = new LinkedList<>();
        characters.add('z');
        characters.add('z');
        characters.add('z');
        characters.add('b');
        characters.add('a');
        characters.add('c');
        characters.add('y');
        characters.add('c');
        characters.addAll(randomCharacters);
        characters.add('d');
        characters.add('x');
        characters.add('f');
        characters.add('e');
        characters.add('e');
        characters.add('e');
        characters.add('u');
        characters.add('v');
        characters.add('u');
        characters.add('a');
        characters.add('a');

        return characters;
    }

    @BeforeClass
    public static void beforeClass() {
        LOG.info("@BeforeClass");
        unsortedCharacters = createCharacters();

        sortedCharacters = unsortedCharacters;
        Collections.sort(sortedCharacters);
    }

    @Before
    public void setUp() throws Exception {
        LOG.info("@Before");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sortUsingBubleSort() throws Exception {
        Example example = new Example();
        Method sort = Example.class.getDeclaredMethod("sortUsingBubbleSort", List.class);
        Character[] characters = (Character[]) sort.invoke(example, unsortedCharacters);

        assertEquals(sortedCharacters, Arrays.asList(characters));
        assertArrayEquals(sortedCharacters.toArray(), Arrays.asList(characters).toArray());
    }

    @Test
    public void sortUsingImprovedBubleSort() throws Exception {
        Example example = new Example();
        Method sort = Example.class.getDeclaredMethod("sortUsingImprovedBubbleSort", List.class);
        Character[] characters = (Character[]) sort.invoke(example, unsortedCharacters);

        assertEquals(sortedCharacters, Arrays.asList(characters));
        assertArrayEquals(sortedCharacters.toArray(), Arrays.asList(characters).toArray());
    }

}
