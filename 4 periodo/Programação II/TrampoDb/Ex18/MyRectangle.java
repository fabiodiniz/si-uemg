package TrampoDb.Ex18;


import java.awt.*;


public class MyRectangle extends MyLimitedShape {
	
	public MyRectangle() {
		
		
	}
	
	public MyRectangle( int x1, int y1, int x2, int y2, 
		Color color, boolean fill ) {
		
		super( x1, y1, x2, y2, color, fill );
		
	}
	
	public void draw( Graphics g ) {
		
		g.setColor( getColor() );
		
		if ( isFilled() )
			g.fillRect( getUpperLeftX(), getUpperLeftY(), 
				getWidth(), getHeight() );
		else
			g.drawRect( getUpperLeftX(), getUpperLeftY(), 
				getWidth(), getHeight() );
		
	}
	
}