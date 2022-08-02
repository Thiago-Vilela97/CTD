import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QuadradoTest {

    Quadrado quadrado1, quadrado2;

    @BeforeEach
    void doBefore() {
        quadrado1 = new Quadrado(4.0);
        quadrado2 = new Quadrado(6.0);
    }

    @Test
    void calcularPerimetro() {
        System.out.println(quadrado1.calcularPerimetro());
        System.out.println(quadrado2.calcularPerimetro());
    }
}