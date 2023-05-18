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

        //adicionar comprtamento
        adao.falar();
        eva.falar();

    }


}