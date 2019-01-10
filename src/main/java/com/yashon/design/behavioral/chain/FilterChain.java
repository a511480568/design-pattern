package com.yashon.design.behavioral.chain;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName FilterChain
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/10 下午11:33
 * @Version 1.0
 **/
public class FilterChain {

    //用List集合来存储过滤规则
    List<Filter> filters = new ArrayList<Filter>();

    //用于标记规则的引用顺序
    int index = 0;

    //往规则链条中添加规则
    public FilterChain addFilter(Filter filter){
        filters.add(filter);
        //代码的设计技巧:Chain链添加过滤规则结束后返回添加后的Chain，方便我们下面doFilter函数的操作
        return this;
    }

    public void doFilter(Request request,Response response,FilterChain chain){

        if(index == filters.size()){
            return;
        }

        Filter filter = filters.get(index);
        index ++;
        filter.doFilter(request,response,chain);
    }
}
