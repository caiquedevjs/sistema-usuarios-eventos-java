import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nomeUsuario;
    private int idade;
    private String genero;
    private List<Evento> listaEventosParticipados;

    public Usuario(String nomeUsuario, int idade, String genero) {
        this.nomeUsuario = nomeUsuario;
        this.idade = idade;
        this.genero = genero;
        this.listaEventosParticipados = new ArrayList<>();
    }

    public void participarEvento(String nomeEvento, Sistema sistema) {
        Evento evento = sistema.getEventos().stream().filter(e -> e.getNome().equals(nomeEvento)).findFirst().orElse(null);
        if (evento != null) {
            listaEventosParticipados.add(evento);
            System.out.println("O usuário " + nomeUsuario + " foi cadastrado no evento " + nomeEvento);
        } else {
            System.out.println("Evento " + nomeEvento + " não encontrado.");
        }
    }

    public void cancelarEventos(String nomeEvento) {
        listaEventosParticipados.removeIf(evento -> evento.getNome().equals(nomeEvento));
    }

    public void consultarEventos() {
        listaEventosParticipados.forEach(System.out::println);
    }
    public void consultarHorarioEventos() {
        Sistema sistema = new Sistema(); 
        sistema.getEventos().forEach(evento -> {
            if (evento.getHorario() < sistema.getMomento()) {
                System.out.println("O evento " + evento.getNome() + " já ocorreu.");
            } else if (evento.getHorario() == sistema.getMomento()) {
                System.out.println("O evento " + evento.getNome() + " está ocorrendo neste momento.");
            } else if (evento.getHorario() > sistema.getMomento()) {
                String horarioEvento = evento.getHorario() < 10 ? "0" + evento.getHorario() + ":00" : evento.getHorario() + ":00";
                System.out.println("O evento " + evento.getNome() + " ainda vai ocorrer às " + horarioEvento + ".");
            }
        });
    }
    
    @Override
    public String toString() {
        return "Usuario{" +
                "nomeUsuario='" + nomeUsuario + '\'' +
                ", idade=" + idade +
                ", genero='" + genero + '\'' +
                ", listaEventosParticipados=" + listaEventosParticipados +
                '}';
    }
}
