/**
 * Class TestaFuncionario
 *
 * Descrição:
 *
 * @version 18.0.2 Jul 2022
 * @author Leandro Henrique <Telegram @leandro_h1>
 *
 * 15/08/2022
 */

class Funcionario {
    public String nome;
    public String departamento;
    public double salario;
    public Data dataDeEntrada = new Data();
    public String rg;

    public void recebeAumento (double valorAumento) {
        this.salario += valorAumento;
        System.out.println("\nO Novo salario do funcionario " + this.nome + " eh R$" + this.salario);
    }

    public double calculaGanhoAnual () {
        return this.salario * 12;
    }

    public String getDataFormatada () {
        String dataFormatada = this.dataDeEntrada.dia+"/"+this.dataDeEntrada.mes+"/"+this.dataDeEntrada.ano;
        return dataFormatada;
    }

    public void mostraDados () {
        System.out.println("\n==================================");
        System.out.println("Nome do funcionario: "+this.nome);
        System.out.println("Departamento: "+this.departamento);
        System.out.println("Salario: R$"+this.salario);
        System.out.println("Ganhos Anuais: R$"+this.calculaGanhoAnual());
        System.out.println("Data de Entrada na Empresa: "+this.getDataFormatada());
        System.out.println("RG do funcionario: "+this.rg);
        System.out.println("==================================");
    }
}

class Data {
    public int dia;
    public int mes;
    public int ano;
}

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.nome = "Leandro";
        f1.salario = 1500;
        f1.dataDeEntrada.dia = 27;
        f1.dataDeEntrada.mes = 8;
        f1.dataDeEntrada.ano = 2022;

        f1.mostraDados();
    }
}
