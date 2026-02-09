void main() {
    Book book1 = new Book("When I leave");
    Book book2 = new Book("Coding");
    Book book3 = new Book(" Pride and Prejudice");
    Book book4 = new Book("Fire and Water");
    Book book5 = new Book("The War of The World ");
    System.out.println("Name of the books: ");
    System.out.println(book1);
    System.out.println(book2);
    System.out.println(book3);
    System.out.println(book4);
    System.out.println(book5);

    System.out.println("Get the count of the books: ");
    System.out.println(Book.getAllBooks());
}