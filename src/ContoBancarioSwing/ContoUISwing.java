package ContoBancarioSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ContoUISwing {
    private double saldo;
    private JFrame frame;
    private JLabel lblSaldo;
    private JTextField txtImporto;

    public ContoUISwing() {
        saldo = 0.0;

        frame = new JFrame("Conto Bancario");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 1));

        lblSaldo = new JLabel("Saldo attuale: 0.00 euro", JLabel.CENTER);
        txtImporto = new JTextField();

        JButton btnDeposita = new JButton("Deposita soldi");
        JButton btnPreleva = new JButton("Preleva soldi");
        JButton btnInteressi = new JButton("Applica interessi (2%)");

        btnDeposita.addActionListener(e -> {
            try {
                double importo = Double.parseDouble(txtImporto.getText());
                if (importo > 0) {
                    saldo += importo;
                    aggiornaSaldo();
                } else {
                    JOptionPane.showMessageDialog(frame, "Importo non valido!");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Inserisci un numero valido!");
            }
        });

        btnPreleva.addActionListener(e -> {
            try {
                double importo = Double.parseDouble(txtImporto.getText());
                if (importo > 0 && importo <= saldo) {
                    saldo -= importo;
                    aggiornaSaldo();
                } else {
                    JOptionPane.showMessageDialog(frame, "Saldo insufficiente o importo non valido");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Inserisci un numero valido");
            }
        });

        btnInteressi.addActionListener(e -> {
            saldo += saldo * 0.02;
            aggiornaSaldo();
            JOptionPane.showMessageDialog(frame, "Applicati interessi del 2%");
        });

        frame.add(lblSaldo);
        frame.add(txtImporto);
        frame.add(btnDeposita);
        frame.add(btnPreleva);
        frame.add(btnInteressi);

        frame.setVisible(true);
    }

    private void aggiornaSaldo() {
        lblSaldo.setText(String.format("Saldo attuale: %.2f euro", saldo));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ContoUISwing::new);
    }
}

