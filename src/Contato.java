

public class Contato {
    private String name;
    private String telefone;
    private int id;
    private static int contador;

    public Contato() {
        contador++;
        this.id += contador;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", telefone='" + telefone + '\'' +
                        ", id=" + id;
    }


}
