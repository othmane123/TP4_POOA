package drawing;

import java.awt.*;

public class Circle extends Shape{
	private Color color;
	
	private double radius;

	String text;
	
	public Circle(Point origin, double radius, Color color){
		this.origin = origin;
		this.radius = radius;
		this.color = color;		
	}
	
	public Circle(Point origin, double radius, Color color,String text){
		this.origin = origin;
		this.radius = radius;
		this.color = color;		
		this.text = text;
		
	}
	
	public void paint(Graphics g){
		g.setColor(color);
		g.fillOval((int)(origin.getX()-radius), (int)(origin.getY()-radius), (int)(2*radius), (int)(2*radius));
		g.setColor(Color.BLACK);
		g.drawOval((int)(origin.getX()-radius), (int)(origin.getY()-radius), (int)(2*radius), (int)(2*radius));
		
		if (text != null)
			g.drawString(text, (int) (origin.x - (radius / 2) - 5), origin.y);
	
		
	}
	public double getRadius(){
		return radius;
		}
	public Color getColor(){
		return color;
		}

	public boolean isOn(Point p) {
		return distanceToCenter(p)<radius;		
	}
	
	private double distanceToCenter(Point p){
		return this.origin.distance(p);
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
