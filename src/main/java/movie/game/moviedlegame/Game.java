package movie.game.moviedlegame;

import javafx.scene.control.*;
import java.util.Random;
import static movie.game.moviedlegame.Movie.movieValue;
public class Game {
    private static Movie[] movies= movieValue();
    public static Random random = new Random();
    public  static int rand = rand();
    public  static Movie chosenMovie(){

        Movie chosen = new Movie();
        chosen.setNo(movies[rand].getNo());
        chosen.setDirector(movies[rand].getDirector());
        chosen.setTitle(movies[rand].getTitle());
        chosen.setStar(movies[rand].getStar());
        chosen.setGenre(movies[rand].getGenre());
        chosen.setYear(movies[rand].getYear());
        chosen.setOrigin(movies[rand].getOrigin());
        return chosen;
    }
    public static Movie getGuess(Movie GuessMovie){
        for(int i=0 ; i<movies.length;i++){
            if(movies[i].getTitle().equalsIgnoreCase(GuessMovie.getTitle())){
                GuessMovie.setNo(movies[i].getNo());
                GuessMovie.setYear(movies[i].getYear());
                GuessMovie.setGenre(movies[i].getGenre());
                GuessMovie.setOrigin(movies[i].getOrigin());
                GuessMovie.setStar(movies[i].getStar());
                GuessMovie.setDirector(movies[i].getDirector());
            }}

        if(GuessMovie.getYear()==null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("You entered an out of list movie! Please enter your guess again.");

            ButtonType buttonType = new ButtonType("I Understood", ButtonBar.ButtonData.OK_DONE);
            alert.getButtonTypes().setAll(buttonType);

            Button okButton = (Button) alert.getDialogPane().lookupButton(buttonType);
            okButton.setOnAction(e -> {
                alert.close();
            });
            alert.showAndWait();
        }
        return GuessMovie;
    }
    public  static int rand(){
        int a =random.nextInt(movies.length);
        return a;
    }


}
