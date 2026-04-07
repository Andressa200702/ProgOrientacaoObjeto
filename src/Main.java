//Aula de POO
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner cc =new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome= cc.nextLine();

        Aluno a = new Aluno(nome);
        System.out.println(a.getNome());

        System.out.println("Digite a primeira nota:");
        a.setNota1(cc.nextDouble());
        System.out.println("Digite a segunda nota:");
        a.setNota2(cc.nextDouble());

        if (a.verificaAprovado()){
            System.out.println("Aprovado com " + a.getMedia());
        } else {
            System.out.println("Reprovado com " + a.getMedia());
        }

        //Pessoa dessa = new Pessoa("Andressa", 19, 1.70);
        //System.out.printf("A %s tem %d anos", dessa.nome, dessa.idade);
    }
}
