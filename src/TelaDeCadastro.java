import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaDeCadastro extends JDialog {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JLabel txtNome;
    private JLabel txtId;
    private JLabel txtTelefone;
    private JLabel txtData;
    private JLabel txtValor;
    private JButton txtBotaoOk;
    private JButton txtBotaoCancelar;
    private JPanel panelMain;

    public TelaDeCadastro(JFrame parent) {
        super(parent);
        setTitle("Banco de clientes");
        setContentPane(panelMain);
        setMinimumSize(new Dimension(450, 500));

        //setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        txtBotaoOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerUser();
            }
        });
        txtBotaoCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }

    private void registerUser()  {
        String nome = txtNome.getText();
       String id = txtId.getText();
        String telefone = txtTelefone.getText();
        String data = txtData.getText();
        String valor = txtValor.getText();



    }

    public static void main(String[] args) {
        TelaDeCadastro frame = new TelaDeCadastro(null);
    }
}
