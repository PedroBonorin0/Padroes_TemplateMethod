package test;

import org.junit.jupiter.api.Test;
import templatemethod.ClientePlanoBasico;
import templatemethod.ClientePlanoMedio;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClientePlanoMedioTest {
  @Test
  void deveRetonarPagamentoEfetuado() {
    ClientePlanoMedio cliente = new ClientePlanoMedio();
    cliente.setSaldo(31);
    assertEquals("Pagamento Realizado", cliente.verificarSaldoParaDebitoAutomatico());
  }

  @Test
  void deveRetonarPagamentoBloqueado() {
    ClientePlanoMedio cliente = new ClientePlanoMedio();
    cliente.setSaldo(10f);
    assertEquals("Saldo Insuficiente", cliente.verificarSaldoParaDebitoAutomatico());
  }

  @Test
  void deveRetornarInformacoes() {
    ClientePlanoMedio cliente = new ClientePlanoMedio();
    cliente.setSaldo(100f);
    cliente.setCpf("123.432.123-54");
    cliente.setNome("Pedro");
    String texto = "Plano Médio: cliente = Pedro, realizar débito automático = Pagamento Realizado";
    assertEquals(texto, cliente.getInfo());
  }
}