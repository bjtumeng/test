package com.itheima.Listener; /**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 20:35 2018/6/24
 * @Modified By:
 */

import com.itheima.mail.MailUtils;
import com.itheima.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javax.mail.MessagingException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

@WebListener()
public class TimerListener implements ServletContextListener,
        HttpSessionListener, HttpSessionAttributeListener {

    // Public constructor is required by servlet spec
    public TimerListener() {
    }

    // -------------------------------------------------------
    // ServletContextListener implementation
    // -------------------------------------------------------
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                //1.获取当前时间
                Date date = new Date();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd");
                String currentime = simpleDateFormat.format(date);
                //2.从数据库中查要发送的人
                QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
                String sql = "select * from customer where birthday like ? ";
                List<Customer> customerList = null;
                try {
                    customerList = runner.query(sql, new BeanListHandler<Customer>(Customer.class), "%"+currentime);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                //3.发送邮件
                if (customerList != null && customerList.size() > 0) {
                    for (Customer c : customerList) {
                        try {
                            MailUtils.sendMail(c.getEmail(), "生日快乐", "亲爱的" + c.getRealName() + "生日快乐");
                            System.out.println(c.getRealName()+"邮件发送完毕");
                        } catch (MessagingException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }, new Date(), 1000);
    }

    public void contextDestroyed(ServletContextEvent sce) {
      /* This method is invoked when the Servlet Context 
         (the Web application) is undeployed or 
         Application Server shuts down.
      */
    }

    // -------------------------------------------------------
    // HttpSessionListener implementation
    // -------------------------------------------------------
    public void sessionCreated(HttpSessionEvent se) {
      /* Session is created. */
    }

    public void sessionDestroyed(HttpSessionEvent se) {
      /* Session is destroyed. */
    }

    // -------------------------------------------------------
    // HttpSessionAttributeListener implementation
    // -------------------------------------------------------

    public void attributeAdded(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute 
         is added to a session.
      */
    }

    public void attributeRemoved(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute
         is removed from a session.
      */
    }

    public void attributeReplaced(HttpSessionBindingEvent sbe) {
      /* This method is invoked when an attibute
         is replaced in a session.
      */
    }
}
