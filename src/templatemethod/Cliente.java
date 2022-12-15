package templatemethod;

public abstract class Cliente {
  private String cpf;
  protected String nome;
  private float saldo;

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public float getSaldo() {
    return saldo;
  }

  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }

  public abstract String verificarSaldoParaDebitoAutomatico();

  public String getTipo() {
    return "Plano Básico";
  }

  public String getInfo() {
    return getTipo() + ":" +
            " cliente = " + this.nome +
            ", realizar débito automático = " + this.verificarSaldoParaDebitoAutomatico();
  }
}
