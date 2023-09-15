package view;
import java.util.Scanner;

public class View {
    private Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    public int getInputBase() {
        System.out.println("Chọn số hệ cơ số đầu vào: ");
        return scanner.nextInt();
    }

    public int getOutputBase() {
        System.out.println("Chọn số hệ cơ số đầu ra: ");
        return scanner.nextInt();
    }

    public String getInputValue() {
        System.out.println("Nhập giá trị đầu vào: ");
        return scanner.next();
    }

    public void printResult(String result) {
        System.out.println("Kết quả: " + result);
    }

    public void close() {
        scanner.close();
    }
}
