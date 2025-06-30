import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimoController {
    private PrimoModel model;
    private PrimoView view;

    public PrimoController(PrimoModel model, PrimoView view) {
        this.model = model;
        this.view = view;

        this.view.addVerificarListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numero = view.getNumero();
                if (numero == -1) {
                    view.setResultado(false);
                } else {
                    boolean ehPrimo = model.ehPrimo(numero);
                    view.setResultado(ehPrimo);
                }
            }
        });
    }
}
