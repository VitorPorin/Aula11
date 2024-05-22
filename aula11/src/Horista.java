public class Horista extends Empregado{
    
    private double hour;

    // Construtores
    public Horista(String newName, String newAddress, double newHour) {
        super(newName, newAddress);
        this.hour = newHour;
    }

    public Horista() {

    }

    // Método acessor
    public double getHour() {
        return this.hour;
    }

    // Método modificador
    public void setHour(double newHour) {
        this.hour = newHour;
    }

    public void calcularSalario() {
        salary = hour * 50;
    }
}
