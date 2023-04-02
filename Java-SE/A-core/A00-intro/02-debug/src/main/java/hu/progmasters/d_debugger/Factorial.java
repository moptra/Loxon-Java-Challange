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

import java.util.Scanner;

/*
 * Why does not work? Put a breakpoint on the factorial
 * method and execute program line by line!
 */

public class Factorial {

    private static int factorial(int n) {
        int result = 1;

        for (;n > 0; n--);
            result *= n;

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer number to determine its factorial:");
        int n = scanner.nextInt();

        int result = factorial(n);
        System.out.println("The result: " + result);
    }
}
