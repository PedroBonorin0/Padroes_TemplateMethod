package templatemethod;

public class ClientePlanoMedio extends Cliente{

  @Override
  public String verificarSaldoParaDebitoAutomatico() {
    return this.getSaldo() >= 30f? "Pagamento Realizado" : "Saldo Insuficiente";
  }

  @Override
  public String getTipo() {
    return "Plano Médio";
  }
}
