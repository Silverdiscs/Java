import com.jackin.dao.UserDaoMySQLIMPL;
import com.jackin.service.UserService;
import com.jackin.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        /*    ———— 使用Spring之前 ————>
        // 用户实际调用的是业务层，Dao层他们不需要接触
        UserService userService = new UserServiceImpl();
        ((UserServiceImpl) userService).setUserDao(new UserDaoMySQLIMPL());
        userService.getUser(); */

        // 使用Spring后 ————>
        // 获取Spring的上下文对象(ApplicationContext)   -> 拿到Spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 我们的对象现在都在Spring中管理了，我们要使用，直接去里面取出来就可以了！ ↓
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");
        userServiceImpl.getUser();
    }
}




















