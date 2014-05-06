/*
 * Copyright 2014 Alexander Orlov <alexander.orlov@loxal.net>. All rights reserved.
 */

package net.loxal.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Example {
    private static final Logger LOG = LoggerFactory.getLogger(Example.class);

    /**
     * A very slow but stable sorting algorithm that consumes little space.
     *
     * @param unsorted entities
     */
    Character[] sortUsingBubbleSort(List<Character> unsorted) {
        Character[] characters = new Character[unsorted.size()];
        unsorted.toArray(characters);

        for (int idx = 0; idx < characters.length - 1; idx++) {
            if (characters[idx] > characters[idx + 1]) {
                swapWithSubsequentEntity(characters, idx);
                idx = -1;
            }
        }

        return characters;
    }

    /**
     * A very slow but stable sorting algorithm that consumes little space (improved version).
     *
     * @param unsorted entities
     */
    Character[] sortUsingImprovedBubbleSort(List<Character> unsorted) {
        Character[] characters = new Character[unsorted.size()];
        unsorted.toArray(characters);

        for (int idx = 0; idx < characters.length - 1; idx++) {
            while (characters[idx] > characters[idx + 1]) {
                swapWithSubsequentEntity(characters, idx);
                if (idx > 0) idx--;
            }
        }

        return characters;
    }

    private void swapWithSubsequentEntity(Character[] characters, int idx) {
//        LOG.info("Swap: {} <=> {}", characters[idx], characters[idx + 1]);
        char tmpBackup = characters[idx];
        characters[idx] = characters[idx + 1];
        characters[idx + 1] = tmpBackup;
    }
}
