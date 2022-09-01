package Car_Park;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.UIManager;

public class SearchCar {

	private JFrame frmSrarchCar;
	private JTextField CarNmbr;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchCar window = new SearchCar();
					window.frmSrarchCar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SearchCar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSrarchCar = new JFrame();
		frmSrarchCar.getContentPane().setBackground(new Color(0, 0, 51));
		frmSrarchCar.getContentPane().setFont(new Font("Sitka Text", Font.PLAIN, 11));
		frmSrarchCar.setTitle("SEARCH CAR");
		frmSrarchCar.setBounds(100, 100, 754, 479);
		frmSrarchCar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSrarchCar.getContentPane().setLayout(null);
		
		JLabel lblNsuCarParking = new JLabel("NSU CAR PARKING MANAGEMENT SYSTEM");
		lblNsuCarParking.setForeground(new Color(0, 0, 255));
		lblNsuCarParking.setFont(new Font("Sitka Text", Font.PLAIN, 28));
		lblNsuCarParking.setBounds(105, 17, 589, 44);
		frmSrarchCar.getContentPane().add(lblNsuCarParking);
		
		JButton AbtnHome = new JButton("");
		AbtnHome.setIcon(new ImageIcon("D:\\car-parking-management-system-java-master\\NSU Car Parking Management System\\picture\\New folder\\home.png"));
		AbtnHome.setForeground(new Color(255, 250, 250));
		AbtnHome.setBackground(UIManager.getColor("CheckBox.background"));
		AbtnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home hm= new Home();   // calling home window will come.
				Home.main(null);
				frmSrarchCar.setVisible(false);
			}
		});
		AbtnHome.setFont(new Font("Sitka Text", Font.BOLD, 11));
		AbtnHome.setBounds(0, 71, 53, 42);
		frmSrarchCar.getContentPane().add(AbtnHome);
		
		JButton AbtnCarPa = new JButton("CAR PARKING");
		AbtnCarPa.setForeground(UIManager.getColor("CheckBox.foreground"));
		AbtnCarPa.setBackground(UIManager.getColor("CheckBox.background"));
		AbtnCarPa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarParking cp= new CarParking();   //calling car parking window will come.
				CarParking.main(null);
				frmSrarchCar.setVisible(false);
			}
		});
		AbtnCarPa.setFont(new Font("Sitka Text", Font.BOLD, 11));
		AbtnCarPa.setBounds(50, 71, 173, 42);
		frmSrarchCar.getContentPane().add(AbtnCarPa);
		
		JButton AbtnCarRe = new JButton("CAR RELEASE");
		AbtnCarRe.setForeground(UIManager.getColor("CheckBox.foreground"));
		AbtnCarRe.setBackground(UIManager.getColor("CheckBox.background"));
		AbtnCarRe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarRele cr= new CarRele();   //calling car release window will come.
				CarRele.main(null);
				frmSrarchCar.setVisible(false);
			}
		});
		AbtnCarRe.setFont(new Font("Sitka Text", Font.BOLD, 11));
		AbtnCarRe.setBounds(221, 71, 161, 42);
		frmSrarchCar.getContentPane().add(AbtnCarRe);
		
		JButton AbtnParkRe = new JButton("PARKING MAP");
		AbtnParkRe.setForeground(UIManager.getColor("CheckBox.foreground"));
		AbtnParkRe.setBackground(UIManager.getColor("CheckBox.background"));
		AbtnParkRe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParkingRef pr= new ParkingRef();
				ParkingRef.main(null);
				frmSrarchCar.setVisible(false);
			}
		});
		AbtnParkRe.setFont(new Font("Sitka Text", Font.BOLD, 11));
		AbtnParkRe.setBounds(381, 71, 167, 42);
		frmSrarchCar.getContentPane().add(AbtnParkRe);
		
		JButton AbtnSearchCar = new JButton("SEARCH CAR");
		AbtnSearchCar.setForeground(UIManager.getColor("CheckBox.foreground"));
		AbtnSearchCar.setBackground(UIManager.getColor("CheckBox.background"));
		AbtnSearchCar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SearchCar au= new SearchCar();  //calling about window will come.
				SearchCar.main(null);
				frmSrarchCar.setVisible(false);
			}
		});
		AbtnSearchCar.setFont(new Font("Sitka Text", Font.BOLD, 11));
		AbtnSearchCar.setBounds(543, 71, 151, 42);
		frmSrarchCar.getContentPane().add(AbtnSearchCar);
		
		JButton AbtnLogout = new JButton("");
		AbtnLogout.setForeground(new Color(255, 250, 250));
		AbtnLogout.setIcon(new ImageIcon("D:\\car-parking-management-system-java-master\\NSU Car Parking Management System\\picture\\New folder\\exit.png"));
		AbtnLogout.setBounds(695, 71, 45, 42);
		AbtnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int AbtnLogout = JOptionPane.showConfirmDialog(null, "Are You Sure?", "LOG OUT", JOptionPane.YES_NO_OPTION);
				if(AbtnLogout == JOptionPane.YES_OPTION) {
				LOGIN li= new LOGIN();
				LOGIN.main(null);
				frmSrarchCar.setVisible(false);
				}
			}
		});
		AbtnLogout.setFont(new Font("Sitka Text", Font.BOLD, 11));
		frmSrarchCar.getContentPane().add(AbtnLogout);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\car-parking-management-system-java-master\\NSU Car Parking Management System\\picture\\New folder\\nsu.png"));
		lblNewLabel.setBounds(33, 0, 63, 72);
		frmSrarchCar.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 745, 72);
		frmSrarchCar.getContentPane().add(panel);
		
		JLabel lblCarNmbr = new JLabel("Enter Your Car Number:");
		lblCarNmbr.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblCarNmbr.setForeground(Color.WHITE);
		lblCarNmbr.setBounds(54, 159, 240, 30);
		frmSrarchCar.getContentPane().add(lblCarNmbr);
		
		CarNmbr = new JTextField();
		CarNmbr.setBounds(54, 206, 206, 30);
		frmSrarchCar.getContentPane().add(CarNmbr);
		CarNmbr.setColumns(10);
		
		JButton btnSrc = new JButton("");
		btnSrc.setIcon(new ImageIcon("D:\\car-parking-management-system-java-master\\NSU Car Parking Management System\\picture\\New folder\\search.png"));
		btnSrc.setForeground(new Color(248, 248, 255));
		btnSrc.setBackground(new Color(255, 250, 250));
		btnSrc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String m="Car Number: "+ CarNmbr.getText();
				try {
					FileReader fr = new FileReader("carpark.txt");
					BufferedReader br = new BufferedReader(fr);
					String in;
					boolean exists = false;
					try {
						while ((in = br.readLine()) != null) {
							

							if ((in.equals(m))) {

								JOptionPane.showMessageDialog(null, "CAR FOUND");
//								System.out.println(in);
								exists = true;
								
								break;
							}
						}
						if (!exists)
							JOptionPane.showMessageDialog(null, "INVALID INFORMATION");
						    CarNmbr.setText(null);
						    
					}
					catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnSrc.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		btnSrc.setBounds(119, 262, 59, 50);
		frmSrarchCar.getContentPane().add(btnSrc);
		
		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Sitka Text", Font.PLAIN, 16));
		textArea_1.setBounds(367, 209, 363, 440);
		scrollPane.setBounds(367, 209, 363, 217);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setViewportView(textArea_1);
		frmSrarchCar.getContentPane().add(scrollPane); 
			
		textArea_1.setText(" ");
		
		JButton read_1 = new JButton("PARKED CARS INFO");
		read_1.setFont(new Font("Sitka Text", Font.PLAIN, 16));
		read_1.setBounds(444, 148, 191, 38);
		frmSrarchCar.getContentPane().add(read_1);
		
		JLabel lblNewLabel_1 = new JLabel("SRARCH CAR");
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		lblNewLabel_1.setForeground(UIManager.getColor("Button.highlight"));
		lblNewLabel_1.setBounds(96, 322, 114, 24);
		frmSrarchCar.getContentPane().add(lblNewLabel_1);

		textArea_1.append(" ");
        read_1.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    FileReader reader = new FileReader( "carpark.txt" );
                    BufferedReader br = new BufferedReader(reader);
                    textArea_1.read( br, null );
                    br.close();
                    textArea_1.requestFocus();
                }
                catch(Exception e2) { System.out.println(e2); }
            }
        });
		
	}
}
