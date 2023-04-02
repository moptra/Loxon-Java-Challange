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

package hu.progmasters.wordscorer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordScorerTest {

    @Test
    void test_evaluate_null_negative1() {
        assertEquals(-1, WordScorer.evaluate(null));
    }

    @Test
    void test_evaluate_emptyString_negative1() {
        assertEquals(-1, WordScorer.evaluate(""));
    }

    @Test
    void test_evaluate_b_1() {
        assertEquals(1, WordScorer.evaluate("b"));
    }

    @Test
    void test_evaluate_a_negative1() {
        assertEquals(-1, WordScorer.evaluate("a"));
    }

    @Test
    void test_evaluate_apple_1() {
        assertEquals(1, WordScorer.evaluate("apple"));
    }

    @Test
    void test_evaluate_ab_0() {
        assertEquals(0, WordScorer.evaluate("ab"));
    }

    @Test
    void test_evaluate_iLoveProgrammingInJava_9() {
        assertEquals(9, WordScorer.evaluate("i love programming in java."));
    }

    @Test
    void test_evaluate_uniqeCharacters_5() {
        assertEquals(5, WordScorer.evaluate("@#<]!"));
    }

    @Test
    void test_evaluate_onlyVowels_negative10() {
        assertEquals(-10, WordScorer.evaluate("AaEeIiOoUu"));
    }

    @Test
    void test_evaluate_upperAndLowerLetters_9() {
        assertEquals(9, WordScorer.evaluate("I LoVe pRoGrAmMiNg iN JaVa."));
    }



}
