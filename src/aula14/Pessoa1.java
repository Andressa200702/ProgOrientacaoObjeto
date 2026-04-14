package aula14;
public class Pessoa1 {
    String nome;
    int idade;

    public Pessoa1 (String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }
}

// === AULA 14/04 - INFORMAÇÕES ===
//public void ola(Pessoa pessoa){ // void --> não vai devolver nada
//sout("olá, %s" + pessoa.getNome(), nome); // formas de criar metodo para cumprimentar
//toString = transformando um INTERIO em STRING
//@Override = para devs
//GET --> "Pegadores", pega o dado do atributo e coloca no main()
//Não aplica GET na frente, exceto em BOOLEANO, que se usa "IS"
//SET --> "Colocador", atribui o dado que vem do main() no atributo
//Encapsulamento --> oculta detalhes dentro de uma classe, protegendo dados e manipulações
//ENUM --> Lista de possíveis erros e vai tratando