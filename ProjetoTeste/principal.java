package maven.connectSqlEclipse;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        DAO dao = new DAO();
        dao.conectar();

        Scanner scanner = new Scanner(System.in);

        int escolha;

        do {
            System.out.println("===== Menu =====");
            System.out.println("1. Listar Clientes");
            System.out.println("2. Inserir Cliente");
            System.out.println("3. Excluir Cliente");
            System.out.println("4. Atualizar Cliente");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    // Listar clientes
                    System.out.println("==== Mostrar clientes === ");
                    Cliente[] clientes = dao.getClientes();
                    for (int i = 0; i < clientes.length; i++) {
                        System.out.println(clientes[i].toString());
                    }
                    break;

                case 2:
                    // Inserir cliente
                    // Código de inserção de cliente
                    break;

                case 3:
                    // Excluir cliente
                    // Código de exclusão de cliente
                    break;

                case 4:
                    // Atualizar cliente
                    // Código de atualização de cliente
                    break;
            }

        } while (escolha != 5);

        scanner.close();
        dao.close();
    }
}
