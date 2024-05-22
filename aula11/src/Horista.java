public class Horista extends Empregado{
    
    private double horas;

    // Construtores
    public Horista(String newName, String newAddress, double newHour) {
        super(newName, newAddress);
        this.horas = newHour;
    }

    public Horista() {

    }

    // Método acessor
    public double getHour() {
        return this.horas;
    }

    // Método modificador
    public void setHour(double newHour) {
        this.horas = newHour;
    }

    public void calcularSalario() {
        salary = horas * 50;
    }
}
