import java.util.ArrayList;
import java.util.List;

public class Agenda {
    List<Contato> contatos = new ArrayList<>();

    public void getContato(String name) {
        if (contatos.isEmpty()) {
            System.out.println("Sem contatos adicionados");
        }


        int i = 0;
        int contador = 0;
        while (i < contatos.size()) {

            if (contatos.get(i).getName().equals(name)) {
                System.out.println(contatos.get(i));
                break;
            } else {
                contador++;
            }
            i++;
            if (contador >= 2) {
                System.out.println("Usuario não cadastrado");
            }

        }


    }


    public void getContatos() {
        if (contatos.isEmpty()) System.out.println("Sem contatos adicionados");
        for (Contato c : contatos) {
            System.out.println(c);
        }
    }


}
