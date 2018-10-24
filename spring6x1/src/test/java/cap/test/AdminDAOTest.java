package cap.test;

import cap.dao.AdminDAO;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdminDAOTest {

 public void testSayHi2() {
    }


    @Test
    public void testSayHi3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AdminDAO adminDAO = (AdminDAO) context.getBean("logProxy");
        System.out.println(adminDAO.sayHi());

    }

    @Test
    public void testSayHi4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AdminDAO adminDAO = (AdminDAO) context.getBean("adminDAO");
        System.out.println(adminDAO.sayHi());

    }

}
