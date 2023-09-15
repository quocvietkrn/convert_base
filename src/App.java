import controller.Controller;
import model.Model;
import view.AbstractMenu;
import view.Menu;
import view.View;

public class App {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        AbstractMenu menu = new Menu();
        Controller controller = new Controller(model, view, menu);

        controller.run();
    }
}
