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

package hu.progmasters.adddigits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddDigitsTest {

    @Test
    void test_addDigits_null_negativeOne() {
        assertEquals(-1, AddDigits.addDigits(null));
    }

    @Test
    void test_addDigits_emptyString_negativeOne() {
        assertEquals(-1, AddDigits.addDigits(""));
    }

    @Test
    void test_addDigits_0_0() {
        assertEquals(0, AddDigits.addDigits("0"));
    }

    @Test
    void test_addDigits_0_apple() {
        assertEquals(0, AddDigits.addDigits("apple"));
    }

    @Test
    void test_addDigits_5_apple5() {
        assertEquals(5, AddDigits.addDigits("apple5"));
    }

    @Test
    void test_addDigits_2_eleven() {
        assertEquals(2, AddDigits.addDigits("11"));
    }

    @Test
    void test_addDigits_3_app1apple2() {
        assertEquals(3, AddDigits.addDigits("app1apple2"));
    }

    @Test
    void test_addDigits_45_0123456789() {
        assertEquals(45, AddDigits.addDigits("0123456789"));
    }

    @Test
    void test_addDigits_45_0zero1one2two3three4four5five6six7seven8eight9nine() {
        assertEquals(45, AddDigits.addDigits("0zero1one2two3three4four5five6six7seven8eight9nine"));
    }

    @Test
    void test_addDigits_15_5minus55() {
        assertEquals(15, AddDigits.addDigits("5-55"));
    }

}
