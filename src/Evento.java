public class Evento {
    private String nome;
    private String categoria;
    private String descricao;
    private int horario;
    private String endereco;

    public Evento(String nome, String categoria, String descricao, int horario, String endereco) {
        this.nome = nome;
        this.categoria = categoria;
        this.descricao = descricao;
        this.horario = horario;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public int getHorario() {
        return horario;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                ", descricao='" + descricao + '\'' +
                ", horario=" + horario +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
