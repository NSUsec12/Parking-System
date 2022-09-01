package Car_Park;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JPanel;

public class CarRele {

	//public static ArrayList<carpark> car = new ArrayList<carpark>();

	private JFrame frmCarRelease;
	private JTextField carNmbr;
	private JTextField name1;
	private JTextField cell1;
	private JTextField place;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarRele window = new CarRele();
					window.frmCarRelease.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CarRele() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCarRelease = new JFrame();
		frmCarRelease.getContentPane().setBackground(new Color(0, 0, 51));
		frmCarRelease.setTitle("CAR RELEASE");
		frmCarRelease.setBounds(100, 100, 744, 465);
		frmCarRelease.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCarRelease.getContentPane().setLayout(null);

		JLabel lblNsuCarParking = new JLabel("NSU CAR PARKING MANAGEMENT SYSTEM");
		lblNsuCarParking.setForeground(new Color(0, 0, 204));
		lblNsuCarParking.setFont(new Font("Sitka Text", Font.PLAIN, 28));
		lblNsuCarParking.setBounds(103, 12, 582, 44);
		frmCarRelease.getContentPane().add(lblNsuCarParking);

		JButton CRbtnHome = new JButton("");
		CRbtnHome.setForeground(new Color(255, 250, 250));
		CRbtnHome.setIcon(new ImageIcon("D:\\car-parking-management-system-java-master\\NSU Car Parking Management System\\picture\\New folder\\home.png"));
		CRbtnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home hm = new Home(); // calling home window will come.
				Home.main(null);
				frmCarRelease.setVisible(false);
			}
		});
		CRbtnHome.setFont(new Font("Sitka Text", Font.BOLD, 11));
		CRbtnHome.setBounds(0, 66, 50, 45);
		frmCarRelease.getContentPane().add(CRbtnHome);

		JButton CRbtnCarPa = new JButton("CAR PARKING");
		CRbtnCarPa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarParking cp = new CarParking(); // calling car parking window will come.
				CarParking.main(null);
				frmCarRelease.setVisible(false);
			}
		});
		CRbtnCarPa.setFont(new Font("Sitka Text", Font.BOLD, 11));
		CRbtnCarPa.setBounds(50, 66, 169, 45);
		frmCarRelease.getContentPane().add(CRbtnCarPa);

		JButton CRbtnCarRe = new JButton("CAR RELEASE");
		CRbtnCarRe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarRele cr = new CarRele(); // calling car release window will come.
				CarRele.main(null);
				frmCarRelease.setVisible(false);
			}
		});
		CRbtnCarRe.setFont(new Font("Sitka Text", Font.BOLD, 11));
		CRbtnCarRe.setBounds(218, 66, 161, 45);
		frmCarRelease.getContentPane().add(CRbtnCarRe);

		JButton CRbtnParkRe = new JButton("PARKING MAP");
		CRbtnParkRe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParkingRef pr = new ParkingRef();
				ParkingRef.main(null);
				frmCarRelease.setVisible(false);
			}
		});
		CRbtnParkRe.setFont(new Font("Sitka Text", Font.BOLD, 11));
		CRbtnParkRe.setBounds(378, 66, 154, 45);
		frmCarRelease.getContentPane().add(CRbtnParkRe);

		JButton CRbtnAbout = new JButton("SEARCH CAR");
		CRbtnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SearchCar au = new SearchCar(); // calling about window will come.
				SearchCar.main(null);
				frmCarRelease.setVisible(false);
			}
		});
		CRbtnAbout.setFont(new Font("Sitka Text", Font.BOLD, 11));
		CRbtnAbout.setBounds(531, 66, 154, 45);
		frmCarRelease.getContentPane().add(CRbtnAbout);
		
		JButton CPbtnLogout = new JButton("");
		CPbtnLogout.setIcon(new ImageIcon("D:\\car-parking-management-system-java-master\\NSU Car Parking Management System\\picture\\New folder\\exit.png"));
		CPbtnLogout.setBounds(684, 66, 46, 45);
		CPbtnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LOGIN li= new LOGIN();
				LOGIN.main(null);
				frmCarRelease.setVisible(false);
				
			}
		});
		CPbtnLogout.setFont(new Font("Sitka Text", Font.BOLD, 11));
		frmCarRelease.getContentPane().add(CPbtnLogout);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\car-parking-management-system-java-master\\NSU Car Parking Management System\\picture\\New folder\\nsu.png"));
		lblNewLabel.setBounds(26, -7, 73, 80);
		frmCarRelease.getContentPane().add(lblNewLabel);

		JTextPane carnmbr = new JTextPane();
		carnmbr.setBackground(Color.GRAY);
		carnmbr.setText("CAR NUMBER:");
		carnmbr.setFont(new Font("Sitka Text", Font.BOLD, 11));
		carnmbr.setBounds(156, 182, 89, 20);
		frmCarRelease.getContentPane().add(carnmbr);

		carNmbr = new JTextField();
		carNmbr.setColumns(10);
		carNmbr.setBackground(SystemColor.inactiveCaptionBorder);
		carNmbr.setBounds(276, 182, 178, 20);
		frmCarRelease.getContentPane().add(carNmbr);

		JTextPane name = new JTextPane();
		name.setBackground(Color.GRAY);
		name.setText("NAME:");
		name.setFont(new Font("Sitka Text", Font.BOLD, 11));
		name.setBounds(156, 223, 73, 20);
		frmCarRelease.getContentPane().add(name);

		name1 = new JTextField();
		name1.setColumns(10);
		name1.setBackground(SystemColor.inactiveCaptionBorder);
		name1.setBounds(276, 223, 178, 20);
		frmCarRelease.getContentPane().add(name1);

		JTextPane cellname = new JTextPane();
		cellname.setBackground(Color.GRAY);
		cellname.setText("CELL No");
		cellname.setFont(new Font("Sitka Text", Font.BOLD, 11));
		cellname.setBounds(160, 260, 85, 20);
		frmCarRelease.getContentPane().add(cellname);

		cell1 = new JTextField();
		cell1.setColumns(10);
		cell1.setBackground(SystemColor.inactiveCaptionBorder);
		cell1.setBounds(276, 260, 178, 20);
		frmCarRelease.getContentPane().add(cell1);

		JTextPane placeNum = new JTextPane();
		placeNum.setBackground(Color.GRAY);
		placeNum.setText("PLACE No:");
		placeNum.setFont(new Font("Sitka Text", Font.BOLD, 11));
		placeNum.setBounds(160, 299, 85, 20);
		frmCarRelease.getContentPane().add(placeNum);

		place = new JTextField();
		place.setColumns(10);
		place.setBackground(SystemColor.inactiveCaptionBorder);
		place.setBounds(277, 299, 69, 20);
		frmCarRelease.getContentPane().add(place);

		JButton select = new JButton("Release Car");
		select.setFont(new Font("Sitka Text", Font.BOLD, 18));
		select.setForeground(new Color(248, 248, 255));
		select.setBackground(new Color(0, 0, 0));
		select.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				File inputFile = new File("carpark.txt");
				File tempFile = new File("src/TempFile.txt");

				BufferedReader reader = null;
				try {
					reader = new BufferedReader(new FileReader("carpark.txt"));
				} catch (FileNotFoundException e) {

					e.printStackTrace();
				}
				BufferedWriter writer = null;
				try {
					writer = new BufferedWriter(new FileWriter(tempFile));
				} catch (IOException e) {

					e.printStackTrace();
				}

				String lineToRemove = "Car Number: " + carNmbr.getText();
				String currentLine;
				@SuppressWarnings("unused")
				boolean successful = false;

				try {
					while ((currentLine = reader.readLine()) != null) {

						System.out.println(currentLine);
						String trimmedLine = currentLine.trim();
						if (trimmedLine.equals(lineToRemove)) {
							for (int x = 0; x <= 6; x++) {
								reader.readLine();
							}
							JOptionPane.showMessageDialog(null, "Released successfully");
							successful = true;
							continue;
						}
						writer.write(currentLine + System.getProperty("line.separator"));
					}
				} catch (IOException e) {

					e.printStackTrace();
				}
				try {
					writer.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
				try {
					reader.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
				inputFile.delete();
				File outf = new File("carpark.txt");
				FileReader ins = null;
				FileWriter outs = null;
				try {
					ins = new FileReader("src/TempFile.txt");
					outs = new FileWriter(outf);
					int ch;
					while ((ch = ins.read()) != -1) {
						outs.write(ch);
					}
				} catch (IOException e) {
					System.out.println(e);
					System.exit(-1);
				} finally {
					try {
						ins.close();
						outs.close();
					} catch (IOException e) {
					}
				}

				tempFile.delete();
			}

		});

		select.setBounds(244, 356, 169, 31);
		frmCarRelease.getContentPane().add(select);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 737, 69);
		frmCarRelease.getContentPane().add(panel);
	}
}