package TrampoDb.Ex18;

import java.awt.*;

public abstract class MyLimitedShape extends MyShape {

	private boolean fill;

	public MyLimitedShape() {

		setFill(false);

	}

	public MyLimitedShape(int x1, int y1, int x2, int y2,
			Color color, boolean fill) {

		super(x1, y1, x2, y2, color);

		setFill(fill);

	}

	public void setFill(boolean f) {

		fill = f;

	}

	public boolean isFilled() {

		return fill;

	}

	public int getUpperLeftX() {

		return Math.min(getX1(), getX2());

	}

	public int getUpperLeftY() {

		return Math.min(getY1(), getY2());

	}

	public int getWidth() {

		return Math.abs(getX1() - getX2());

	}

	public int getHeight() {

		return Math.abs(getY1() - getY2());

	}
}
