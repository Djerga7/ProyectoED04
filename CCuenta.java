public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta() {
    }

    public CCuenta(String nom, String cue, double sal, double tipo) {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
        setTipoInterés(tipo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInterés() {
        return tipoInterés;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (getSaldo() < cantidad)
            throw new Exception("No hay suficiente saldo para retirar la cantidad especificada");
        setSaldo(getSaldo() - cantidad);
    }

    public void operativa_cuenta(float cantidad) {
        try {
            retirar(2300);
        } catch (Exception e) {
            System.out.println("Fallo al retirar: " + e.getMessage());
        }
        try {
            System.out.println("Ingreso en cuenta");
            ingresar(695);
        } catch (Exception e) {
            System.out.println("Fallo al ingresar: " + e.getMessage());
        }
    }
}
