public class First {

    public static void main(String[] args) {

        // 2. Feladat:
        // Tökéletesnek nevezzük azt a pozitív egész számot,
        // ami megegyezik a nála kisebb pozitív osztói összegével. Például: 6 = 1 + 2 + 3
        // Írj egy olyan programot, ami 2 és 10000 között kiírja az összes tökéletes számot!

        int sum = 0;

        for (int i = 2; i <= 10000; i++) {
            sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (i == sum) {
                System.out.println(i);
            }
        }

    }
}
