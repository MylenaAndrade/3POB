import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        int opcao1 = 0, opcao2 = 0, opcao3 = 0;
        int id=0;
        String nome, endereco, postalCode, pais, cpf, passaporte, email,dtNascimento;
        String nomeQuarto,descricao, codigoCama, posicao, descricaoCama, dtEntrada,dtSaida;
        int qtdeCamas, idQuarto, idCama, idCliente;
        boolean temBanheiro, ehBeliche;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Digite: \n[1]Acessar Clientes\n[2]Acessar Quartos\n[3]Acessar Camas\n[4]Acessar Reservas\n[5]Sair");
            opcao1 = sc.nextInt();
            switch (opcao1){
                case 1:
                    do {
                        System.out.println("Digite: \n[1]Inserir\n[2]Remover\n[3]Alterar\n[4]Listar\n[5]Sair");
                        opcao2 = sc.nextInt();
                        switch (opcao2){
                            case 1:
                                sc.nextLine();
                                System.out.println("Digite o seu Nome: ");
                                nome = sc.nextLine();
                                sc.nextLine();
                                System.out.println("Endereço: ");
                                endereco = sc.nextLine();
                                sc.nextLine();
                                System.out.println("Código Postal: ");
                                postalCode = sc.nextLine();
                                sc.nextLine();
                                System.out.println("País: ");
                                pais = sc.nextLine();
                                sc.nextLine();
                                System.out.println("CPF: ");
                                cpf = sc.nextLine();
                                sc.nextLine();
                                System.out.println("Passaporte: ");
                                passaporte = sc.nextLine();
                                sc.nextLine();
                                System.out.println("Email: ");
                                email= sc.nextLine();
                                sc.nextLine();
                                System.out.println("Data de Nascimento: ");
                                dtNascimento = sc.nextLine();


                                Cliente c = new Cliente(nome,endereco,postalCode,pais,cpf,passaporte,email,dtNascimento);

                                new CRUD().ClienteInserir(c);
                                break;
                            case 2:
                                System.out.println("Digite o id do Cliente que deseja remover: ");
                                id = sc.nextInt();

                                new CRUD().ClienteRemover(id);
                                break;
                            case 3:
                                System.out.println("Digite o id do Cliente que deseja alterar: ");
                                id = sc.nextInt();

                                do {
                                    System.out.println("Digite: \n[1]Alterar Nome\n[2]Alterar Endereco\n" +
                                            "[3]Alterar Código Postal\n[4]Alterar País\n[5]Alterar CPF\n[6]Alterar Passaporte\n" +
                                            "[7]Alterar Email\n[8]Alterar Data de Nascimento\n[9]Sair");
                                    opcao3 = sc.nextInt();

                                    switch (opcao3){
                                        case 1:
                                            sc.nextLine();
                                            System.out.println("Digite o Nome: ");
                                            nome = sc.nextLine();
                                            new CRUD().ClienteAlterar(id,nome,"nome");
                                            break;
                                        case 2:
                                            sc.nextLine();
                                            System.out.println("Endereço: ");
                                            endereco = sc.nextLine();
                                            new CRUD().ClienteAlterar(id,endereco,"endereco");
                                            break;
                                        case 3:
                                            sc.nextLine();
                                            System.out.println("Código Postal: ");
                                            postalCode = sc.next();
                                            new CRUD().ClienteAlterar(id,postalCode,"postalCode");
                                            break;
                                        case 4:
                                            sc.nextLine();
                                            System.out.println("País: ");
                                            pais = sc.nextLine();
                                            new CRUD().ClienteAlterar(id,pais,"pais");
                                            break;
                                        case 5:
                                            sc.nextLine();
                                            System.out.println("CPF: ");
                                            cpf = sc.next();
                                            new CRUD().ClienteAlterar(id,cpf,"cpf");
                                            break;
                                        case 6:
                                            sc.nextLine();
                                            System.out.println("Passaporte: ");
                                            passaporte = sc.next();
                                            new CRUD().ClienteAlterar(id,passaporte,"passaporte");
                                            break;
                                        case 7:
                                            sc.nextLine();
                                            System.out.println("Email: ");
                                            email = sc.next();
                                            new CRUD().ClienteAlterar(id,email,"email");
                                            break;
                                        case 8:
                                            sc.nextLine();
                                            System.out.println("Data de Nascimento: ");
                                            dtNascimento = sc.next();
                                            new CRUD().ClienteAlterar(id,dtNascimento,"dtNascimento");
                                            break;

                                    }
                                }while(opcao3!=9);

                                break;
                            case 4:
                                System.out.println("Digite o id do Cliente que deseja listar: ");
                                id = sc.nextInt();
                                new CRUD().ClienteListar(id);
                                break;
                        }
                    }while (opcao2 != 5);
                    break;
                case 2:
                    do {
                        System.out.println("Digite: \n[1]Inserir\n[2]Remover\n[3]Alterar\n[4]Listar\n[5]Sair");
                        opcao2 = sc.nextInt();
                        switch (opcao2){
                            case 1:
                                sc.nextLine();
                                System.out.println("Digite o Nome do quarto: ");
                                nomeQuarto = sc.nextLine();
                                sc.nextLine();
                                System.out.println("Quantidade de Camas: ");
                                qtdeCamas = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Tem banheiro?: ");
                                temBanheiro = sc.nextBoolean();
                                sc.nextLine();
                                System.out.println("Descrição: ");
                                descricao = sc.nextLine();


                                Quarto q = new Quarto(nomeQuarto,qtdeCamas,temBanheiro,descricao);

                                new CRUD().QuartoInserir(q);
                                break;
                            case 2:
                                System.out.println("Digite o id do Quarto que deseja remover: ");
                                id = sc.nextInt();

                                new CRUD().QuartoRemover(id);
                                break;
                            case 3:
                                System.out.println("Digite o id do Quarto que deseja alterar: ");
                                id = sc.nextInt();

                                do {
                                    System.out.println("Digite: \n[1]Alterar Nome\n[2]Alterar Número de Camas\n" +
                                            "[3]Alterar se tem Banheiro\n[4]Alterar Descrição\n[5]Sair");
                                    opcao3 = sc.nextInt();

                                    switch (opcao3){
                                        case 1:
                                            sc.nextLine();
                                            System.out.println("Digite o Nome: ");
                                            nome = sc.nextLine();
                                            new CRUD().QuartoAlterar(id,nome,"nome");
                                            break;
                                        case 2:
                                            sc.nextLine();
                                            System.out.println("Número de Camas: ");
                                            qtdeCamas = sc.nextInt();
                                            new CRUD().QuartoAlterar(id,String.valueOf(qtdeCamas),"qtdeCamas");

                                            break;
                                        case 3:
                                            sc.nextLine();
                                            System.out.println("Tem Banheiro: ");
                                            temBanheiro = sc.nextBoolean();
                                            new CRUD().QuartoAlterar(id,String.valueOf(temBanheiro),"temBanheiro");
                                            break;
                                        case 4:
                                            sc.nextLine();
                                            System.out.println("Descrição: ");
                                            descricao = sc.nextLine();
                                            new CRUD().QuartoAlterar(id,descricao,"descricao");
                                            break;

                                    }
                                }while(opcao3!=5);

                                break;
                            case 4:
                                System.out.println("Digite o id do Quarto que deseja listar: ");
                                id = sc.nextInt();
                                new CRUD().QuartoListar(id);
                                break;
                        }
                    }while (opcao2 != 5);
                    break;
                case 3:
                    do {
                        System.out.println("Digite: \n[1]Inserir\n[2]Remover\n[3]Alterar\n[4]Listar\n[5]Sair");
                        opcao2 = sc.nextInt();
                        switch (opcao2){
                            case 1:
                                sc.nextLine();
                                System.out.println("Digite o Código da Cama: ");
                                codigoCama = sc.nextLine();
                                sc.nextLine();
                                System.out.println("É beliche?: ");
                                ehBeliche = sc.nextBoolean();
                                sc.nextLine();
                                System.out.println("Posição: ");
                                posicao = sc.next();
                                sc.nextLine();
                                System.out.println("Descrição: ");
                                descricaoCama = sc.nextLine();


                                Cama cama = new Cama(codigoCama,ehBeliche,posicao,descricaoCama);

                                new CRUD().CamaInserir(cama);
                                break;
                            case 2:
                                System.out.println("Digite o id da Cama que deseja remover: ");
                                id = sc.nextInt();

                                new CRUD().CamaRemover(id);
                                break;
                            case 3:
                                System.out.println("Digite o id da Cama que deseja alterar: ");
                                id = sc.nextInt();

                                do {
                                    System.out.println("Digite: \n[1]Alterar Código da Cama\n[2]Alterar se é Beliche\n" +
                                            "[3]Alterar Posição\n[4]Alterar Descrição\n[5]Sair");
                                    opcao3 = sc.nextInt();

                                    switch (opcao3){
                                        case 1:
                                            sc.nextLine();
                                            System.out.println("Digite o Código da Cama: ");
                                            codigoCama = sc.next();
                                            new CRUD().CamaAlterar(id,codigoCama,"codigoCama");
                                            break;
                                        case 2:
                                            sc.nextLine();
                                            System.out.println("É Beliche?: ");
                                            ehBeliche = sc.nextBoolean();
                                            new CRUD().CamaAlterar(id,String.valueOf(ehBeliche),"qtdeCamas");

                                            break;
                                        case 3:
                                            sc.nextLine();
                                            System.out.println("Posição: ");
                                            posicao = sc.nextLine();
                                            new CRUD().CamaAlterar(id,posicao,"posicao");
                                            break;
                                        case 4:
                                            sc.nextLine();
                                            System.out.println("Descrição: ");
                                            descricao = sc.nextLine();
                                            new CRUD().CamaAlterar(id,descricao,"descricao");
                                            break;

                                    }
                                }while(opcao3!=5);

                                break;
                            case 4:
                                System.out.println("Digite o id da Cama que deseja listar: ");
                                id = sc.nextInt();
                                new CRUD().CamaListar(id);
                                break;
                        }
                    }while (opcao2 != 5);
                    break;
                case 4:
                    do {
                        System.out.println("Digite: \n[1]Inserir\n[2]Remover\n[3]Alterar\n[4]Listar\n[5]Sair");
                        opcao2 = sc.nextInt();
                        switch (opcao2){
                            case 1:
                                sc.nextLine();
                                System.out.println("Digite o ID do Quarto: ");
                                idQuarto = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Digite o ID da cama: ");
                                idCama = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Digite o ID do Cliente: ");
                                idCliente = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Digite a Data de Entrada: ");
                                dtEntrada = sc.nextLine();
                                sc.nextLine();
                                System.out.println("Digite a Data de Saída: ");
                                dtSaida = sc.nextLine();


                                Reserva reserva = new Reserva(idQuarto,idCama,idCliente,dtEntrada,dtSaida);

                                new CRUD().ReservaInserir(reserva);
                                break;
                            case 2:
                                System.out.println("Digite o id da Reserva que deseja remover: ");
                                id = sc.nextInt();

                                new CRUD().ReservaRemover(id);
                                break;
                            case 3:
                                System.out.println("Digite o id da Reserva que deseja alterar: ");
                                id = sc.nextInt();

                                do {
                                    System.out.println("Digite: \n[1]Alterar ID do Quarto\n[2]Alterar ID da Cama\n" +
                                            "[3]Alterar ID do Cliente\n[4]Alterar Data de Entrada\n[5]Alterar Data de Saída\n[6]Sair");
                                    opcao3 = sc.nextInt();

                                    switch (opcao3){
                                        case 1:
                                            sc.nextLine();
                                            System.out.println("Digite o ID do Quarto: ");
                                            idQuarto = sc.nextInt();
                                            new CRUD().ReservaAlterar(id,String.valueOf(idQuarto),"idQuarto");
                                            break;
                                        case 2:
                                            sc.nextLine();
                                            System.out.println("ID da Cama: ");
                                            idCama = sc.nextInt();
                                            new CRUD().ReservaAlterar(id,String.valueOf(idCama),"idCama");

                                            break;
                                        case 3:
                                            sc.nextLine();
                                            System.out.println("ID do Cliente: ");
                                            idCliente = sc.nextInt();
                                            new CRUD().ReservaAlterar(id,String.valueOf(idCliente),"idCliente");
                                            break;
                                        case 4:
                                            sc.nextLine();
                                            System.out.println("Data de Entrada: ");
                                            dtEntrada = sc.nextLine();
                                            new CRUD().ReservaAlterar(id,dtEntrada,"dtEntrada");
                                            break;
                                        case 5:
                                            sc.nextLine();
                                            System.out.println("Data de Saída: ");
                                            dtSaida = sc.nextLine();
                                            new CRUD().ReservaAlterar(id,dtSaida,"dtSaida");
                                            break;

                                    }
                                }while(opcao3!=6);

                                break;
                            case 4:
                                System.out.println("Digite o id da Reserva que deseja listar: ");
                                id = sc.nextInt();
                                new CRUD().ReservaListar(id);
                                break;
                        }
                    }while (opcao2 != 5);
                    break;
            }

        }while (opcao1 != 5);

    }
}
