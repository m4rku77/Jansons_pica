package pica;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Frame1 {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Frame1 window = new Frame1();
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
    public Frame1() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 915, 659);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        Image img = new ImageIcon(this.getClass().getResource("/mainreal.png")).getImage();
                
                        JButton btnNewButton = new JButton("START");
                        btnNewButton.setFocusPainted(false);
                        btnNewButton.setDefaultCapable(false);
                        btnNewButton.setContentAreaFilled(false);
                        btnNewButton.setBorderPainted(false);
                        btnNewButton.addActionListener(new ActionListener() {
                        	
                        	    public void actionPerformed(ActionEvent e) {
                        	        frame.setVisible(false); 
                        	        Frame2 frame2 = new Frame2();
                        	        frame2.setVisible(true); 
                        	    }
                        	});
                        
                                btnNewButton.setFont(new Font("Ink Free", Font.BOLD, 20));
                                btnNewButton.setBounds(351, 428, 197, 42);
                                frame.getContentPane().add(btnNewButton);
                
                JButton btnAbout = new JButton(" CREDITS");
                btnAbout.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                		Frame3 frame3 = new Frame3();
                		frame3.setVisible(true);
                		
                	}
                });
                btnAbout.setFont(new Font("Ink Free", Font.BOLD, 20));
                btnAbout.setFocusPainted(false);
                btnAbout.setDefaultCapable(false);
                btnAbout.setContentAreaFilled(false);
                btnAbout.setBorderPainted(false);
                btnAbout.setBounds(351, 556, 197, 53);
                frame.getContentPane().add(btnAbout);
        
                JLabel lblNewLabel = new JLabel("");
                lblNewLabel.setIcon(new ImageIcon(img));
                lblNewLabel.setBounds(0, 0, 899, 622);
                frame.getContentPane().add(lblNewLabel);
    }
}
