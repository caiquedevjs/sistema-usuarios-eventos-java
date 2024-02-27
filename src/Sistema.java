import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sistema {
    private List<Usuario> usuarios;
    private List<Evento> eventos;
    private int momento;

    public Sistema() {
        this.usuarios = new ArrayList<>();
        this.eventos = new ArrayList<>();
        this.momento = java.time.LocalDateTime.now().getHour();
    }

    public void criarEvento(Evento evento) {
        eventos.add(evento);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void ordenarEventosPorProximidade() {
        Collections.sort(eventos, (eventoA, eventoB) -> {
            int diffA = Math.abs(eventoA.getHorario() - momento);
            int diffB = Math.abs(eventoB.getHorario() - momento);
            return Integer.compare(diffA, diffB);
        });
    }

    public void imprimirEventosOrdenadosPorProximidade() {
        ordenarEventosPorProximidade();
        eventos.forEach(evento -> {
            System.out.println("Nome: " + evento.getNome() + " | Horário: " + evento.getHorario());
        });
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public int getMomento() {
        return momento;
    }
}
