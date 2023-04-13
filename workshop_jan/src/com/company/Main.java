package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

/*        Dog csibesz = new Dog("Csibész", 5, true);
        Dog buksi = new Dog("Buksi", 2, true);

        System.out.println(csibesz.age);
        System.out.println(buksi.age);
        csibesz.bark();
        buksi.bark();*/

        //alapból egy 10 hozzú tömb jön létre, de lehet tovább pakolni bele, ha 11-diket akarunk beleraki,
        // megkétszerezni a helyek számát

        //tömböket akkor használunk, ha tudjuk pontosan mennyi elemet founk kezelni

        // List list = new ArrayList();
        List<Object> objectList = new ArrayList<>();
        objectList.add(2);
        objectList.add("macska");
        objectList.add(true);
        System.out.println(objectList);
        //bármit rakhatunk ebbe, bármilyen típ. változót

        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        integerList.add(10);

        List<String> myAnimalList = new ArrayList<>();
        myAnimalList.add("elephant");
        System.out.println(myAnimalList);

        //Array listába áttöltése
        String[] myStringArray = {"kutya", "macska", "egér"};
        List<String> animalList = new ArrayList<>(Arrays.asList(myStringArray));
        System.out.println(animalList);

        Integer[] intArray = {1, 2, 3};
        List<Integer> intList = new ArrayList<>(Arrays.asList(intArray));
        System.out.println(intList);

        //ugyanaz az indexelési elve, mint az arraynek, 0. indexről indulunk

        //METÓDUSOK

        //hozzáadás --> .add
        intList.add(87); //a végére rakja az Integert (de bármi mást is)
        System.out.println(intList);

        //méret lekérdezése --> .size (Array, string --> . length)
        System.out.println(intList.size());

        //egy elem kikérése --> .get
        Integer firstElement = intList.get(0);
        System.out.println(firstElement);

        //itt is túl tudunk indexálni
        //System.out.println(intList.get(7));
        //IndexOutOfBoundsException hiba

        //a listába rakhatunk listát objektumként --> így lehet kvázi több dimenziós listát csinálni

        //egy elem eltávolítása --> .remove (boolean-nal tér vissza, hogy sikerül-e vagy sem)
        boolean isSuccess = animalList.remove("egér");
        System.out.println(isSuccess);
        System.out.println(animalList);
        boolean isSucess2 = animalList.remove("zsiráf");
        System.out.println(isSucess2);


        //tartalmaz-e valamit a lista --> .conatins
        boolean isContains = animalList.contains("egér");
        boolean isContains2 = animalList.contains("macska");
        System.out.println(isContains);
        System.out.println(isContains2);

        //egy adott indexű elem cserélése valamire --> .set
        animalList.set(1, "orrszarvú");
        System.out.println(animalList);
        //animalList.set(3, "tyúk");
        //System.out.println(animalList); --> out of bound exeptionra fut

        //elem beszúrása két másik elem közé, az utána következő tolódik hátra
        animalList.add(1, "tyúk");
        System.out.println(animalList);

        // kipucolja a teljes listát --> .clear (nincs visszatérési érték
        animalList.clear();
        System.out.println(animalList);
        System.out.println(animalList.size());
        animalList.add(null);
        System.out.println(animalList);

        // list iterálás --> .iter
        for (String animal : animalList) {
        }

        for (int i = 0; i < animalList.size(); i++) {
            System.out.println(animalList.get(i));

        }





      /*  int x = 1, y = 6;
        while (y-- > 0) {
            x++;
        }
        System.out.println("x = " + x + " y = " + y);
*/
    }
}
