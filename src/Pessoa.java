public class Pessoa {

    private double altura;
    public int idade;
    protected String nome;
    //boolean cabelo;

    //Construtor
    public Pessoa (String nomeDaPessoa, int idadeDaPessoa, double alturaDaPessoa){
        nome = nomeDaPessoa;
        idade = idadeDaPessoa;
        altura = alturaDaPessoa;
    }

    public void colocarAltura() {
        altura = 1.70;
    }
}
