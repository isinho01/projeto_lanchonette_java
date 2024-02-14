package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Toolkit;

public class MenuPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setTitle("Cadastro");
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuPrincipal.class.getResource("/View/imagens/icons/time_6425925.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 967, 686);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 247, 28);
		contentPane.add(menuBar);
		
		JMenu JMenuCadastro = new JMenu("Cadastro");
		menuBar.add(JMenuCadastro);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Cliente");
		JMenuCadastro.add(mntmNewMenuItem);
		
		JMenu mnNewMenu = new JMenu("Serviço");
		JMenuCadastro.add(mnNewMenu);
		
		JMenu JMenuOperacao = new JMenu("Operação");
		menuBar.add(JMenuOperacao);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/View/imagens/restaurante-de-cafe-cafeteria-borrao-com-fundo-bokeh.jpg")));
		lblNewLabel.setBounds(0, -14, 993, 679);
		contentPane.add(lblNewLabel);
	}
}
