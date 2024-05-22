public class App {
    public static void main(String[] args) throws Exception {
        Mensalista men1, men2;
        Horista hora1, hora2;

        // Empregados Mensalistas
        // men1
        men1 = new Mensalista("Jose", "Rua abc", "Junior");
        men1.calcularSalario();
        men1.calcularInss();

        System.out.println("==============================");
        System.out.println("Nome: " + men1.getName());
        System.out.println("Endereço: " + men1.getAddress());
        System.out.printf("Salario: %.2f\n", men1.getSalary());
        System.out.println("==============================");


        // men2
        men2 = new Mensalista("Ana", "Rua sem fim", "Senior");
        men2.calcularSalario();
        men2.calcularInss();

        System.out.println("==============================");
        System.out.println("Nome: " + men2.getName());
        System.out.println("Endereço: " + men2.getAddress());
        System.out.printf("Salario: %.2f\n", men2.getSalary());
        System.out.println("==============================");


        // Empregados Horistas
        //hora1
        hora1 = new Horista("Carlos", "Rua xyz", 20);
        hora1.calcularSalario();

        System.out.println("==============================");
        System.out.println("Nome: " + hora1.getName());
        System.out.println("Endereço: " + hora1.getAddress());
        System.out.printf("Salario: %.2f\n", hora1.getSalary());
        System.out.println("==============================");

        //hora2
        hora2 = new Horista("Cristina", "Rua do centro", 100);
        hora2.calcularSalario();

        System.out.println("==============================");
        System.out.println("Nome: " + hora2.getName());
        System.out.println("Endereço: " + hora2.getAddress());
        System.out.printf("Salario: %.2f\n", hora2.getSalary());
        System.out.println("==============================");
    }
}
