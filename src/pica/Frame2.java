package pica;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.Cursor;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import javax.swing.JTree;
import javax.swing.JList;
import javax.swing.JFormattedTextField;
import javax.swing.SpinnerNumberModel;

public class Frame2 extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private JTextField txtPicuVeidi;
    private JTextField txtExtraToppings;
    private JTextField txtPizzasSize;
    private JTextField txtNoOfPizzas;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Frame2 frame = new Frame2();
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
    public Frame2() {
        initialize();
    }

    private void initialize() {
     
        this.setBounds(100, 100, 906, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);
        Image img = new ImageIcon(this.getClass().getResource("/menuframe.png")).getImage();

        
        
        String[] picuVeidi = { "Hawaiian", "Margherita", "Greek", "Pepperoni" };
        
        Double [] picuCenas = {9.99, 5.99, 12.99, 8.99};
        Double[] picuToppings = {0.99, 1.49, 1.99, 1.99};
        		
        Image atpakalarrow = new ImageIcon(this.getClass().getResource("/atpakalarrow.png")).getImage();
        JLabel greenarrow = new JLabel("");
        greenarrow.setIcon(new ImageIcon(atpakalarrow));
        greenarrow.setBounds(38, 537, 110, 86);
        this.getContentPane().add(greenarrow);

       greenarrow.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	setVisible(false); 
            	Frame1 frame1 = new Frame1();
            	// ka uzrādit frame 1
            }
        });

       
        
        
        		JSpinner spinner = new JSpinner();
        		spinner.setModel(new SpinnerNumberModel(1, 1, 5, 1));
        		spinner.setOpaque(false);
        		spinner.setBounds(225, 459, 42, 32);
        		getContentPane().add(spinner);
        		
        		txtNoOfPizzas = new JTextField();
        		txtNoOfPizzas.setVerifyInputWhenFocusTarget(false);
        		txtNoOfPizzas.setText("No. of Pizzas");
        		txtNoOfPizzas.setOpaque(false);
        		txtNoOfPizzas.setFont(new Font("Ink Free", Font.BOLD | Font.ITALIC, 25));
        		txtNoOfPizzas.setFocusTraversalKeysEnabled(false);
        		txtNoOfPizzas.setEditable(false);
        		txtNoOfPizzas.setColumns(10);
        		txtNoOfPizzas.setCaretColor(Color.WHITE);
        		txtNoOfPizzas.setBorder(null);
        		txtNoOfPizzas.setBounds(63, 459, 171, 32);
        		getContentPane().add(txtNoOfPizzas);
        		
        		JComboBox comboBox_1 = new JComboBox();
        		comboBox_1.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
        		comboBox_1.setFont(new Font("Ink Free", Font.BOLD, 15));
        		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Small", "Medium ", "Large"}));
        		comboBox_1.setBounds(63, 407, 85, 22);
        		getContentPane().add(comboBox_1);
        		
        		txtPizzasSize = new JTextField();
        		txtPizzasSize.setVerifyInputWhenFocusTarget(false);
        		txtPizzasSize.setText("Pizza's size");
        		txtPizzasSize.setOpaque(false);
        		txtPizzasSize.setFont(new Font("Ink Free", Font.BOLD | Font.ITALIC, 25));
        		txtPizzasSize.setFocusTraversalKeysEnabled(false);
        		txtPizzasSize.setEditable(false);
        		txtPizzasSize.setColumns(10);
        		txtPizzasSize.setCaretColor(Color.WHITE);
        		txtPizzasSize.setBorder(null);
        		txtPizzasSize.setBounds(63, 370, 182, 32);
        		getContentPane().add(txtPizzasSize);
                
                
                
                
                
                JCheckBox chckbxOnions = new JCheckBox("Red Onions");
                chckbxOnions.setOpaque(false);
                chckbxOnions.setFont(new Font("Ink Free", Font.BOLD, 15));
                chckbxOnions.setBounds(63, 296, 182, 22);
                getContentPane().add(chckbxOnions);
                
                JCheckBox chckbxOlives = new JCheckBox("Olives");
                chckbxOlives.setOpaque(false);
                chckbxOlives.setFont(new Font("Ink Free", Font.BOLD, 15));
                chckbxOlives.setBounds(63, 271, 182, 22);
                getContentPane().add(chckbxOlives);
                
                JCheckBox chckbxMushrooms = new JCheckBox("Mushrooms");
                chckbxMushrooms.setOpaque(false);
                chckbxMushrooms.setFont(new Font("Ink Free", Font.BOLD, 15));
                chckbxMushrooms.setBounds(63, 321, 182, 22);
                getContentPane().add(chckbxMushrooms);
                
                JCheckBox chckbxNewCheckBox = new JCheckBox("Cheese");
                chckbxNewCheckBox.setFont(new Font("Ink Free", Font.BOLD, 15));
                chckbxNewCheckBox.setOpaque(false);
                chckbxNewCheckBox.setBounds(63, 246, 182, 22);
                getContentPane().add(chckbxNewCheckBox);
                
                txtExtraToppings = new JTextField();
                txtExtraToppings.setVerifyInputWhenFocusTarget(false);
                txtExtraToppings.setText("Extra Toppings");
                txtExtraToppings.setOpaque(false);
                txtExtraToppings.setFont(new Font("Ink Free", Font.BOLD | Font.ITALIC, 25));
                txtExtraToppings.setFocusTraversalKeysEnabled(false);
                txtExtraToppings.setEditable(false);
                txtExtraToppings.setColumns(10);
                txtExtraToppings.setCaretColor(Color.WHITE);
                txtExtraToppings.setBorder(null);
                txtExtraToppings.setBounds(63, 207, 182, 32);
                getContentPane().add(txtExtraToppings);
                
                txtPicuVeidi = new JTextField();
                txtPicuVeidi.setEditable(false);
                txtPicuVeidi.setBorder(null);
                txtPicuVeidi.setFocusTraversalKeysEnabled(false);
                txtPicuVeidi.setCaretColor(new Color(255, 255, 255));
                txtPicuVeidi.setVerifyInputWhenFocusTarget(false);
                txtPicuVeidi.setOpaque(false);
                txtPicuVeidi.setFont(new Font("Ink Free", Font.BOLD | Font.ITALIC, 25));
                txtPicuVeidi.setText("Pizza Types");
                txtPicuVeidi.setBounds(63, 118, 145, 32);
                getContentPane().add(txtPicuVeidi);
                txtPicuVeidi.setColumns(10);
                JComboBox<String> comboBox = new JComboBox<>(picuVeidi);
                comboBox.setOpaque(false);
                comboBox.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
                comboBox.setBackground(new Color(255, 255, 255));
                comboBox.setFont(new Font("Ink Free", Font.BOLD, 15));
                comboBox.setForeground(new Color(0, 0, 0));
                comboBox.setBounds(63, 156, 107, 22);
                getContentPane().add(comboBox);
        
                JLabel lblNewLabel = new JLabel("");
                JLabel lblNewLabel_1 = new JLabel("");
                lblNewLabel_1.setBounds(297, 536, 107, 76);
                getContentPane().add(lblNewLabel_1);
                
                Image greenArrowImg = new ImageIcon(this.getClass().getResource("/greenarrow2.png")).getImage();
                lblNewLabel_1.setIcon(new ImageIcon(greenArrowImg));
                
                lblNewLabel_1.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                    	setVisible(false);
                        Frame5 frame5 = new Frame5();
                        frame5.setVisible(true);
                    }
                });
                
                
                
                lblNewLabel.setIcon(new ImageIcon(img));
                		
                        lblNewLabel.setIcon(new ImageIcon(img));
                        lblNewLabel.setBounds(0, 0, img.getWidth(null), img.getHeight(null));
                        this.getContentPane().add(lblNewLabel);
    }
}
