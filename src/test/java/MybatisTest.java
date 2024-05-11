
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/resources/applicationContext-webapp.xml"})
public class MybatisTest
{
    @Autowired
    private SqlSessionFactory sqlFactory;

    @Test
    public void testFactory(){
        System.out.println("sqlFactory : "+sqlFactory);
    }

    @Test
    public void testSession() throws Exception{

        try(SqlSession session = sqlFactory.openSession()){

            System.out.println("session  : "+session);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}