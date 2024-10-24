import javax.swing.JFrame;
import javax.swing.JLabel;
        import javax.swing.JTextField;
        import javax.swing.JButton;
import javax.swing.JOptionPane;
        import javax.swing.WindowConstants;


public class Janela {
    public static void main (String[] args) {
        JFrame janela =  new JFrame ();
        janela. setTitle ("Riki.");
        janela. setSize( 500, 500);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JLabel labelElogio = new JLabel();
        labelElogio.setText("Elogio:");
        labelElogio.setBounds(20, 20, 150, 20);




        JTextField caixaElogio = new JTextField();
        caixaElogio.setBounds(20,40,300,20);


        JButton Enviar = new JButton();
                Enviar.setText("enviar");
                Enviar.setBounds(20, 60,100,20);
                Enviar.addActionListener(event ->{
                    String nomeDigitado = caixaElogio.getText();
                    JOptionPane.showMessageDialog(janela, "O riki é:" + nomeDigitado);
                });



        janela.setLayout(null);
        janela.getContentPane().add(labelElogio);
        janela.getContentPane().add(caixaElogio);
        janela.getContentPane().add(Enviar);
        janela. setVisible (true);

    }
}
