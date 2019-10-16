/**
 * @program: SpringTest
 * @description: spring项目小实例
 * @author: Mr.Jiang
 * @create: 2019-10-16 20:18
 **/
public class Book {
    private String bookName;
    private String author;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void printInfo(){
        System.out.println("Book Name:"+this.bookName+",Author:"+this.author);
    }
}

    