package com.yashon.design.behavioral.memento;

/**
 * @ClassName Article
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/9 下午5:52
 * @Version 1.0
 **/
public class Article {

    private String title;

    private String content;

    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ArticleMemento createMemento(){
        ArticleMemento memento = new ArticleMemento(this.title,this.content);
        return memento;
    }

    public void undo(ArticleMemento memento){
        this.content = memento.getContent();
        this.title = memento.getTitle();
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
