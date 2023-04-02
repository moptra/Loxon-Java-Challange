/*
 * Copyright (c) PROGmasters (QTC Kft.), 2022.
 * All rights reserved. No part or the whole of this Teaching Material (TM) may be reproduced, copied, distributed,
 * publicly performed, disseminated to the public, adapted or transmitted in any form or by any means, including
 * photocopying, recording, or other electronic or mechanical methods, without the prior written permission of QTC Kft.
 * This TM may only be used for the purposes of teaching exclusively by QTC Kft. and studying exclusively by QTC Kft.’s
 * students and for no other purposes by any parties other than QTC Kft.
 * This TM shall be kept confidential and shall not be made public or made available or disclosed to any unauthorized person.
 * Any dispute or claim arising out of the breach of these provisions shall be governed by and construed in accordance with the laws of Hungary.
 */

package hu.progmasters.uniquechars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class UniqueFinderTest {
    private List<Character> charList;

    @BeforeEach
    void init() {
        charList = new ArrayList<>();
    }

    @Test
    void test_uniqueChars_null_null() {
        assertEquals("Input was null", UniqueFinder.uniqueChars(null));
    }

    @Test
    void test_uniqueChars_a_a() {
        charList.add('a');
        assertEquals(charList, UniqueFinder.uniqueChars("a"));
    }

    @Test
    void test_uniqueChars_abc_abc() {
        charList.add('a');
        charList.add('b');
        charList.add('c');
        assertEquals(charList, UniqueFinder.uniqueChars("abc"));
    }

    @Test
    void test_uniqueChars_abac_abc() {
        charList.add('a');
        charList.add('b');
        charList.add('c');
        assertEquals(charList, UniqueFinder.uniqueChars("abac"));
    }

    @Test
    void test_uniqueChars_ilkethcs_iLikeTheCats() {
        charList.add('i');
        charList.add(' ');
        charList.add('l');
        charList.add('k');
        charList.add('e');
        charList.add('t');
        charList.add('h');
        charList.add('c');
        charList.add('a');
        charList.add('s');
        assertEquals(charList, UniqueFinder.uniqueChars("i like the cats"));
    }

    @Test
    void test_uniqueChars_aAbBcCDd_aAabBbcCCcDdD() {
        charList.add('a');
        charList.add('A');
        charList.add('b');
        charList.add('B');
        charList.add('c');
        charList.add('C');
        charList.add('D');
        charList.add('d');
        assertEquals(charList, UniqueFinder.uniqueChars("aAabBbcCCcDdD"));
    }

    @Test
    void test_uniqueChars_123_123() {
        charList.add('1');
        charList.add('2');
        charList.add('3');
        assertEquals(charList, UniqueFinder.uniqueChars("123"));
    }

    @Test
    void test_uniqueChars_1234_1223334444() {
        charList.add('1');
        charList.add('2');
        charList.add('3');
        charList.add('4');
        assertEquals(charList, UniqueFinder.uniqueChars("1223334444"));
    }

    @Test
    void test_uniqueChars_iate12pls_iAte112Apples() {
        charList.add('i');
        charList.add(' ');
        charList.add('a');
        charList.add('t');
        charList.add('e');
        charList.add('1');
        charList.add('2');
        charList.add('p');
        charList.add('l');
        charList.add('s');
        assertEquals(charList, UniqueFinder.uniqueChars("i ate 112 apples"));
    }

    @Test
    void test_uniqueChars_withSpecialCharacters_withSpecialCharacters() {
        charList.add('<');
        charList.add('3');
        charList.add(' ');
        charList.add('j');
        charList.add('a');
        charList.add('v');
        charList.add('&');
        charList.add('m');
        charList.add('y');
        charList.add('t');
        charList.add('e');
        charList.add('@');
        charList.add('p');
        charList.add(':');
        charList.add('0');
        assertEquals(charList, UniqueFinder.uniqueChars("<3 java && my team @ pm @ 3:00"));
    }

}
