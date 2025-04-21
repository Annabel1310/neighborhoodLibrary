public class book {
    //this is the book class .It holds all the information about each book
    class Book {
        // These are the properties of a Book.
        int id;//-id; int
        String isbn;//-isbn:
        String title; //-isCheckedout:boolean
        boolean isCheckedOut;//- isCheckedOut: boolean
        String checkedOutTo;

        //This is the constructor. It sets up a book when its created.
        Book(int id, String isbn, String title) {
            this.id = id;
            this.isbn = isbn;
            this.title = title;
            this.isCheckedOut = false; //Book is available
            this.checkedOutTo = "";
        }

        public void checkOut(String name) {
            isCheckedOut = true;
            checkedOutTo = name;
            {
                isCheckedOut = false;
                checkedOutTo = "";
            }
        }
    }


}

