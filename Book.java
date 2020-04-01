class Book 
{

    int bookid;
    int bookScore;


    public int getBookid() {
        return this.bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public int getBookScore() {
        return this.bookScore;
    }

    public void setBookScore(int bookScore) {
        this.bookScore = bookScore;
    }


    @Override
    public String toString() {
    //   System.out.println(" Book id "+bookid);
      System.out.println("Books score " +bookScore);
        //return super.toString();

        return "";
    }

}