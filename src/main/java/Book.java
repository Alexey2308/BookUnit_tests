public class Book {
    public String title;
    public String author;
    public int year;
    public int raiting;
    public String text;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.raiting = 3;
        this.text = "";
    }

    public void up() {
        if (raiting < 5) {
            raiting++;
        }
    }

    public void down() {
        if (raiting > 0) {
            raiting--;
        }
    }

    public void append(String moreText) {
        text += moreText;
    }

    public String toString() {
        return title + " " + author + " " + year + " " + "рейтинг:" + " " + raiting + " " + "[текст:" + text + "]";
    }


}
