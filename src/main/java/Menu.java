import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private int user;
    private String menuPizza;
    private String menuSałatki;
    private int number;
    private String pizzaName;
    private Menu menu;


    public void Menu() {
        int sumaZamowien = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println( Colors.ANSI_BLUE + " Menu: ");
        System.out.println(" 1: Pizza: ");
        System.out.println(" 2: Sałatki: ");
        System.out.println(" 3: Makarony: ");
        System.out.println(" 4: Dodatki ");
        System.out.println(" 0: Wyjscie: " + Colors.ANSI_RESET);
        this.user = scanner.nextInt();
        while (true) {
            switch (user) {
                case 1:
                    System.out.println(Colors.ANSI_RED+"1: Pizza: "+Colors.ANSI_RESET);
                    setMenuPizza();
                    Pizza.takeOrder();
                    break;
                case 2:
                    System.out.println(Colors.ANSI_YELLOW+"2: Sałatki: "+Colors.ANSI_RESET);
                    setMenuSałatki();
                    Salatki.takeOrder();
                    break;
                case 3:
                    System.out.println(Colors.ANSI_PURPLE+"3: Makarony: "+Colors.ANSI_RESET);
                    setMenuMakarony();
                    Makarony.takeOrder();
                    break;
                case 0:
                    System.out.println(Colors.ANSI_GREEN+" Wyjscie ");
                    System.out.println(" Do zapłaty: " + sumaZamowien + Colors.ANSI_RESET);
                    System.exit(0);
            }
        }
    }

    private void setMenuSałatki() {
        System.out.println(Colors.ANSI_GREEN+"\n1. Sałatka grecka, 15 PLN");
        System.out.println(" Sałata lodowa, pomidor koktajlowy, ogórek, papryka, oliwki, sos winegret, feta"+Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_PURPLE+"\n2. Sałatka kebab, 15 PLN");
        System.out.println(" Kapusta pekińska, mięso kebab, ogórek, sos"+Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_YELLOW+"\n3. Sałatka z kurczakiem, 15 PLN");
        System.out.println(" Kapusta pekińska, ogórek, pomidor, kurczak grillowany, sos"+Colors.ANSI_RESET);

    }

    private void setMenuMakarony() {
        System.out.println(Colors.ANSI_BLACK+"\n1. Spaghetii bolognese, 12 PLN"+Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_CYAN+"\n2. Spaghetii funghi, 15 PLN");
        System.out.println(" sos śmietanowy, pieczarki, parmezan"+Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_WHITE+"\n3. Spaghetii carbonara, 15 PLN");
        System.out.println(" sos śmietanowy, boczek, ser"+Colors.ANSI_RESET);
    }

    private void setMenuPizza() {
        System.out.println(Colors.ANSI_RED+"\n1. Margarita, 20 PLN");
        System.out.println(" sos, ser, oregano "+Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_CYAN+"\n2. Capriciosa, 27 PLN");
        System.out.println(" sos, ser, szynka, pieczarki "+Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_BLACK+"\n3. Hawaii, 32 PLN ");
        System.out.println(" sos, ser, szynka, ananas "+Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_YELLOW+"\n4. Kebab, 33 PLN ");
        System.out.println(" sos, ser, mięso kebab, kapusta pekińska, ogórek, pomidor, sos czosnkowy "+Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_GREEN+"\n5. Funghi, 22 PLN ");
        System.out.println(" sos, ser, pieczarki"+Colors.ANSI_RESET);
    }
}

