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

package hu.progmasters.fighter;

/**
 * Create a function that returns the name of the winner in a fight between two fighters.
 * Each fighter takes turns attacking the other and whoever kills the other first is the victorious.
 * Death is defined as having health <= 0.
 * Both health and damagePerAttack will be integers larger than 0. You can mutate the Fighter objects.
 */
public class FightClub {

    public static void main(String[] args) {

        Fighter abel = new Fighter("Dávid", 20, 2);
        Fighter aron = new Fighter("Góliát", 10, 4);

        System.out.println(FightClub.declareWinner(abel, aron, "Dávid"));
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        boolean shouldContinue = true;
        int currentHealthOfFirstFighter = fighter1.getHealth();
        int currentHealthOfSecondFighter = fighter2.getHealth();

        while (shouldContinue) {
            if (fighter1.getName() == firstAttacker) {
                currentHealthOfSecondFighter -= fighter1.getDamagePerAttack();

                if (currentHealthOfSecondFighter <= 0) {
                    break;
                }

                currentHealthOfFirstFighter -= fighter2.getDamagePerAttack();

                if (currentHealthOfFirstFighter <= 0) {
                    break;
                }

            } else if (fighter2.getName() == firstAttacker) {

                currentHealthOfFirstFighter -= fighter2.getDamagePerAttack();
                if (currentHealthOfFirstFighter <= 0) {
                    break;
                }

                currentHealthOfSecondFighter -= fighter1.getDamagePerAttack();

                if (currentHealthOfSecondFighter <= 0) {
                    break;
                }
            }

            if (currentHealthOfSecondFighter <= 0 || currentHealthOfFirstFighter <= 0) {
                shouldContinue = false;
            }
        }

        if (currentHealthOfSecondFighter < currentHealthOfFirstFighter) {
            return fighter1.getName();
        } else {
            return fighter2.getName();
        }
    }
}
