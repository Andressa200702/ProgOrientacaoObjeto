package aula14;
public class Main {
    public static void main(String[] args) {

        Pessoa1 a = new Pessoa1("Anna", 20);
        Pessoa1 b = new Pessoa1("Carol", 18);

        System.out.println("Olá " + a.nome +", quanto tempo!");
        System.out.println("Olá " + b.nome + ", feliz em te ver." );
        System.out.println("Minha idade idade atual é " + a.idade + " anos. E a sua?");
        System.out.println("Eu estou com " + b.idade + " anos. Bjos!");
    }
}
