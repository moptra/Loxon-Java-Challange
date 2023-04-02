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

package hu.progmasters.sample;

/**
 * commit - push gyakorlás
 */
public class HelloWorld {

    public static void main(String[] args) {

//        Dog csibesz = new Dog("Csibész", 5, true);
//        System.out.println(csibesz.age);
//        Dog buksi = new Dog("Buksi", 2, true);
//        System.out.println(buksi.age);
//        buksi.canEat();
//        csibesz.canEat();


        int firstNumber = 5;
        int secondNumber = 8;
        int thirdNumber = 10;

        int a = add(firstNumber, secondNumber);
        System.out.println(a);

        add(secondNumber, thirdNumber);
        System.out.println("Hello world!");
        System.out.println(firstNumber);
    }

    static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }
}
