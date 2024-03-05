package es.iesmz;

public class EmpleadoBR {
    private TipoEmpleado tipo;
    private float ventasMes;
    private float horasExtra;
    private final float baseVendedor = 1000;
    private final float baseEncargado = 1500;
    private final float prima1VentasMes = 100;
    private final float prima2VentasMes = 200;
    private final float precioHoraExtra = 20;

    public EmpleadoBR(TipoEmpleado tipo, float ventasMes, float horasExtra) {
        this.tipo = tipo;
        this.ventasMes = ventasMes;
        this.horasExtra = horasExtra;
    }

    public TipoEmpleado getTipo() {
        return tipo;
    }

    public void setTipo(TipoEmpleado tipo) {
        this.tipo = tipo;
    }

    public float getVentasMes() {
        return ventasMes;
    }

    public void setVentasMes(float ventasMes) {
        this.ventasMes = ventasMes;
    }

    public float getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(float horasExtra) {
        this.horasExtra = horasExtra;
    }

    public float calcularSalarioBruto() {
        if (tipo == null || ventasMes < 0 || horasExtra < 0) return -1;
        int total = 0;
        if (tipo == TipoEmpleado.vendedor) total += baseVendedor;
        else if (tipo == TipoEmpleado.encargado) total += baseEncargado;

        if (ventasMes >= 1500) total += prima2VentasMes;
        else if (ventasMes >= 1000) total += prima1VentasMes;
        total += horasExtra * precioHoraExtra;
        return total;
    }

    public float calcularSalarioNeto(float salarioBruto) {
        if (salarioBruto < 0) return -1;
        else if (salarioBruto < 1000) return salarioBruto;
        else if (salarioBruto < 1500) return salarioBruto * 0.84f;
        else return salarioBruto * 0.82f;
    }
}
