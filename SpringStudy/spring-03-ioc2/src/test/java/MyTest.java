import com.Jackin.pojo.User;
import com.Jackin.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // User user = new User();
        // Spring容器，就类似于一个婚介网站！
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        User user = (User) context.getBean("user2");
        UserT user = (UserT) context.getBean("u2");
        user.show();
    }
}
