package cn.itcast.app18;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制器
 * 
 * @author AdminTC
 */
@Controller
@RequestMapping("/user")
public class UserAction {
	/**
	 * 用户注册，只能接收POST请求
	 */
	public String registerMethod(HttpServletRequest request,HttpServletResponse response) throws Exception {
		// 获取用户名和薪水
		String username = request.getParameter("username");
		String salary = request.getParameter("salary");
		System.out.println("用户注册-->" + username + ":" + salary);
		
		request.getSession().setAttribute("username",username);
		request.getSession().setAttribute("salary",salary);
		
		//重定向/jsp/success.jsp页面
		//response.sendRedirect(request.getContextPath()+"/jsp/success.jsp");
		
		//转发/jsp/ok.jsp页面
		request.getRequestDispatcher("/jsp/ok.jsp").forward(request,response);
		
		//转发(提倡)
		return "/jsp/success.jsp";
	}

}
