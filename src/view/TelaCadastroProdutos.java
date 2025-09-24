package view;

import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JEditorPane;

public class TelaCadastroProdutos extends JPanel {
	private JButton BotaoCadastrar;

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField tfnome;
	private JTextField tfpreco;
	private JTextField tfdescricao;
	private JButton botaovoltar;
	private JButton cadastrobutton;
	

	/**
	 * Create the panel.
	 */
	public TelaCadastroProdutos() {
		setLayout(null);
		
		cadastrobutton = new JButton("Cadastrar");
		cadastrobutton.setBounds(170, 254, 89, 23);
		add(cadastrobutton);
		
		JLabel lblnome = new JLabel("Nome do produto");
		lblnome.setBounds(48, 80, 83, 14);
		add(lblnome);
		
		table = new JTable();
		table.setBounds(304, 50, 136, 193);
		table.setToolTipText("aaaaaaaaaaaaaa");
		add(table);
		
		JLabel lblProdutosCadastrados = new JLabel("Produtos cadastrados");
		lblProdutosCadastrados.setBounds(321, 23, 119, 14);
		add(lblProdutosCadastrados);
		
		JButton btnremover = new JButton("Remover");
		btnremover.setBounds(344, 277, 75, 23);
		add(btnremover);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(344, 254, 75, 23);
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(btnEditar);
		
		tfnome = new JTextField();
		tfnome.setBounds(48, 105, 86, 20);
		add(tfnome);
		tfnome.setColumns(10);
		
		JLabel lblPreco = new JLabel("Preço");
		lblPreco.setBounds(48, 136, 83, 14);
		add(lblPreco);
		
		tfpreco = new JTextField();
		tfpreco.setBounds(48, 161, 86, 20);
		tfpreco.setColumns(10);
		add(tfpreco);
		
		tfdescricao = new JTextField();
		tfdescricao.setBounds(176, 91, 83, 103);
		add(tfdescricao);
		tfdescricao.setColumns(10);
		
		JLabel lblDescricao = new JLabel("Descrição");
		lblDescricao.setBounds(182, 39, 83, 14);
		add(lblDescricao);
		
		botaovoltar = new JButton("<-");
		botaovoltar.setBounds(10, 19, 51, 23);
		add(botaovoltar);
		
		

	}
	public void cadastrar(ActionListener actionListener) {
		this.cadastrobutton.addActionListener(actionListener);
	}
	public String getNome() {
		return this.tfnome.getText();
	}
	public String getPreco() {
		return this.tfpreco.getText();
	}
	public String getDescricao() {
		return this.tfdescricao.getText();
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
		this.tfnome.setText("");
		this.tfpreco.setText("");
		this.tfdescricao.setText("");
		
	}
	public void voltar(ActionListener actionListener) {
		this.botaovoltar.addActionListener(actionListener);
	}
}
