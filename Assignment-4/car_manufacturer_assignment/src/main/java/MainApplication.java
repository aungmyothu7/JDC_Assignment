import entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Arrays;

public class MainApplication {
    private static SessionFactory sessionFactory;


    static {
        sessionFactory = HibernateUtils.getSessionFactory(Arrays.asList());
    }

    public static void main(String[] args) {

        try (Session session = sessionFactory.openSession()) {


        }
        JPAUtil.checkData("select * from student");

    }
}
