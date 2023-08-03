package practice.decorator;

abstract class ShapeDecorator implements Shape {
	protected Shape decoratedShape;

	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}

	public void draw() {
		decoratedShape.draw();
	}
}

class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw() {
		setRedBorder(decoratedShape);
	}

	private void setRedBorder(Shape decoratedShape) {
		decoratedShape.draw();
		System.out.println("Border Color: Red");
	}
}

class GreenShapeDecorator extends ShapeDecorator {

	public GreenShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw() {
		setGreenBorder(decoratedShape);
	}

	private void setGreenBorder(Shape decoratedShape) {
		decoratedShape.draw();
		System.out.println("Border Color: Green");
	}
}
