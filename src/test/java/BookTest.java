import org.junit.jupiter.api.*;

class BookTest {
    public String title;
    public String author;
    public int year;
    public int raiting;
    public String text;


    public void Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.raiting = 3;
        this.text = "";
    }


    Book testbook = new Book("Book with up raiting", "Somebody", 2022);


    @Test
    void up() {
        if (testbook.raiting < 5) {
            int expResult = 2;
            int actualResult = testbook.raiting++;
            Assertions.assertEquals(expResult, actualResult);
            System.out.println("Тест метода 'up' пройден");
        }
    }


    @Test
    void down() {
        if (testbook.raiting > 0) {
            int expResult = 2;
            int actualResult = testbook.raiting - 1;
            Assertions.assertEquals(expResult, actualResult);
            System.out.println("Тест метода 'down' пройден");
        }
    }


    @Test
    void append() {
        String t = "some text";
        String expResult = "";
        String actualResult = testbook.text += t;
        Assertions.assertFalse(expResult == actualResult);
        System.out.println("Тест метода 'append' пройден");
    }
}