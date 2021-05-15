package com.djn.listener;

import com.mysql.cj.jdbc.AbandonedConnectionCleanupThread;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

@WebListener
public class ContextFinalizer implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        Enumeration<Driver> drivers = DriverManager.getDrivers();
        Driver d = null;
        while (drivers.hasMoreElements()) {
            try {
                d = drivers.nextElement();
                DriverManager.deregisterDriver(d);
                System.out.printf("ContextFinalizer:Driver %s deregistered%n",d);
            } catch (SQLException ex) {
                System.out.printf("ContextFinalizer:Error deregistering driver %s%n",d);
            }
        }
        AbandonedConnectionCleanupThread.checkedShutdown();
    }
}