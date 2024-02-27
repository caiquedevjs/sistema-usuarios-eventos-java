public class App {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        
        sistema.criarEvento(new Evento("Evento1", "Categoria1", "Descricao1", 10, "Endereco1"));
        sistema.criarEvento(new Evento("Evento2", "Categoria2", "Descricao2", 12, "Endereco2"));
        sistema.criarEvento(new Evento("Evento3", "Categoria3", "Descricao3", 15, "Endereco3"));

        Usuario alice = new Usuario("Alice", 25, "Feminino");
        Usuario bob = new Usuario("Bob", 30, "Masculino");
        sistema.adicionarUsuario(alice);
        sistema.adicionarUsuario(bob);

        
        alice.participarEvento("Evento1", sistema);
        alice.participarEvento("Evento2", sistema);
        sistema.imprimirEventosOrdenadosPorProximidade();
        alice.consultarEventos();
        alice.cancelarEventos("Evento1");
        alice.consultarHorarioEventos();
    }
}
