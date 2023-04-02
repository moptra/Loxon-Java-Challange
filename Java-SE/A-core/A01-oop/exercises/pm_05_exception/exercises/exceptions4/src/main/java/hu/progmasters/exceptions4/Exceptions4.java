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

package hu.progmasters.exceptions4;

public class Exceptions4 {
    public static void main(String[] args) {
        // TODO - write code to handle the three different exception types separately

        // eatAFruit("apple");
        // eatAFruit("banana");
        // eatAFruit("carp");
        // eatAFruit("kiwi");
        // eatAFruit("carrot");
        // eatAFruit("oat");


        // TODO - write code to handle the three different exception types in a single catch clause

        // eatAFruit("apple");
        // eatAFruit("banana");
        // eatAFruit("kiwi");
        // eatAFruit("carrot");
        // eatAFruit("oat");
        // eatAFruit("carp");

        // TODO - add a finally clause and verify that it's executed (even if an exception is thrown)

        // Check what happens if you put all eatAFruit() calls in one try blocks, and what happens if you put them in
        // separate ones!
    }

    public static void eatAFruit(String fruit) throws VegetableException, CerealException, FishException {
        switch (fruit.toLowerCase()) {
            case "carrot":
                throw new VegetableException(fruit + " is a vegetable.");
            case "oat":
                throw new CerealException(fruit + " is a cereal.");
            case "carp":
                throw new FishException(fruit + " is a kind of fish.");
            default:
                System.out.println("Eaten a(n) " + fruit);
        }
    }
}
