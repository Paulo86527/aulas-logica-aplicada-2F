public class Main {
    public static void main(String[] args){
        // Aula de Orientaçao de Objetos
        //Declarar objetos

        Pessoa adao;
        //Instanciar obejtos

        adao = new Pessoa();
        Pessoa eva = new Pessoa();

        //Definiçao do formato
        adao.nome = "Adao";
        adao.sobrenome = "Silva";

        eva.nome = "Eva";
        eva.sobrenome = "Silva";

        //adicionar comportamento
        adao.falar();
        eva.falar();

        //criar mais objetos
        Pessoa qualquer = new Pessoa();
        //declarar objeto
        Pessoa rainha;
        // instanciaçao do objeto
        rainha = new Pessoa();
        // Definindo forma da pessoa
        rainha.nome = "tina";
        rainha.sobrenome = "tunner";
        // definiçao comportamento
        System.out.println(rainha.falar("alto"));
        rainha.comer();


    }


}