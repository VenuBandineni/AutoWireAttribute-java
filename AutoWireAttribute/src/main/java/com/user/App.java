package com.user;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.user.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=
        		new ClassPathXmlApplicationContext("com/user/file/sample.xml");
        User user=context.getBean(User.class);
        user.toKnowAboutBike();
        System.out.println(user);
    }
}
