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

package hu.progmasters.method;

import org.junit.jupiter.api.Test;

import static hu.progmasters.method.BasicCalculator.*;
import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {

    @Test
    void add_test() {
        double expected = 9;
        double result = BasicCalculator.add(5,4);

        assertEquals(expected, result);
    }

    @Test
    void subtract_test() {
        double result = BasicCalculator.subtract(7,2);
        double expected = 5;
        assertEquals(expected, result);
    }

    @Test
    void complex_test1() {
        double res = subtract(21, multiply(divide(4,3),5));
        double exp = 14.333333333333334;
        assertEquals(exp, res, 0.0001); // deltával a pontosság adható meg (mennyivel térhet el)
    }

    @Test
    void complex_test2() {
        double res = add(divide(multiply(multiply(7,7), 4), 5),6);
        double exp = 45.2;
        assertEquals(exp, res);
    }

    @Test
    void testMulitply_WithSmallNumbers_ShouldReturn() {
    }

    @Test
    void divide_test() {
    }

}
