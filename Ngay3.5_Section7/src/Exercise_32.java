public class Exercise_32 {
    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }

}

class Wall {
    private double width;
    private double height;

    public Wall(double width, double height) {
        if (width < 0)
            this.width = 0;
        else
            this.width = width;

        if (height < 0)
            this.height = 0;
        else
            this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0)
            this.height = 0;
        else
            this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0)
            this.width = 0;
        else
            this.width = width;
    }

    public double getArea() {
        return width * height;
    }
}


