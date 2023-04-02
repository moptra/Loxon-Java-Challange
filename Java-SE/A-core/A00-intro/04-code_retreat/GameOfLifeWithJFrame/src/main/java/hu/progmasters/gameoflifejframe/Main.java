package hu.progmasters.gameoflifejframe;
/*
 * Copyright © Progmasters (QTC Kft.), 2016-2021.
 * All rights reserved. No part or the whole of this Teaching Material (TM) may be reproduced, copied, distributed,
 * publicly performed, disseminated to the public, adapted or transmitted in any form or by any means, including
 * photocopying, recording, or other electronic or mechanical methods, without the prior written permission of QTC Kft.
 * This TM may only be used for the purposes of teaching exclusively by QTC Kft. and studying exclusively by QTC Kft.’s
 * students and for no other purposes by any parties other than QTC Kft.
 * This TM shall be kept confidential and shall not be made public or made available or disclosed to any unauthorized person.
 * Any dispute or claim arising out of the breach of these provisions shall be governed by and construed in accordance with the laws of Hungary.
 */

import javax.swing.*;
import java.awt.*;

public class Main {

    public static final int HEIGHT = 20;
    public static final int WIDTH = 20;

    private static TableModel tableModel;

    public static void main(String[] args) throws InterruptedException {

        GameOfLife gameOfLife = new GameOfLife(HEIGHT, WIDTH);

        gameOfLife.generateInitialBoard();

        JTable jTable = createUI(gameOfLife);

        while (true) {
            gameOfLife.updateToNextGenerataion();

            Thread.sleep(500L); //wait for 1 second

            updateUI(jTable, gameOfLife);

        }

    }

    private static JTable createUI(final GameOfLife gameOfLife) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(HEIGHT * 25, WIDTH * 25);

        JTable tableModel = new JTable(Main.tableModel);

        JScrollPane scrollPane = new JScrollPane(tableModel);
        frame.add(scrollPane, BorderLayout.CENTER);

        Main.tableModel = new TableModel(gameOfLife);

        tableModel.setModel(Main.tableModel);

        frame.setVisible(true);

        return tableModel;
    }

    //ez csinélja meg az alblakot;

    private static void updateUI(JTable table, GameOfLife gameOfLife) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                table.updateUI();
            }
        });

    }
}
