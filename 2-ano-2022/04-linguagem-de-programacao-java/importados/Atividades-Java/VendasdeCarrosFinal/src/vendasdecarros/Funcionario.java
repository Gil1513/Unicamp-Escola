/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: Funcionario.java
Explicação: classes agrupam dados e comportamentos; herança e sobrescrita especializam comportamentos; interfaces definem contratos; exceções tratam falhas durante a execução.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vendasdecarros;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Gilmar da Silva
 */
public class Funcionario extends Pessoa implements IPessoa {
    Scanner entrada = new Scanner(System.in);
    
    private String nome;
    private int idade;
    private String cargo;
    private double salario;
    private int horasSemanais;
    private int telefone;
    
        
    public Funcionario() {
        super.setIdade(1);
        super.setNome("");
        this.idade = 0;
        this.salario = -1.0;
        this.horasSemanais = 0;
        this.telefone = -1;
        
    }

    public Funcionario(String nome, int idade, String cargo, double salario,int horasSemanais,  int telefone) {
        super(nome, idade);
        this.cargo = cargo;
        this.salario = salario;
        this.horasSemanais = horasSemanais;
        this.telefone = telefone;

    }
 

        
    public double getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        if (telefone < 0) {
            throw new IllegalArgumentException("Valor de telefone invalido");
	}else{
            this.telefone = telefone;
	}
    }
    
    @Override
    public void exibir() {
        System.out.println("\nNome: " + this.nome + "\nIdade: " + this.idade + "\nCargo: " + this.cargo + "\nSalário: "
	+ this.salario + "\nHoras Semanais: " + this.horasSemanais + "\n");
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Valor inválido");
	}
        else{
            this.idade = idade;
	}
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("Saalario invalido");
	}
        else{
            this.salario = salario;
	}
    }

    public int getHorasSemanais() {
        return horasSemanais;
    }

    public void setHorasSemanais(int horasSemanais) {
        this.horasSemanais = horasSemanais;
    }
    
  public Funcionario CriarFuncionario() {
    Funcionario fl = new Funcionario();
    // criando Funcionario
  System.out.println("Digite o nome do Funcionário: ");
  fl.setNome(entrada.next());
  entrada.nextLine();

while (fl.getIdade() < 1) {
    try{
      System.out.println("Digite a idade do Funcionário: ");
      fl.setIdade(entrada.nextInt());
       }  
    catch (IllegalArgumentException e) {
      System.out.println("Idade de Funcionário invalida");
    }
    catch (InputMismatchException e) {
      System.out.println("Tipo de idade invalida");
      entrada.nextLine();
    }
}
while (fl.getTelefone() < 0) {
    try {
    System.out.println("Digite o telefone do Funcionário:");
    fl.setTelefone(entrada.nextInt());
	}
    catch (IllegalArgumentException e) {
       System.out.println("Valor de telefone invalido");
	} 
    catch (InputMismatchException e) {
        System.out.println("Tipo de telefone invalido");
        entrada.nextLine();
	}
}

    System.out.println("Digite o cargo do Funcionário:");
    fl.setCargo(entrada.next());
        
    
    while (fl.getSalario() < 0) {
	try {
            System.out.println("Digite o salario do funcionario: ");
            fl.setSalario(entrada.nextDouble());
	} 
        catch (IllegalArgumentException e) {
            System.out.println("Salario de funcionario invalido");
	} 
        catch (InputMismatchException e) {
            System.out.println("Tipo de salario invalido");
        }
		}  
    
    System.out.println("Digite às horas semanais: /n");
    fl.setHorasSemanais(entrada.nextInt());
     
    //entrada.nextInt();
    // retorna arrayList
    return fl;
    
    }

  public String Testa(){
      try{
        System.out.println("Digite 1 se deseja remover por nome e 2 se deseja remover por índice");
	int apagar = entrada.nextInt();
      }
      catch(InputMismatchException e){
        System.out.println("opção ivalida!");
        }
        return null;
}
}

