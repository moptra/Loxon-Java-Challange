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

package hu.progmasters.exceptions3;

/**
 * Exception handling basics
 *
 * In this exercise we are going to write a simple wage calculator. We'll need to complete
 * the code to get user input of the hourly wage of the employee and the hours worked. After
 * doing some calculations, print the weekly wage.
 *
 * Use try/catch/finally blocks to validate the user input
 * (check for non-number and negative number inputs as well).
 *
 */

public class Exceptions3 {

    public static void main(String[] args) {
        // TODO - write code to get input from the user and handle possible errors
    }

    private static double getHourlyWage() {
        // TODO - read input from System.in and in case of an error throw an exception
        // TODO - (you can either throw a new exception or let Scanner.nextDouble() throw it)
        return 0.0;
    }

    private static int getWeeklyHours() {
        // TODO - read input from System.in and in case of an error throw an exception
        return 0;
    }

    private static void printWeeklyWage() {
    }
}
