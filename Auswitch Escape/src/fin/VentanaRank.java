package fin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class VentanaRank extends JFrame {


	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRank frame = new VentanaRank();
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
	public VentanaRank() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		String[] columnas = {"Posicion", "Nombre", "Tiempo"};
		Object[][] data= {{new Integer(1), "Francisco", new Double(100.3)},
				{new Integer(2), "Pedro", new Double(132.45)}};
		JTable table = new JTable(data, columnas);
		panel.setLayout(new BorderLayout());
		panel.add(table.getTableHeader(), BorderLayout.PAGE_START);
		panel.add(table, BorderLayout.CENTER);
//		JScrollPane scrollPane = new JScrollPane(table);
//		table.setFillsViewportHeight(true);
		
	}

}
