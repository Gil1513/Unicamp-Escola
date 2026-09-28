/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: VendasdeCarros.java
Explicação: classes agrupam dados e comportamentos; herança e sobrescrita especializam comportamentos; coleções armazenam múltiplos objetos.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
package vendasdecarros;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gilmar da Silva
 */
public class VendasdeCarros/* extends Cliente*/ {

    static ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
    static ArrayList<Funcionario> cadastroFuncionarios = new ArrayList<>();
    static ArrayList<Produtos> cadastroProduto = new ArrayList<>();
    
    
    public static void main(String[] args) {
        Scanner entrada1 = new Scanner(System.in);
        Cliente c2 = new Cliente();
        Funcionario f1 = new Funcionario();
        Produtos p1 = new Produtos();

            int opcaoUsuario = 1;

        while (opcaoUsuario != 0) {
        System.out.println("Digite 1 para funções do cliente 2 para funções do funcionário,"
        + " 3 para a dos produtos 0 para sair");
        int result = entrada1.nextInt();

            if (result == 1) {
             int deci = 1;
                while(deci != 0){   
             System.out.println("Selecione uma das opcoes abaixo: \n 0 - Fechar programa \n 1 "
             + "- Cadastrar Cliente\n2 - Ver a lista de Cliente\n 3 - remover Cliente\n 4 - Buscar clientes\n"
             + "5 - para ver o cliente mais velho \n 6 - para ver o cliente mais novo \n 7 - Exibir clientes maiores de 60 anos\n "
             + "8 - Exibir clientes maiores de 18 anos\n 9 - média da idade de clientes");
             int resp = entrada1.nextInt();
             
             switch(resp){
             case 0:
             //Saindo da execução.
                System.exit(resp);
                break;
             case 1:
            //Adiciona Clientes.
                c2 = c2.CriarCliente();
                listaCliente.add(c2);
                System.out.println("Cliente adicionado!");
                break;
           
             case 2:
            //Exibindo Clientes
               listaCliente();
               break;
             case 3:
            //Apagando Clintes 
               apagarCliente();
               break;
             case 4:
            //Buscando Clientes
               buscarCliente();
               break;
             case 5:
            //Mostrando Cliente mais novo
               clienteMaisVelho();
               break;
             case 6:
            //Mostrando Clinte mais velho
               clienteMaisNovo();
               break;
             case 7:
            // Quantidade de clientes maiores de 60
                System.out.println("A quantidade de clientes maiores de 60 anos e:" + ClientesMaisSessenta());
                break;
             case 8:
            // Quantidade de clientes maiores de 18
                System.out.println("A quantidade de clientes maiores de 18 anos e:" + ClientesMaisDezoito());
                break;
             case 9:
            // Media das idades
                System.out.println("A media das idades e" + naMediaIdade());
                break;
             }
                System.out.println("Digite 0 para sair das opcoes dos clientes e 1 para continuar");
                deci = entrada1.nextInt();
             }
            }
            if (result == 2) {
               int deci2 = 1;
                while(deci2 != 0){
                System.out.println("Selecione uma das opcoes abaixo:\n1 - para cadastar Funcionario\n2 - Ver a lista de funcionarios\n"
                + "3 - Para remover funcionario\n4 - Buscar Funcionario\n5 - para ver o funcionario mais velho\n6 - para ver o funcionario mais "
                + "novo \n7 - Exibir funcionarios maiores de 60 anos\n"
                + "8 - Exibir funcionarios maiores de 18 anos\n9 - média da idade de funcionarios\n0 para sair da execução");    
                int resp = entrada1.nextInt();
                
                switch(resp){
                
            case 0:
             //Saindo da execução.
                System.exit(resp);
                break;
            case 1:
            //Adiciona Funcionario.
                f1 = f1.CriarFuncionario();
                cadastroFuncionarios.add(f1);
                System.out.println("funcionario adicionado!");
                break;
           
            case 2:
            //Exibindo Funcionario
               listaFuncionario();
               break;
            case 3:
            //Apagando Funcionario 
               apagarFuncionario();
               break;
            case 4:
            //Buscando Funcionario
               buscarFuncionario();
               break;
            case 5:
            //Mostrando Funcionario mais novo
               FuncionarioMaisVelho();
               break;
            case 6:
            //Mostrando Funcionario mais velho
               FuncioanrioMaisNovo();
               break;
            case 7:
            // Quantidade de Funcionario maiores de 60
                System.out.println("A quantidade de Funcionario maiores de 60 anos e:" + FuncionarioMaisSessenta());
                break;
            case 8:
            // Quantidade de Funcionario maiores de 18
                System.out.println("A quantidade de Funcionarios maiores de 18 anos e:" + FuncionarioMaisDezoito());
                break;
            case 9:
            // Media das idades
                System.out.println("A media das idades e" + FuncionarioMediaIdade());
                break;
             }
               System.out.println("Digite 0 para sair das opcoes dos Funcionarios e 1 para continuar");
                deci2 = entrada1.nextInt(); 
                }
                
                
            }
            if (result == 3) {
             int deci3 = 1;
                while(deci3 != 0){
                System.out.println("Selecione uma das opcoes abaixo:\n1 - para cadastar Produto\n2 - Ver a lista de Produtos\n"
                + "3 - Para remover Produto\n4 - Buscar Produto por Descricao\n5 - Buscar produto por preco\n"
                + "6 - Buscar produto por cor\n7 - Produto mias barato\n8 - Produto mais caro\n9 - média dos precos\n"
                + "10 - Produtos com os precos acima da media\n0 para sair da execução");    
                int resp = entrada1.nextInt();
                
                switch(resp){
                
            case 0:
             //Saindo da execução.
                System.exit(resp);
                break;
            case 1:
            //Adiciona Produtos.
                p1 = p1.CriarProdutos();
                cadastroProduto.add(p1);
                System.out.println("Produto adicionado!");
                break;
           
            case 2:
            //Exibindo Produtos
               listaProdutos();
               break;
            case 3:
            //Apagando Funcionario 
               apagarProduto();
               break;
            case 4:
            //Buscar Produtos
                buscarProdutoDesc();
                break;
            case 5:
            //Buscar Produtos pelo preço
                buscarProdutoPreco();
                break;
            case 6:
            //Buscar Produtos pela cor
                buscarCor();
                break;
            case 7:
            //Exibi produto mais barato
                ProdutoBarato();
                break;
            case 8:
            //Exibi produto mais caro
                ProdutoCaro();
                break;
            case 9:
            //Exibi média de preços dos carros
                System.out.println("A media dos precos dos carros: " + MediaPrecos());
		break;
            case 10:
            //Exibi produto com o valor acima da média
                PrdtsAcimaMediaPreco();
                }
            if (result == 0) {
                System.exit(result);
                break;
            }
                System.out.println("Digite 0 para sair das opcoes dos Funcionarios e 1 para continuar");
                deci3 = entrada1.nextInt();
            }
            
         
    }
  
   
 }
}
    //===============================Lista de Cliente==========================//
    private static void listaCliente() {
    for (Cliente c : listaCliente) {
    c.exibir();
    System.out.print("Numero do Cliente: " + listaCliente.indexOf(c) + "\n");
    }
    }
    //===============================Apagar Cliente==========================//
    private static void apagarCliente(){ 
    Scanner entrada2 = new Scanner(System.in);
    Cliente c1 = new Cliente();
    
    System.out.println("Digite 1 se deseja remover por nome e 2 se deseja remover por índice");
    int apagar = entrada2.nextInt();
    switch (apagar) {                                  
     case 1:
        System.out.println("Digite o nome que deseja remover");
        String Nome = entrada2.next();
        // Removendo alguém:
        for (Cliente c : listaCliente) {
        if (c.getNome().equals(Nome)) {
        // Encontrou uma pessoa cadastrada com nome.        
        // Remove.
        listaCliente.remove(c);
        // Sai do loop.
        break;
          }
        }
        break;
     case 2: 
        System.out.println("Digite o indice do cliente a ser apagado: ");
        int indice= entrada2.nextInt();
        
        while (indice > listaCliente.size() || indice < 0) {
        System.out.println("Numero de cliente invalido...");
        System.out.println("\nDigite novamente o numero do cliente: ");
        indice = entrada2.nextInt();
        }
        listaCliente.remove(indice);
        break;
        default:
        System.out.println("Opcao invalida");
        break; 
    }
    }
   //==============================Buscar Cliente================================//
    private static void buscarCliente() {
    Scanner entrada3 = new Scanner(System.in);    
    
    System.out.println("Para realizar a busca, digite, no minimo parte do nome do cliente: ");
    String busccliIniciais = entrada3.next();
        for (Cliente c : listaCliente) {
            if (c.getNome().startsWith(busccliIniciais)) {
            c.exibir();
            }
    }
 }
    //==============================Buscar Cliente mais velho================================//
    private static void clienteMaisVelho(){
     Cliente clienteMaisVelho = listaCliente.get(0);
        for (Cliente c : listaCliente) {
        if (clienteMaisVelho.getIdade() < c.getIdade()) {
        c.exibir();        
        }
        else{
            clienteMaisVelho.exibir();
        }
    }
   }
    //==============================Buscar cliente Mais Novo================================//
    private static void clienteMaisNovo(){
    Cliente clienteMaisNovo = listaCliente.get(0);
        for (Cliente c : listaCliente) {
        if (clienteMaisNovo.getIdade() > c.getIdade()) {
        c.exibir();
        }else{
        clienteMaisNovo.exibir();
        }
    }
}
    //==============================Buscar cliente com a idade maior que 60================================//
    private static int ClientesMaisSessenta() {
    int ClientesMaisSessenta = 0;
    for (Cliente c : listaCliente) {
	if (c.getIdade() > 60) {
	ClientesMaisSessenta++;
	}
	}
	return ClientesMaisSessenta;
	}
    //==============================Buscar cliente com a idade maior que 18================================//
    private static int ClientesMaisDezoito() {
    int ClientesMaisDezoito = 0;
    for (Cliente c : listaCliente) {
	if (c.getIdade() > 18) {
	ClientesMaisDezoito++;
	}
        }
         return ClientesMaisDezoito;
	}
    //==============================Media das idades dos clientes================================//
    private static int naMediaIdade() {
    int mediaIdade = 0;
    for (Cliente c : listaCliente) {
	mediaIdade += c.getIdade();
	}
	mediaIdade = mediaIdade / listaCliente.size();
	return mediaIdade;
	}
    //===============================Lista de Funcionarios==========================//
    private static void listaFuncionario() {
    for (Funcionario c : cadastroFuncionarios) {
    c.exibir();
    System.out.print("Numero do Funcionario: " + cadastroFuncionarios.indexOf(c) + "\n");
    }
    }
     //===============================Apagar Funcionario==========================//
    private static void apagarFuncionario(){ 
    Scanner entrada2 = new Scanner(System.in);
    Funcionario f2 = new Funcionario();
    
    System.out.println("Digite 1 se deseja remover por nome e 2 se deseja remover por índice");
    int apagar = entrada2.nextInt();
    switch (apagar) {                                  
     case 1:
        System.out.println("Digite o nome que deseja remover");
        String Nome = entrada2.next();
        // Removendo alguém
        for (Funcionario f : cadastroFuncionarios) {
        if (f.getNome().equals(Nome)) {
        // Encontrou uma pessoa cadastrada com nome.
        // Remove.
        cadastroFuncionarios.remove(f);
        // Sai do loop.
        break;
          }
        }
        break;
     case 2: 
        System.out.println("Digite o indice do funcionario a ser apagado: ");
        int indice = entrada2.nextInt();
        
        while (indice > cadastroFuncionarios.size() || indice < 0) {
        System.out.println("Numero de funcionario invalido...");
        System.out.println("\nDigite novamente o numero do funcionario: ");
        indice = entrada2.nextInt();
        }
        cadastroFuncionarios.remove(indice);
        break;
        default:
        System.out.println("Opcao invalida");
        break; 
    }
    }
    //==============================Buscar Funcionario================================//
    private static void buscarFuncionario() {
    Scanner entrada3 = new Scanner(System.in);    
    
    System.out.println("Para realizar a busca, digite, no minimo parte do nome do funcionario: ");
    String busccliIniciais = entrada3.next();
        for (Funcionario f : cadastroFuncionarios) {
            if (f.getNome().startsWith(busccliIniciais)) {
            f.exibir();
            }
    }
 }
    //==============================Buscar funcionario mais velho================================//
    private static void FuncionarioMaisVelho(){
     Funcionario FuncionarioMaisVelho = cadastroFuncionarios.get(0);
        for (Funcionario f : cadastroFuncionarios) {
        if (FuncionarioMaisVelho.getIdade() < f.getIdade()) {
        f.exibir();        
        }
        else{
            FuncionarioMaisVelho.exibir();
        }
    }
   }
    //==============================Buscar Funcionario Mais Novo================================//
    private static void FuncioanrioMaisNovo(){
    Funcionario FuncionarioMaisNovo = cadastroFuncionarios.get(0);
        for (Funcionario f : cadastroFuncionarios) {
        if (FuncionarioMaisNovo.getIdade() < f.getIdade()) {
        FuncionarioMaisNovo.exibir();
        }else{
        f.exibir();}
    }
}
    //==============================Buscar Funcionario com a idade maior que 60================================//
    private static int FuncionarioMaisSessenta() {
    int FuncionarioMaisSessenta = 0;
    for (Funcionario f : cadastroFuncionarios) {
	if (f.getIdade() > 60) {
	FuncionarioMaisSessenta++;
	}
	}
	return FuncionarioMaisSessenta;
	}
    //==============================Buscar Funcionario com a idade maior que 18================================//
    private static int FuncionarioMaisDezoito() {
    int FuncionarioMaisDezoito = 0;
    for (Funcionario f : cadastroFuncionarios) {
	if (f.getIdade() > 18) {
	FuncionarioMaisDezoito++;
	}
        }
         return FuncionarioMaisDezoito;
	}
    //==============================Media das idades dos Funcionarios================================//
    private static int FuncionarioMediaIdade() {
    int mediaIdade = 0;
    for (Funcionario f : cadastroFuncionarios) {
	mediaIdade += f.getIdade();
	}
	mediaIdade = mediaIdade / cadastroFuncionarios.size();
	return mediaIdade;
	}
    //===============================Lista de Produtos==========================//
    private static void listaProdutos() {
    for (Produtos p : cadastroProduto) {
    p.exibir();
    System.out.print("Numero do Produto: " + cadastroProduto.indexOf(p) + "\n");
    }
    }
    //===============================Apagar Produto==========================//
    private static void apagarProduto(){ 
    Scanner entrada2 = new Scanner(System.in);
    Produtos p1 = new Produtos();
    
    System.out.println("Digite 1 se deseja remover por nome e 2 se deseja remover por índice");
    int apagar = entrada2.nextInt();
    switch (apagar) {                                  
     case 1:
        System.out.println("Digite o nome do Produto que deseja remover");
        String Nome = entrada2.next();
        
        // Removendo Produto:
        for (Produtos p : cadastroProduto) {
        if (p.getNome().equals(Nome)) {
        // Encontrou um Produto cadastrada com nome.
        // Remove.
        cadastroProduto.remove(p);
        // Sai do loop.
        break;
          }
        }
        break;
     case 2: 
        System.out.println("Digite o indice do produto a ser apagado: ");
        int indice = entrada2.nextInt();
        
        while (indice > cadastroProduto.size() || indice < 0) {
        System.out.println("Numero de Produto invalido...");
        System.out.println("\nDigite novamente o numero do produto: ");
        indice = entrada2.nextInt();
        }
        cadastroFuncionarios.remove(indice);
        break;
        default:
        System.out.println("Opcao invalida");
        break; 
    }
    }
    //===============================Buscar Produto pela descrição==========================//
    private static void buscarProdutoDesc() {
	Scanner entrada = new Scanner(System.in);
        System.out.println("Para realizar a busca, digite, no minimo, parte da descricao da planta: ");
	String produtoIniciais = entrada.next();
	
        for (Produtos p : cadastroProduto) {
            if (p.getDescricao().startsWith(produtoIniciais)) {
            p.exibir();
            }
	}
	}
    //===============================Buscar Produto pelo preço==========================//
    private static void buscarProdutoPreco() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Para realizar a busca digite o preco da planta: ");
	double produtoPreco = entrada.nextDouble();
	for (Produtos p : cadastroProduto) {
            if (p.getPreco() == produtoPreco) {
            p.exibir();
            }
	}
	}
    //===============================Buscar Produto pela cor==========================//
    private static void buscarCor() {
	Scanner entrada = new Scanner(System.in);
        System.out.println("Para realizar a busca digite a cor:");
	String cor = entrada.next();
	entrada.nextLine();
        for (Produtos p : cadastroProduto) {
            if (p.getCor().startsWith(cor)) {
            p.exibir();
            }
	}
	}
    //===============================Mostrar produto mais barato==========================//
    private static void ProdutoBarato() {
	Produtos prodMaisBarato = cadastroProduto.get(0);
	for (Produtos p : cadastroProduto) {
            if (prodMaisBarato.getPreco() > p.getPreco()) {
            prodMaisBarato = p;
            }
	}
	prodMaisBarato.exibir();
	}
    //===============================Mostrar produto mais caro==========================//
    private static void ProdutoCaro() {
	Produtos prodMaisCaro = new Produtos();
        for (Produtos p : cadastroProduto) {
            if (prodMaisCaro.getPreco() < p.getPreco()) {
            prodMaisCaro = p;
            }
            }
          prodMaisCaro.exibir();
	}
    //===============================Media dos preços==========================//
    private static double MediaPrecos() {
	double mediaPrecos = 0;
        for (Produtos p : cadastroProduto) {
	mediaPrecos += p.getPreco();
	}
        mediaPrecos = mediaPrecos / cadastroProduto.size();
	return mediaPrecos;
	}
    //===============================Produtos acima da média==========================//
    private static void PrdtsAcimaMediaPreco() {
	for (Produtos p : cadastroProduto) {
            if (p.getPreco() > MediaPrecos()) {
            p.exibir();
            }
            }
	}
}
