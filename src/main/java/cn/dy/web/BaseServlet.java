package cn.dy.web;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class BaseServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //获取用户访问路径
        String uri=req.getRequestURI();
        System.out.println("URI:=====>"+uri);
        int index=uri.lastIndexOf("/");
        String methodName=uri.substring(index+1,uri.length());
        System.out.println("methodName========>"+methodName);
        try {
            Method method=this.getClass().getMethod(methodName,HttpServletRequest.class,HttpServletResponse.class);
            method.invoke(this,req,resp);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

    protected void getJson(HttpServletResponse response,Object obj) throws Exception{
        ObjectMapper mapper=new ObjectMapper();
        String json=mapper.writeValueAsString(obj);
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(json);


    }

}
