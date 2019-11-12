import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pizza extends Menu {

    private String name;
    private int price;
    private int cenaZamowienia1 = 0;

    public Pizza(String name, int price) {
        super();
        this.name = name;
        this.price = price;
    }


    public static void takeOrder() {
        int cenaZamowienia1 = 0;
        String name;
        Scanner scanner = new Scanner(System.in);

        Pizza margarita = new Pizza("1. Margarita ", 20);
        Pizza capriciosa = new Pizza("2. Capriciosa ", 27);
        Pizza hawaii = new Pizza("3. Hawaii ", 32);
        Pizza kebab = new Pizza("4. Kebab ", 33);
        Pizza funghi = new Pizza("5. Funghi ", 22);

        while (true) {
            int number = scanner.nextInt();

            switch (number) {
                case 1:
                    System.out.println(Colors.ANSI_RED+"\n1. Margarita "+Colors.ANSI_RESET);
                    cenaZamowienia1 += margarita.price;
                    break;
                case 2:
                    System.out.println(Colors.ANSI_BLUE+"\n2. Capriciosa "+Colors.ANSI_RESET);
                    cenaZamowienia1 += capriciosa.price;
                    break;
                case 3:
                    System.out.println(Colors.ANSI_CYAN+"\n3. Hawaii"+Colors.ANSI_RESET);
                    cenaZamowienia1 += hawaii.price;
                    break;
                case 4:
                    System.out.println(Colors.ANSI_BLACK+"\n4. Kebab"+Colors.ANSI_RESET);
                    cenaZamowienia1 += kebab.price;
                    break;
                case 5:
                    System.out.println(Colors.ANSI_GREEN+"\n5. Funghi"+Colors.ANSI_RESET);
                    cenaZamowienia1 += funghi.price;
                    break;
                case 0:
                    System.out.println(Colors.ANSI_PURPLE+"\n Wyjscie z Menu: "+Colors.ANSI_RESET);
                    System.out.println(Colors.ANSI_YELLOW+" \nTwoje zamowienie za pizze " + cenaZamowienia1 + Colors.ANSI_RESET);
                    System.out.println();
                    Menu menu = new Menu();
                    menu.Menu();
                    break;

            }
        }
    }
}
