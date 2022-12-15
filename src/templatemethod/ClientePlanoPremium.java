package templatemethod;

public class ClientePlanoPremium extends Cliente{

  @Override
  public String verificarSaldoParaDebitoAutomatico() {
    return this.getSaldo() >= 40f? "Pagamento Realizado" : "Saldo Insuficiente";
  }

  @Override
  public String getTipo() {
    return "Plano Premium";
  }
}
