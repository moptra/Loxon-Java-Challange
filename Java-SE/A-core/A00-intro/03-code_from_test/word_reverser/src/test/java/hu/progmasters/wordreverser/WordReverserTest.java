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

package hu.progmasters.wordreverser;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordReverserTest {

    @Test
    void test_reverse_null_notValid() {
        assertEquals("Not valid input", WordReverser.reverse(null));
    }

    @Test
    void test_reverse_emptyString_notValid() {
        assertEquals("Not valid input", WordReverser.reverse(""));
    }

    @Test
    void test_reverse_a_a() {
        assertEquals("a", WordReverser.reverse("a"));
    }

    @Test
    void test_reverse_1_1() {
        assertEquals("1", WordReverser.reverse("1"));
    }

    @Test
    void test_reverse_abc_cba() {
        assertEquals("cba", WordReverser.reverse("abc"));
    }

    @Test
    void test_reverse_123_321() {
        assertEquals("2Bb1Aa", WordReverser.reverse("aA1bB2"));
    }

    @Test
    void test_reverse_aA1bB2_2Bb1Aa() {
        assertEquals("2Bb1Aa", WordReverser.reverse("aA1bB2"));
    }

    @Test
    void test_reverse_iLoveProgrammingInJava_avaNiGnimmargorpEvolI() {
        assertEquals("!avaJ ni gnimmargorp evol I", WordReverser.reverse("I love programming in Java!"));
    }

}
