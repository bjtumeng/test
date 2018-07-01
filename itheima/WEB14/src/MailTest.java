import javax.mail.MessagingException;

import static com.itheima.mail.MailUtils.sendMail;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 20:58 2018/6/19
 * @Modified By:
 */
public class MailTest {
    public static void main(String[]args){
        String email="lucy@itheima32.com";
        String subject="测试邮件主题";
        String emailMsg="主要内容忽略不计";
        try {
            sendMail(email,subject,emailMsg);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

}
