public class Main {

    public static void main(String[] args){

        Pessoa objCarla = new Pessoa();
        objCarla.setSobrenome("Rissi");
        objCarla.setIdade(38);



        imprimeSobrenome(objCarla);
        imprimeIdade(objCarla);
        imprimeAnoNascimento(objCarla);



        Pessoa objPereira = new Pessoa();
        objPereira.setSobrenome("Pereira");
        objPereira.setIdade(75);

        imprimeSobrenome(objPereira);
        imprimeIdade(objPereira);
        imprimeAnoNascimento(objPereira);

        int calculo;
        calculo = calculaSoma(objCarla.getIdade(), objPereira.getIdade());
        System.out.println("A soma das idades é: " + calculo);

        int calculaMaisVelho;
        calculaMaisVelho = calculaMaisVelho(objCarla.getIdade(), objPereira.getIdade());
        System.out.println("O mais velho é: " + calculaMaisVelho);

        int calculaAnoMaisVelho;
        calculaAnoMaisVelho = retornaAnoMaisVelho(objCarla.getIdade(), objPereira.getIdade());
        System.out.println("O ano do mais velho é: " + calculaAnoMaisVelho);

        int calculaDiferenca;
        calculaDiferenca = diferencaIdade(objCarla.getIdade(), objPereira.getIdade());
        System.out.println("A diferença das idades é: " + calculaDiferenca);

        double calculaDivisao;
        calculaDivisao = divisaoIdade(objCarla.getIdade(), objPereira.getIdade());
        System.out.println("A divisão entre as idades é: " + calculaDivisao);

        int calculaMaisNovo;
        calculaMaisNovo = calculaMaisNovo(objCarla.getIdade(), objPereira.getIdade());
        System.out.println("O mais novo é: " + calculaMaisNovo);

        int calculaAnoMaisNovo;
        calculaAnoMaisNovo = retornaAnoMaisNovo(objCarla.getIdade(), objPereira.getIdade());
        System.out.println("O ano do mais novo é: " + calculaAnoMaisNovo);

        int calculaMedia;
        calculaMedia = calculaMediaIdade(objCarla.getIdade(), objPereira.getIdade());
        System.out.println("A média das idades é: " + calculaMedia);


    }

    private static void imprimeSobrenome(Pessoa obj){
       System.out.println("Meu sobrenome é: " + obj.getSobrenome());
    }

    private static void imprimeIdade(Pessoa obj){
        System.out.println("Minha idade é: " + obj.getIdade());
    }

    private static int retornaAnoNascimento(int idade){
        int anoAtual = 2022;
        int anoNascimento = anoAtual - idade;
        return anoNascimento;
    }

    private static void imprimeAnoNascimento(Pessoa obj){
        int anoNascimento = retornaAnoNascimento(obj.getIdade());
        System.out.println("Eu nasci em: " + anoNascimento);
    }

    private static int calculaSoma(int idade1, int idade2){
        int soma = idade1 + idade2;
        return soma;
    }

    private static int calculaMaisVelho(int idade1, int idade2){
        int maisVelho = 0;
        if (idade1 > idade2) {
            maisVelho = idade1;
        }
        if (idade2 > idade1) {
            maisVelho = idade2;
        }
        return maisVelho;
    }

    private static int retornaAnoMaisVelho(int idade1, int idade2){
        int idadeMaisVelho = 0;
        idadeMaisVelho = calculaMaisVelho(idade1, idade2);
        int anoMaisVelho = retornaAnoNascimento(idadeMaisVelho);
        return anoMaisVelho;
    }

    private static int diferencaIdade(int idade1, int idade2){
        int diferenca = idade1 - idade2;
        return diferenca;
    }

    private static double divisaoIdade (int idade1, int idade2){
        double divisao = (double) (idade1 / idade2);
        return divisao;
    }

    private static int calculaMaisNovo(int idade1, int idade2) {
        int maisNovo = 0;
        if (idade1 < idade2) {
            maisNovo = idade1;
        } else {
            maisNovo = idade2;
        }
        return maisNovo;
    }

    private static int retornaAnoMaisNovo(int idade1, int idade2){
        int idadeMaisNovo = 0;
        idadeMaisNovo = calculaMaisNovo(idade1, idade2);
        int anoMaisNovo = retornaAnoNascimento(idadeMaisNovo);
        return anoMaisNovo;
    }

    private static int calculaMediaIdade(int idade1, int idade2){
        int media = (idade1 + idade2) / 2;
        return media;
    }


}