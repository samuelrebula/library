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

  public String getTitulo() {
    return title;
  }

  public void setTitulo(String title) {
    this.title = title;
  }

  public String getAutor() {
    return writer;
  }

  public void setAutor(String writer) {
    this.writer = writer;
  }

  public int getNpag() {
    return numPages;
  }

  public void setNpag(int numPages) {
    this.numPages = numPages;
  }

  public int getEdicao() {
    return numChapter;
  }

  public void setEdicao(int numChapter) {
    this.numChapter = numChapter;
  }
}
