import static java.lang.Math.*;

public class Main{

	public static void main(String[] args){

		
		//Shape s1 = new Circle(5.5, "RED", false); 
		//Ошибка, т.к. не можем использовать конструктор абстрактного класса для создания его объекта. 
		//Вместо этого пишем:
		Circle s1 = new Circle(5.5, "RED", false); 
		
		System.out.println(s1); 
		System.out.println(s1.getArea()); 
		System.out.println(s1.getPerimeter()); 
		System.out.println(s1.getColor()); 
		System.out.println(s1.isFilled()); 
		System.out.println(s1.getRadius()); 

		Circle c1 = (Circle)s1; 
		System.out.println(c1); 
		System.out.println(c1.getArea()); 
		System.out.println(c1.getPerimeter()); 
		System.out.println(c1.getColor()); 
		System.out.println(c1.isFilled()); 
		System.out.println(c1.getRadius());

		//Shape s2 = new Shape();
		//ошибка, т.к. Shape - абстрактный класс



	    //Shape s3 = new Rectangle(1.0, 2.0, "RED", false); 
	    //Ошибка, т.к. не можем использовать конструктор абстрактного класса для создания его объекта. 
		//Вместо этого пишем:
		Rectangle s3 = new Rectangle(1.0, 2.0, "RED", false);
		
		System.out.println(s3); 
		System.out.println(s3.getArea()); 
		System.out.println(s3.getPerimeter()); 
		System.out.println(s3.getColor()); 
		System.out.println(s3.getLength());


		Rectangle r1 = (Rectangle)s3; 
		System.out.println(r1); 
		System.out.println(r1.getArea()); 
		System.out.println(r1.getColor()); 
		System.out.println(r1.getLength());



		//Shape s4 = new Square(6.6); 
		//Ошибка, т.к. не можем использовать конструктор абстрактного класса для создания его объекта. 
		//Вместо этого пишем:
		Square s4 = new Square(6.6);
		
		System.out.println(s4); 
		System.out.println(s4.getArea()); 
		System.out.println(s4.getSide()); 
		System.out.println(s4.getColor()); 

		Rectangle r2 = (Rectangle)s4;
		System.out.println(r2); 
		System.out.println(r2.getArea()); 
		System.out.println(r2.getColor()); 
		
		//System.out.println(r2.getSide());
		//ошибка, т.к. getSide() не является методом класса Rectangle
		
		System.out.println(r2.getLength());

		Square sq1 = (Square)r2; 
		System.out.println(sq1); 
		System.out.println(sq1.getArea()); 
		System.out.println(sq1.getColor()); 
		System.out.println(sq1.getSide()); 
		System.out.println(sq1.getLength());

	}
}

abstract class Shape{

	protected String color;
	protected boolean filled;

	Shape(){}

	Shape(String color, boolean filled){

		this.color=color;
		this.filled=filled;
	}

	public String getColor(){ return color; }

	public void setColor(String color){ this.color=color; }

	public boolean isFilled(){ return filled; }

	public void setFilled(boolean filled){ this.filled=filled; }

	abstract public double getArea();

	abstract public double getPerimeter();

	//public String toString(){ /*.......*/ }
}

class Rectangle extends Shape{

	protected double width;
	protected double length;
	
	Rectangle(){}

	Rectangle(double width, double length){

		this.width=width;
		this.length=length;
	}

	Rectangle(double width, double length, String color, boolean filled){

		this.width=width;
		this.length=length;
		this.color=color;
		this.filled=filled;
	}

	public double getWidth(){ return width; }
	
	public void setWidth(double width){ this.width=width; }

	public double getLength(){ return length; }

	public void setLength(){ this.length=length; }

	public double getArea(){ return width*length; }

	public double getPerimeter(){ return 2*(width+length); }

	//public String toString(){ /*......*/ }
}

class Square extends Rectangle{

	protected double side;

    Square(){}

	Square(double side){ this.side=side; }

	Square(double side, String color, boolean filled){

		this.side=side;
		this.color=color;
		this.filled=filled;
	}

	public double getSide(){ return side; }

	public void setSide(double side){ this.side=side; }

	public void setWidth(double side){ width=side; }

	public void setLength(double side){ length=side; }	

	//public String toString(){ /*......*/ }
}

class Circle extends Shape{

	protected double radius;

	Circle(){}

	Circle(double radius){ this.radius=radius; }
	
	Circle(double radius, String color, boolean filled){

		this.radius=radius;
		this.color=color;
		this.filled=filled;
	}

	public double getRadius(){ return radius; }

	public void setRadius(double radius){ this.radius=radius; }

	public double getArea(){ return PI*pow(radius,2); } 

	public double getPerimeter(){ return 2*PI*radius; }

	//public String toString(){ /*......*/ }
}
