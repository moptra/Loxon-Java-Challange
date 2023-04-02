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

import java.sql.SQLOutput;

/**
 * We have a calculator with the four basic operations (+, -, *, /), one method for each.
 * Write the method body for each operation.
 *
 */

public class BasicCalculator {
    public static void main(String[] args) {
        // TODO - with the use of the functions below calculate the following formulas:
        //example:

        System.out.println(subtract(multiply(6,3), 2));  // 6 * 3 - 2

        // TODO implement the followings like above

        System.out.println(subtract(21, multiply(divide(4,3),5))); // 21 - 4 / 3 * 5
        System.out.println(add(divide(multiply(multiply(7,7), 4), 5),6)); // 7 * 7 * 4 / 5 + 6

    }

    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }

}
