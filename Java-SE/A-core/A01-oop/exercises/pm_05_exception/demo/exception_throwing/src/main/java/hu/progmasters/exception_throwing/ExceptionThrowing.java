/*
 * Copyright © Progmasters (QTC Kft.), 2016-2019.
 * All rights reserved. No part or the whole of this Teaching Material (TM) may be reproduced, copied, distributed,
 * publicly performed, disseminated to the public, adapted or transmitted in any form or by any means, including
 * photocopying, recording, or other electronic or mechanical methods, without the prior written permission of QTC Kft.
 * This TM may only be used for the purposes of teaching exclusively by QTC Kft. and studying exclusively by QTC Kft.’s
 * students and for no other purposes by any parties other than QTC Kft.
 * This TM shall be kept confidential and shall not be made public or made available or disclosed to any unauthorized person.
 * Any dispute or claim arising out of the breach of these provisions shall be governed by and construed in accordance with the laws of Hungary.
 */

package hu.progmasters.exception_throwing;

import java.util.Scanner;

/**
 * In this exercise you will learn how to create,
 * and throw a custom exception
 */

public class ExceptionThrowing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        try {
            double result = squareRoot(number);
            System.out.println(result);
        } catch (RuntimeException e) {
            // TODO print the stacktrace
        }
    }

    public static double squareRoot(double number) {
        // TODO create a custom exception class called NegativeNumberException, which extends RuntimeException
        // if the number parameter is negative, throw an instance of NegativeNumberException
        // if it is non-negative, return the square root of it
        return Math.sqrt(number);
    }
}
