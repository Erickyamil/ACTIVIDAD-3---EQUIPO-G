import java.util.Date;

public class FiguraGeometrica {
    private String color;
    private Boolean relleno;
    private Date fechaCreacion;

    FiguraGeometrica(String color, Boolean relleno){
        this.color = color;
        this.relleno = relleno;
        this.fechaCreacion = new Date();
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getRelleno() {
        return relleno;
    }

    public void setRelleno(Boolean relleno) {
        this.relleno = relleno;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override 
    public String toString(){
        return "La figura Geometrica tiene: [Color = " + color + "], [Relleno = " + relleno + "], y fue creada el: [ " + fechaCreacion + " ]";
    }
}
