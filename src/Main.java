import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: SpringTest
 * @description: 主方法
 * @author: Mr.Jiang
 * @create: 2019-10-16 20:28
 **/
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
        Book book=applicationContext.getBean("book",Book.class);
        book.printInfo();
    }

}

    