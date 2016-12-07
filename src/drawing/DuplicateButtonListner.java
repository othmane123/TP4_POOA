package drawing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DuplicateButtonListner implements ActionListener {
    private Drawing drawing;

    public DuplicateButtonListner(Drawing drawing){
        this.drawing = drawing;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        drawing.dupliquer();
        
    }
}