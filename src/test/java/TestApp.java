import java.time.DateTimeException;
import java.util.zip.DataFormatException;

import org.testng.Assert;
import org.testng.annotations.Test;
public class TestApp {
    @Test
    public void test(){
        User chahua = new User(29,3,2001);
        Consulta consulta = new Consulta(1,6,2022,chahua);
        Assert.assertEquals(consulta.isOlder(), 1);

    }
  
}
