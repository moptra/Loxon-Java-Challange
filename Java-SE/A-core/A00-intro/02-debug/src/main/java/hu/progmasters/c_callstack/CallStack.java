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

package hu.progmasters.c_callstack;

/**
 * Method call stack exercise
 *
 * Write code that will get an int array, convert the elements and then finally print the result
 * Integer values can be between 0 and 10.
 *
 * e.g.:
 * input: {1, 4, 6, 9}
 * the result is: "The elements of the array: one, four, six, nine"
 */

public class CallStack {

    public static void main(String[] args) {
        int[] numberArray = new int[]{4, 3, 1, 2, 6, 0};
        String result = convertAndPrintResult(numberArray);
        System.out.println(result);
   }

    public static String convertAndPrintResult(int[] numbers) {
        // TODO - call convertNumbersToStrings() and return String like this: "The elements of the array: ..."
        return null;
    }

    public static String[] convertNumbersToStrings(int[] numbers) {
        // TODO - call convertItem for each element in numbers
        return null;
    }

    public static String convertItem(int number) {
        // TODO - convert the int to human readable form
        return null;
    }
}
