package com.yashon.design.behavioral.chain;

/**
 * @ClassName HTMLFilter
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/10 下午11:34
 * @Version 1.0
 **/
public class HTMLFilter implements Filter {
    public void doFilter(Request request, Response response, FilterChain chain) {

        request.requestStr=request.requestStr.replace('<', '[').replace('>', ']') + "----HTMLFilter()";
        chain.doFilter(request, response,chain);
        response.responseStr+="---HTMLFilter()";
    }
}
