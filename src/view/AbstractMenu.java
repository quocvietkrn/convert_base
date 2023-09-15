package view;

public abstract class AbstractMenu {
    public abstract int getMenuChoice();

    public void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Nhị phân");
        System.out.println("2. Thập phân");
        System.out.println("3. Thập lục phân");
    }
}
