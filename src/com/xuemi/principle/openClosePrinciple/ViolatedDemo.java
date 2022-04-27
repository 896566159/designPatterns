package com.xuemi.principle.openClosePrinciple;

public class ViolatedDemo {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();

        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new Circle());
    }

}

//违背开闭原则原因：当再次新增一个Shape的子类时，要调用绘制图案时，需要在调用得类中修改代码。更改越多，修改越多

//图形基类
class Shape {
    int type;
}

class Triangle extends Shape {
    Triangle() {
        super.type = 3;
    }
}

class Circle extends Shape {
    Circle() {
        super.type = 2;
    }
}

class Rectangle extends Shape {
    Rectangle() {
        super.type = 1;
    }
}

//用于绘图的类
class GraphicEditor {
    public void drawShape(Shape s) {
        if (s.type == 1) {
            drawRectangle(s);
        } else if (s.type == 2) {
            drawCircle(s);
        } else if (s.type == 3) {
            drawTriangle(s);
        }
    }

    public void drawRectangle(Shape r) {
        System.out.println("绘制矩形");
    }
    public void drawCircle(Shape r) {
        System.out.println("绘制圆形");
    }
    public void drawTriangle(Shape r) {
        System.out.println("绘制三角形");
    }
}

