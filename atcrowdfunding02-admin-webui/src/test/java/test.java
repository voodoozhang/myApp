import com.zhang.atcrowdfunding.entity.Admin;
import com.zhang.atcrowdfunding.service.api.AdmineService;
import com.zhang.atcrowdfunding.service.impl.AdmineServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-persist-tx.xml", "classpath:spring-persist-mybatis.xml"})
public class test {
    @Autowired
    private AdmineService admineService;
    @Test

    public void run(){
    Admin admin=new Admin(null,"123aaaa","123456","974133539@qq.com",null);
    admineService.saveAdmin(admin);
    }
}
