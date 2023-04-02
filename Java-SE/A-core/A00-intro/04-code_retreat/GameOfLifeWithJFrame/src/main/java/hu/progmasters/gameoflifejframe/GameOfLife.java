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

public class GameOfLife {

    private int height;
    private int width;
    private int[][] space;

    public GameOfLife(int height, int width) {
        this.height = height;
        this.width = width;
        this.space = new int[this.height + 2][this.width + 2];  //Use this with virtual border
    }


    public void updateToNextGenerataion() {
        //TODO generate the next generation state and update the space

        int[][] newTable = new int[this.height + 2][this.width + 2];

            for (int i = 1; i < this.space[i].length - 1; i++) {
                for (int j = 1; j < this.space[j].length - 1; j++) {
                    int cellSum = 0;
                    for (int rowIndex = i - 1; rowIndex <= i + 1; rowIndex++) {
                        for (int columnIndex = j - 1; columnIndex <= j + 1; columnIndex++) {
                            cellSum += this.space[rowIndex][columnIndex];
                        }
                    }
                    cellSum -= this.space[i][j];

                    if (cellSum == 3) {
                        newTable[i][j] = 1;
                    } else if (cellSum > 3 || cellSum < 2) {
                        newTable[i][j] = 0;
                    } else if (cellSum == 2 && isAlive(i,j)) {
                        newTable[i][j] = 1;
                    } else {
                        newTable[i][j] = 0;
                    }
                }
            }

            for (int i = 0; i < newTable.length; i++) {
                for (int j = 0; j < newTable.length; j++) {
                    System.out.print(newTable[i][j] + " ");
                }
                System.out.println();
            }
            this.space = newTable;
    }

    public boolean isAlive(int rowIndex, int columnIndex) {
        if (space[rowIndex][columnIndex] == 1) {
            return true;
        } else {
            return false;
        }
    }

    public void generateInitialBoard() {
        space = SpaceData.initSpace;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}
