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
        Consulta consulta = new Consulta(1,6,2022,chahua);
        Assert.assertEquals(consulta.isOlder(), 1);

    }

    @Test
    public void test2(){
        User chahua = new User(29,3,2001);
        Consulta consulta = new Consulta(4,3,2019,chahua);
        Assert.assertEquals(consulta.isOlder(), 0);

    }
  
}
