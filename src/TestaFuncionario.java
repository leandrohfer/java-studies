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

class Empresa {
    public String nomeSocial;
    public String cnpj;
    public Funcionario[] empregados = new Funcionario[100];
    public static int numeroFuncionarios = 0;

    public void emprega (Funcionario fn) {
        this.empregados[numeroFuncionarios] = fn;
        numeroFuncionarios++;
    }

    public void mostraEmpregados() {
        for (Funcionario x :
                this.empregados) {
            if (x != null) {
                x.mostraDados();
            }
        }
    }

    public boolean contemFuncionario (Funcionario f) {
        for (Funcionario f1 : this.empregados) {
            if ((f1 != null) && (f1 == f)) {
                return true;
            }
        }
        return false;
    }
}

public class TestaFuncionario {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Funcionario f2 = new Funcionario();
        for (int i = 0; i < 10; i++) {
            Funcionario f1 = new Funcionario();
            f1.salario = 1500 + (i * 100);
            empresa.emprega(f1);
        }

        empresa.mostraEmpregados();
        empresa.emprega(f2);

        if (empresa.contemFuncionario(f2)) {
            System.out.println("\nEsse funcionario trabalha na empresa!");
        } else {
            System.out.println("\nEsse funcionario nao trabalha na empresa!");
        }
    }
}
