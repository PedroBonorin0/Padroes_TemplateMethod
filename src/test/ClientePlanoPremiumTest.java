package test;

import org.junit.jupiter.api.Test;
import templatemethod.ClientePlanoMedio;
import templatemethod.ClientePlanoPremium;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClientePlanoPremiumTest {
  @Test
  void deveRetonarPagamentoEfetuado() {
    ClientePlanoPremium cliente = new ClientePlanoPremium();
    cliente.setSaldo(41f);
    assertEquals("Pagamento Realizado", cliente.verificarSaldoParaDebitoAutomatico());
  }

  @Test
  void deveRetonarPagamentoBloqueado() {
    ClientePlanoPremium cliente = new ClientePlanoPremium();
    cliente.setSaldo(10f);
    assertEquals("Saldo Insuficiente", cliente.verificarSaldoParaDebitoAutomatico());
  }

  @Test
  void deveRetornarInformacoes() {
    ClientePlanoPremium cliente = new ClientePlanoPremium();
    cliente.setSaldo(100f);
    cliente.setCpf("123.432.123-54");
    cliente.setNome("Pedro");
    String texto = "Plano Premium: cliente = Pedro, realizar débito automático = Pagamento Realizado";
    assertEquals(texto, cliente.getInfo());
  }
}