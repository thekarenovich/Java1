
public class Main{
    public static void main(String[] args){
        
        Ball obj = new Ball(1.2, 9.0);

        System.out.print(obj.getX());
        System.out.print(obj.getY());
        obj.setX(3.4);
        obj.setY(5.1);
        obj.setXY(1.0, 2.0);
        obj.move(0, 3.0);
        
    }
}

class Ball{

    private double x = 0.0;
    private double y = 0.0;

    Ball(double x, double y){
        this.x=x;
        this.y=y;
    }

    Ball(){}

    public double getX(){ return x; }

    public double getY(){ return y; }

    public void setX(double x) { this.x = x; }

    public void setY(double y) { this.y = y; }

    public void setXY(double x, double y){ 
        this.x = x;
        this.y = y; 
    }
    
    public void move( double xDisp, double yDisp){ 
        
        x+=xDisp;
        y+=yDisp; 
    }
    
    //String toString(){ ... }

}


