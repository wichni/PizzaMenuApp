import java.util.Scanner;

public class Salatki extends Menu{
    private String name;
    private int price;

    public Salatki (String name, int price) {
        super();
        this.name = name;
        this.price = price;
    }


    public static void takeOrder() {
        int cenaZamowienia2 = 0;
        String name;
        Scanner scanner = new Scanner(System.in);

        Salatki grecka = new Salatki("1. Sałatka grecka ", 15);
        Salatki kebab = new Salatki("1. Sałatka kebab ", 15);
        Salatki kurczak = new Salatki("1. Sałatka z kurczakiem ", 15);


        while (true) {
            int number = scanner.nextInt();

            switch (number) {
                case 1:
                    System.out.println("\n1. Sałatka grecka ");
                    cenaZamowienia2 += grecka.price;
                    break;
                case 2:
                    System.out.println("\n2. Sałatka kebab ");
                    cenaZamowienia2 += kebab.price;
                    break;
                case 3:
                    System.out.println("\n3. Sałatka z kurczakiem");
                    cenaZamowienia2 += kurczak.price;
                    break;
                case 0:
                    System.out.println("\n Wyjscie z Menu: ");
                    System.out.println(" \nTwoje zamowienie za sałatkę: " + cenaZamowienia2);
                    System.out.println();
                    Menu menu = new Menu();
                    menu.Menu();
                    break;

            }
        }
    }
}
