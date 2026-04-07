public class Aluno {
    private String nome;
    private double nota1, nota2, media;
    private boolean aprovado;


    public Aluno(String nome) {
        this.nome = nome;
    }


    private void calcularMedia() {
        media = (nota1 + nota2) / 2;
    }


    public String getNome() {
        return nome;
    }


    public double getNota1() {
        return nota1;
    }


    public double getNota2() {
        return nota2;
    }


    public boolean isAprovado() {
        return aprovado;
    }


    public double getMedia() {
        return media;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setMedia(double media) {
        this.media = media;
    }


    public void setNota1(double nota1) {
        if (nota1 >= 0 && nota1 <= 10) {
            this.nota1 = nota1;
        } else {
            System.out.println("Nota inválida, foi digitado ZERO!");
        }
    }


    public void setNota2(double nota2) {
        if (nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2;
        } else {
            System.out.println("Nota inválida, foi digitado ZERO!");
        }
    }


    public boolean verificaAprovado() {
        calcularMedia();
        if (media >= 6){
            aprovado = true;
        }
        return aprovado;
    }


    private void setCalcularMedia(double CalcularMedia){
        media = (nota1+nota2)/2;
    }
}

