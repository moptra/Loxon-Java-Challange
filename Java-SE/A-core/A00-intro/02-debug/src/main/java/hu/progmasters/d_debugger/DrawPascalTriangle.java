/*
 * Copyright © Progmasters (QTC Kft.), 2016-2018.
 * All rights reserved. No part or the whole of this Teaching Material (TM) may be reproduced, copied, distributed,
 * publicly performed, disseminated to the public, adapted or transmitted in any form or by any means, including
 * photocopying, recording, or other electronic or mechanical methods, without the prior written permission of QTC Kft.
 * This TM may only be used for the purposes of teaching exclusively by QTC Kft. and studying exclusively by QTC Kft.’s
 * students and for no other purposes by any parties other than QTC Kft.
 * This TM shall be kept confidential and shall not be made public or made available or disclosed to any unauthorized person.
 * Any dispute or claim arising out of the breach of these provisions shall be governed by and construed in accordance with the laws of Hungary.
 */

package hu.progmasters.d_debugger;

/**
 * Pascal Triangle:
 *
 * https://en.wikipedia.org/wiki/Pascal%27s_triangle
 *
 * Expected output:
 *     1
 *    1 1
 *   1 2 1
 *  1 3 3 1
 * 1 4 6 4 1
 *
 * Find out why the numbers are incorrect!
 */

public class DrawPascalTriangle {

    public static void main(String[] args) {
        int r;
        int n;
        for (int i = 0; i < 5; i++) {
            n = 1;
            r = i + 1;

            for (int j = 4 - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int c = 0; c < i + 1; c++) {
                if (c < 0) {
                    n = n * (r - c) / c;
                }
                System.out.print(n + " ");
            }

            System.out.println();
        }
    }
}
