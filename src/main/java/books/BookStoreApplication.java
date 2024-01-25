package books;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookStoreApplication {

    public static void main(String[] args){

//        Staff staff = new Staff();
//        staff.setName("Karim");
        Staff staff = new Staff();
        staff.setName("Naim");

       BookStore bookStore = new BookStore(staff);
       bookStore.pring();

    }

}
