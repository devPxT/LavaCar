import java.text.SimpleDateFormat;
import java.util.Date;

public class Agendamento {
    private Cliente cliente;
    private Servico servico;
    private Date data;

    public Agendamento(Cliente cliente, Servico servico, Date data) {
        this.cliente = cliente;
        this.servico = servico;
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Servico getServico() {
        return servico;
    }

    public Date getData() {
        return data;
    }

    public void imprimirDescricao() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        System.out.println("Agendamento para o cliente:");
        cliente.imprimirDescricao();
        System.out.print("Serviço agendado: ");
        servico.imprimirDescricao();
        System.out.println("Data: " + sdf.format(data));
    }
}
