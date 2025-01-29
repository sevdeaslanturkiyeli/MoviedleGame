module movie.game.moviedlegame {
    requires javafx.controls;
    requires javafx.fxml;


    opens movie.game.moviedlegame to javafx.fxml;
    exports movie.game.moviedlegame;
}