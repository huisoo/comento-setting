
import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/resources/applicationContext-webapp.xml" })
public class DBConnectionTest {

    @Autowired
    private DataSource ds;

    @Test
    public void testConnection(){

        try (Connection con = ds.getConnection()) {

            System.out.println("\nDB연결 성공 !!\n");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}