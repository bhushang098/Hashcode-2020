import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyCompBook implements Comparator<Book>
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

class Sorter 
{

    public ArrayList<Book> sortBook(ArrayList<Book> books)
    {
        for(int i = 0;i<books.size()-1;i++)
        {

            for(int j = 0;j<books.size()-i-1;j++)
            {

                if(books.get(j).getBookScore()<books.get(j+1).getBookScore())
                {
                    
                   Collections.swap(books, j, j+1);

                }
            }
        }

        return books;

    }

    public ArrayList<Library> sortlibes(ArrayList<Library> libes)
    {
        for(int i = 0;i<libes.size()-1;i++)
        {

            for(int j = 0;j<libes.size()-i-1;j++)
            {

                if(libes.get(j).getScoreOflib()<libes.get(j+1).getScoreOflib())
                {
                    
                   Collections.swap(libes, j, j+1);

                }
            }
        }

        return libes;

    }
}