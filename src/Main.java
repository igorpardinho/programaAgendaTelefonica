import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        while (true) {
            System.out.println("1 - Para cadastrar contato / 2 - Para listar todos os contatos /" + " 3 - Para buscar um contato pelo nome / Ou qualquer outro para encerrar o programa");
            Scanner sc = new Scanner(System.in);
            int digito = sc.nextInt();

            if (digito == 1) {
                Contato contato = new Contato();
                sc = new Scanner(System.in);
                System.out.println("Digite o nome: ");
                String nome = sc.nextLine();
                System.out.println("Digite o telefone: ");
                String idade = sc.nextLine();
                contato.setName(nome);
                contato.setTelefone(idade);
                agenda.contatos.add(contato);
            } else if (digito == 2) {
                agenda.getContatos();
            } else if (digito == 3) {
                sc = new Scanner(System.in);
                System.out.println("Digite o nome para realizar a busca: ");
                String nome = sc.nextLine();
                agenda.getContato(nome);
            } else {
                break;
            }
        }

    }
}