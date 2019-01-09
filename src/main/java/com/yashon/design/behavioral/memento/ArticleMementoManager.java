package com.yashon.design.behavioral.memento;

import java.util.Stack;

/**
 * @ClassName ArticleMementoManager
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/9 下午5:56
 * @Version 1.0
 **/
public class ArticleMementoManager {

    private final Stack<ArticleMemento> ARTICLE_MEMENTO_STACK = new Stack<ArticleMemento>();

    public ArticleMemento getArticleMemento(){
        return ARTICLE_MEMENTO_STACK.pop();
    }

    public void addArticleMemento(ArticleMemento memento){
        ARTICLE_MEMENTO_STACK.push(memento);
    }
}
