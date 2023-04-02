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

package hu.progmasters.evencounter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvenCounterTest {

    @Test
    void test_count_negative200_negative1() {
        assertEquals(-1, EvenCounter.count(-200));
    }

    @Test
    void test_count_0_1() {
        assertEquals(-1, EvenCounter.count(0));
    }

    @Test
    void test_count_1_0() {
        assertEquals(0, EvenCounter.count(1));
    }

    @Test
    void test_count_1111_0() {
        assertEquals(0, EvenCounter.count(1111));
    }

    @Test
    void test_count_2222_4() {
        assertEquals(4, EvenCounter.count(2222));
    }

    @Test
    void test_count_1234567890_5() {
        assertEquals(5, EvenCounter.count(1234567890));
    }

}
