import model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    List<Cliente> clientesDoSistema = new ArrayList<>();

    public void criarCliente(Cliente cliente) {
        clientesDoSistema.add(cliente);
    }

    public Cliente getClientePorCPF(String cpf) {
        Cliente cliente = null;

        for (Cliente getCliente : clientesDoSistema) {
            if (cpf.equals(getCliente.getCpf())) {
                cliente = getCliente;
            }

        }

        return cliente;
    }

    public void exibirSaldo(String cpf) {
        Cliente cliente = getClientePorCPF(cpf);

        System.out.println("Saldo da Conta: R$" + cliente.getConta().getSaldo());
    }
}
