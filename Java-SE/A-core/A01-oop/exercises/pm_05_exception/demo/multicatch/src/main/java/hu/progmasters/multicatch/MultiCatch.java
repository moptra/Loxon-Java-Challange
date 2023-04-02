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

package hu.progmasters.multicatch;

/**
 * Exception handling basics - Multiple catch
 * <p>
 * Write code that will read two integers from System.in with the help of a Scanner.
 * Divide the first integer (dividend) by the second one (divisor).
 * These operations can result in two different Exceptions:
 * - ArithmeticException - if the divisor is zero
 * - NumberFormatException - if the value entered on the console is not an integer
 * <p>
 * Catch these exceptions and print them!
 * <p>
 * Try out your code and make sure you cover both Exception cases!
 * <p>
 * When you need to handle more than one exception, and the bodies of the catch blocks
 * are identical, you can use the multi-catch feature of Java to achieve the same result.
 * With this you can use a single catch block:
 * <p>
 * catch (ExceptionType1 | ExceptionType2 ex) {
 * ...
 * }
 * <p>
 * Refactor your code to use the above syntax and verify that it still works!
 */
public class MultiCatch {

    public static void main(String[] args) {


    }
}
