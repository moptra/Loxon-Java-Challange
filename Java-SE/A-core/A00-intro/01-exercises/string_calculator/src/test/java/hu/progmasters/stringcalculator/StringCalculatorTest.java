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

package hu.progmasters.stringcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StringCalculatorTest {

    @Test
    void testAdd_noArgument_shouldReturnZero() {
        int expected = 0;
        int result = StringCalculator.add("");

        assertEquals(expected,result);
    }
    @Test
    void testAdd_oneArgument_shouldReturnTheArgument() {
        int expected = 7;
        int result = StringCalculator.add("7");

        assertEquals(expected,result);
    }
    @Test
    void testAdd_twoArgument_shouldReturnTheSumOfArguments() {
        int expected = 7;
        int result = StringCalculator.add("3,4");

        assertEquals(expected,result);
    }

}
