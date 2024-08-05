import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        LavaCar lavaCar = new LavaCar();

        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00", "98765-4321");
        Cliente cliente2 = new Cliente("Maria Oliveira", "987.654.321-00", "12345-6789");

        lavaCar.adicionarCliente(cliente1);
        lavaCar.adicionarCliente(cliente2);

        Servico servico1 = new Servico("Lavagem Simples", 30.0);
        Servico servico2 = new Servico("Lavagem Completa", 50.0);

        lavaCar.adicionarServico(servico1);
        lavaCar.adicionarServico(servico2);

        lavaCar.agendarServico(cliente1, servico1, new Date());
        lavaCar.agendarServico(cliente2, servico2, new Date());

        for (Agendamento agendamento : lavaCar.getHistoricoAgendamentos()) {
            agendamento.imprimirDescricao();
            System.out.println();
        }
    }
}