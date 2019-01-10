package com.yashon.design.behavioral.chain;

/**
 * @ClassName SensitiveFilter
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/10 下午11:41
 * @Version 1.0
 **/
public class SensitiveFilter implements Filter {
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.requestStr=request.requestStr.replace("被就业", "就业").replace("敏感", "")+" ---sensitiveFilter()";
        chain.doFilter(request,response,chain);
        response.responseStr+="---sensitiveFilter()";
    }
}
