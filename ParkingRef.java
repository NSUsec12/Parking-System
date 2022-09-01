package Car_Park;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ParkingRef {

	private JFrame frmCarParkingRef;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParkingRef window = new ParkingRef();
					window.frmCarParkingRef.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ParkingRef() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCarParkingRef = new JFrame();
		frmCarParkingRef.getContentPane().setBackground(Color.WHITE);
		frmCarParkingRef.setTitle("CAR PARKING REF.");
		frmCarParkingRef.setBounds(100, 100, 764, 557);
		frmCarParkingRef.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCarParkingRef.getContentPane().setLayout(null);
		
		JLabel lblNsuCarParking = new JLabel("NSU CAR PARKING MANAGEMENT SYSTEM");
		lblNsuCarParking.setForeground(new Color(0, 0, 205));
		lblNsuCarParking.setFont(new Font("Sitka Text", Font.PLAIN, 28));
		lblNsuCarParking.setBounds(102, 15, 635, 44);
		frmCarParkingRef.getContentPane().add(lblNsuCarParking);
		
		JButton PRbtnHome = new JButton("");
		PRbtnHome.setForeground(Color.WHITE);
		PRbtnHome.setIcon(new ImageIcon("D:\\car-parking-management-system-java-master\\NSU Car Parking Management System\\picture\\New folder\\home.png"));
		PRbtnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home hm= new Home();   // calling home window will come.
				Home.main(null);
				frmCarParkingRef.setVisible(false);
			}
		});
		PRbtnHome.setFont(new Font("Sitka Text", Font.BOLD, 11));
		PRbtnHome.setBounds(0, 71, 56, 42);
		frmCarParkingRef.getContentPane().add(PRbtnHome);
		
		JButton PRbtnCarPa = new JButton("CAR PARKING");
		PRbtnCarPa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarParking cp= new CarParking();   //calling car parking window will come.
				CarParking.main(null);
				frmCarParkingRef.setVisible(false);
			}
		});
		PRbtnCarPa.setFont(new Font("Sitka Text", Font.BOLD, 11));
		PRbtnCarPa.setBounds(53, 71, 188, 42);
		frmCarParkingRef.getContentPane().add(PRbtnCarPa);
		
		JButton PRbtnCarRe = new JButton("CAR RELEASE");
		PRbtnCarRe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarRele cr= new CarRele();   //calling car release window will come.
				CarRele.main(null);
				frmCarParkingRef.setVisible(false);
			}
		});
		PRbtnCarRe.setFont(new Font("Sitka Text", Font.BOLD, 11));
		PRbtnCarRe.setBounds(238, 71, 169, 42);
		frmCarParkingRef.getContentPane().add(PRbtnCarRe);
		
		JButton PRbtnParkMap = new JButton("PARKING MAP");
		PRbtnParkMap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParkingRef pr= new ParkingRef();
				ParkingRef.main(null);
				frmCarParkingRef.setVisible(false);
			}
		});
		PRbtnParkMap.setFont(new Font("Sitka Text", Font.BOLD, 11));
		PRbtnParkMap.setBounds(405, 71, 159, 42);
		frmCarParkingRef.getContentPane().add(PRbtnParkMap);
		
		JButton PRbtnSearch = new JButton("SEARCH CAR");
		PRbtnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SearchCar au= new SearchCar();  //calling about window will come.
				SearchCar.main(null);
				frmCarParkingRef.setVisible(false);
			}
		});
		PRbtnSearch.setFont(new Font("Sitka Text", Font.BOLD, 11));
		PRbtnSearch.setBounds(563, 71, 138, 42);
		frmCarParkingRef.getContentPane().add(PRbtnSearch);
		
		JButton PRbtnLogout = new JButton("");
		PRbtnLogout.setForeground(Color.WHITE);
		PRbtnLogout.setIcon(new ImageIcon("D:\\car-parking-management-system-java-master\\NSU Car Parking Management System\\picture\\New folder\\exit.png"));
		PRbtnLogout.setBounds(701, 71, 50, 42);
		PRbtnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int PRbtnLogout = JOptionPane.showConfirmDialog(null, "Are You Sure?", "LOG OUT", JOptionPane.YES_NO_OPTION);
				if(PRbtnLogout == JOptionPane.YES_OPTION) {
				LOGIN li= new LOGIN();
				LOGIN.main(null);
				frmCarParkingRef.setVisible(false);
				}
			}
		});
		PRbtnLogout.setFont(new Font("Sitka Text", Font.BOLD, 11));
		frmCarParkingRef.getContentPane().add(PRbtnLogout);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setIcon(new ImageIcon("D:\\car-parking-management-system-java-master\\NSU Car Parking Management System\\picture\\New folder\\nsu.png"));
		lblNewLabel.setBounds(30, 5, 50, 59);
		frmCarParkingRef.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\car-parking-management-system-java-master\\NSU Car Parking Management System\\picture\\New folder\\map.png"));
		lblNewLabel_1.setBounds(0, 111, 751, 411);
		frmCarParkingRef.getContentPane().add(lblNewLabel_1);
	}
}
