
public class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura, String color, boolean relleno) {
        super(color, relleno);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return base * altura;
    }

    public double getPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String toString() {
        return super.toString() + ", además tiene: [Base = " + base + "], [Altura = " + altura + "], [ Área =" + getArea() + " ]" + 
        ", [Perímetro = " + getPerimetro() + "]";
    }
}