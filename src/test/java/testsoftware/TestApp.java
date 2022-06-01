package testsoftware;
import java.time.DateTimeException;

import org.testng.Assert;
import org.testng.annotations.Test;

import software.Consulta;
import software.User;
public class TestApp {
    @Test
    public void testOlder(){
        User chahua = new User(29,3,2001);
        User chahua1 = new User(12,4,2004);
        User chahua2 = new User(1,6,2004);
        User chahua3 = new User(2,7,1999);
        Consulta consulta = new Consulta(1,6,2022,chahua);
        Consulta consulta1 = new Consulta(1,6,2022,chahua1);
        Consulta consulta2 = new Consulta(1,6,2022,chahua2);
        Consulta consulta3 = new Consulta(1,5,2022,chahua2);
        Consulta consulta4 = new Consulta(4,3,2019,chahua);
        Consulta consulta5 = new Consulta(1,6,2022,chahua3);
        Consulta consulta6 = new Consulta(1,6,2020,chahua3);
        Consulta consulta7 = new Consulta(1,6,2005,chahua3);
        Assert.assertEquals(consulta.isOlder(), 1);
        Assert.assertEquals(consulta1.isOlder(), 1);
        Assert.assertEquals(consulta2.isOlder(), 1);
        Assert.assertEquals(consulta3.isOlder(), 0);
        Assert.assertEquals(consulta4.isOlder(), 0);
        Assert.assertEquals(consulta5.isOlder(), 1);
        Assert.assertEquals(consulta6.isOlder(), 1);
        Assert.assertEquals(consulta7.isOlder(), 0);

    }

    @Test(expectedExceptions = DateTimeException.class)
    public void testFormato(){
        //test exceptions
        User chahua = new User(29,3,999);
        User chahua1 = new User(29,3,2023);
        User chahua2 = new User(5,13,2022);
        User chahua3 = new User(5,1,1000);
        User chahua4 = new User(0,1,2020);
        User chahua5 = new User(34,1,2020);
        Consulta consulta = new Consulta(1,6,2020,chahua);
        Consulta consulta1 = new Consulta(1,34,10000,chahua1);
        Consulta consulta2 = new Consulta(1,10,2019,chahua2);
        Consulta consulta3 = new Consulta(1,10,2019,chahua3);
        Consulta consulta4 = new Consulta(1,10,2019,chahua4);
        Consulta consulta5 = new Consulta(1,10,2019,chahua5);
        consulta.correctoFormato();
        consulta1.correctoFormato();
        consulta2.correctoFormato();
        consulta3.correctoFormato();
        consulta4.correctoFormato();
        consulta5.correctoFormato();

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

    @Test(expectedExceptions = DateTimeException.class)
    public void testNacimiento(){
        User chahua = new User(29,3,2001);
        User chahua1 = new User(29,3,2010);
        Consulta consulta = new Consulta(4,3,2000,chahua);
        Consulta consulta1 = new Consulta(4,2,2010,chahua1);
        consulta.anteriorNacimiento();
        consulta1.anteriorNacimiento();

    }
  
}
