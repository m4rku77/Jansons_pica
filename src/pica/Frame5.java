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
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Frame;

public class Frame5 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Frame5 frame = new Frame5();
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
    public Frame5() {
    	
    	
    	
    	
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 625, 728);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        Image img = new ImageIcon(this.getClass().getResource("/aboutscreen.png")).getImage();
        
        JTextPane txtpnNo = new JTextPane();
        txtpnNo.setText("No");
        txtpnNo.setRequestFocusEnabled(false);
        txtpnNo.setOpaque(false);
        txtpnNo.setFont(new Font("Ink Free", Font.BOLD, 35));
        txtpnNo.setEditable(false);
        txtpnNo.setBounds(307, 393, 58, 37);
        contentPane.add(txtpnNo);
        
        JTextPane txtpnYes = new JTextPane();
        txtpnYes.setText("Yes");
        txtpnYes.setRequestFocusEnabled(false);
        txtpnYes.setOpaque(false);
        txtpnYes.setFont(new Font("Ink Free", Font.BOLD, 35));
        txtpnYes.setEditable(false);
        txtpnYes.setBounds(232, 393, 65, 37);
        contentPane.add(txtpnYes);
        
        JTextPane txtpnGraphicDesignerMarkuss = new JTextPane();
        txtpnGraphicDesignerMarkuss.setText("Takeaway?");
        txtpnGraphicDesignerMarkuss.setRequestFocusEnabled(false);
        txtpnGraphicDesignerMarkuss.setOpaque(false);
        txtpnGraphicDesignerMarkuss.setFont(new Font("Ink Free", Font.BOLD, 30));
        txtpnGraphicDesignerMarkuss.setEditable(false);
        txtpnGraphicDesignerMarkuss.setBounds(67, 306, 174, 37);
        contentPane.add(txtpnGraphicDesignerMarkuss);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(-654, 0, 1279, 693);
        contentPane.add(lblNewLabel);
        lblNewLabel.setIcon(new ImageIcon(img)); 
        
        txtpnYes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	setVisible(false); 
                Frame4 frame4 = new Frame4();
                frame4.setVisible(true);
            }
        });
        
        
        txtpnNo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	setVisible(false); 
                Frame6 frame6 = new Frame6();
                frame6.setVisible(true);
            }
        });
        
}
}
