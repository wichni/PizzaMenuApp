import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    private int user;

    public static void main(String[] args) {

        System.out.println(Colors.ANSI_GREEN+" Witaj w pizzerii "+Colors.ANSI_RESET);
        Menu menu = new Menu();
        menu.Menu();
    }
}
