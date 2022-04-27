package com.xuemi.principle.openClosePrinciple;

public class ImproveDemo {

    public static void main(String[] args) {
        GraphicEdit graphicEditor = new GraphicEdit();

        graphicEditor.drawShape(new Rectangle1());
        graphicEditor.drawShape(new Triangle1());
        graphicEditor.drawShape(new Circle1());
    }

}

class GraphicEdit {
    public void drawShape(Shape1 s){
        s.draw();
    }
}

abstract class Shape1 {
    int type;

    abstract void draw();
}

class Triangle1 extends Shape1 {
    Triangle1() {
        super.type = 3;
    }

    @Override
    void draw() {
        System.out.println("绘制三角形");
    }
}

class Circle1 extends Shape1 {
    Circle1() {
        super.type = 2;
    }

    @Override
    void draw() {
        System.out.println("绘制圆形");
    }
}

class Rectangle1 extends Shape1 {
    Rectangle1() {
        super.type = 1;
    }

    @Override
    void draw() {
        System.out.println("绘制矩形");
    }
}

