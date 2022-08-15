/**
 * Class tipos_var_e_operadores
 *
 * Descrição do programa: Classe para testar os tipos primitivos e não
 * primitivos das variáveis do Java, testar as limitações dessas variáveis,
 * as formas de alterá-las, etc.
 *
 * @version 18.0.2 Jul 2022
 * @author Leandro Henrique <Telegram @leandro_h1>
 *
 * 10/08/2022
 */

public class tipos_var_e_operadores {

        public static void main (String[] args){
            int idadejoao = 15;
            int idademaria = 21;
            long numeroGrande = 99999999L;

            int somadasidades = idadejoao + idademaria;
            System.out.println(somadasidades);

            double pi = 3.1415;
            float doublepi = (float) (pi*2);
            System.out.println(pi*2);

            boolean amigoDono = true;
            boolean inimigo = !amigoDono;

            System.out.println(amigoDono);

            /**
             * Estado da expressão sendo atribuído a
             * uma variável.
             */
            boolean maiorDeIdade = idadejoao <= 18;
            System.out.println(maiorDeIdade);

            /**
             * Em variável tipo Char se utiliza aspas
             * simples.
             */
            char letra = 'L';

            /**
             * Todos os tipos de dados acima são
             * conhecidos como tipo Primitivos. Os
             * tipos não primitivos iniciam com letra
             * maiúscula, como o String abaixo.
             */

            String nomeCompleto = "Leandro Henrique";
            System.out.println(nomeCompleto);

            if (idadejoao >= 18 && amigoDono) {
                System.out.println("Entre na Festa!");
            } else {
                System.out.println("Volte para Casa!");
            }

            for (int i = 1; i <= 100; i++){
                System.out.println("Parabens pelo seu aniversario No. " + i);
            }
        }
}
