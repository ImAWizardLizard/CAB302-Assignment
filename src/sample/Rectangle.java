package sample;


public class Rectangle extends Shape {

    int x1,y1;
    int x2,y2;

    public Rectangle(int x1,int y1, int x2, int y2){
        super();
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Rectangle(int pen, int fill,int x1,int y1, int x2, int y2){
       super(pen,fill);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
}
