package Extra;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.Color;

public class CuentaAtras extends JFrame {

    private static final long serialVersionUID = 3545053785228009472L;

    // GUI Components
    private JPanel panel;
    private JLabel Time1;
    private JPanel buttonPanel;
  

    // Properties of Program.
    public byte centiseconds = 0;
    public int seconds = 20;
    

    private DecimalFormat timeFormatter;

    public Timer tiempo;

    public CuentaAtras() {
    	
    	this.seconds= seconds;
        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        Time1 = new JLabel();
        Time1.setForeground(Color.RED);
        Time1.setFont(new Font("DK Face Your Fears", Font.PLAIN, 30));
        Time1.setHorizontalAlignment(JLabel.CENTER);
        panel.add(Time1);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));


        panel.add(buttonPanel, BorderLayout.SOUTH);

        timeFormatter = new DecimalFormat("00");

        tiempo = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (centiseconds > 0) {
                    centiseconds--;
                } else {
                    if (CuentaAtras.this.seconds == 0 ) {
                    	tiempo.stop();
                    } else if (CuentaAtras.this.seconds > 0) {
                        CuentaAtras.this.seconds--;
                        centiseconds = 99;
                   
                    }
                }
                Time1.setText(timeFormatter.format(seconds) + "."
                         + timeFormatter.format(centiseconds));
            }
        });
        

        Time1.setText(timeFormatter.format(seconds) + "."
                 + timeFormatter.format(centiseconds));

        getContentPane().add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("CuentaAtras.java");

        pack();
        setVisible(true);
    }
    
    
    public void Inicio(JLabel Reloj){
    	Time1 = Reloj;
    	tiempo.start();
    }
    
    public void Acabar(JLabel Reloj){
    	Time1 = Reloj;
    	tiempo.stop();
    }

    public void Fin(JLabel Reloj){
    	Time1 = Reloj;
    	Time1.setVisible(false);
    }
    
    public void cambiar(byte seconds){
    	
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                }

               
            }
        });
    }
}