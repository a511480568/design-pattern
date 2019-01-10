package com.yashon.design.behavioral.chain;

/**
 * @ClassName FaceFilter
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/10 下午11:42
 * @Version 1.0
 **/
public class FaceFilter implements Filter {
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.requestStr = request.requestStr.replace(":):", "^V^")+ "----FaceFilter()";
        chain.doFilter(request,response,chain);
        response.responseStr += "---FaceFilter()";
    }
}
