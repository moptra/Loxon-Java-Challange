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

package hu.progmasters.sumdigits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumDigitsTest {



    @Test
    void test_sumDigits_zero_zero() {
        assertEquals(0, SumDigits.sumDigits(0));
    }

    @Test
    void test_sumDigits_eight_eight() {
        assertEquals(8, SumDigits.sumDigits(8));
    }

    @Test
    void test_sumDigits_twelve_three() {
        assertEquals(3, SumDigits.sumDigits(12));
    }

    @Test
    void test_sumDigits_eightynine_seventeen() {
        assertEquals(17, SumDigits.sumDigits(89));
    }

    @Test
    void test_sumDigits_hundred_one() {
        assertEquals(1, SumDigits.sumDigits(100));
    }

    @Test
    void test_sumDigits_thousand_one() {
        assertEquals(1, SumDigits.sumDigits(1000));
    }

    @Test
    void test_sumDigits_twoThousandSixHundredAndFiftySeven_twenty() {
        assertEquals(20, SumDigits.sumDigits(2657));
    }

    @Test
    void test_sumDigits_tenOnes_ten() {
        assertEquals(10, SumDigits.sumDigits(1111111111));
    }

    @Test
    void test_sumDigits_twelveThousandThreeHundredAndFortyFive_fifteen() {
        assertEquals(15, SumDigits.sumDigits(12345));
    }

    @Test
    void test_sumDigits_ninetyNineThousandNineHundredAndNinetyNine_fourtyFive() {
        assertEquals(45, SumDigits.sumDigits(99999));
    }

}
