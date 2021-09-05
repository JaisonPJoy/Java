class Shape
{
	void draw()
	{
		System.out.println(" DRAWING SHAPES ");
	}
	void erase()
	{
		System.out.println(" ERASING SHAPES ");
		System.out.println(" ============== ");
	}
	
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println(" DRAWING CIRCLE ");
	}
	void erase()
	{
		System.out.println(" ERASING CIRCLE ");
		System.out.println(" ============== ");
	}
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println(" DRAWING TRIANGLE ");
	}
	void erase()
	{
		System.out.println(" ERASING TRIANGLE ");
		System.out.println(" ================ ");
	}
}
class Square extends Shape
{
	void draw()
	{
		System.out.println(" DRAWING SQUARE ");
	}
	void erase()
	{
		System.out.println(" ERASING SQUARE ");
		System.out.println(" ============== ");
	}
}
class C3Q3
{
	public static void main(String args[])
	{
		Shape sh = new Shape();  //dynamic method dispatch
		sh.draw();      
		sh.erase();
		sh = new Circle();
		sh.draw();
		sh.erase();
		sh = new Triangle();
		sh.draw();
		sh.erase();
		sh = new Square();
		sh.draw();
		sh.erase();
	}
}