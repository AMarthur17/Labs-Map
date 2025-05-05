package edu.uepb.cct.cc;

public class Main {

    public static final Funcao ATOR = new Ator();
    public static final Funcao DIRETOR = new Diretor();
    public static final Funcao ROTEIRISTA = new Roteirista();
    public static final Funcao CINEGRAFISTA = new Cinegrafista();
    public static final Funcao CAMERA = new Camera();

    public static void main(String[] args) {

        // Criando funcionários
        Funcionario Laura = new Funcionario("Laura", "11111111111");
        Funcionario Kevin = new Funcionario("Kevin", "11111111112");
        Funcionario Arthur = new Funcionario("Arthur", "11111111113");

        // Criando filmes
        Filme scream = new Filme("Scream IV", 2011, "00001");
        Filme detona = new Filme("Detona Ralph - O filme", 1978, "00002");

        // Adicionando funções aos filmes e atualizando filmografia dos funcionários
        scream.adicionarNoFilme(Laura, DIRETOR);
        scream.adicionarNoFilme(Kevin, ATOR);
        scream.adicionarNoFilme(Kevin, ROTEIRISTA);
        scream.adicionarNoFilme(Arthur, ATOR);

    

        // Adicionando trilha sonora
        scream.setTrilhaSonora("Wicked Game - Chris Isaak");


        detona.adicionarNoFilme(Kevin, ATOR);
        detona.adicionarNoFilme(Laura, DIRETOR);
        detona.setTrilhaSonora("detona theme - John Williams");


        System.out.println(scream);
        System.out.println(detona);

        System.out.println(Arthur); 
        System.out.println(Arthur.toStringFilmografia()); 
    }
}
