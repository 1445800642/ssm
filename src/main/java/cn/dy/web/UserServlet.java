package cn.dy.web;

import cn.dy.pojo.Admin;
import cn.dy.service.UserService;
import cn.dy.service.impl.UserServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/*")
public class UserServlet extends BaseServlet {
   //用户的登录
   public  void  login(HttpServletRequest request,HttpServletResponse response)throws  Exception{
       System.out.println("================进入了登录================");
       request.setCharacterEncoding("utf-8");
       String username = request.getParameter("username");
       String password = request.getParameter("password");
       //调用services层代码
       UserService service=new UserServiceImpl();
       Admin admin=service.login(username,password);
       if (admin!=null){ //证明用户登录成功
           //把用户信息保存在session作用域中
           request.getSession().setAttribute("loginUser",admin);
           response.getWriter().write("true");
       }else {
           response.getWriter().write("false");
       }
   }

   //查询用户的信息
    public  void  findLoginUser(HttpServletRequest request,HttpServletResponse response)throws  Exception{
        System.out.println("================进入了查询登录用户的信息================");
        Admin admin=(Admin) request.getSession().getAttribute("loginUser");
        getJson(response,admin);
    }

    //退出登录
    public void exitUser(HttpServletRequest request,HttpServletResponse response)throws  Exception{
        request.getSession().invalidate();
        response.sendRedirect("/studentManager/login.html");
    }


}
