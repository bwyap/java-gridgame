package bwyap.gridgame.render.entity;

import java.awt.Graphics;

/**
 * A rectangular shaped drawable object
 * @author bwyap
 *
 */
public class Rectangle extends Shape {
	
	/**
	 * Create a rectangular shaped drawable object
	 * @param id a unique name to identify the object
	 * @param priority specifies the drawing priority of the object
	 * @param x x position
	 * @param y y position
	 * @param w width
	 * @param h height
	 */
	public Rectangle(String id, int priority, float x, float y, float w, float h) {
		super(id, priority, x, y, w, h);
	}
	
	/**
	 * Create a rectangular shaped drawable object with a default drawing priority
	 * @param id a unique name to identify the object
	 * @param x x position
	 * @param y y position
	 * @param w width
	 * @param h height
	 */
	public Rectangle(String id, float x, float y, float w, float h) {
		super(id, x, y, w, h);
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(colour);
		g.fillRect((int)posX, (int)posY, (int)width, (int)height);
	}

}
