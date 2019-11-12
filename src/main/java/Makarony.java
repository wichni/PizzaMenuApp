import java.util.Scanner;

public class Makarony extends Menu {
    private String name;
    private int price;

    public Makarony (String name, int price) {
        super();
        this.name = name;
        this.price = price;
    }


    public static void takeOrder() {
        int cenaZamowienia3 = 0;
        Scanner scanner = new Scanner(System.in);

        Makarony bolognese = new Makarony("1. Spaghetii bolognese ", 12);
        Makarony funghi = new Makarony("1. Spaghetii funghi ", 15);
        Makarony carbonara = new Makarony("1. Spaghetii carbonara ", 15);


        while (true) {
            int number = scanner.nextInt();

            switch (number) {
                case 1:
                    System.out.println("\n1. Spaghetii bolognese ");
                    cenaZamowienia3 += bolognese.price;
                    break;
                case 2:
                    System.out.println("\n2. Spaghetii funghi ");
                    cenaZamowienia3 += funghi.price;
                    break;
                case 3:
                    System.out.println("\n3. Spaghetii carbonara");
                    cenaZamowienia3 += carbonara.price;
                    break;
                case 0:
                    System.out.println("\n Wyjscie z Menu: ");
                    System.out.println(" \nTwoje zamowienie za makarony " + cenaZamowienia3);
                    System.out.println();
                    Menu menu = new Menu();
                    menu.Menu();
                    break;

            }
        }
    }
}

