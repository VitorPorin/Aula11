public class Mensalista extends Empregado{
    
    private String position;

    // Construtores
    public Mensalista(String Nnome, String Nendereço, String Nposicao) {
        super(Nnome, Nendereço);
        this.position = Nposicao;
    }

    public Mensalista() {

    }

    // Método Acessore
    public String getPosition() {
        return position;
    }

    // Método Modificador
    public void setPosition(String Nposicao) {
        this.position = Nposicao;
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
    