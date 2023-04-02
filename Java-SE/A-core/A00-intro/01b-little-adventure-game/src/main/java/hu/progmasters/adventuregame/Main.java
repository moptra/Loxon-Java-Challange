package hu.progmasters.adventuregame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int v = 1;

        while (!(i == 19 || i == 22)) {
            if (i == 1) {
                System.out.println("Te vagy az iskola rosszfiúja. Késve érkezel a suli elé, még elszívod a cigidet, aztán… \n" +
                        "2. elnyomod a csikket az igazgatónő bringájának kerekébe. \n" +
                        "3. felrúgod a bejárat mel3letti szemeteskukát és mellé pöccinted a csikket. \n" +
                        "4. odaér a haverod, Béci is. Rágyújtotok egy újabb cigire. \n" +
                        "Mit választasz? Írj be a számot:");
                v = Integer.parseInt(scanner.nextLine());
                if (v == 2 || v == 3 || v == 4) {
                    i = v;
                }
            }

            if (i == 2) {
                System.out.println("észreveszi az éppen érkező töri tanárod, mit tettél és… \n" +
                        "5. azonnal felrángat az igazgatói irodába. Te hőzöngve tiltakozol végig a folyosón. \n" +
                        "6. gratulál neked, hisz szerinte is egy nagyképű szipirtyó a nő. \n" +
                        "7. szó nélkül tovább sétál, mivel eléggé parázik tőled. \n" +
                        "Mit választasz? Írj be a számot:");
                v = Integer.parseInt(scanner.nextLine());
                if (v == 5 || v == 6 || v == 7) {
                    i = v;
                }
            }
        }
    }
}
