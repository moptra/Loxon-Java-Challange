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

package hu.progmasters.lettermultiplier;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LetterMultiplierTest {

    @Test
    void test_multiply_null_notValid() {
        assertEquals("Not valid inputs", LetterMultiplier.multiply(null, 1));
    }

    @Test
    void test_multiply_emptyString_notValid() {
        assertEquals("Not valid inputs", LetterMultiplier.multiply("", 1));
    }

    @Test
    void test_multiply_negativeNumber_notValid() {
        assertEquals("Not valid inputs", LetterMultiplier.multiply("java", -1));
    }

    @Test
    void test_multiply_alma0_emptyString() {
        assertEquals("", LetterMultiplier.multiply("alma", 0));
    }

    @Test
    void test_multiply_a1_a() {
        assertEquals("a", LetterMultiplier.multiply("a", 1));
    }

    @Test
    void test_multiply_apple1_apple() {
        assertEquals("apple", LetterMultiplier.multiply("apple", 1));
    }

    @Test
    void test_multiply_j2_jj() {
        assertEquals("jj", LetterMultiplier.multiply("j", 2));
    }

    @Test
    void test_multiply_java3_jjjaaavvvaaa() {
        assertEquals("jjjaaavvvaaa", LetterMultiplier.multiply("java", 3));
    }

    @Test
    void test_multiply_one2_11() {
        assertEquals("11", LetterMultiplier.multiply("1", 2));
    }

    @Test
    void test_multiply_one1two2three3And2_oonnee11ttwwoo22tthhrreeee33() {
        assertEquals("oonnee11ttwwoo22tthhrreeee33", LetterMultiplier.multiply("one1two2three3", 2));
    }

}
