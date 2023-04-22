import java.util.ArrayList;
import java.util.List;

public class Agenda {
    List<Contato> contatos = new ArrayList<>();

    public void getContato(String name){
        if(contatos.isEmpty()) System.out.println("Sem contatos adicionados");
        for(Contato c: contatos){
            if(c.getName().equals(name)){
                System.out.println(c);
            } else if(!c.getName().equals(name)){
                System.out.println("Contato nao encontrado");
                break;
            }
        }
    }
    public void getContatos(){
        if(contatos.isEmpty()) System.out.println("Sem contatos adicionados");
        for (Contato c:contatos){
            System.out.println(c);
        }
    }

}
