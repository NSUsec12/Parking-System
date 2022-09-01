package Car_Park;

import java.awt.EventQueue;
import java.awt.Window;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;


public class CreatingAc {
	
	public static ArrayList<createAccount> create = new ArrayList<createAccount>();
	public static HashMap<createAccount, Boolean> hp = new HashMap<createAccount, Boolean>();

	private JFrame frmCreatAccount;
	private JTextField nameTxt;
	private JTextField genderTxt;
	private JTextField passTxt;
	private JTextField emailTxt;
	private JTextField mobTxt;
	private JTextField brithTxt;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreatingAc window = new CreatingAc();
					window.frmCreatAccount.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	public JTextField getNameTxt() {
		return nameTxt;
	}


	public void setNameTxt(JTextField nameTxt) {
		this.nameTxt = nameTxt;
	}


	public JTextField getPassTxt() {
		return passTxt;
	}


	public void setPassTxt(JTextField passTxt) {
		this.passTxt = passTxt;
	}


	public JTextField getEmailTxt() {
		return emailTxt;
	}


	public void setEmailTxt(JTextField emailTxt) {
		this.emailTxt = emailTxt;
	}


	public JTextField getMobTxt() {
		return mobTxt;
	}


	public void setMobTxt(JTextField mobTxt) {
		this.mobTxt = mobTxt;
	}


	public JTextField getBrithTxt() {
		return brithTxt;
	}


	public void setBrithTxt(JTextField brithTxt) {
		this.brithTxt = brithTxt;
	}


	/**
	 * Create the application.
	 */
	public CreatingAc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCreatAccount = new JFrame();
		frmCreatAccount.getContentPane().setBackground(new Color(0, 0, 51));
		frmCreatAccount.setTitle("Create Account");
		frmCreatAccount.setBounds(100, 100, 761, 541);
		frmCreatAccount.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCreatAccount.getContentPane().setLayout(null);
		
		JLabel caName = new JLabel("NAME:");
		caName.setForeground(SystemColor.text);
		caName.setBackground(SystemColor.activeCaptionText);
		caName.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		caName.setBounds(65, 140, 70, 23);
		frmCreatAccount.getContentPane().add(caName);
		
		JLabel lblNsuCarParking = new JLabel("NSU CAR PARKING MANAGEMENT SYSTEM");
		lblNsuCarParking.setForeground(new Color(0, 0, 255));
		lblNsuCarParking.setFont(new Font("Sitka Text", Font.PLAIN, 28));
		lblNsuCarParking.setBounds(108, 10, 599, 44);
		frmCreatAccount.getContentPane().add(lblNsuCarParking);
		
		JLabel caGender = new JLabel("GENDER:");
		caGender.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		caGender.setForeground(new Color(255, 255, 255));
		caGender.setBounds(65, 184, 103, 22);
		frmCreatAccount.getContentPane().add(caGender);
		
		JLabel caPassword = new JLabel("Password:");
		caPassword.setForeground(SystemColor.text);
		caPassword.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		caPassword.setBounds(65, 360, 103, 24);
		frmCreatAccount.getContentPane().add(caPassword);
		
		JLabel caEmail = new JLabel("Email:");
		caEmail.setForeground(SystemColor.text);
		caEmail.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		caEmail.setBounds(65, 228, 70, 30);
		frmCreatAccount.getContentPane().add(caEmail);
		
		JLabel caMobile = new JLabel("Mobile No:");
		caMobile.setForeground(SystemColor.text);
		caMobile.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		caMobile.setBounds(65, 272, 110, 30);
		frmCreatAccount.getContentPane().add(caMobile);
		
		JLabel caBirth = new JLabel("Birth Date:");
		caBirth.setForeground(SystemColor.text);
		caBirth.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		caBirth.setBounds(65, 316, 120, 22);
		frmCreatAccount.getContentPane().add(caBirth);
		
		nameTxt = new JTextField();
		nameTxt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nameTxt.setBounds(169, 140, 254, 22);
		frmCreatAccount.getContentPane().add(nameTxt);
		nameTxt.setColumns(10);
		
		genderTxt = new JTextField();
		genderTxt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		genderTxt.setColumns(10);
		genderTxt.setBounds(169, 184, 254, 22);
		genderTxt.setText("Male");
		frmCreatAccount.getContentPane().add(genderTxt);
		
		
		passTxt = new JTextField();
		passTxt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passTxt.setColumns(10);
		passTxt.setBounds(169, 360, 254, 22);
		frmCreatAccount.getContentPane().add(passTxt);
		
		emailTxt = new JTextField();
		emailTxt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		emailTxt.setColumns(10);
		emailTxt.setBounds(169, 228, 254, 22);
		frmCreatAccount.getContentPane().add(emailTxt);
		
		mobTxt = new JTextField();
		mobTxt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		mobTxt.setColumns(10);
		mobTxt.setBounds(169, 272, 254, 22);
		frmCreatAccount.getContentPane().add(mobTxt);
		
		brithTxt = new JTextField();
		brithTxt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		brithTxt.setColumns(10);
		brithTxt.setBounds(169, 316, 254, 22);
		frmCreatAccount.getContentPane().add(brithTxt);
		
		JButton btnNewButton = new JButton("Creat Account");
		btnNewButton.setBackground(new Color(0, 102, 204));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Object obj = arg0.getSource();
				
				try{
					
				    FileWriter pr=new FileWriter("createAccount.txt",true);
					BufferedWriter bw=new BufferedWriter(pr);
					String p=nameTxt.getText();	
					String g=genderTxt.getText();					
					String ip=emailTxt.getText();
					String po=mobTxt.getText();
					String a=passTxt.getText();
					 
						bw.write(p+" "+a+" "+g+" "+ip+" "+po);
						 // bw.append("\n");
						bw.newLine();
						bw.close();
					}
					catch(Exception e){
						System.out.print("Exception");
					}
				
				
				
				
				LOGIN li= new LOGIN();
				LOGIN.main(null);
				frmCreatAccount.setVisible(false);
			}
		});
		btnNewButton.setBounds(209, 420, 148, 23);
		frmCreatAccount.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(255, 250, 250));
		lblNewLabel.setIcon(new ImageIcon("D:\\car-parking-management-system-java-master\\NSU Car Parking Management System\\picture\\New folder\\nsu.png"));
		lblNewLabel.setBounds(23, 11, 59, 74);
		frmCreatAccount.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("ACCOUNT REGISTRATION");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.PLAIN, 28));
		lblNewLabel_2.setBounds(194, 54, 359, 31);
		frmCreatAccount.getContentPane().add(lblNewLabel_2);
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.setBackground(new Color(102, 102, 102));
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LOGIN li= new LOGIN();
				LOGIN.main(null);
				frmCreatAccount.setVisible(false);
			}

		});
		btnGoBack.setFont(new Font("Tahoma", Font.BOLD, 14)); 
		btnGoBack.setBounds(573, 455, 120, 24);
		frmCreatAccount.getContentPane().add(btnGoBack);
		
		JComboBox comboBoxGender = new JComboBox();
		comboBoxGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				genderTxt.setText(comboBoxGender.getSelectedItem().toString());
			}
		});
	
		comboBoxGender.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		comboBoxGender.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female","Other"}));
		comboBoxGender.setBounds(452, 177, 97, 30);
		frmCreatAccount.getContentPane().add(comboBoxGender);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 747, 93);
		frmCreatAccount.getContentPane().add(panel);
		
		
	}
}