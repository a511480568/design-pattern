package com.yashon.design.behavioral.chain;

/**
 * @ClassName Client
 * @Description
 * <p>
 *      我们有一个字符串String msg = ":):,<script>,敏感,被就业,网络授课";我们希望应用以下三个规则对字符串进行过滤和谐处理：
 *
 *      (1)将字符串中出现的"<>"符号替换成"[]"
 *
 *      (2)处理字符串中的敏感信息，将被就业和谐成就业
 *
 *      (3)将字符串中出现的":):"转换成"^V^";
 *
 *       字符串会依次运用这三条规则，对字符串进行处理，每个规则都有自己需要完成的责任和任务。
 * </p>
 * @Author yashon
 * @Date 2019/1/10 下午11:30
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        String msg = ":):,<script>,敏感,被就业,网络授课";
        Request request=new Request();
        request.setRequestStr(msg);

        Response response=new Response();
        response.setResponseStr("response:");

        FilterChain fc=new FilterChain();
        fc.addFilter(new HTMLFilter()).addFilter(new SensitiveFilter()).addFilter(new FaceFilter());
        fc.doFilter(request,response,fc);

        System.out.println(request.getRequestStr());

        System.out.println(response.getResponseStr());
    }
}
