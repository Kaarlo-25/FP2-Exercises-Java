public class Rectangle {
    double base, height;
    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase(){
        return this.base;
    }

    public double getHeight(){
        return this.height;
    }

    @Override
    public boolean equals(Object other){
        if (other instanceof Rectangle){
            Rectangle r = (Rectangle) other;
            return this.base == r.base && this.height == r.height;
        } else {
            return false;
        }
    }

    @Override
    public String toString(){
        return "base: " + this.base + ", heigth: " + this.height;
    }
}
