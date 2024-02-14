package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.TextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Agenda extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					Agenda frame = new Agenda();
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
	public Agenda() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1005, 815);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"ID", "Cliente", "Servi\u00E7o", "Valor", "Data", "hora", "Observa\u00E7\u00E3o"},
				{"1", "Alan", "Barba", "10,00", "10/12", "10:00", "Estilo Ombré"},
				{"2", "Pedro", "Sobrancelha", "5,00", "10/12", "10:20", null},
				{"3", "Isaac", "Cabelo", "20,00", "10/12", "11:00", null},
			{"4" ,"Carlos", "Cabelo", "25,00", "11/12", "10:00", null},
				{"5", "Leonardo","Cabelo", "30,00", "18/12", "15:00", "pode ser que eu chegue mais cedo"},
				{"6", null, null, null, null, null, null},
				{"7", null, null, null, null, null, null},
			},
			new String[] {
				"ID", "Cliente", "Servi\u00E7o", "Valor", "Data", "Hora", "Observa\u00E7\u00E3o"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, true, true, true, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.setBounds(144, 601, 815, 167);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("Agendar");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setBounds(513, 457, 446, 38);
		contentPane.add(btnNewButton);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(513, 98, 446, 343);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_3_1_1_1_1_1 = new JLabel("Observação:");
		lblNewLabel_3_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblNewLabel_3_1_1_1_1_1.setBounds(513, 62, 172, 38);
		contentPane.add(lblNewLabel_3_1_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(144, 457, 324, 38);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("Hora");
		lblNewLabel_3_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblNewLabel_3_1_1_1_1.setBounds(10, 448, 129, 38);
		contentPane.add(lblNewLabel_3_1_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(144, 379, 324, 38);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Data");
		lblNewLabel_3_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblNewLabel_3_1_1_1.setBounds(10, 370, 129, 38);
		contentPane.add(lblNewLabel_3_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(144, 306, 324, 38);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Valor R$");
		lblNewLabel_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblNewLabel_3_1_1.setBounds(10, 297, 129, 38);
		contentPane.add(lblNewLabel_3_1_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(144, 231, 324, 38);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Serviço");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblNewLabel_3_1.setBounds(10, 223, 113, 38);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3 = new JLabel("Cliente");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(10, 143, 113, 38);
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(144, 151, 324, 38);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Agenda");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 36));
		lblNewLabel_2.setBounds(459, 10, 181, 47);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(144, 71, 324, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(10, 52, 100, 63);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Agenda.class.getResource("/View/imagens/restaurante-de-cafe-cafeteria-borrao-com-fundo-bokeh.jpg")));
		lblNewLabel.setBounds(0, 0, 1002, 804);
		contentPane.add(lblNewLabel);
	}
}
