class Triangle{
        double s1, s2, s3, l, b;
    public Triangle(){
        s1 = 3;
        s2 = 2;
        s3 = 5;
        l = 3;
        b = 2;
    }
    public double Area(){
        return 0.5 * l * b;
    }
    public double Perimeter(){
        return s1 + s2 + s3;
    }
}
class AreaOfTriangleConst{
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        double area = triangle.Area();
        double perimeter = triangle.Perimeter();
        System.out.println(area+" "+perimeter);
    }
}
