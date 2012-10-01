package hci;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Annotation {
    static String label_msg;
	private static JFrame frame;
	private static JTextField  field;
	public static void annotate(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		JPanel annotatepanel = new JPanel();
		
		JLabel msg = new JLabel ("Please provide an annotation for the segment");
		
		JLabel label = new JLabel("Label");
		annotatepanel.add(label);
		
		
		field = new JTextField(20);
		
		field.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				label_msg=(field.getText());
				frame.dispose();
			}
		});
		annotatepanel.add(field);
		frame.getContentPane().add (annotatepanel);
		frame.getContentPane().add(BorderLayout.NORTH,msg);
		frame.pack();
		frame.setVisible(true);
	}
	
	
}
