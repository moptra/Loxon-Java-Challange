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

package hu.progmasters.car;

/**
 * Provide the missing classes and methods so the class compiles without errors.
 */
public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        //pm_01.car = car;



// these lines are commented out, because they don't compile yet

/*    pm_01.car.getLeft().getWindow().rollDown();
    pm_01.car.getLeft().getWindow().rollUp();
    pm_01.car.getWheel()[0].inflate(72);
    pm_01.car.getRight().open();
    pm_01.car.getRight().close();
    pm_01.car.getEngine().start();
    pm_01.car.getEngine().stop();*/

        car.getLeft().getWindow().rollDown();
        car.getLeft().getWindow().rollUp();
        car.getWheel()[0].inflate(72);
        car.getRight().open();
        car.getRight().close();
        car.getEngine().start();
        car.getEngine().stop();
    }

}
