package pica;

import java.awt.EventQueue;
import java.awt.Image;

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

public class Frame2 extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private JTextField txtPicuVeidi;
    private JTextField txtExtraToppings;

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
        // Set properties for this JFrame
        this.setBounds(100, 100, 906, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);
        Image img = new ImageIcon(this.getClass().getResource("/menuframe.png")).getImage();

        String[] picuVeidi = { "Havaju", "Margarita", "Grieķu", "Pepperoni" };
                
                JTextArea textArea = new JTextArea();
                textArea.setEditable(false);
                textArea.setBounds(189, 156, 76, 22);
                getContentPane().add(textArea);
                
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
                comboBox.setFocusTraversalKeysEnabled(false);
                comboBox.setFocusable(false);
                comboBox.setModel(new DefaultComboBoxModel(new String[] {"Hawaiian", "Margherita", "Greek", "Pepperoni"}));
                comboBox.setBackground(new Color(255, 255, 255));
                comboBox.setFont(new Font("Ink Free", Font.BOLD, 15));
                comboBox.setForeground(new Color(0, 0, 0));
                comboBox.setBounds(63, 156, 107, 22);
                getContentPane().add(comboBox);
        
                JLabel lblNewLabel = new JLabel("");
                
                        lblNewLabel.setIcon(new ImageIcon(img));
                        lblNewLabel.setBounds(0, 0, 900, 665);
                        this.getContentPane().add(lblNewLabel);
    }
}
