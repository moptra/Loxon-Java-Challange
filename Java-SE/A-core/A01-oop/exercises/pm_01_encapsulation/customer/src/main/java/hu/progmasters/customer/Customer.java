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

package hu.progmasters.customer;

/**
 * Create a class called Customer that has the following properties:
 *  - id (long)
 *  - name (String)
 *  - address (Address type)
 *  - phone number (String)
 *  - email address (String)
 *
 * An Address has the following properties:
 *  - town (String)
 *  - street (String)
 *  - number (int)
 *
 * Add an overloaded method called setCustomerInfo, depending on how the method is called, it does one of the following:
 *  - sets the id, name, address and phone number for a Customer object
 *  - sets the id, name, address, phone number and email address for a Customer object
 *
 * Write tests for the class!!
 *
 * In the main method (and in the test class) create two Customer objects and use each variation of the setCustomerInfo method.
 *
 */

public class Customer {

    private long id;
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private Address address;

    public Customer(long id, String name, Address address, String phoneNumber, String emailAddress) {
        this.address = address;
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public void setCostumerInfo(long id, String name, Address address, String phoneNumber) {
        this.address = address;
        if (this.id < 0) {
            this.id = 0;
        } else {
            this.id = id;
        }
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void setCostumerInfo(long id, String name, Address address, String phoneNumber, String emailAddress) {
        this.address = address;
        if (id < 0) {
            this.id = 0;
        } else {
            this.id = id;
        }
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        if (id < 0) {
            this.id = 0;
        } else {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    //tostringet írni rá, hogy ki lehessen íratni!!
}
