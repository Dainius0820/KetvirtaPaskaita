import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n-------------------------- TASK 1 --------------------------\n");

        // 1. Sukurkite Funkciją kuri priima du int tipo kintamuosius. Juos
        // susumuoja ir atspausdina.

        printSum((int) (Math.random() * 10), (int) (Math.random() * 10));

        System.out.println("\n-------------------------- TASK 2 --------------------------\n");

        // 2. Sukurkite Funkciją kuri vadinasi PISq. Funkcija gražina double tipo
        // reikšmę. Reikšmė yra : 9.8596; Gautą reikšmę atspausdinkite.

        System.out.println(PISq());

        System.out.println("\n-------------------------- TASK 3 --------------------------\n");

        // 3. Sukurkite Funkciją kuri priima du int tipo kintamuosius. Funkcija
        // gražina skaičių sandaugą.; Gautą reikšmę atspausdinkite.

        System.out.println(numMulti((int) (Math.random() * 10), (int) (Math.random() * 10)));

        System.out.println("\n-------------------------- TASK 4 --------------------------\n");

        // 4. Sukurkite Funkciją kuri priima int[] tipo kintamąjį, prasuka ciklą ir
        // atspausdina kiekvieną skaičių vienoje eilutėje.

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }
        printIntArray(numbers);
        System.out.println();

        System.out.println("\n-------------------------- TASK 5 --------------------------\n");

        // 5. Sukurkite Funkciją kuri priima du int tipo kintamuosius, min ir max
        // reikšmėms nustatyti ir sugeneruoja random int skaičių ir jį gražintų.

        int num1 = 1;
        int num2 = 25;
        System.out.println(rndNumber(num1, num2));

        System.out.println("\n-------------------------- TASK 6 --------------------------\n");

        // 6. Sukurkite Funkciją kuri sugeneruotų random int skaičių masyvą ir jį
        // gražintų. Funkcija priima tris int tipo kintamuosius, min, max ir length
        // reikšmėms nustatyti.

        int[] numArray = rndNumberArray(5, 10, 5);
        System.out.println(Arrays.toString(numArray));

        System.out.println("\n-------------------------- TASK 7 --------------------------\n");

        // 7. Sukurkite Funkciją kuri panaudotų 6toje užduotyje sugeneruotą masyvą
        // (priimtų kaip kintamąjį), susumuotų ir gražintų reikšmę.

        System.out.println(sumRndNumberArray(numArray));

        // 8. Sukurkite Funkciją kuri priimtų 6toje užduotyje sugeneruotą masyvą ir
        // gražintų jos skaičių vidurkį (double).


    }

    public static void printSum (int x, int y) {
        System.out.println(x + y);
    }

    public static double PISq () {
        return 9.8596;
    }

    public static int numMulti (int x, int y) {
        return x * y;
    }

    public static void printIntArray (int[] numbers) {
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static int rndNumber(int num1, int num2) {
        int rndNumber = 0;
        if (num1 > num2) {
            rndNumber = num2 + (int) Math.round(Math.random() * (num1 - num2));
        }
        if (num2 > num1) {
            rndNumber = num1 + (int) Math.round(Math.random() * (num2 - num1));
        }
        return rndNumber;
    }

    public static int[] rndNumberArray(int min, int max, int length) {
        int[] rndNumbers = new int[length];
        for (int i = 0; i < rndNumbers.length; i++) {
            rndNumbers[i] = min + (int) Math.round(Math.random() * (max - min));
        }
        return rndNumbers;
    }

    public static int sumRndNumberArray (int[] numArray) {
        int sum = 0;
        for (int i : numArray)
            sum += i;
        return sum;
    }



























































        // END OF CLASS... DON'T DELETE!}
}