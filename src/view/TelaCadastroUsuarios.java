package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class TelaCadastroUsuarios extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldNome;
	private JTextField textFieldCPF;
	private JButton BotaoCadastrar;
	private JButton BotaoVoltar;


	/**
	 * Create the panel.
	 */
	public TelaCadastroUsuarios() {
		setLayout(null);
		
		JLabel LabelNome = new JLabel("Nome");
		LabelNome.setBounds(187, 55, 46, 14);
		add(LabelNome);
		
		textFieldNome = new JTextField();
		textFieldNome.setColumns(10);
		textFieldNome.setBounds(166, 80, 86, 20);
		add(textFieldNome);
		
		JLabel LabelCPF = new JLabel("CPF");
		LabelCPF.setBounds(187, 139, 46, 14);
		add(LabelCPF);
		
		textFieldCPF = new JTextField();
		textFieldCPF.setColumns(10);
		textFieldCPF.setBounds(166, 164, 86, 20);
		add(textFieldCPF);
		
		JButton BotaoCadastrar = new JButton("Cadastrar");
		BotaoCadastrar.setBounds(163, 232, 89, 23);
		add(BotaoCadastrar);
		
		JButton BotaoVoltar = new JButton("<-");
		BotaoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BotaoVoltar.setBounds(10, 27, 53, 23);
		add(BotaoVoltar);
		
		JRadioButton RadioButtonAdmin = new JRadioButton("Admin?");
		RadioButtonAdmin.setBounds(306, 232, 109, 23);
		add(RadioButtonAdmin);

	}
	public void cadastrar(ActionListener actionListener) {
		this.BotaoCadastrar.addActionListener(actionListener);
	}
	public String getCPF() {
		return this.textFieldCPF.getText();
	}
	public String getNome() {
		return this.textFieldNome.getText();
	}
	public void exibirMensagem(String titulo, String mensagem, int tipoMensagem) {
		JOptionPane.showMessageDialog(
				null,
				mensagem,
				titulo,
				tipoMensagem
				);
	}
	public void limparFormulario(){
		this.textFieldNome.setText("");
		this.textFieldCPF.setText("");
		
	}
	public void voltar(ActionListener actionListener) {
		this.BotaoVoltar.addActionListener(actionListener);
	}


}
