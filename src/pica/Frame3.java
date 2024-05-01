package pica;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;

public class Frame3 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Frame3 frame = new Frame3();
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
    public Frame3() {
    	
    	
    	
    	
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 625, 728);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        Image img = new ImageIcon(this.getClass().getResource("/aboutscreen.png")).getImage();
        
        JTextPane txtpnGraphicDesignerMarkuss = new JTextPane();
        txtpnGraphicDesignerMarkuss.setText("Graphic Designer: Markuss Jansons  ");
        txtpnGraphicDesignerMarkuss.setRequestFocusEnabled(false);
        txtpnGraphicDesignerMarkuss.setOpaque(false);
        txtpnGraphicDesignerMarkuss.setFont(new Font("Ink Free", Font.BOLD, 20));
        txtpnGraphicDesignerMarkuss.setEditable(false);
        txtpnGraphicDesignerMarkuss.setBounds(65, 378, 385, 79);
        contentPane.add(txtpnGraphicDesignerMarkuss);
        
        JTextPane txtpnAuthorMarkussJansons = new JTextPane();
        txtpnAuthorMarkussJansons.setFont(new Font("Ink Free", Font.BOLD, 20));
        txtpnAuthorMarkussJansons.setRequestFocusEnabled(false);
        txtpnAuthorMarkussJansons.setOpaque(false);
        txtpnAuthorMarkussJansons.setEditable(false);
        txtpnAuthorMarkussJansons.setText("Author: Markuss Jansons  ");
        txtpnAuthorMarkussJansons.setBounds(65, 304, 321, 79);
        contentPane.add(txtpnAuthorMarkussJansons);
        
        JTextPane txtpnDirectorMarkussJansons = new JTextPane();
        txtpnDirectorMarkussJansons.setText("Director: Markuss Jansons  ");
        txtpnDirectorMarkussJansons.setRequestFocusEnabled(false);
        txtpnDirectorMarkussJansons.setOpaque(false);
        txtpnDirectorMarkussJansons.setFont(new Font("Ink Free", Font.BOLD, 20));
        txtpnDirectorMarkussJansons.setEditable(false);
        txtpnDirectorMarkussJansons.setBounds(65, 340, 321, 79);
        contentPane.add(txtpnDirectorMarkussJansons);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(-654, 0, 1279, 693);
        contentPane.add(lblNewLabel);
        lblNewLabel.setIcon(new ImageIcon(img)); // Set the loaded image to the JLabel

    }
}
