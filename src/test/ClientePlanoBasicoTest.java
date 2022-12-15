package test;

import org.junit.jupiter.api.Test;
import templatemethod.ClientePlanoBasico;

import static org.junit.jupiter.api.Assertions.*;

class ClientePlanoBasicoTest {
  @Test
  void deveRetonarPagamentoEfetuado() {
    ClientePlanoBasico cliente = new ClientePlanoBasico();
    cliente.setSaldo(30f);
    assertEquals("Pagamento Realizado", cliente.verificarSaldoParaDebitoAutomatico());
  }

  @Test
  void deveRetonarPagamentoBloqueado() {
    ClientePlanoBasico cliente = new ClientePlanoBasico();
    cliente.setSaldo(10f);
    assertEquals("Saldo Insuficiente", cliente.verificarSaldoParaDebitoAutomatico());
  }

  @Test
  void deveRetornarInformacoes() {
    ClientePlanoBasico cliente = new ClientePlanoBasico();
    cliente.setSaldo(40f);
    cliente.setCpf("123.432.123-54");
    cliente.setNome("Pedro");
    String texto = "Plano Básico: cliente = Pedro, realizar débito automático = Pagamento Realizado";
    assertEquals(texto, cliente.getInfo());
  }
}