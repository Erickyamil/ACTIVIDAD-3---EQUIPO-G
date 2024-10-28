public class Triangulo extends FiguraGeometrica {

    private double lado1 = 1.0;
    private double lado2 = 1.0;
    private double lado3 = 1.0;

    Triangulo(String color, Boolean relleno,double lado1, double lado2, double lado3) {
        super(color, relleno);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public double getArea() {

        double altura = lado1 * Math.sqrt(3) / 2;

        return (lado1 * altura) / 2;
    }

    public double getPerimeter() {
        return lado1 * 3;
    }

 
    public String toString() {
        return super.toString() + ", además tiene: [Lados = " + lado1 + ", " + lado2 + ", " + lado3 + " ], " + "[Área = " + getArea() + "], " + "[Perímetro: " + getPerimeter() + "]";
    }
}

