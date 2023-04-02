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
 * 1. Find out why the code can't find the palindromes.
 *
 * 2. When you have found the bug, correct it.
 *
 **/
public class Palindrome {

    public static void main(String[] args) {

        for (int i = 100; i < 1000; i++) {
            System.out.println(i + isPalindrome(i));
        }
    }

    public static String isPalindrome(int number) {
        int reverseNumber = 0;
        while (number != 0) {
            int residue = number % 10;
            reverseNumber = reverseNumber * 10 + residue;
            number /= 10;
        }

        if (reverseNumber == number) {
            return " is a palindrome";
        } else {
            return " is not";
        }
    }
}
