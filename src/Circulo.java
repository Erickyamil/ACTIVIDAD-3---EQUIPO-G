import java.util.Date;

public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(String color, Date fechaCreacion, Boolean relleno, double radio) {
        super(color, relleno);
        this.radio = radio;
    }

    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

  
    @Override
    public String toString() {
        return super.toString() + ", además tiene: [Radio = " + radio + "], [Perímetro = " + getPerimetro() + "], [Área = " + getArea() + "]";
    }

}

