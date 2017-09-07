package test.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import test.entity.User;
import test.service.LoginService;

@Controller
public class LoginAction {
	private LoginService loginservice;
	@RequestMapping("/login.do")
	public String login(HttpServletRequest request, HttpServletResponse respose) {
		User user = new User();
		user.setUsername(request.getParameter("username"));
		user.setPassword(request.getParameter("password"));
		boolean result = loginservice.checkLogin(user);
		if(result) {
			return "success.jsp";
		}
			return "error.html";
	}
	
	public LoginService getLoginservice() {
		return loginservice;
	}
	@Resource(name="testService")
	public void setLoginservice(LoginService loginservice) {
		this.loginservice = loginservice;
	}
	
}
