import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CirculoTest {
    Circulo circulo1, circulo2;

    @BeforeEach
    void doBefore() {
        circulo1 = new Circulo(2.0);
        circulo2 = new Circulo(5.0);
    }
    @Test
    void calcularPerimetro() {

        System.out.println(circulo1.calcularPerimetro());
        System.out.println(circulo2.calcularPerimetro());

    }

}