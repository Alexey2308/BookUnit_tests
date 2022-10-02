public class Main {
    public static void main(String[] args) {

        Book book = new Book("Book with up raiting", "Somebody", 2022);
        book.append("Поднимаем" + " ");
        book.append("рейтинг" + " ");
        book.append("выше пяти");
        book.up();
        book.up();
        book.up();
        book.up();
        System.out.println(book);

        Book book1 = new Book("Book with down raiting", "Somebody", 2022);
        book1.append("Отпускаем" + " ");
        book1.append("рейтинг" + " ");
        book1.append("ниже нуля");
        book1.down();
        book1.down();
        book1.down();
        book1.down();
        System.out.println(book1);
    }
}
