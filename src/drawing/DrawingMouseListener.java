package drawing;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

//import com.sun.javafx.scene.paint.GradientUtils.Point;

/**
 * Listener pour g�rer la souris dans la zone de dessin
 */
public class DrawingMouseListener implements MouseMotionListener, MouseListener {

	Drawing drawing;
	Shape currentShape = null;
	int nbshape_selectioner = 0;
	public DrawingMouseListener(Drawing d){
		drawing = d;
	}

	/**
	 * Bouge la forme s�lectionn�e (si une forme est s�lectionn�e)
	 */
	public void mouseDragged(MouseEvent e) {
		if(currentShape != null){
			currentShape.setOrigin(e.getPoint());
			drawing.repaint();
		}
		if(drawing.shapeSelect.size() != 0){
			for(Shape s: drawing.shapeSelect){
				//Point  p = new Point (s.origin.x  + e.getX(), s.origin.y + e.getY());
				//s.origin.x = s.origin.x + e.getX();
				//s.origin.y = s.origin.y + e.getPoint().x;

				s.setOrigin(e.getPoint());
				drawing.repaint();
			}
		}
	}

	/**
	 * S�lectionne la forme sur laquelle l'utilisateur a cliqu�
	 */
	public void mousePressed(MouseEvent e) {
		for(Shape s : drawing){
			if(s.isOn(e.getPoint())){
				currentShape = s;
				break;
			}
		}
	}

	/**
	 * D�s�lectionne la forme
	 */
	public void mouseReleased(MouseEvent e) {
		if (e.getButton() == 1) {
			currentShape = null;
			if (drawing.shapeSelect.size() != 0) {
				drawing.shapeSelect.clear();
				nbshape_selectioner = 0;
				drawing.notifyObservers_for_selected_shape(0);
				//drawing.updateStatus("Objects unselected");
			}
		}


	}

	public void mouseMoved(MouseEvent e) {
	}
	/*public void leftClickAction(MouseEvent e) {
		java.awt.Point p = e.getPoint();
		drawing.addShape(currentShape);

	}*/
	public void mouseClicked(MouseEvent e) {
		if (e.getButton() == 3){
			for(Shape s : drawing){
				if(s.isOn(e.getPoint())){

					drawing.shapeSelect.add(s);
					nbshape_selectioner ++;
					//drawing.updateNbSelect(nbshape_selectioner);
					drawing.notifyObservers_for_selected_shape(nbshape_selectioner);
					//drawing.updateStatus("Selected objects : " + shapeList.size());
				}
			}
		}
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}
}
