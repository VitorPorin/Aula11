public class Empregado {
    
    protected String name;
    protected String endereco;
    protected double salario;
    
    public Empregado(String name, String endereco, double salario) {
        this.name = name;
        this.endereco = endereco;
        this.salario = salario;
    }

    public Empregado(){

    }

    public void setName(String name) {
        this.name = name;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }


    public String getName() {
        return name;
    }


    public String getEndereco() {
        return endereco;
    }


    public double getSalario() {
        return salario;
    }

    public double calcularIRPF() {
        double aux = 0;
        if (salario > 2112.01 && salario<2826.66) {
            aux = salario * 0.075;

        } else if (salario>=2826.67 && salario<=3751.05){
            aux = salario * 0.015;          
        } else if (salario>=3751.06 && salario<=4664.68){
            aux = salario * 0.225;
        } else if (salario> 4664.68){
            aux = salario*0.275;
        }
        return aux;
        }
        
        public double calcINSS(){
            double aux =0;
            if (salario<=1412){
                aux = salario *0.075;
            }else if (salario>1412 && salario<2667){
                aux = salario *0.09;
            }else if (salario>2667 && salario<4000){
                aux = salario *0.12;
            }else if (salario>4000){
                aux = salario *0.14;
            }
            return aux;
        }
            

    }

