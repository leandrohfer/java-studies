/**
 * Class exemplo_turma_alunos
 *
 * Descrição: Classe para testar instanciação de objetos, alteração
 * de atributos públicos desses objetos e invocação de métodos.
 *
 * @version 18.0.2 Jul 2022
 * @author Leandro Henrique <Telegram @leandro_h1>
 *
 * 10/08/2022
 */

class Turma {
    /**
     * Lista de objetos Alunos
     */
    Aluno[] listaAlunos;

    void imprimeDados() {
        /**
         * Condição: Enquanto i for menor que o tamanho da lista de Alunos
         * do objeto Turma em questão
         */
        for (int i = 0; i < this.listaAlunos.length; i++) {

            /**
             * Criando um objeto da classe Aluno e atribuindo a ele o objeto Aluno
             * correspondente da lista de Alunos do objeto Turma em questão.
             */
            Aluno aluno = this.listaAlunos[i];

            /**
             * Caso não exista aluno em alguma posição da Lista, continue o código.
             */
            if (aluno == null) continue;

            /**
             * Exibição dos dados do aluno.
             */
            System.out.
                    println("\nO aluno " + aluno.nome +" recebeu a nota " + aluno.nota + "\n");
        }
    }
}

class Aluno {
    String nome;
    int nota;
}

public class exemplo_turma_alunos {

    public static void main(String[] args) {
        /**
         * Criando um objeto da classe Turma
         */
        Turma AD01 = new Turma();

        /**
         * Atribuindo tamanho à lista de alunos do objeto da classe turma que foi criado
         */
        AD01.listaAlunos = new Aluno[10];

        /**
         * Instanciando objetos da classe Aluno em alguns índices da lista de Alunos
         */
        AD01.listaAlunos[0] = new Aluno();
        AD01.listaAlunos[1] = new Aluno();
        AD01.listaAlunos[2] = new Aluno();

        /**
         * Atribuindo valores aos atributos e chamando a função
         */
        AD01.listaAlunos[0].nome = "Leandro Henrique";
        AD01.listaAlunos[0].nota = 9;

        AD01.listaAlunos[1].nome = "Augusto Cezar";
        AD01.listaAlunos[1].nota = 5;

        AD01.listaAlunos[2].nome = "Joao Pedro";
        AD01.listaAlunos[2].nota = 10;

        AD01.imprimeDados();
    }
}
