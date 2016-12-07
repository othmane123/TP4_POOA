package drawing;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RedoListener implements ActionListener {

	Drawing drawing;
	
	public RedoListener(Drawing drawing){
		this.drawing=drawing;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		drawing.redo();
	}

}