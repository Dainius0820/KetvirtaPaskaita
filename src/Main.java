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

        int[] numArray = rndNumArray(5, 10, 5);
        System.out.println(Arrays.toString(numArray));

        System.out.println("\n-------------------------- TASK 7 --------------------------\n");

        // 7. Sukurkite Funkciją kuri panaudotų 6toje užduotyje sugeneruotą masyvą
        // (priimtų kaip kintamąjį), susumuotų ir gražintų reikšmę.

        System.out.println(sumRndNumArray(numArray));

        System.out.println("\n-------------------------- TASK 8 --------------------------\n");

        // 8. Sukurkite Funkciją kuri priimtų 6toje užduotyje sugeneruotą masyvą ir
        // gražintų jos skaičių vidurkį (double).

        System.out.println(averageRnDNumArray(numArray));

        System.out.println("\n-------------------------- TASK 9 --------------------------\n");

        // 9. Sukurkite Funkciją kuri priimtų du int skaičius ir atspausdintų
        // stačiakampį užpildytą žvaigždutėmis. Pirmas int - išoriniam ciklui,
        // antras vidiniam.

        int num3 = 5;
        int num4 = 9;

        rectangle(num3, num4);

        System.out.println("\n-------------------------- TASK 10 --------------------------\n");

        // 10. Sukurkite Funkciją kuri priimtų sakinį kaip kintamąjį ir atspausdintų
        // kiek jame yra raidžių(simbolių) ir tarpų. Sakinys - “Šiandien labai graži
        // diena” (kodas turi veikti padavus bet kokį sakinį).

        String sentence = "Šiandien labai graži diena";
        spaceSymbolCount(sentence);

        System.out.println("\n-------------------------- TASK 11 --------------------------\n");

        // 11. Sukurkite Funkciją kuri priimtų sakinį, jį užkoduotų ir grąžintų.
        // Kodavimas - sakinį apsukame iš kitos pusės. Pvz “Naglis” turi gautis
        // “silgaN”.

        System.out.println(reverseSentence(sentence));

        System.out.println("\n-------------------------- TASK 12 --------------------------\n");

        // 12. Parašykite funkciją, kurios argumentas būtų tekstas, kuris būtų
        // atspausdinamas konsolėje pridedant “---” pradžioje ir gale. PVZ
        // (---labas---)

        addDashes(sentence);

        System.out.println("\n-------------------------- TASK 13 --------------------------\n");

        // 13. Sugeneruokite atsitiktinį stringą iš raidžių ir skaičių (10 simbolių).
        // Atspausdinkite simbolius stulpeliu. Jei tai skaičius apgaubkite “ [ 7 ]”. Jei
        // skaičiai eina keli iš eilės, apgaubkite juos kartu. [75].

        String text = generateRndStr(10);
        System.out.println(text);
        printRndStr(text);

        System.out.println("\n-------------------------- TASK 14 --------------------------\n");

        // 14. Parašykite funkciją, kuri skaičiuotų, ir gražintų iš kiek sveikų skaičių jos
        // argumentas dalijasi be liekanos (išskyrus vienetą ir patį save).

        int rndNumber = (int) (Math.random() * 100);
        System.out.println(rndNumber);

        System.out.println("Skaičius " + rndNumber + " dalijasi be liekanos" +
                    " iš " + factorsCount(rndNumber) + " skaičių(-iaus)");

        System.out.println("\n-------------------------- TASK 15 --------------------------\n");

        // 15. Sugeneruokite masyvą iš 100 elementų, kurio reikšmės atsitiktiniai
        // skaičiai nuo 33 iki 77. Išrūšiuokite masyvą pagal daliklių be liekanos kiekį
        // mažėjimo tvarka, panaudodami trečio uždavinio funkciją.

        int[] rndNumArray = rndNumArray(33, 77, 100);
        for (int i = 0; i < rndNumArray.length; i++) {
            System.out.print(rndNumArray[i] + " ");
        }
        System.out.println();
        sortNumArrayFactors(rndNumArray);

        System.out.println("\n\n-------------------------- TASK 16 --------------------------\n");

        // 16. Sugeneruokite masyvą iš 100 elementų, kurio reikšmės atsitiktiniai
        // skaičiai nuo 333 iki 777. Naudodami 3 uždavinio funkciją iš masyvo
        // suskaičiuokite kiek yra pirminių skaičių.

        int[] rndNumArray1 = rndNumArray(333, 777, 100);
        for (int i = 0; i < rndNumArray1.length; i++) {
            System.out.print(rndNumArray1[i] + " ");
        }
        System.out.println();
        // int[] rndNumArray2 = {2, 3, 5, 7, 4, 12};
        System.out.println(primeNumbersCount(rndNumArray1));
        // System.out.println(primeNumbersCount(rndNumArray2));

        System.out.println("\n\n-------------------------- TASK 17 --------------------------\n");

        // 17. Sugeneruokite masyvą iš trijų elementų, kurie yra atsitiktiniai skaičiai
        // nuo 1 iki 33. Jeigu tarp trijų paskutinių elementų yra nors vienas ne
        // pirminis skaičius, prie masyvo pridėkite dar vieną elementą- atsitiktinį
        // skaičių nuo 1 iki 33. Vėl patikrinkite pradinę sąlygą ir jeigu reikia pridėkite
        // dar vieną elementą. Kartokite, kol sąlyga nereikalaus pridėti elemento.

        int[] rndNumArray3 = rndNumArray(1, 33, 3);
        for (int i = 0; i < rndNumArray3.length; i++) {
            System.out.print(rndNumArray3[i] + " ");
        }
        System.out.println();
        rndNumArrayCheck(rndNumArray3);

        System.out.println("\n\n-------------------------- TASK 18 --------------------------\n");

        // 18. Sugeneruokite masyvą iš 10 elementų, kurie yra masyvai iš 10 elementų,
        // kurie yra atsitiktiniai skaičiai nuo 1 iki 100. Jeigu tokio didelio masyvo (ne
        // atskirai mažesnių) pirminių skaičių vidurkis mažesnis už 70, suraskite
        // masyve mažiausią skaičių (nebūtinai pirminį) ir prie jo pridėkite 3. Vėl
        // paskaičiuokite masyvo pirminių skaičių vidurkį ir jeigu mažesnis nei 70
        // viską kartokite.

        twoDimensionalArray(3,3, 1, 100);

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

    public static int[] rndNumArray(int min, int max, int length) {
        int[] rndNumbers = new int[length];
        for (int i = 0; i < rndNumbers.length; i++) {
            rndNumbers[i] = min + (int) Math.round(Math.random() * (max - min));
        }
        return rndNumbers;
    }

    public static int sumRndNumArray(int[] numArray) {
        int sum = 0;
        for (int i : numArray)
            sum += i;
        return sum;
    }

    public static double averageRnDNumArray(int[] numArray) {
        int sum = 0;
        for (int i : numArray)
            sum += i;
        return (double)sum / numArray.length;
    }

    public static void rectangle (int num1, int num2) {
        char star = '*';
        for (int x = 0; x < num1; x++) {
            for (int y = 0; y < num2; y++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }

    public static void spaceSymbolCount (String sentence) {
        int numOfSpaces = sentence.length() - sentence.replace(" ", "").length();
        int numOfSymbols = sentence.length() - numOfSpaces;
        System.out.println("Simbolių skaičius: " + numOfSymbols + "\nTarpų skaičius: " + numOfSpaces);
    }

    public static String reverseSentence (String sentence) {
        String reversedStr = "";
        for (int i = 0; i < sentence.length(); i++) {
            reversedStr = sentence.charAt(i) + reversedStr;
        }
        return reversedStr;
    }

    // 12. -----------------------------------------------------------------------------------------------

    public static void addDashes (String sentence) {
        System.out.println("---" + sentence + "---");
    }

    // 13. -----------------------------------------------------------------------------------------------

    public static String generateRndStr(int length) {
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345678901234567890";
        String text = "";
        for (int i = 0; i < length; i++) {
            text += symbols.charAt((int) (Math.random()*symbols.length()));
        }
        return text;
    }

    public static void printRndStr (String rndStr) {
        String[] textArray = rndStr.split("");
        boolean isNumberGrouped = false;

        for (int i = 0; i < rndStr.length(); i++) {
            if (textArray[i].matches("[0-9]")) {
                if (!isNumberGrouped) {
                    System.out.print("[");
                    isNumberGrouped = true;
                }
                System.out.print(textArray[i]);
                if (i == textArray.length - 1 || !textArray[i + 1].matches("[0-9]")) {
                    System.out.println("]");
                    isNumberGrouped = false;
                }
            }
            else {
                System.out.println(textArray[i]);
            }
        }
    }

    // 14. -----------------------------------------------------------------------------------------------

    public static int factorsCount(int rndNum) {
        int factorsCount = 0;
        for (int i = 2; i < rndNum - 1; i++) {
            if (rndNum % i == 0) {
                factorsCount++;
            }
        }
        return factorsCount;

        /*
        int factor = 1;
        int factorsCount = 0;
        boolean isPrimeNum = false;

        while (factor <= rndNum) {
            if (rndNum % factor == 0) {
                factorsCount++;
            }
            factor++;
        }
        if (factorsCount == 2) {
            factorsCount = 0;
        }
        if (factorsCount > 2) {
            factorsCount -= 2;
        }
        return factorsCount;
         */
    }

    // 15. -----------------------------------------------------------------------------------------------

    public static void sortNumArrayFactors (int[] rndNumArray) {
        for (int i = 0; i < rndNumArray.length - 1; i++) {
            for (int j = i + 1; j < rndNumArray.length; j++) {
                if (factorsCount(rndNumArray[i]) < factorsCount(rndNumArray[j])) {
                    int temp = rndNumArray[i];
                    rndNumArray[i] = rndNumArray[j];
                    rndNumArray[j] = temp;
                }
            }
        }
        for (int i = 0; i < rndNumArray.length; i++) {
            System.out.print(rndNumArray[i] + " ");
        }
    }

    // 16. -----------------------------------------------------------------------------------------------

    public static int primeNumbersCount (int[] rndNumArray) {
        int primeNumbersCount = 0;
        for (int i = 0; i < rndNumArray.length; i++) {
            if (factorsCount(rndNumArray[i]) == 0) {
                primeNumbersCount++;
            }
        }

        return primeNumbersCount;
    }

    // 17. -----------------------------------------------------------------------------------------------

    public static void rndNumArrayCheck (int[] rndNumArray) {
        boolean containsNonPrime = true;
        while (containsNonPrime) {
            containsNonPrime = false;

            for (int i = rndNumArray.length - 1; i >= rndNumArray.length - 3 && i >= 0; i--) {
                if (factorsCount(rndNumArray[i]) > 0) {
                    containsNonPrime = true;
                    break;
                }
            }
            if (containsNonPrime) {
                int[] newRndNumArray = new int[rndNumArray.length + 1];

                for (int i = 0; i < rndNumArray.length; i++) {
                    newRndNumArray[i] = rndNumArray[i];
                }
                newRndNumArray[newRndNumArray.length - 1] = 1 + (int) Math.round(Math.random() * (33 - 1));
                rndNumArray = newRndNumArray;
            }
            System.out.println(Arrays.toString(rndNumArray));
        }
    }

    // 18. -----------------------------------------------------------------------------------------------

    public static void twoDimensionalArray (int numOfRows, int numOfColumns, int min, int max) {
        int[][] twoDimArray = new int[numOfRows][numOfColumns];
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfColumns; j++) {
                twoDimArray[i][j] = min + (int) Math.round(Math.random() * (max - min));
            }
        }

        while (true) {
            int primeSum = 0;
            int primeCount = 0;

            for (int i = 0; i < numOfRows; i++) {
                for (int j = 0; j < numOfColumns; j++) {
                    int num = twoDimArray[i][j];
                    if (num >= 2) {
                        boolean isPrime = true;
                        for (int k = 2; k <= Math.sqrt(num); k++) {
                            if (num % k == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                        if (isPrime) {
                            primeSum += num;
                            primeCount++;
                        }
                    }
                }
            }

            if (primeCount == 0) {
                break;
            }

            double primeAverage = (double) primeSum / primeCount;

            if (primeAverage >= 70) {
                break;
            }

            int minValue = twoDimArray[0][0];
            int minRow = 0;
            int minColumn = 0;

            for (int i = 0; i < numOfRows; i++) {
                for (int j = 0; j < numOfColumns; j++) {
                    if (twoDimArray[i][j] < minValue) {
                        minValue = twoDimArray[i][j];
                        minRow = i;
                        minColumn = j;
                    }
                }
            }

            twoDimArray[minRow][minColumn] += 3;
        }
        int finalPrimeSum = 0;
        int finalPrimeCount = 0;
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfColumns; j++) {
                int num = twoDimArray[i][j];
                if (num >= 2) {
                    boolean isPrime = true;
                    for (int k = 2; k <= Math.sqrt(num); k++) {
                        if (num % k == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        finalPrimeSum += num;
                        finalPrimeCount++;
                    }
                }
            }
        }

        System.out.println("Pirminių skaičių kiekis: " + finalPrimeCount);
        System.out.println("Pirminių skaičių suma: " + finalPrimeSum);
        System.out.println(Arrays.deepToString(twoDimArray));
    }




    // END OF CLASS... DON'T DELETE!}
}