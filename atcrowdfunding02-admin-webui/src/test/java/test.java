import com.zhang.atcrowdfunding.entity.Admin;
import com.zhang.atcrowdfunding.service.api.AdmineService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-persist-tx.xml", "classpath:spring-persist-mybatis.xml"})
public class test {
    @Test
    public void run(){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring-persist-mybatis.xml");
        String[]val=context.getBeanDefinitionNames();
        for (String s : val) {
            System.out.println(s);
        }

    }
}
