public class Mensalista extends Empregado{
    
    private String position;

    // Construtores
    public Mensalista(String newName, String newAddress, String newPosition) {
        super(newName, newAddress);
        this.position = newPosition;
    }

    public Mensalista() {

    }

    // Método Acessore
    public String getPosition() {
        return position;
    }

    // Método Modificador
    public void setPosition(String newPosition) {
        this.position = newPosition;
    }

    public void calcularSalario() {
        if (position.toUpperCase().equals("JUNIOR")){
            salary = 3658.92;
        }
        else if(position.toUpperCase().equals("PLENO")) {
            salary = 7387.42;
        }
        else if (position.toUpperCase().equals("SENIOR")) {
            salary = 14399.46;
        }
    }
}
    