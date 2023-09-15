package view;

import java.util.Scanner;

public class Menu extends AbstractMenu {
    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    @Override
    public int getMenuChoice() {
        displayMenu();
        System.out.println("Chọn một lựa chọn từ menu: ");
        return scanner.nextInt();
    }
}
