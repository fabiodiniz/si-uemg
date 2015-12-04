package TrampoDb.Ex18;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class DrawPanel extends JPanel {
	
	private MyShape[] shapes;
	private MyShape currentShape;
	private Color currentColor;
	private JLabel statusLabel;
	
	private int shapeCount;
	private int shapeType;
	private boolean filledShape;
	
	public DrawPanel( JLabel label ) {
		
		statusLabel = label;
		
		shapes = new MyShape[ 100 ];
		
		shapeCount = 0;
		
		setShapeType( new MyLine() );
		
		currentShape = null;
		
		setCurrentColor( Color.BLACK );
		
		setBackground( Color.WHITE );
		
		MouseEventHandler handler = new MouseEventHandler();
		addMouseListener( handler );
		addMouseMotionListener( handler );
		
	}
	
	public void setShapeType( MyShape shape ) {
		
		if ( shape instanceof MyLine )
			shapeType = 0;
		else if ( shape instanceof MyOval )
			shapeType = 1;
		else
			shapeType = 2;
		
	}
	
	public void setCurrentColor(Color c) {
		
		currentColor = c;
		
	}
	
	public void setFilled(boolean fill) {
		
		filledShape = fill;
		
	}
	
	public int getShapeType() {
		
		return shapeType;
		
	}
	
	public Color getCurrentColor() {
		
		return currentColor;
		
	}
	
	public boolean isFilled() {
		
		return filledShape;
		
	}
	
	public void clearLastShape() {
		
		if ( shapeCount > 0 )
			shapeCount--;
			
		repaint();
		
	}
	
	public void clearDrawing() {
		
		shapeCount = 0;
			
		repaint();
		
	}
	
	public void paintComponent( Graphics g ) {
		super.paintComponent( g );
		
		for ( int i = 0; i < shapeCount; i++ )
			if ( shapes[ i ] != null )
				shapes[ i ].draw( g );
		if(currentShape != null)
			currentShape.draw(g);
			
	}
	
	public String getShapeContent() {
		String s = "";
		
		for(int i = 0; i < shapeCount; i++)
			s += shapes[ i ].getClass().getName() + "\n";
		
		return s;
	}
	
	private class MouseEventHandler extends MouseAdapter 
		implements MouseMotionListener {
			
		public void mousePressed(MouseEvent evt) {
			if (getShapeType() == 0)
				currentShape = new MyLine();
			else if (getShapeType() == 1)
				currentShape = new MyOval();
			else
				currentShape = new MyRectangle();
			
			currentShape.setX1(evt.getX());
			currentShape.setY1(evt.getY());
			
			currentShape.setColor(getCurrentColor());
			
			if (currentShape instanceof MyLimitedShape) {
				MyLimitedShape filled = (MyLimitedShape) currentShape;
				filled.setFill(isFilled());
				
				currentShape = filled;
				
			}
		}
		
		public void mouseReleased(MouseEvent evt) {
			currentShape.setX2(evt.getX());
			currentShape.setY2(evt.getY());
			
			shapes[ shapeCount ] = currentShape;					
			shapeCount++;
			
			currentShape = null;
			
			repaint();
		}
		
		public void mouseMoved(MouseEvent evt) {
			statusLabel.setText("(" + evt.getX() + ", " 
				+ evt.getY() + ")");
		}
		
		public void mouseDragged( MouseEvent evt ) {
			currentShape.setX2( evt.getX() );
			currentShape.setY2( evt.getY() );
			
			repaint();
			
			statusLabel.setText( "(" + evt.getX() + ", " 
				+ evt.getY() + ")" );
			
		}
	}
}