package testsoftware;
import java.time.DateTimeException;
import java.util.zip.DataFormatException;

import org.testng.Assert;
import org.testng.annotations.Test;

import software.Consulta;
import software.User;
public class TestApp {
    @Test
    public void test1(){
        User chahua = new User(29,3,2001);
        User chahua1 = new User(12,4,2004);
        User chahua2 = new User(1,6,2004);
        Consulta consulta = new Consulta(1,6,2022,chahua);
        Consulta consulta1 = new Consulta(1,6,2022,chahua1);
        Consulta consulta2 = new Consulta(1,6,2022,chahua2);
        Consulta consulta3 = new Consulta(1,5,2022,chahua2);
        Assert.assertEquals(consulta.isOlder(), 1);
        Assert.assertEquals(consulta1.isOlder(), 1);
        Assert.assertEquals(consulta2.isOlder(), 1);
        Assert.assertEquals(consulta3.isOlder(), 0);

    }

    @Test
    public void test2(){
        User chahua = new User(29,3,2001);
        Consulta consulta = new Consulta(4,3,2019,chahua);
        Assert.assertEquals(consulta.isOlder(), 0);

    }

    @Test
    public void testFechas(){
        User chahua = new User(29,3,2001);
        Consulta consulta = new Consulta(4,3,2019,chahua);
        Assert.assertEquals(chahua.getAnio(),2001);
        Assert.assertEquals(chahua.getDia(),29);
        Assert.assertEquals(chahua.getMes(),3);
        Assert.assertEquals(consulta.getAnio(),2019);
        Assert.assertEquals(consulta.getDia(),4);
        Assert.assertEquals(consulta.getMes(),3);

    }
  
}
