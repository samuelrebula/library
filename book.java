public class book {

  private String title;
  private String writer;
  private int numPages;
  private int numChapter;

  public book(String title, String writer, int numPages, int numChapter) {
    this.title = title;
    this.writer = writer;
    this.numPages = numPages;
    this.numChapter = numChapter;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getWriter() {
    return writer;
  }

  public void setWriter(String writer) {
    this.writer = writer;
  }

  public int getNumPages() {
    return numPages;
  }

  public void setNumPages(int numPages) {
    this.numPages = numPages;
  }

  public int getChapter() {
    return numChapter;
  }

  public void setChapter(int numChapter) {
    this.numChapter = numChapter;
  }
}