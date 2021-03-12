public class Rectangle extends Shape implements IRectangle{
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public Rectangle() {
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public double getDiagonal() {
        return Math.sqrt(width * width + length * length);
    }
    @Override
    public double getPremter() {
        // TODO Auto-generated method stub
        return (width + length) * 2;
    }
    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return width * length;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Hinh chu nhat: "+"\nChieu dai = "+length+"\nChieu rong = "+width+"\nDuong cheo = "+getDiagonal()+"\nChu vi = "+getPremter()+"\nDien tich = "+getArea();
    }
    

}
