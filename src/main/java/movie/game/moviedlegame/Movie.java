package movie.game.moviedlegame;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Movie {
    private String No;
    private String Title;
    private String Year;
    private String Genre;
    private String Origin;
    private String Director;
    private String Star;
    private String imdb;

    public Movie() {

    }
    public Movie(String No, String Title, String Year, String Genre, String Origin, String Director, String Star) {
        this.No = No;
        this.Title = Title;
        this.Year = Year;
        this.Genre = Genre;
        this.Origin = Origin;
        this.Director = Director;
        this.Star = Star;
    }

    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        this.No = no;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        this.Year = year;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        this.Genre = genre;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        this.Origin = origin;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        this.Director = director;
    }

    public String getStar() {
        return Star;
    }

    public void setStar(String star) {
        this.Star = star;
    }

    public static Movie[] movieValue() {

        BufferedReader objReader = null;
        Movie[] movies = null;
        try {
            String satir;

            objReader = new BufferedReader(new FileReader("imdb_top_250.csv", StandardCharsets.ISO_8859_1));
            int lineCount = 0;

            while ((satir = objReader.readLine()) != null) {
                lineCount++;
            }
            movies = new Movie[lineCount];
            objReader = new BufferedReader(new FileReader("imdb_top_250.csv", StandardCharsets.ISO_8859_1));

            for(int i = 0; i < lineCount; i++) {
                satir = objReader.readLine();
                String[] bol = satir.split(";");

                Movie movie = new Movie();
                movie.setNo(bol[0]);
                movie.setTitle(bol[1]);
                movie.setYear(bol[2]);
                movie.setGenre(bol[3]);
                movie.setOrigin(bol[4]);
                movie.setDirector(bol[5]);
                movie.setStar(bol[6]);

                movies[i] = movie;
            }
        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {
                if (objReader != null)
                    objReader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return movies;
    }

    public String toString() {
        return "No: " + No + ", Title: " + Title + ", Year: " + Year + ", Genre: " + Genre + ", Origin: " + Origin + ", Director: " + Director + ", Star: " + Star;
    }
}
