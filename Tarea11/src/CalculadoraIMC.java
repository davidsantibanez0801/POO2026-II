import java.awt.*;
import java.awt.event.*;

public class CalculadoraIMC extends Frame implements ActionListener {

    Label lblPeso, lblAltura, lblResultado;
    TextField txtPeso, txtAltura;
    Button btnCalcular;

    public CalculadoraIMC() {

        // Título de la ventana
        super("Calculadora IMC");

        // Tamaño de ventana
        setSize(350, 200);

        // Diseño
        setLayout(new GridLayout(4, 2));

        // Componentes
        lblPeso = new Label("Ingresar peso:");
        txtPeso = new TextField();

        lblAltura = new Label("Ingresar altura:");
        txtAltura = new TextField();

        btnCalcular = new Button("Calcular IMC");
        btnCalcular.addActionListener(this);

        lblResultado = new Label("Resultado: ");

        // Agregar componentes
        add(lblPeso);
        add(txtPeso);

        add(lblAltura);
        add(txtAltura);

        add(btnCalcular);
        add(new Label(""));

        add(lblResultado);

        // Cerrar ventana
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    // Acción del botón
    public void actionPerformed(ActionEvent e) {

        double peso = Double.parseDouble(txtPeso.getText());
        double altura = Double.parseDouble(txtAltura.getText());

        double imc = peso / (altura * altura);

        lblResultado.setText("Resultado: " + imc);
    }

    // Main
    public static void main(String[] args) {
        new CalculadoraIMC();
    }
}