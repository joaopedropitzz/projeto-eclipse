	package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JButton;

public class TelaLogin extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldNome;
	private JTextField textFieldCPF;

	/**
	 * Create the panel.
	 */
	public TelaLogin() {
		setLayout(null);
		
		JLabel LabelNome = new JLabel("Nome");
		LabelNome.setBounds(190, 45, 46, 14);
		add(LabelNome);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(169, 70, 86, 20);
		add(textFieldNome);
		textFieldNome.setColumns(10);
		
		JLabel LabelCPF = new JLabel("CPF");
		LabelCPF.setBounds(190, 116, 46, 14);
		add(LabelCPF);
		
		textFieldCPF = new JTextField();
		textFieldCPF.setBounds(169, 141, 86, 20);
		add(textFieldCPF);
		textFieldCPF.setColumns(10);
		
		JLabel LabelCadastrar = new JLabel("Não possui um conta?");
		LabelCadastrar.setBounds(158, 224, 105, 14);
		add(LabelCadastrar);
		
		JButton BotaoEntrar = new JButton("Entrar");
		BotaoEntrar.setBounds(166, 174, 89, 23);
		add(BotaoEntrar);
		
		JButton BotaoCadastrar = new JButton("Cadastrar");
		BotaoCadastrar.setBounds(169, 266, 89, 23);
		add(BotaoCadastrar);

	}
}
