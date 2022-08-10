import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FlyweightFactoryTest {

    @Test
    void getTriangulo() {
        Triangulo triangulo = FlyWeightFactory.obterTriangulo("vermelho");
        triangulo.setTamanho(2);
        var triangulo1 = FlyWeightFactory.obterTriangulo("vermelho");
        triangulo1.setTamanho(4);

        assertEquals(triangulo.getCor(), "vermelho");
        assertEquals(triangulo1.getTamanho(),4);
        assertEquals(FlyWeightFactory.trianguloMap.size()==1,true);
    }
}
