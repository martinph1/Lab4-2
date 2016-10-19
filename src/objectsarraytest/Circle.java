package objectsarraytest;

import java.awt.Color;

public class Circle {
	private double x;
	private double y;
	private double r;
	private Color fillColor;
	private String name;
	
	public Circle (double x, double y, double r, Color col, String name) 
	{
		this.x = x;
		this.y = y;
		this.r = r;
		this.fillColor = col;
		this.name = name;
	}
	
	public double getX () 
	{
		return this.x;
	}
	public double getY () 
	{
		return this.y;
	}
	
	public double getR () 
	{
		return this.r;
	}
	
	public Color getColor () 
	{
		return this.fillColor;
	}
	
	public String getName () 
	{
		return this.name;
	}

}
