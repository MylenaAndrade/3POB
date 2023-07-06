import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        int opcao = 0;
        int id=0;
        String nome, endereco, postalCode, pais, cpf, passaporte,dtNascimento;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Digite: \n[1]Inserir\n[2]Remover\n[3]Alterar\n[4]Listar\n[5]Sair");
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Digite o id: ");
                    id = sc.nextInt();
                    System.out.println("Digite o seu Nome: ");
                    nome = sc.next();
                    System.out.println("Endereço: ");
                    endereco = sc.next();
                    System.out.println("Código Postal: ");
                    postalCode = sc.next();
                    System.out.println("País: ");
                    pais = sc.next();
                    System.out.println("CPF: ");
                    cpf = sc.next();
                    System.out.println("Passaporte: ");
                    passaporte = sc.next();
                    System.out.println("Data de Nascimento: ");
                    dtNascimento = sc.next();

                    Cliente cliente = new Cliente(id, nome, endereco, postalCode, pais, cpf, passaporte, dtNascimento);
                    CRUD.ClienteInserir(clientes,cliente);
                    break;
                case 2:
                    System.out.println("Digite o id do Cliente que deseja remover: ");
                    id = sc.nextInt();
                    CRUD.ClienteRemover(clientes,id);;
                    break;
                case 3:
                    System.out.println("Digite o id do Cliente que deseja alterar: ");
                    id = sc.nextInt();
                    System.out.println("DIGITE NULL SE DESEJA NÃO ALTERAR UM ATRIBUTO!");
                    System.out.println("Digite o Nome: ");
                    nome = sc.next();
                    System.out.println("Endereço: ");
                    endereco = sc.next();
                    System.out.println("Código Postal: ");
                    postalCode = sc.next();
                    System.out.println("País: ");
                    pais = sc.next();
                    System.out.println("CPF: ");
                    cpf = sc.next();
                    System.out.println("Passaporte: ");
                    passaporte = sc.next();
                    System.out.println("Data de Nascimento: ");
                    dtNascimento = sc.next();
                    CRUD.ClienteAlterar(clientes,id,nome,endereco,postalCode,pais,cpf,passaporte,dtNascimento);
                    break;
                case 4:
                    CRUD.ClienteListar(clientes);
                    break;
                default:
                    break;
            }
        }while (opcao != 5);
    }
}
