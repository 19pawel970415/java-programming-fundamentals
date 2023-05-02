import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1
        System.out.println("Hello");

        // 2
        String name = "Paul";
        System.out.println("Hello " + name);

        // 3
        int a = 5;
        int b = 8;
        System.out.println(a + b);

        // 4
        float c = 5f;
        float d = 7.5f;
        System.out.println(c + d);

        // 5
        double e = 5d;
        double f = 6.324214d;
        System.out.println(e + f);

        // 6
        System.out.println(e * f);

        // 7
        System.out.println(b / a);

        // 8
        System.out.println(b % a);

        // 9
        // short if
        System.out.println((a == b) ? "a equals b" : "a doesn't equal b");
//        if (a == b) {
//            System.out.println("a equals b");
//        }
//        if (a != b) {
//            System.out.println("a doesn't equal b");
//        }

        // 10
        boolean is = true;
        boolean isNot = false;
        if (is == isNot) {
            System.out.println("That's true");
        } else {
            System.out.println("That's not true");
        }

        // 11 and 12
        float g = b;
        int h = (int) d;
        System.out.println(g);
        System.out.println(h);

        // 13 and 14 and 15
        float temperature = 38.5f;
        if (temperature > 37.5) {
            System.out.println("U should definitely c a doc");
        } else if (temperature < 36) {
            System.out.println("The temperature is too low");
        } else {
            System.out.println("Ur fine");
        }

        // 17
        float price = 5500f;
        if (price > 6000) {
            System.out.println("It's too expensive, not gonna buy it");
        } else if (price < 4000) {
            System.out.println("I'll definitely buy it");
        } else {
            System.out.println("I'll consider buying it");
        }

        // 18
        String personName = "Kate";
        switch (personName) {
            case "Mike":
                System.out.println("Hello Mike");
                break;
            case "John":
                System.out.println("Hello John");
                break;
            case "Kate":
                System.out.println("Hello Kate");
                break;
            default:
                System.out.println("Hello someone");
        }

        // 19
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }

        System.out.println();

        // 20
        for (int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        // 21
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        // 22
        int i = 1;

        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        // 23
        i = 1;

        while (i <= 10) {
            System.out.print(i + " ");
            if (i == 5) {
                break;
            }
            i++;
        }

        System.out.println();

        // 24
        String[] names = {"Paul", "Martin", "James", "Eve", "Lucy"};
        for (String n:
             names) {
            System.out.println("Hello " + n);
        }

        // 25
        for (int j = 0; j < names.length; j++) {
            System.out.println(names[j]);
        }

        // 26
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String input = scanner.nextLine();
        System.out.println("Hello " + input);

        // 27
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number  = scanner1.nextInt();
        if (number > 200) {
            System.out.println("It's a huge number");
        } else if (number < 100) {
            System.out.println("It's a small number");
        } else {
            System.out.println("It's neither huge nor small");
        }

        // 28
        printHello();

        // 29
        printHelloSb(input);

        // 30
        String toPrint = printHelloSbReturnString("Tom");
        System.out.println(toPrint);

        /*
        1. Napisz w metodzie main operację drukującą "Hello",
        2. Napisz metodę drukującą (funkcja System.out.println) Hello oraz imie, które wcześniej przypiszesz do zmiennej,
        3. Napisz w funkcji main sumowanie dwóch zmiennych typu całkowitego i wydrukuj ich wynik,
        4. Napisz w funkcji main sumowanie dwóch zmiennych typu float i wydrukuj ich wynik,
        5. Napisz w funkcji main sumowanie dwóch zmiennych typu double i wydrukuj ich wynik,
        6. Napisz w funkcji main mnożenie dwóch zmiennych typu double i wydrukuj ich wynik,
        7. Napisz w funkcji main dzielenie dwóch zmiennych typu int i wydrukuj ich wynik - tutaj może użyć rzutowania,
        8. Napisz w funkcji main operacje uzyskania reszty z dzielenia dwóch liczb i wydrukuj wynik,
        9. Napisz w funkcji main porównanie dwóch dowolnych liczb (przez ==  i !=).
        10.Napisz w funkcji main porównanie dwóch zmiennych typu prawda-fałsz (boolean).
        11. Zrzutuj zmienna o typie int na zmienną o typie float.
        12. Zrzutuj zmienna o typie float na zmienną o typie int.
        13. Napisz zmienną float przechowującą temperature człowiek i w instrukcji warunkowej sprawdź czy osoba ma gorączkę tip: if(temp > 37.5).
        14. Rozwiń zadanie 13 i dopisz sytuację przeciwną (else) wydrukuj informacje że człowiek jest zdrowy.
        15. Rozwiń zadanie 13 i 14 dopisz kolejny warunek do funkcji warunkowej (else if). Jeśli temperatura jest większa od 37,5 napisz ze ma gorączkę, jeśli między 37,5 a 36,0 że w normie, natomiast jeśli niższa niż 36 wydrukuj informację że zbyt niska.
        17. Analogicznie do zadań 13,14,15 przygotuj scenariusz dla dowolnego przypadku np. cen mieszkań za mert na rynku nieruchomości.
        18. Napisz zmienną 'name', przygotuj funkcję funkcję warunkową switch-case. Przywitaj się z imionami Mike, John, Kate w sposób Hello <imię>. Domyślnie wydrukuj "Hello someone"
        19. Napisz pętle for drukującą liczenie od 1 do 10
        20. Napisz pętlę for liczącą od 0 do 20
        21. Napisz pętlę for liczącą od 10 do 1
        22. Napisz pętlę while liczącą od 1 do 10
        23. Przerwij pętlę while z zadania 22 gdy doliczy do 5 (użyj instrukcji warunkowej i i specjalnej komendy 'break')
        24. Napisz tablicę typu string z imionami. Przy użyciu pętli for each wydrukuj przywitanie dla wszystkich imion z listy.
        25. Uzyj tablicy z zadania 24 i wydrukuj imiona przy użyciu zwykłej pętli for na podstawie długości tablicy (table.length).
        26. Napisz program odczytujący strumień wejściowy (Uzyj klasy Scanner) oraz drukujący zawarość wejściowego stringa. Uruchom program i napisz w konsoli imię.
        27. Napisz program przyjmujący liczbę wejściową typu int. Następnie utwórz instrukcje warunkową sprawdzającą czy liczba jest mniejsza od 100, między 100 a 200 lub większa od 200.
        28. Nazwij i napisz ciało swojej metody drukującej hello (uruchom tą metodę w metodzie main)
        29. Rozwiń zadanie nr 28. Przyjmij do metody argument z imieniem i wydrukuj w swojej metodzie 'hello <imie>'.
        30. Zwróć wartość z metody zamiast ją drukować. Zwróć wartość typu String. W metodzie main przejmij zwracaną wartość i ją wydrukuj.


        */
    }

    public static void printHello() {
        System.out.println("Hello");
    }

    public static void printHelloSb(String name) {
        System.out.println("Hello " + name);
    }

    public static String printHelloSbReturnString(String name) {
        return "Hello " + name;
    }

}
