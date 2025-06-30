import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PrimoView extends JFrame {
    private JTextField campoNumero = new JTextField(10);
    private JButton botaoVerificar = new JButton("calcular");
    private JLabel labelResultado = new JLabel("Digite um número acima");

    public PrimoView() {
        setTitle("PRIMO");
        setSize(280, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Número:"));
        add(campoNumero);
        add(botaoVerificar);
        add(labelResultado);
    }

    public int getNumero() {
        try {
            return Integer.parseInt(campoNumero.getText());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public void setResultado(boolean ehPrimo) {
        labelResultado.setText(ehPrimo ? "é primo" : "não é primo");
    }

    public void addVerificarListener(ActionListener listener) {
        botaoVerificar.addActionListener(listener);
    }
}
