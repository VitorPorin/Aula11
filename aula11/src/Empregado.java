public class Empregado {
    
    protected String name;
    protected String address;
    protected double salary;

    // Contrutor
    public Empregado() {

    }

    public Empregado(String newName, String newAddress) {
        this.name = newName;
        this.address = newAddress;
    }

    // Métodos acessores
    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public double getSalary() {
        return this.salary;
    }

    // Métodos modificadores
    public void setName(String newName) {
        this.name = newName;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }


    public double calcularIrpf() {
        double rate = 0;

        if (salary >= 2259.21 && salary <= 2825.65){
            rate = salary * 0.075;
        }
        else if(salary > 2825.65 && salary <= 3751.05) {
            rate = salary * 0.15;
        }
        else if (salary > 3751.65 && salary <= 4664.68) {
            rate = salary * 0.225;
        }
        else if (salary > 4664.68){
            rate = salary * 0.275;
        }

        return rate;
    }

    public double calcularInss() {
        double discount = 0;

        if (salary <= 1412.00) {
            discount = salary * 0.075;
        }
        else if(salary > 1412.00 && salary <= 2666.68) {
            discount = salary * 0.09 - 21.18;
        }
        else if(salary > 2666.68 && salary <= 4000.03) {
            discount = salary * 0.12 - 101.18;
        }
        else if(salary > 4000.03 && salary <= 7786.02) {
            discount = salary * 0.14 - 181.18;
        }
        else if(salary > 7786.02) {
            discount = 908.86;
        }

        return discount;
    }


    
    

}

