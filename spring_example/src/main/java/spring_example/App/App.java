package spring_example.App;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_example.beans.MyBean;

public class App {
    public static void main(String[] args) {

        // container spring che legge la configurazione da file xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        MyBean bean = context.getBean("mybean", MyBean.class);
        bean.ciaoMondo();
        context.close();
    }

}
