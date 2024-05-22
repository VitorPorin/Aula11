public class Horista extends Empregado{
    
    private double horas;

    // Construtores
    public Horista(String Nnome, String Nendereço, double Nhora) {
        super(Nnome, Nendereço);
        this.horas = Nhora;
    }

    public Horista() {

    }

    // Método acessor
    public double getHour() {
        return this.horas;
    }

    // Método modificador
    public void setHour(double Nhora) {
        this.horas = Nhora;
    }

    public void calcularSalario() {
        salary = horas * 50;
    }
}
