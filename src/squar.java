public class squar extends Rectangle
{
    public squar() {}
    public squar(double side){
        super(side,side);
    }
    public squar(double side,String color,boolean filled){
        super.setLength(side);
        super.setWidth(side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double side) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Square{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", width=" + width +
                ", length=" + length +
                ", side=" + this.getSide() +
                '}';
    }
}