import junit.framework.TestCase;

public class AveTest extends TestCase {
  
  private Ave pepita;
  
  public void setUp() {
    this.pepita = new Ave();
  }

  public void testAlVolarPierdeEnergia() {
    pepita.volar();
    assertEquals(50, pepita.energia());
  }
  
  public void testAlComerGanaEnergia() {
    pepita.comer();
    assertEquals(120, pepita.energia());
  }
  
}
