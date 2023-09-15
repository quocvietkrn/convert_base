package controller;

import model.Model;
import view.AbstractMenu;
import view.View;

public class Controller {
    private Model model;
    private View view;
 private AbstractMenu menu;

    public Controller(Model model, View view, AbstractMenu menu) {
        this.model = model;
        this.view = view;
        this.menu = menu;
    }

    public void run() {
        int fromBase, toBase;
        String inputValue;

        while (true) {
            int choice = menu.getMenuChoice();

            if (choice < 1 || choice > 3) {
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                continue;
            }

            fromBase = choice;
            toBase = menu.getMenuChoice();
            inputValue = view.getInputValue();

            String result = model.convertBase(inputValue, fromBase, toBase);
            view.printResult(result);

            System.out.println("Bạn có muốn tiếp tục không? (Nhập 'no' để thoát): ");
            String continueChoice = view.getInputValue();
            if ("no".equalsIgnoreCase(continueChoice)) {
                break;
            }
        }

        view.close();
    }
}
