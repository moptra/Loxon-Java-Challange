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

package hu.progmasters.b_refactor;

import java.util.Scanner;

/**
 * Refactor the variable names (Shift+F6).
 * */

public class C1ass {
    public static void main(String[] args) {
        int l1l1 = 0;
        int lll1 = 1;
        int ll1l = 2;
        int l11l = 3;
        int ll11 = 4;
        int l1ll = 5;

        ll1l = l1l1 + lll1;
        l11l = lll1 + ll1l;
        ll11 = ll1l + l11l;
        l1ll = l11l + ll11;
        l1l1 = ll11 + l1ll;
        lll1 = l1ll + l1l1;

        guessTheResult(lll1);
    }

    private static void guessTheResult(int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the result:");
        int guess = scanner.nextInt();

        if (guess == number) {
            System.out.println("Yay!");
        } else {
            System.out.println("Nope. Try again.");
        }

        scanner.close();
    }
}
