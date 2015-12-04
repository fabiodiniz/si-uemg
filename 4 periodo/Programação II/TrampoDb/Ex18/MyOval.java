package TrampoDb.Ex18;


import java.awt.*;


public class MyOval extends MyLimitedShape {
	
	public MyOval() {
		
	}
	
	public MyOval( int x1, int y1, int x2, int y2, 
		Color color, boolean fill ) {
		
		super( x1, y1, x2, y2, color, fill );
		
	}
	
	public void draw( Graphics g ) {
		
		g.setColor( getColor() );
		
		if ( isFilled() )
			g.fillOval( getUpperLeftX(), getUpperLeftY(), 
				getWidth(), getHeight() );
		else
			g.drawOval( getUpperLeftX(), getUpperLeftY(), 
				getWidth(), getHeight() );
		
	}
	
}