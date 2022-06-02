public class Pessoa {

    private String sobrenome;
    private int idade;

    private final String cor = "negra";

    public String getSobrenome() {

        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {

        this.sobrenome = sobrenome;
    }

    public int getIdade() {

        return idade;
    }

    public void setIdade(int idade) {

        this.idade = idade;
    }

    public String getCor() {

        return this.cor;
    }

}
