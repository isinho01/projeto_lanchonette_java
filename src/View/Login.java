package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.LoginController;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private final LoginController controller;
	private JPanel contentPane;
	private JLabel LabelLogin;
	private JLabel JLabelfundotela;
	private JLabel LabelSenha;
	private JTextField TextUsuario;
	private JPasswordField TextSenha;
	private JLabel lblNewLabel;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() { 
		controller = new LoginController(this);
		setTitle("Login Sistema");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/View/imagens/icons/time_6425925.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 801);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Entrar = new JButton("Entrar");
		Entrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.fizTarefa();
				System.out.println(TextUsuario.getText());//usuario
				System.out.println(TextSenha.getText());//senha
			}
		});
		Entrar.setBounds(232, 490, 97, 36);
		contentPane.add(Entrar);
		
		TextUsuario = new JTextField();
		TextUsuario.setBounds(165, 324, 219, 29);
		contentPane.add(TextUsuario);
		TextUsuario.setColumns(10);
		
		TextSenha = new JPasswordField();
		TextSenha.setBounds(165, 432, 219, 29);
		contentPane.add(TextSenha);
		
		LabelSenha = new JLabel("Senha");
		LabelSenha.setBackground(new Color(255, 255, 255));
		LabelSenha.setForeground(new Color(255, 255, 255));
		LabelSenha.setFont(new Font("Dialog", Font.PLAIN, 36));
		LabelSenha.setBounds(232, 374, 112, 36);
		contentPane.add(LabelSenha);
		
		LabelLogin = new JLabel("Login");
		LabelLogin.setFont(new Font("Dialog", Font.PLAIN, 36));
		LabelLogin.setForeground(new Color(255, 255, 255));
		LabelLogin.setBackground(new Color(255, 255, 255));
		LabelLogin.setBounds(232, 258, 97, 58);
		contentPane.add(LabelLogin);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/View/imagens/Design sem nome (1).png")));
		lblNewLabel.setBounds(119, 258, 340, 289);
		contentPane.add(lblNewLabel);
		
		JLabelfundotela = new JLabel("");
		JLabelfundotela.setIcon(new ImageIcon(Login.class.getResource("/View/imagens/Copo de hambúrguer e refrigerante _ Vetor Premium.jpg")));
		JLabelfundotela.setBounds(-10, 0, 557, 795);
		contentPane.add(JLabelfundotela);
		
		
	}

	public void exibeMensagem(String mensagem) {
		JOptionPane.showMessageDialog(null,mensagem);
		
	}

	public JTextField getTextUsuario() {
		return TextUsuario;
	}

	public void setTextUsuario(JTextField textUsuario) {
		TextUsuario = textUsuario;
	}

	public JPasswordField getTextSenha() {
		return TextSenha;
	}

	public void setTextSenha(JPasswordField textSenha) {
		TextSenha = textSenha;
	}
	
}
