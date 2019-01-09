package com.yashon.design.behavioral.memento;

/**
 * @ClassName ArticleMemento
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/9 下午5:53
 * @Version 1.0
 **/
public class ArticleMemento {

    private String title;

    private String content;

    public ArticleMemento(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "ArticleMemento{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
