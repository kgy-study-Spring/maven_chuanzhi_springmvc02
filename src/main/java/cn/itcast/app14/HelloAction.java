package cn.itcast.app14;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 单例 控制器(程序员)
 * 
 * @author AdminTC
 */
@Controller
public class HelloAction {

	public HelloAction() {
		System.out.println("HelloAction.HelloAction()" + this.hashCode());
	}

	/**
	 * 业务方法 只要是/hello.action的请求，都交由HelloAction对象中的hello()方法去处理
	 */
	@RequestMapping("/hello.action")
	public String hello(Model model) throws Exception {
		System.out.println("HelloAction::hello()");
		model.addAttribute("message", "你好");
		return "success";
	}

	/**
	 * 业务方法 只要是/bye.action的请求，都交由HelloAction对象中的bye()方法去处理
	 */
	@RequestMapping("/bye.action")
	public String bye(Model model) throws Exception {
		System.out.println("HelloAction::bye()");
		model.addAttribute("message", "再见");
		return "success";
	}
}
