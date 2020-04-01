import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

class Reader 
{

     int noofbooks1;
     int Noofdays1;
     int NoOflibs1;

   

    public Returner Read2020(String filename) throws Exception
    {

        Returner ret = null;

        BufferedReader br = null;

       // int lineNo = 1;



           
             ret = new Returner();

             br = new BufferedReader(new FileReader(filename));

            //while (br.ready()) {
              
                    String[] line0 = br.readLine().split(" ");
                    System.out.println("line lenght  "+line0.length);

                    Noofdays1 = Integer.parseInt(line0[2]);
                    NoOflibs1 = Integer.parseInt(line0[1]);
                    noofbooks1 = Integer.parseInt(line0[0]);

				// Get details
                String[] linebook = br.readLine().split(" ");

                ArrayList<Book> books1 = new ArrayList<>();
                
                for(int i =0;i<linebook.length;i++)
                {
                    Book b = new Book();
                    b.setBookScore(Integer.parseInt(linebook[i]));
                    b.setBookid(i);
                    books1.add(b);

                }

            

                ArrayList<Library> libes1 = new ArrayList<>();

                for(int i = 0;i<NoOflibs1;i++)
                {
                    String[] libline1 = br.readLine().split(" ");
                    Library l = new Library();

                    l.setLibid(i);
                    l.setNoofbooksinLib(Integer.parseInt(libline1[0]));
                    l.setSignUpdays(Integer.parseInt(libline1[1]));
                    l.setCapacity(Integer.parseInt(libline1[2]));

                    String[] libline2 = br.readLine().split(" ");

                    ArrayList<Book> booksinlib = new ArrayList<>();

                    for(int j =0;j<Integer.parseInt(libline1[0]);j++)
                    {

                        booksinlib.add(books1.get(Integer.parseInt(libline2[j])));


                        //    for (Book book : books1) {

                        //        if(book.getBookid()==Integer.parseInt(libline2[j]))
                        //        {
                        //            booksinlib.add(book);
                        //        }
                                
                        //    }//end of foreach loop


                    }//end of J for

                   // booksinlib.sort(new MyCompBook());
                   int sumOfScore = 0;

                   Sorter s = new Sorter();
                   s.sortBook(booksinlib);


                 for (int j = 0;j<booksinlib.size()-5;j++) {

                       sumOfScore = sumOfScore+booksinlib.get(j).getBookScore();
                   }
                   
                //    int scoreOflib = (sumOfScore+l.getCapacity())-l.getSignUpdays();

                //    l.setScoreOflib(scoreOflib);
                l.setDookaddn(sumOfScore);

                    l.setBooksInLibrary(booksinlib);

                libes1.add(l);

                }//end Of Lib For

                // System.out.println(libes1.size());
                // System.out.println(books1.size());

               

                ret.books = books1;
                ret.libes = libes1;
                ret.noOfdays = Noofdays1;
                ret.noOfLibs = NoOflibs1;
                ret.noOfbooks = NoOflibs1;

                System.out.println("No fo books before >> "+noofbooks1);

                br.close();


            //}//en dof While 

           // br.close();

            return ret;
        
		// } finally {
		// 	if (br != null) {
		// 		try {
		// 			br.close();
		// 		} catch (Exception ex) {
		// 			System.err.println(ex.getMessage());
		// 		}
		// 	}
        // }
     
        
    }
}