package com.yashon.design.behavioral.memento;

/**
 * @ClassName Client
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/9 下午6:00
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        ArticleMementoManager manager = new ArticleMementoManager();
        Article article = new Article("标题A","内容A");

        ArticleMemento memento = article.createMemento();
        manager.addArticleMemento(memento);

        System.out.println("原始内容：" + article);

        article.setContent("内容B");
        article.setTitle("标题B");

        System.out.println("新内容：" + article);

        //这时发现出错了，需要回退
        ArticleMemento undoArticleMemento = manager.getArticleMemento();
        article.undo(undoArticleMemento);

        System.out.println("回退之后的内容：" + article);
    }
}
