package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.util.ErrorPageSupport;
import org.apache.taglibs.standard.tag.rt.fmt.RequestEncodingTag;


@WebServlet("/InquiryServlet")
public class InquiryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public InquiryServlet() {
        super();
       
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var username = request.getParameter("username");
		var usermail = request.getParameter("usermail");
		var content = request.getParameter("content");
		
		List<String> errors = new ArrayList<String>();
		
		if (username == null || username.equals("")) {
		    errors.add("なまえを入れてください");  
        }
		if (usermail == null || usermail.equals("")) {
		    errors.add("メールアドレスをいれてください");
        }
		if (content == null || content.equals("")) {
            errors.add("お問い合わせ内容を入れてください");
        }
		
		if (errors.size() > 0) {
            request.setAttribute("errors", errors);
        } else {
            request.setAttribute("username", username);
            request.setAttribute("usermail", usermail);
            request.setAttribute("content", content);
        }
				
		var rd = request.getRequestDispatcher("/WEB-INF/inquiry_result.jsp");
		rd.forward(request, response);
	}

}
