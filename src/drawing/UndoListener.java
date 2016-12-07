package drawing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UndoListener implements ActionListener {

	Drawing drawing;
	
	public UndoListener(Drawing drawing){
		this.drawing=drawing;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		drawing.undo();
	}

}