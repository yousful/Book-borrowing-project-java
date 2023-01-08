import java.time.LocalDate;

public class HelloStudent {
   public static void main(String args[]){
   //  User user = new User("Yusuf Olanrewaju", "2000-02-26");

    Book literature = new Book("Half of a Yellow Sun", "Chimamanda Ngozi Adiche", 570);
    AudioBook history = new AudioBook("Things Fall Apart", "Chinua Achebe", 20000);
    Ebook chemistry = new Ebook("New School Chemistry", "Ababio", 300, "PDF");
   //  user.borrow(literature);

   //  System.out.printf("%s was born back in %s, and he is now %s years old \n", user.getName(), user.getBirthDay(), user.age());
   //  System.out.printf("%s has borrowed these books: %s \n", user.getName(), user.borrowedBooks());
  
   System.out.println(chemistry.toString());
   }
}
