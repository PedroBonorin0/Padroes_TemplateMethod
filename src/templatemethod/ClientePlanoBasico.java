package templatemethod;

public class ClientePlanoBasico extends Cliente{

  @Override
  public String verificarSaldoParaDebitoAutomatico() {
    return this.getSaldo() >= 20f? "Pagamento Realizado" : "Saldo Insuficiente";
  }
}
