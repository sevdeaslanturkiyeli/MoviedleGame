package movie.game.moviedlegame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
public class MovieImage {
    private String imageNo;
    private String url;

    public String getImageNo() {
        return imageNo;
    }

    public void setImageNo(String imageNo) {
        this.imageNo = imageNo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static MovieImage[] movieGetImage() {
        BufferedReader objReader = null;
        MovieImage[] moviesImages = null;
        try {
            String satir;

            objReader = new BufferedReader(new FileReader("imdb_top_250_images.csv", StandardCharsets.ISO_8859_1));
            int lineCount = 0;

            while ((satir = objReader.readLine()) != null) {
                lineCount++;
            }
            moviesImages = new MovieImage[lineCount];
            objReader = new BufferedReader(new FileReader(("imdb_top_250_images.csv"), StandardCharsets.ISO_8859_1));
            for (int i = 0; i < lineCount; i++) {
                satir = objReader.readLine();

                String[] ayir = satir.split(";");
                MovieImage image = new MovieImage();
                image.setImageNo(ayir[0]);
                image.setUrl(ayir[1]);
                moviesImages[i] = image;
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
        return moviesImages;
    }

}
