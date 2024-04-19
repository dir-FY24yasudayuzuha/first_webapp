package listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class AppScopeLogListener implements ServletContextAttributeListener {


    public AppScopeLogListener() {
       
    }


    public void attributeAdded(ServletContextAttributeEvent scae)  { 
         System.out.println("アプリケーションスコープに登録しました：" + scae.getName()+ "=" + scae.getValue());
    }


    public void attributeRemoved(ServletContextAttributeEvent scae)  { 
         
    }


    public void attributeReplaced(ServletContextAttributeEvent scae)  { 
         
    }
	
}
