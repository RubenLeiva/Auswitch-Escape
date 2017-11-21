package Level1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Color;

public class Comic extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel Siguiente;
	private JLabel SiguienteP;
	private JLabel Comic2;
	private JLabel Comic1;
	private JLabel Comic3;
	private JLabel Start;
	private JLabel StartP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Comic frame = new Comic();
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
	public Comic() {
		this.setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Siguiente = new JLabel("\r\n");
		Siguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Siguiente.setVisible(false);
				SiguienteP.setVisible(true);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if(Comic1.isVisible()==true){
				Comic1.setVisible(false);
				Comic2.setVisible(true);
				Siguiente.setVisible(true);
				SiguienteP.setVisible(false);
				}else if(Comic2.isVisible()==true){
					Comic2.setVisible(false);
					Comic3.setVisible(true);
					Siguiente.setVisible(false);
					Start.setVisible(true);
					SiguienteP.setVisible(false);
				}
			}
		});
		Siguiente.setIcon(new ImageIcon(Comic.class.getResource("/Ventanas/depositphotos_9818868-stock-photo-red-grunge-arrow.png")));
		Siguiente.setBounds(1175, 603, 177, 79);
		contentPane.add(Siguiente);
		
		SiguienteP = new JLabel("");
		SiguienteP.setVisible(false);
		SiguienteP.setVisible(false);
		SiguienteP.setIcon(new ImageIcon(Comic.class.getResource("/Ventanas/Flechaderpeque.png")));
		SiguienteP.setBounds(1208, 596, 128, 92);
		contentPane.add(SiguienteP);
		
		StartP = new JLabel("");
		StartP.setVisible(false);
		Start = new JLabel("");
		Start.setVisible(false);
		Start.setVisible(false);
		Start.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Start.setVisible(false);
				StartP.setVisible(true);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Start.setVisible(true);
				StartP.setVisible(false);
				Juego j = new Juego();
				j.setVisible(true);
				dispose();
			}
		});
		Start.setIcon(new ImageIcon(Comic.class.getResource("/Level1/StartLv1.png")));
		Start.setBounds(0, 0, 1362, 705);
		contentPane.add(Start);
		StartP.setIcon(new ImageIcon(Comic.class.getResource("/Level1/StartLv1P.PNG")));
		StartP.setBounds(46, 25, 1277, 669);
		contentPane.add(StartP);
		
		Comic1 = new JLabel("New label");
		Comic1.setIcon(new ImageIcon(Comic.class.getResource("/Level1/Comic1Lv1.jpg")));
		Comic1.setBounds(0, 0, 1362, 705);
		contentPane.add(Comic1);
		
		Comic2 = new JLabel("New label");
		Comic2.setVisible(false);
		Comic2.setIcon(new ImageIcon(Comic.class.getResource("/Level1/Comic2Lv2.jpg")));
		Comic2.setBounds(0, 0, 1362, 705);
		contentPane.add(Comic2);
		
		Comic3 = new JLabel("");
		Comic3.setVisible(false);
		Comic3.setIcon(new ImageIcon(Comic.class.getResource("/Level1/Comic3Lv1.jpg")));
		Comic3.setBounds(0, 0, 1362, 705);
		contentPane.add(Comic3);
	}
}
