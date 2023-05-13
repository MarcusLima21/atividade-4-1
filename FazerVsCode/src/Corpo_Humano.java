public class Corpo_Humano {
  private float massa;
  private float imc;
  private float altura;

  public Corpo_Humano(float massa, float altura) {
    this.massa = massa;
    this.altura = altura;
    imc = massa / altura;

  }

  public float GetMassa() {
    return massa;
  }

  public float Getaltura() {
    return altura;
  }

  public float Getimc() {
    return imc;
  }

  public void SetMassa(float massa) {
    this.massa = massa;
    imc = massa / altura;
  }

  public void Setaltura(float altura) {
    this.altura = altura;
    imc = massa / altura;
  }
}