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

package hu.progmasters.account;

/**
 * A simple Account class is provided below, implement the following methods in it:
 * - deposit (add money to account)
 * - withdraw (get money from account)
 * - toString
 * <p>
 * Add two derived classes, called SavingsAccount and CurrentAccount.
 * - a SavingsAccount object, in addition to the attributes of an Account object,
 * should have an interest variable and a method which adds interest to the account.
 * - a CurrentAccount object, in addition to the attributes of an Account object,
 * should have an overdraft limit variable.
 * <p>
 * Create a Bank class, which contains an array (or a list) of Account objects.
 * Accounts in the array could be instances of the Account class, the SavingsAccount class, or the CurrentAccount class.
 * <p>
 * Write an update method in the Bank class.
 * It iterates through each account, updating it in the following ways:
 * - SavingsAccounts get interest added (via the method you already wrote)
 * - CurrentAccounts print a message if they are in overdraft.
 * <p>
 * An pm_03.account may only be modified through the deposit(double) and withdraw(double) methods or when they receive the interest.
 */

public class Account {

    private double balance;
    private String accountNumber;

}
