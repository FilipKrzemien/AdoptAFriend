package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JProgressBar;

public class Potwierdzenie {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Potwierdzenie window = new Potwierdzenie();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Potwierdzenie() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 584, 441);
		frame.getContentPane().add(panel);
		
		JLabel lblWydruk = new JLabel("POTWIERDZENIE WYDRUKOWANE");
		lblWydruk.setBounds(100, 180, 361, 25);
		lblWydruk.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblWydruk.setHorizontalAlignment(SwingConstants.CENTER);
		lblWydruk.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		
		JButton btnPowrt = new JButton("POWR\u00D3T");
		btnPowrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				String[] args = null;
				MainWindow.main(args);
			}
		});
		btnPowrt.setBounds(230, 230, 95, 23);

		panel.setLayout(null);
		panel.add(btnPowrt);
		panel.add(lblWydruk);
		panel.setVisible(false);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 584, 441);
		frame.getContentPane().add(panel_1);
		
		JLabel lblDruko = new JLabel("DRUKOWANIE POTWIERDZENIA");
		lblDruko.setBounds(120, 180, 328, 25);
		lblDruko.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setBounds(166, 230, 228, 25);
		progressBar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.setLayout(null);
		panel_1.add(lblDruko);
		panel_1.add(progressBar);
		
		int timerDelay = 40;

		new javax.swing.Timer(timerDelay , new ActionListener() {
			private int index = 0;
			private int maxIndex = 101;
			
			public void actionPerformed(ActionEvent e) 
			{
				if (index < maxIndex) 
				{
					progressBar.setValue(index);
					index++;
				} 
				else 
				{
					progressBar.setValue(maxIndex);
					((javax.swing.Timer)e.getSource()).stop(); // stop the timer
					try {
						Thread.sleep(100);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					panel_1.setVisible(false);
					panel.setVisible(true);
				}
			}
			}).start();		
	}
}
