package pica;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Frame6 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtPhoneNumber;
	private JTextField textField;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame6 frame = new Frame6();
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
	public Frame6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 898, 693);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Image contactInfo = new ImageIcon(this.getClass().getResource("/contactinfo.jpg")).getImage();
        
        JSpinner spinner = new JSpinner();
        spinner.setOpaque(false);
        spinner.setModel(new SpinnerNumberModel(371, 0, 998, 1));
        spinner.setBounds(71, 318, 49, 20);
        contentPane.add(spinner);
        
        Image atpakalarrow = new ImageIcon(this.getClass().getResource("/atpakalarrow.png")).getImage();
        
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(atpakalarrow));
        lblNewLabel_1.setBounds(10, 557, 110, 86);
        contentPane.add(lblNewLabel_1);
        
        lblNewLabel_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	setVisible(false);
                Frame5 frame5 = new Frame5();
                frame5.setVisible(true);
            }
        });
        
        
        
        
        
        textField_2 = new JTextField();
        textField_2.setInheritsPopupMenu(true);
        textField_2.setIgnoreRepaint(true);
        textField_2.setFocusTraversalPolicyProvider(true);
        textField_2.setFocusCycleRoot(true);
        textField_2.setBorder(null);
        textField_2.setFont(new Font("Ink Free", Font.BOLD, 15));
        textField_2.setColumns(10);
        textField_2.setBounds(130, 317, 110, 21);
        contentPane.add(textField_2);
        
        textField = new JTextField();
        textField.setFont(new Font("Ink Free", Font.BOLD, 15));
        textField.setBounds(71, 226, 86, 20);
        contentPane.add(textField);
        textField.setColumns(10);
        
        txtPhoneNumber = new JTextField();
        txtPhoneNumber.setVerifyInputWhenFocusTarget(false);
        txtPhoneNumber.setText("Phone number:");
        txtPhoneNumber.setOpaque(false);
        txtPhoneNumber.setFont(new Font("Ink Free", Font.BOLD | Font.ITALIC, 25));
        txtPhoneNumber.setFocusTraversalKeysEnabled(false);
        txtPhoneNumber.setEditable(false);
        txtPhoneNumber.setColumns(10);
        txtPhoneNumber.setCaretColor(Color.WHITE);
        txtPhoneNumber.setBorder(null);
        txtPhoneNumber.setBounds(71, 274, 200, 32);
        contentPane.add(txtPhoneNumber);
        
        txtName = new JTextField();
        txtName.setVerifyInputWhenFocusTarget(false);
        txtName.setText("Name:");
        txtName.setOpaque(false);
        txtName.setFont(new Font("Ink Free", Font.BOLD | Font.ITALIC, 25));
        txtName.setFocusTraversalKeysEnabled(false);
        txtName.setEditable(false);
        txtName.setColumns(10);
        txtName.setCaretColor(Color.WHITE);
        txtName.setBorder(null);
        txtName.setBounds(71, 190, 145, 32);
        contentPane.add(txtName);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(contactInfo));
        
        lblNewLabel.setBounds(0, 0, 885, 657);
        contentPane.add(lblNewLabel);
	}
}
