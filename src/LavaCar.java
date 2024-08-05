import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LavaCar {
    private List<Cliente> clientes;
    private List<Servico> servicos;
    private List<Agendamento> agendamentos;

    public LavaCar() {
        this.clientes = new ArrayList<>();
        this.servicos = new ArrayList<>();
        this.agendamentos = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void adicionarServico(Servico servico) {
        servicos.add(servico);
    }

    public void agendarServico(Cliente cliente, Servico servico, Date data) {
        Agendamento agendamento = new Agendamento(cliente, servico, data);
        agendamentos.add(agendamento);
    }

    public List<Agendamento> getHistoricoAgendamentos() {
        return agendamentos;
    }
}
