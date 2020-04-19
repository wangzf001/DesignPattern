package com.wzf.design.delegate.dispatch;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: HERO
 * @Date: 2020/4/8 15:08
 * @Version 1.0
 *
 * 相当于项目经理角色
 */
public class DispatcherServlet extends HttpServlet {

//    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//
//        String uri = req.getRequestURI();
//        if(StringUtils.equals(uri,"/queryMemberById")){
//            new MemberController().queryMemberById();
//        }else if(StringUtils.equals(uri,"/queryOrderById")){
//            new OrderController().queryOrderById();
//        }else {
//            resp.getWriter().write("404 not found!");
//        }
//
//    }

    private static List<Handler> list = new ArrayList<>();

    @Override
    public void init() throws ServletException {

        Class<?> clzz = MemberController.class;
        try {
            Handler handler = new Handler().setController(clzz.newInstance())
                    .setMethod(clzz.getMethod("queryMemberById",null))
                    .setUri("/queryMemberById");
            list.add(handler);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doDispatch(req, resp);
    }



    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) {
        String uri = req.getRequestURI();
        System.out.println("请求URI:"+uri);
        Handler h = null;
        for (Handler handler : list) {
            if(handler.uri.equals(uri)){
                h = handler;
                break;
            }
        }

        Object object = null;
        try {
           object = h.method.invoke(h.controller);
        } catch (Exception e){
            e.printStackTrace();
        }

    }


    class Handler{

        private Object controller;

        private Method method;

        private String uri;

        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }

        public String getUri() {
            return uri;
        }

        public Handler setUri(String uri) {
            this.uri = uri;
            return this;
        }
    }

}
