package Car_Park;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

//import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
//import javax.swing.JMenu;
//import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class Home {

	private JFrame frmHome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frmHome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHome = new JFrame();
		frmHome.getContentPane().setForeground(Color.WHITE);
		frmHome.getContentPane().setBackground(new Color(255, 255, 255));
		frmHome.setTitle("HOME");
		frmHome.setBounds(100, 100, 734, 520);
		frmHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHome.getContentPane().setLayout(null);
		
		JButton HbtnHome = new JButton("");
		HbtnHome.setIcon(new ImageIcon("D:\\car-parking-management-system-java-master\\NSU Car Parking Management System\\picture\\New folder\\home.png"));
		HbtnHome.setForeground(new Color(255, 250, 250));
		HbtnHome.setBackground(UIManager.getColor("Button.background"));
		HbtnHome.setBounds(1, 69, 48, 42);
		HbtnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Home hm= new Home();   // calling home window will come.
				Home.main(null);
				frmHome.setVisible(false);
			}
		});
		HbtnHome.setFont(new Font("Sitka Text", Font.BOLD, 11));
		frmHome.getContentPane().add(HbtnHome);
		
		JButton HbtnCarPa = new JButton("CAR PARKING");
		HbtnCarPa.setForeground(new Color(0, 0, 0));
		HbtnCarPa.setBackground(new Color(240, 240, 240));
		HbtnCarPa.setBounds(49, 69, 184, 42);
		HbtnCarPa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarParking cp= new CarParking();   //calling car parking window will come.
				CarParking.main(null);
				frmHome.setVisible(false);
			}
		});
		HbtnCarPa.setFont(new Font("Sitka Text", Font.BOLD, 11));
		frmHome.getContentPane().add(HbtnCarPa);
		
		JButton HbtnCarRe = new JButton("CAR RELEASE");
		HbtnCarRe.setForeground(new Color(0, 0, 0));
		HbtnCarRe.setBackground(new Color(240, 240, 240));
		HbtnCarRe.setBounds(228, 69, 157, 42);
		HbtnCarRe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarRele cr= new CarRele();   //calling car release window will come.
				CarRele.main(null);
				frmHome.setVisible(false);
			}
		});
		HbtnCarRe.setFont(new Font("Sitka Text", Font.BOLD, 11));
		frmHome.getContentPane().add(HbtnCarRe);
		
		JButton HbtnParkRe = new JButton("PARKING MAP");
		HbtnParkRe.setForeground(new Color(0, 0, 0));
		HbtnParkRe.setBackground(new Color(240, 240, 240));
		HbtnParkRe.setBounds(385, 69, 143, 42);
		HbtnParkRe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ParkingRef pr= new ParkingRef();  //calling parking ref. window will come.
				ParkingRef.main(null);
				frmHome.setVisible(false);
			}
		});
		HbtnParkRe.setFont(new Font("Sitka Text", Font.BOLD, 11));
		frmHome.getContentPane().add(HbtnParkRe);
		
		JButton HbtnAbout = new JButton("SEARCH CAR");
		HbtnAbout.setForeground(new Color(0, 0, 0));
		HbtnAbout.setBackground(new Color(240, 240, 240));
		HbtnAbout.setBounds(524, 69, 150, 42);
		HbtnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SearchCar au= new SearchCar();  //calling about window will come.
				SearchCar.main(null);
				frmHome.setVisible(false);
			}
		});
		HbtnAbout.setFont(new Font("Sitka Text", Font.BOLD, 11));
		frmHome.getContentPane().add(HbtnAbout);		
		
		JButton HbtnLogout = new JButton("");
		HbtnLogout.setForeground(Color.WHITE);
		HbtnLogout.setIcon(new ImageIcon("D:\\car-parking-management-system-java-master\\NSU Car Parking Management System\\picture\\New folder\\exit.png"));
		HbtnLogout.setBounds(674, 69, 46, 42);
		HbtnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int HbtnLogout = JOptionPane.showConfirmDialog(null, "Are You Sure?", "LOG OUT", JOptionPane.YES_NO_OPTION);
				if(HbtnLogout == JOptionPane.YES_OPTION) {
				LOGIN li= new LOGIN();
				LOGIN.main(null);
				frmHome.setVisible(false);
				}
				
			}
		});
		HbtnLogout.setFont(new Font("Sitka Text", Font.BOLD, 11));
		frmHome.getContentPane().add(HbtnLogout);
		
		JLabel lblNewLabel_3 = new JLabel("NSU CAR PARKING MANAGEMENT SYSTEM");
		lblNewLabel_3.setForeground(new Color(0, 0, 153));
		lblNewLabel_3.setFont(new Font("Sitka Text", Font.PLAIN, 28));
		lblNewLabel_3.setBounds(88, 15, 654, 44);
		frmHome.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\car-parking-management-system-java-master\\NSU Car Parking Management System\\picture\\New folder\\nsu.png"));
		lblNewLabel.setBounds(20, 0, 58, 64);
		frmHome.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(UIManager.getColor("Button.background"));
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setIcon(new ImageIcon("D:\\car-parking-management-system-java-master\\NSU Car Parking Management System\\picture\\parking-accident-lawyer.jpg"));
		lblNewLabel_1.setBounds(0, 110, 720, 373);
		frmHome.getContentPane().add(lblNewLabel_1);
	}
}
