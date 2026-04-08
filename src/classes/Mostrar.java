package classes;
public class Mostrar {
    public static void main(String[] args) {
        Carro n1 = new Carro("Hyundai", "Creta", 2026);
        Carro n2 = new Carro("Nissan", "Kicks", 2018);

        System.out.printf("A marca é: %s \nO modelo é: %s \nO ano é: %d", n1.marca, n1.modelo, n1.ano);
        System.out.printf("\n\nA marca é: %s \nO modelo é: %s \nO ano é: %d", n2.marca, n2.modelo, n2.ano);

    }
}
