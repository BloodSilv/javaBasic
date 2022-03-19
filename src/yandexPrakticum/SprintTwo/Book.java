package yandexPrakticum.SprintTwo;

// класс Main, в котором создаются объекты для внедрения в класс Book
class Main {
    public static void main(String[] args) {
        IAuthor author = new FantasyAuthor();
        IPublisher publisher = new OldPublisher();
        Book book = new Book(author, publisher);
        book.printBookInfo();
    }
}

// интерфейс для издательств
interface IPublisher {
    int foundationYear();
}

class OldPublisher implements IPublisher {
    @Override
    // метод, который возвращает год основания издательства
    public int foundationYear() {
        return 1950;
    }
}

// интерфейс для авторов
interface IAuthor {
    String getName();
}

// класс для автора фентези
class FantasyAuthor implements IAuthor {
    @Override
    public String getName() {
        return "Фрэнк Герберт";
    }
}

public class Book {
    // переменные author и publisher внутри класса
    private IAuthor author;
    private IPublisher publisher;

    public Book(IAuthor author, IPublisher publisher) {
        this.author = author;
        this.publisher = publisher;
    }


    // здесь допиши внедрение зависимости author и publisher через конструктор


    // методы из классов author и publisher
    public void printBookInfo() {
        System.out.println("Автор: " + author.getName());
        System.out.println("Год основания издательства: " + publisher.foundationYear());
    }
}
