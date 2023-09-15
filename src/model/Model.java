package model;

public class Model {
    public String convertBase(String input, int fromBase, int toBase) {
        try {
            int num = Integer.parseInt(input, fromBase);
            return Integer.toString(num, toBase);
        } catch (NumberFormatException e) {
            return "Lỗi đầu vào không hợp lệ!";
        }
    }
}

