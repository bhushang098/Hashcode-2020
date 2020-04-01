import java.util.Comparator;

class MyComp implements Comparator<Book>
{

    @Override
    public int compare(Book o1, Book o2) {
       if(o1.getBookScore()>o2.getBookScore())
       {
           return -1;
       }
       return 1;
    }

   
    
}