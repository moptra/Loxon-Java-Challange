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

package hu.progmasters.desk;

/**
 * Create a class for Paper.
 * A Paper is represented as a string with values like “exam1”, “article3”, “memo12”, etc.
 *
 * Create a class for a Radio.
 * You should be able to change the station.
 * The radio can be turned on or off.
 *
 * Create a class for a Drawer.
 * A Drawer can be opened or closed.
 * If it is open it can be filled or emptied.
 * For simplicity assume your drawer holds only Papers.
 *
 * Create a class for a Computer.
 * A Computer has a brand name, (MAC or PC).
 * A computer can be on or off.
 * You can shut it down or boot it up.
 *
 * Create a class for a Photograph.
 * A Photograph has a title and a date.
 * You can change the title.
 *
 * Create a class for a Desk.
 * Someone’s desk has a Radio, a Computer, a Photograph, and a certain number of Drawers.
 * The desk is either tidy or untidy. It is tidy if all the drawers are closed, and the Computer and the Radio are off.
 * You can tidy up a desk.
 *
 * You can print out all the information about a desk – including the contents and status of each drawer,
 * the channel and state (on/off) of the radio, the state of the computer, and the photo information.
 *
 */
public class Composition {

    public static void main(String[] args) {

        Paper paper = new Paper("this is a secret message");
        Radio radio = new Radio("Party Station", true);
        Drawer leftDrawer = new Drawer(true, paper);
        Drawer rightDrawer = new Drawer(false, paper);
        Computer computer = new Computer("MAC", true);
        Photograph photograph = new Photograph("holiday", "2022");

        Desk desk = new Desk(leftDrawer,rightDrawer,radio, computer, photograph);

        System.out.println(desk);

        System.out.println("---------------------------------------------------------------");

        desk.tidyUp();

        System.out.println(desk);

    }
}
