public class Main {
    public static void main(String[] args) {
        PrimoModel model = new PrimoModel();
        PrimoView view = new PrimoView();
        new PrimoController(model, view);
        view.setVisible(true);
    }
}

//iniciamos aqui