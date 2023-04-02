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
 Make the code more readable by making new int variables for the partial results of the operations.
 Use Refactor/Extract/Variable (Ctrl+Alt+V)
 * */

public class Trainwreck {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        int result = modulo(multiply(add(d,modulo(b, c)),add(subtract(c, a),b)), divide(add(modulo(c, d), subtract(b, a)), subtract(b, a)));

        guessTheResult(result);
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

    public static int add(int p, int q) {
        return p + q;
    }
    public static int subtract(int p, int q) {
        return p - q;
    }
    public static int multiply(int p, int q) {
        return p * q;
    }
    public static int divide(int p, int q) {
        return p / q;
    }
    public static int modulo(int p, int q) {
        return p % q;
    }
}
