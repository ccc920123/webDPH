package com.jysd.dphweb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 作者:陈渝金
 * 公司：四川星盾科技股份有限公司
 * 部门：技术部 PDA
 * 创建时间: 2019/4/2 21:53
 * 描述：解决跨域问题
 * 修改人：
 * 修改时间：
 */

@Component
public class CrosFilter implements Filter {
        @Override
        public void init(FilterConfig filterConfig) throws ServletException {

        }

        @Override
        public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
            HttpServletResponse rep = (HttpServletResponse) servletResponse;

            HttpServletRequest req = (HttpServletRequest) servletRequest;

            String origin = req.getHeader("Origin");
            if (!StringUtils.isEmpty(origin)) {
                rep.addHeader("Access-Control-Allow-Origin", origin);
            }
            //动态添加自定义头
            String headers = req.getHeader("Access-Control-Request-Headers");
            if (!StringUtils.isEmpty(headers)) {
                System.out.println(headers);
                rep.addHeader("Access-Control-Allow-Headers", headers);
            }

            //允许8081访问:
//        rep.addHeader("Access-Control-Allow-Origin", "*");
//        rep.addHeader("Access-Control-Allow-Origin", "http://localhost:8081");
            //允许访问方法GET
            rep.addHeader("Access-Control-Allow-Methods", "GET");
            rep.addHeader("Access-Control-Allow-Methods", "POST");
//        rep.addHeader("Access-Control-Allow-Headers", "Content-Type");
            rep.addHeader("Access-Control-Max-Age", "3600");//一小时内缓存预检请求
            rep.addHeader("Access-Control-Allow-Credentials", "true");//允许cookie

            filterChain.doFilter(servletRequest, rep);
        }

        @Override
        public void destroy() {

        }

}
