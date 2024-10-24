import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;


public class Cadastro_de_Funcionarios{
    public static void main (String[] args) {
        JFrame Cadastro_de_Funcionarios = new JFrame();
        Cadastro_de_Funcionarios.setTitle("Cadastro de funcionarios.");
        Cadastro_de_Funcionarios.setSize(1000, 1000);
        Cadastro_de_Funcionarios.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JLabel labelNome = new JLabel();
        labelNome.setText("nome:");
        labelNome.setBounds(20, 20, 150, 20);


        JTextField caixaNome = new JTextField();
        caixaNome.setBounds(150, 20, 100, 20);


        JLabel labelEndereco = new JLabel();
        labelEndereco.setText("Endereço :");
        labelEndereco.setBounds(20, 40, 150, 20);

        JTextField caixaEd = new JTextField();
        caixaEd.setBounds(150, 40, 100, 20);

        JLabel labelBairro = new JLabel();
        labelBairro.setText("Bairro:");
        labelBairro.setBounds(20, 60, 150, 20);

        JTextField caixaBairro = new JTextField();
        caixaBairro.setBounds(150, 60, 100, 20);

        JLabel labelCidade = new JLabel();
        labelCidade.setText("Cidade:");
        labelCidade.setBounds(20, 80, 150, 20);

        JTextField caixaCidade = new JTextField();
        caixaCidade.setBounds(150, 80, 100, 20);

        JLabel labelEstado = new JLabel();
        labelEstado.setText("Estado:");
        labelEstado.setBounds(20, 100, 150, 20);

        JTextField caixaEstado = new JTextField();
        caixaEstado.setBounds(150, 100, 100, 20);

        JLabel labelCep = new JLabel();
        labelCep.setText("CEP:");
        labelCep.setBounds(20, 120, 150, 20);

        JTextField caixaCep = new JTextField();
        caixaCep.setBounds(150, 120, 100, 20);

        JLabel labelTelefone = new JLabel();
        labelTelefone.setText("Telefone:");
        labelTelefone.setBounds(20, 140, 150, 20);

        JTextField caixaTelefone= new JTextField();
        caixaTelefone.setBounds(150, 140, 100, 20);

        JLabel labelEmail = new JLabel();
        labelEmail.setText("E-mail:");
        labelEmail.setBounds(20, 160, 150, 20);


        JTextField caixaEmail = new JTextField();
        caixaEmail.setBounds(150, 160, 100, 20);


        JLabel labelCargo = new JLabel();
        labelCargo.setText("Cargo:");
        labelCargo.setBounds(20, 180, 150, 20);

        JTextField caixaCargo = new JTextField();
        caixaCargo.setBounds(150, 180, 100, 20);

        JLabel labelDatadecontratacao = new JLabel();
        labelDatadecontratacao.setText("Data de contratação:");
        labelDatadecontratacao.setBounds(20, 200, 150, 20);

        JTextField caixaDatadecontratacao = new JTextField();
        caixaDatadecontratacao.setBounds(150, 200, 100, 20);

        JLabel labelRemuneracao = new JLabel();
        labelRemuneracao.setText("Remuneração:");
        labelRemuneracao.setBounds(20, 220, 150, 20);

        JTextField caixaRemuneracao = new JTextField();
        caixaRemuneracao.setBounds(150, 220, 100, 20);

        JButton Consultar = new JButton();
        Consultar.setText("Consultar");
        Consultar.setBounds(20, 280, 100, 20);
        Consultar.addActionListener(event -> {
            caixaNome.setText("riki");
            caixaEd.setText("Poços de calda");
            caixaCidade.setText("Aluminio");
            caixaBairro.setText("paraiso");
            caixaEstado.setText("SP");
            caixaCep.setText("18125-000");
            caixaTelefone.setText("(11) 96307-8678");
            caixaEmail.setText("riki1arruda@gmail.com");
            caixaCargo.setText("Gerente adiministrativo");
            caixaDatadecontratacao.setText("30/05/2029");
            caixaRemuneracao.setText("22.000");
        });

        JButton sair = new JButton();
        sair.setText("Sair");
        sair.setBounds(140, 280, 100, 20);
        sair.addActionListener(event -> {
            Cadastro_de_Funcionarios.dispose ();
        });

        JButton Incluir = new JButton();
        Incluir.setText("incluir");
        Incluir.setBounds(260, 280, 100, 20);
        Incluir.addActionListener(event -> {
            String nomeDigitado = caixaNome.getText();
            JOptionPane.showMessageDialog(Cadastro_de_Funcionarios, "Funcionario " + nomeDigitado + " incluido com sucesso");
        });

        JButton Limpar = new JButton();
        Limpar.setText("limpar");
        Limpar.setBounds(380, 280, 100, 20);
        Limpar.addActionListener(event -> {
            caixaNome.setText("");
            caixaEd.setText("");
            caixaCidade.setText("");
            caixaBairro.setText("");
            caixaEstado.setText("");
            caixaCep.setText("");
            caixaTelefone.setText("");
            caixaEmail.setText("");
            caixaCargo.setText("");
            caixaDatadecontratacao.setText("");
            caixaRemuneracao.setText("");
        });

        JButton Alterar = new JButton();
        Alterar.setText("Alterar");
        Alterar.setBounds(500, 280, 100, 20);
        Alterar.addActionListener(event -> {
            String nomeDigitado = caixaNome.getText();
            JOptionPane.showMessageDialog(Cadastro_de_Funcionarios, "Funcionario " + nomeDigitado + " alterado com sucesso");
        });

        JButton Excluir = new JButton();
        Excluir.setText("Excluir");
        Excluir.setBounds(620, 280, 100, 20);
        Excluir.addActionListener(event -> {
            String nomeDigitado = caixaNome.getText();
            JOptionPane.showMessageDialog(Cadastro_de_Funcionarios, "Funcionario " + nomeDigitado + " excluido com sucesso");
        });





        Cadastro_de_Funcionarios.setLayout(null);
        Cadastro_de_Funcionarios.getContentPane().add(labelNome);
        Cadastro_de_Funcionarios.getContentPane().add(labelEndereco);
        Cadastro_de_Funcionarios.getContentPane().add(labelBairro);
        Cadastro_de_Funcionarios.getContentPane().add(labelCidade);
        Cadastro_de_Funcionarios.getContentPane().add(labelEstado);
        Cadastro_de_Funcionarios.getContentPane().add(labelCep);
        Cadastro_de_Funcionarios.getContentPane().add(labelTelefone);
        Cadastro_de_Funcionarios.getContentPane().add(labelEmail);
        Cadastro_de_Funcionarios.getContentPane().add(labelCargo);
        Cadastro_de_Funcionarios.getContentPane().add(labelDatadecontratacao);
        Cadastro_de_Funcionarios.getContentPane().add(labelRemuneracao);
        Cadastro_de_Funcionarios.getContentPane().add(caixaNome);
        Cadastro_de_Funcionarios.getContentPane().add(caixaEd);
        Cadastro_de_Funcionarios.getContentPane().add(caixaBairro);
        Cadastro_de_Funcionarios.getContentPane().add(caixaCidade);
        Cadastro_de_Funcionarios.getContentPane().add(caixaEstado);
        Cadastro_de_Funcionarios.getContentPane().add(caixaCep);
        Cadastro_de_Funcionarios.getContentPane().add(caixaTelefone);
        Cadastro_de_Funcionarios.getContentPane().add(caixaEmail);
        Cadastro_de_Funcionarios.getContentPane().add(caixaCargo);
        Cadastro_de_Funcionarios.getContentPane().add(caixaDatadecontratacao);
        Cadastro_de_Funcionarios.getContentPane().add(caixaRemuneracao);
        Cadastro_de_Funcionarios.getContentPane().add(Consultar);
        Cadastro_de_Funcionarios.getContentPane().add(sair);
        Cadastro_de_Funcionarios.getContentPane().add(Incluir);
        Cadastro_de_Funcionarios.getContentPane().add(Limpar);
        Cadastro_de_Funcionarios.getContentPane().add(Alterar);
        Cadastro_de_Funcionarios.getContentPane().add(Excluir);
        Cadastro_de_Funcionarios.setVisible(true);

    }
}
