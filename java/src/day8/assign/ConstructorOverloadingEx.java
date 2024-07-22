package day8.assign;

public class ConstructorOverloadingEx {
    //Book
    private String title;
    private String author;
    private int page;

    public ConstructorOverloadingEx() {
        this("", "", 0);
    }

    public ConstructorOverloadingEx(String title, String author) {
        this(title, author, 0);
    }

    public ConstructorOverloadingEx(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public void show() {
        System.out.println("제목:" + title + " 저자:" + author + " 페이지수: " + page);
    }
}
