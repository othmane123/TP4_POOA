package drawing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class textButtonListener implements ActionListener {
	Drawing drawing;
	JFrame frame;
	JPanel panel;
	
	private JPanel buttonPanel;
	private JTextField textField;
	private JPanel textPanel;
	private JButton textButton;
	
	public textButtonListener(Drawing drawing){
		this.drawing = drawing;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (drawing.shapes.size() != 0) {
			frame = new JFrame();
			frame.setTitle("Insérer texte");
			frame.setSize(150, 80);
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
			
			panel = new JPanel();
			panel.setLayout(new BorderLayout());
			
			textButton = new JButton("Afficher Texte");
			textField = new JTextField();
			 
			buttonPanel = new JPanel();
			buttonPanel.add(textButton);
			
			textButton.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		        	 
		        	 
		        	drawing.textShape(textField.getText());
		        	 frame.dispose();
		         }
			});
			
			
			
			
			textPanel = new JPanel();
			textPanel.setLayout(new BorderLayout());
			textPanel.add(textField,BorderLayout.CENTER);
			
			panel.add(buttonPanel, BorderLayout.SOUTH);
			panel.add(textPanel, BorderLayout.CENTER);
			
			frame.setContentPane(panel);
			frame.setResizable(false);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}
	}
	}

