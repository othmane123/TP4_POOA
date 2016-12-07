package drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Rectangle extends Shape {

	int width;
	int height;
	Color color;
	String text;

	public Rectangle(Point origin, int width, int height, Color color){
		this.origin = origin;
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public boolean isOn(Point p) {
		return(p.x > origin.x && p.x < origin.x+width && p.y > origin.y && p.y < origin.y+height);
	}

	public void paint(Graphics g) {
		g.setColor(color);
		g.fillRect(origin.x, origin.y, width, height);
		g.setColor(Color.BLACK);
		g.drawRect(origin.x, origin.y, width, height);
		
		if (this.text != null)
			g.drawString(text, (int) origin.x + width/2 - 20, (int) origin.y + height/2);
	}
	public int getWidth() {
		return width;
	}

	public int getHeight(){
		return height;
	}

	public Color getColor(){
		return color;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public Shape dupliquer() {
		// TODO Auto-generated method stub
		return null;
	}


	
	
}
