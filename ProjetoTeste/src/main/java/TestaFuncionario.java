/**
 * Class TestaFuncionario
 *
 * Descrição: Exercícios sobre conceitos básicos de Java
 *
 * @version 18.0.2 Jul 2022
 * @author Leandro Henrique <Telegram @leandro_h1>
 *
 * 15/08/2022
 */

class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private Data dataDeEntrada;
    private String rg;

    private int identificador;

    private static int contadorFuncionarios = 1;

    Funcionario (String nome, String departamento, double salario, Data data, String rg) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.dataDeEntrada = data;
        this.rg = rg;
        this.identificador = contadorFuncionarios;
        contadorFuncionarios++;
    }

    public double getSalario() {
        return this.salario;
    }
    public void setSalario (double salario) {
        this.salario = salario;
    }

    public void recebeAumento (double valorAumento) {
        this.salario += valorAumento;
        System.out.println("\nO Novo salario do funcionario " + this.nome + " eh R$" + this.salario);
    }

    public double getGanhoAnual () {
        return this.salario * 12;
    }

    public String getDataFormatada () {
        String dataFormatada = this.dataDeEntrada.dia+"/"+this.dataDeEntrada.mes+"/"+this.dataDeEntrada.ano;
        return dataFormatada;
    }

    public void mostraDados () {
        System.out.println("\n==================================");
        System.out.println("Nome do funcionario: "+this.nome);
        System.out.println("ID do funcionario: "+this.identificador);
        System.out.println("Departamento: "+this.departamento);
        System.out.println("Salario: R$"+this.salario);
        System.out.println("Ganhos Anuais: R$"+this.getGanhoAnual());
        System.out.println("Data de Entrada na Empresa: "+this.getDataFormatada());
        System.out.println("RG do funcionario: "+this.rg);
        System.out.println("==================================");
    }
}

class Data {
    public int dia;
    public int mes;
    public int ano;

    Data (int dia, int mes, int ano) {
        if ((mes == 2) && (dia > 29)) {
            System.out.println("Data Invalida");
        } else {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }
}

class Empresa {
    private String nomeSocial;
    private String cnpj;
    private Funcionario[] empregados;
    private static int numeroFuncionarios = 0;

    Empresa (int quantidadeFuncionario) {
        empregados = new Funcionario[quantidadeFuncionario];
    }
    public void emprega (Funcionario fn) {
        this.empregados[numeroFuncionarios] = fn;
        numeroFuncionarios++;
    }

    public void mostraEmpregados() {
        for (int i = 0; i < numeroFuncionarios; i++) {
            this.empregados[i].mostraDados();
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

    public int getNumeroFuncionarios () {
        return numeroFuncionarios;
    }

    public Funcionario getFuncionario (int posicao) {
        return this.empregados[posicao];
    }
}

public class TestaFuncionario {
    public static void main(String[] args) {
        Empresa empresa = new Empresa(11);

        for (int i = 0; i < 10; i++) {
            Funcionario f1 = new Funcionario("","GTIN", 1500 + (i * 100), new Data(16,8,2022),"9158475");
            empresa.emprega(f1);
        }
        Funcionario f2 = new Funcionario("","GTIN", 2500, new Data(230,2,2022),"9158475");

        empresa.emprega(f2);
        empresa.mostraEmpregados();

        if (empresa.contemFuncionario(f2)) {
            System.out.println("\nEsse funcionario trabalha na empresa!");
        } else {
            System.out.println("\nEsse funcionario nao trabalha na empresa!");
        }

        empresa.getFuncionario(10).mostraDados();
    }
}
