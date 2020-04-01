import java.util.ArrayList;

class Library 
{
    int libid;
    int signUpdays;
    int noofbooksinLib;
    int capacity;
    int scoreOflib;

    ArrayList<Book> booksInLibrary;



    public int getLibid() {
        return this.libid;
    }

    public void setLibid(int libid) {
        this.libid = libid;
    }

    public int getSignUpdays() {
        return this.signUpdays;
    }

    public void setSignUpdays(int signUpdays) {
        this.signUpdays = signUpdays;
    }

    public int getNoofbooksinLib() {
        return this.noofbooksinLib;
    }

    public void setNoofbooksinLib(int noofbooksinLib) {
        this.noofbooksinLib = noofbooksinLib;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Book> getBooksInLibrary() {
        return this.booksInLibrary;
    }

    public void setBooksInLibrary(ArrayList<Book> booksInLibrary) {
        this.booksInLibrary = booksInLibrary;
    }


    public int getScoreOflib() {
        return this.scoreOflib;
    }

    public void setScoreOflib(int scoreOflib) {
        this.scoreOflib = scoreOflib;
    }


    @Override
    public String toString() {
        
        System.out.println(" Elemeirts Of library");
        System.out.println(libid);
        System.out.println("No Of Books"+noofbooksinLib);
        System.out.println("Time to sighn Up"+signUpdays);
        System.out.println("capacity = "+capacity);
        System.out.println("Score Of Lib = "+ scoreOflib);

        System.out.println("Books In Library>>>");
    
        for (Book book : booksInLibrary) {
            System.out.println(book);
        }
        return " ";
    }

   

}