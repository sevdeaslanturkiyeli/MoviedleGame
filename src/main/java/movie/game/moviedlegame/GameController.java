package movie.game.moviedlegame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;

public class GameController {
    @FXML
    Button guessButton;
    @FXML
    TextField txtGuess;
    @FXML
    Label chance;
    int i = 5;
    @FXML
    Label lastChance;
    @FXML
    Label rec1L1,rec1L2,rec1L3,rec1L4,rec1L5,rec1L6,rec2L1,rec2L2,rec2L3,rec2L4,rec2L5,rec2L6,rec3L1,rec3L2,rec3L3,
            rec3L4, rec3L5,rec3L6,rec4L1,rec4L2,rec4L3,rec4L4,rec4L5,rec4L6,rec5L1,rec5L2,rec5L3,rec5L4,rec5L5,rec5L6;
    @FXML
    Rectangle chanceRec,rec1,rec2,rec3,rec4,rec5,arrow1,arrow2,arrow3,arrow4,arrow5;
    @FXML
    Polyline arrow1up,arrow1down,arrow2up,arrow2down,arrow3up,arrow3down,arrow4up,arrow4down,arrow5up,arrow5down;
    @FXML
    AnchorPane popUp;
    @FXML
    Label popUpLabel,resultLabel;
    @FXML
    Button restartButton,exitButton;
    @FXML
    ImageView rec1img1,rec2img2,rec3img3,rec4img4,rec5img5;

    @FXML
    public void onGuessButtonClick(ActionEvent event) {

        MovieImage[] images = MovieImage.movieGetImage();
        String imageUrl;
        if(i==5){
            Movie tahmin = new Movie();
            tahmin.setTitle(txtGuess.getText().trim());
            Movie tahmined=Game.getGuess(tahmin);
            System.out.println(Game.chosenMovie());
            if(Compare.compareTitle(Game.chosenMovie(),tahmined)==true){
                rec1L1.setText(tahmined.getTitle());
                rec1L1.setStyle("-fx-background-color:green");}
            else{
                rec1L1.setText(tahmined.getTitle());
                rec1L1.setStyle("-fx-background-color:red");}
            if(Compare.compareYear(Game.chosenMovie(),tahmined)==0){
                rec1L2.setText(tahmined.getYear());
                rec1L2.setStyle("-fx-background-color:green");}
            else{
                if(Compare.compareYear(Game.chosenMovie(),tahmined)==1){
                    rec1L2.setText(tahmined.getYear());
                    rec1L2.setStyle("-fx-background-color:red");
                    arrow1.setVisible(true);
                    arrow1down.setVisible(true);}
                else if(Compare.compareYear(Game.chosenMovie(),tahmined)==-1){
                    rec1L2.setText(tahmined.getYear());
                    rec1L2.setStyle("-fx-background-color:red");
                    arrow1.setVisible(true);
                    arrow1up.setVisible(true);;
                }}
            if(Compare.compareGenre(Game.chosenMovie(),tahmined)==true){
                rec1L3.setText(tahmined.getGenre());
                rec1L3.setStyle("-fx-background-color:green");}
            else{
                rec1L3.setText(tahmined.getGenre());
                rec1L3.setStyle("-fx-background-color:red");}
            if(Compare.compareOrigin(Game.chosenMovie(),tahmined)==true){
                rec1L4.setText(tahmined.getOrigin());
                rec1L4.setStyle("-fx-background-color:green");}
            else{
                rec1L4.setText(tahmined.getOrigin());
                rec1L4.setStyle("-fx-background-color:red");}
            if(Compare.compareDirector(Game.chosenMovie(),tahmined)==true){
                rec1L5.setText(tahmined.getDirector());
                rec1L5.setStyle("-fx-background-color:green");}
            else{
                rec1L5.setText(tahmined.getDirector());
                rec1L5.setStyle("-fx-background-color:red");}
            if(Compare.compareStar(Game.chosenMovie(),tahmined)==true){
                rec1L6.setText(tahmined.getStar());
                rec1L6.setStyle("-fx-background-color:green");}
            else{
                rec1L6.setText(tahmined.getStar());
                rec1L6.setStyle("-fx-background-color:red");}
            imageUrl = images[(Integer.parseInt(tahmined.getNo()))].getUrl();
            Image movieImage = new Image(imageUrl);
            rec1img1.setImage(movieImage);
            i--;
            rec1.setVisible(true);rec1L1.setVisible(true);rec1L2.setVisible(true);
            rec1L3.setVisible(true);rec1L4.setVisible(true);rec1L5.setVisible(true);rec1L6.setVisible(true);
            rec1img1.setVisible(true);
        }
        else if(i==4){
            Movie tahmin = new Movie();
            tahmin.setTitle(txtGuess.getText().trim());
            Movie tahmined=Game.getGuess(tahmin);
            if(Compare.compareTitle(Game.chosenMovie(),tahmined)==true){
                rec2L1.setText(tahmined.getTitle());
                rec2L1.setStyle("-fx-background-color:green");}
            else{
                rec2L1.setText(tahmined.getTitle());
                rec2L1.setStyle("-fx-background-color:red");}
            if(Compare.compareYear(Game.chosenMovie(),tahmined)==0){
                rec2L2.setText(tahmined.getYear());
                rec2L2.setStyle("-fx-background-color:green");}
            else{
                if(Compare.compareYear(Game.chosenMovie(),tahmined)==1){
                    rec2L2.setText(tahmined.getYear());
                    rec2L2.setStyle("-fx-background-color:red");
                    arrow2.setVisible(true);
                    arrow2down.setVisible(true);}
                else if(Compare.compareYear(Game.chosenMovie(),tahmined)==-1){
                    rec2L2.setText(tahmined.getYear());
                    rec2L2.setStyle("-fx-background-color:red");
                    arrow2.setVisible(true);
                    arrow2up.setVisible(true);;
                }}
            if(Compare.compareGenre(Game.chosenMovie(),tahmined)==true){
                rec2L3.setText(tahmined.getGenre());
                rec2L3.setStyle("-fx-background-color:green");}
            else{
                rec2L3.setText(tahmined.getGenre());
                rec2L3.setStyle("-fx-background-color:red");}
            if(Compare.compareOrigin(Game.chosenMovie(),tahmined)==true){
                rec2L4.setText(tahmined.getOrigin());
                rec2L4.setStyle("-fx-background-color:green");}
            else{
                rec2L4.setText(tahmined.getOrigin());
                rec2L4.setStyle("-fx-background-color:red");}
            if(Compare.compareDirector(Game.chosenMovie(),tahmined)==true){
                rec2L5.setText(tahmined.getDirector());
                rec2L5.setStyle("-fx-background-color:green");}
            else{
                rec2L5.setText(tahmined.getDirector());
                rec2L5.setStyle("-fx-background-color:red");}
            if(Compare.compareStar(Game.chosenMovie(),tahmined)==true){
                rec2L6.setText(tahmined.getStar());
                rec2L6.setStyle("-fx-background-color:green");}
            else{
                rec2L6.setText(tahmined.getStar());
                rec2L6.setStyle("-fx-background-color:red");}
            imageUrl = images[(Integer.parseInt(tahmined.getNo()))].getUrl();
            Image movieImage = new Image(imageUrl);
            rec2img2.setImage(movieImage);
            i--;
            rec1.setVisible(false);rec2.setVisible(true);rec2L1.setVisible(true);rec2L2.setVisible(true);
            rec2L3.setVisible(true);rec2L4.setVisible(true);rec2L5.setVisible(true);rec2L6.setVisible(true);
            rec2img2.setVisible(true);}
        else if(i==3){
            Movie tahmin = new Movie();
            tahmin.setTitle(txtGuess.getText().trim());
            Movie tahmined=Game.getGuess(tahmin);
            if(Compare.compareTitle(Game.chosenMovie(),tahmined)==true){
                rec3L1.setText(tahmined.getTitle());
                rec3L1.setStyle("-fx-background-color:green");}
            else{
                rec3L1.setText(tahmined.getTitle());
                rec3L1.setStyle("-fx-background-color:red");}
            if(Compare.compareYear(Game.chosenMovie(),tahmined)==0){
                rec3L2.setText(tahmined.getYear());
                rec3L2.setStyle("-fx-background-color:green");}
            else{
                if(Compare.compareYear(Game.chosenMovie(),tahmined)==1){
                    rec3L2.setText(tahmined.getYear());
                    rec3L2.setStyle("-fx-background-color:red");
                    arrow3.setVisible(true);
                    arrow3down.setVisible(true);}
                else if(Compare.compareYear(Game.chosenMovie(),tahmined)==-1){
                    rec3L2.setText(tahmined.getYear());
                    rec3L2.setStyle("-fx-background-color:red");
                    arrow3.setVisible(true);
                    arrow3up.setVisible(true);;
                }}
            if(Compare.compareGenre(Game.chosenMovie(),tahmined)==true){
                rec3L3.setText(tahmined.getGenre());
                rec3L3.setStyle("-fx-background-color:green");}
            else{
                rec3L3.setText(tahmined.getGenre());
                rec3L3.setStyle("-fx-background-color:red");}
            if(Compare.compareOrigin(Game.chosenMovie(),tahmined)==true){
                rec3L4.setText(tahmined.getOrigin());
                rec3L4.setStyle("-fx-background-color:green");}
            else{
                rec3L4.setText(tahmined.getOrigin());
                rec3L4.setStyle("-fx-background-color:red");}
            if(Compare.compareDirector(Game.chosenMovie(),tahmined)==true){
                rec3L5.setText(tahmined.getDirector());
                rec3L5.setStyle("-fx-background-color:green");}
            else{
                rec3L5.setText(tahmined.getDirector());
                rec3L5.setStyle("-fx-background-color:red");}
            if(Compare.compareStar(Game.chosenMovie(),tahmined)==true){
                rec3L6.setText(tahmined.getStar());
                rec3L6.setStyle("-fx-background-color:green");}
            else{
                rec3L6.setText(tahmined.getStar());
                rec3L6.setStyle("-fx-background-color:red");}
            i--;
            imageUrl = images[(Integer.parseInt(tahmined.getNo()))].getUrl();
            Image movieImage = new Image(imageUrl);
            rec3img3.setImage(movieImage);
            rec2.setVisible(false);rec3.setVisible(true);rec3L1.setVisible(true);rec3L2.setVisible(true);
            rec3L3.setVisible(true);rec3L4.setVisible(true);rec3L5.setVisible(true);rec3L6.setVisible(true);
            rec3img3.setVisible(true);}
        else if(i==2){
            Movie tahmin = new Movie();
            tahmin.setTitle(txtGuess.getText().trim());
            Movie tahmined=Game.getGuess(tahmin);
            if(Compare.compareTitle(Game.chosenMovie(),tahmined)==true){
                rec4L1.setText(tahmined.getTitle());
                rec4L1.setStyle("-fx-background-color:green");}
            else{
                rec4L1.setText(tahmined.getTitle());
                rec4L1.setStyle("-fx-background-color:red");}
            if(Compare.compareYear(Game.chosenMovie(),tahmined)==0){
                rec4L2.setText(tahmined.getYear());
                rec4L2.setStyle("-fx-background-color:green");}
            else{
                if(Compare.compareYear(Game.chosenMovie(),tahmined)==1){
                    rec4L2.setText(tahmined.getYear());
                    rec4L2.setStyle("-fx-background-color:red");
                    arrow4.setVisible(true);
                    arrow4down.setVisible(true);}
                else if(Compare.compareYear(Game.chosenMovie(),tahmined)==-1){
                    rec4L2.setText(tahmined.getYear());
                    rec4L2.setStyle("-fx-background-color:red");
                    arrow4.setVisible(true);
                    arrow4up.setVisible(true);;
                }}
            if(Compare.compareGenre(Game.chosenMovie(),tahmined)==true){
                rec4L3.setText(tahmined.getGenre());
                rec4L3.setStyle("-fx-background-color:green");}
            else{
                rec4L3.setText(tahmined.getGenre());
                rec4L3.setStyle("-fx-background-color:red");}
            if(Compare.compareOrigin(Game.chosenMovie(),tahmined)==true){
                rec4L4.setText(tahmined.getOrigin());
                rec4L4.setStyle("-fx-background-color:green");}
            else{
                rec4L4.setText(tahmined.getOrigin());
                rec4L4.setStyle("-fx-background-color:red");}
            if(Compare.compareDirector(Game.chosenMovie(),tahmined)==true){
                rec4L5.setText(tahmined.getDirector());
                rec4L5.setStyle("-fx-background-color:green");}
            else{
                rec4L5.setText(tahmined.getDirector());
                rec4L5.setStyle("-fx-background-color:red");}
            if(Compare.compareStar(Game.chosenMovie(),tahmined)==true){
                rec4L6.setText(tahmined.getStar());
                rec4L6.setStyle("-fx-background-color:green");}
            else{
                rec4L6.setText(tahmined.getStar());
                rec4L6.setStyle("-fx-background-color:red");}
            imageUrl = images[(Integer.parseInt(tahmined.getNo()))].getUrl();
            Image movieImage = new Image(imageUrl);
            rec4img4.setImage(movieImage);
            i--;
            chanceRec.setVisible(false);
            chance.setVisible(false);
            lastChance.setVisible(true);
            rec3.setVisible(false);rec4.setVisible(true);rec4L1.setVisible(true);rec4L2.setVisible(true);
            rec4L3.setVisible(true);rec4L4.setVisible(true);rec4L5.setVisible(true);rec4L6.setVisible(true);
            rec4img4.setVisible(true);}
        else if (i==1){
            Movie tahmin = new Movie();
            tahmin.setTitle(txtGuess.getText().trim());
            Movie tahmined=Game.getGuess(tahmin);
            if(Compare.compareTitle(Game.chosenMovie(),tahmined)==true){
                rec5L1.setText(tahmined.getTitle());
                rec5L1.setStyle("-fx-background-color:green");}
            else{
                rec5L1.setText(tahmined.getTitle());
                rec5L1.setStyle("-fx-background-color:red");}
            if(Compare.compareYear(Game.chosenMovie(),tahmined)==0){
                rec5L2.setText(tahmined.getYear());
                rec5L2.setStyle("-fx-background-color:green");}
            else{
                if(Compare.compareYear(Game.chosenMovie(),tahmined)==1){
                    rec5L2.setText(tahmined.getYear());
                    rec5L2.setStyle("-fx-background-color:red");
                    arrow5.setVisible(true);
                    arrow5down.setVisible(true);}
                else if(Compare.compareYear(Game.chosenMovie(),tahmined)==-1){
                    rec5L2.setText(tahmined.getYear());
                    rec5L2.setStyle("-fx-background-color:red");
                    arrow5.setVisible(true);
                    arrow5up.setVisible(true);;
                }}
            if(Compare.compareGenre(Game.chosenMovie(),tahmined)==true){
                rec5L3.setText(tahmined.getGenre());
                rec5L3.setStyle("-fx-background-color:green");}
            else{
                rec5L3.setText(tahmined.getGenre());
                rec5L3.setStyle("-fx-background-color:red");}
            if(Compare.compareOrigin(Game.chosenMovie(),tahmined)==true){
                rec5L4.setText(tahmined.getOrigin());
                rec5L4.setStyle("-fx-background-color:green");}
            else{
                rec5L4.setText(tahmined.getOrigin());
                rec5L4.setStyle("-fx-background-color:red");}
            if(Compare.compareDirector(Game.chosenMovie(),tahmined)==true){
                rec5L5.setText(tahmined.getDirector());
                rec5L5.setStyle("-fx-background-color:green");}
            else{
                rec5L5.setText(tahmined.getDirector());
                rec5L5.setStyle("-fx-background-color:red");}
            if(Compare.compareStar(Game.chosenMovie(),tahmined)==true){
                rec5L6.setText(tahmined.getStar());
                rec5L6.setStyle("-fx-background-color:green");}
            else{
                rec5L6.setText(tahmined.getStar());
                rec5L6.setStyle("-fx-background-color:red");}
            imageUrl = images[(Integer.parseInt(tahmined.getNo()))].getUrl();
            Image movieImage = new Image(imageUrl);
            rec5img5.setImage(movieImage);
            i--;
            rec4.setVisible(false);rec5.setVisible(true);rec5L1.setVisible(true);rec5L2.setVisible(true);
            rec5L3.setVisible(true);rec5L4.setVisible(true);rec5L5.setVisible(true);rec5L6.setVisible(true);
            rec5img5.setVisible(true);}

        if(Compare.sayac==6){
            popUp.setVisible(true);
            resultLabel.setText("You Win :)");
            txtGuess.setDisable(true);
            guessButton.setDisable(true);

        }else if(i == 0){
            Compare.sayac = 0;
            resultLabel.setText("You Lost :(");
            popUp.setVisible(true);
            txtGuess.setDisable(true);
            guessButton.setDisable(true);
        } else{
            Compare.sayac = 0;
            chance.setText( i +" Chances Left");
        }
    }
    @FXML
    public void onRestartButton(ActionEvent event){
        popUp.setVisible(false);
        Compare.sayac = 0;
        i = 5;
        rec1.setVisible(false);rec1L1.setVisible(false);rec1L2.setVisible(false);
        rec1L3.setVisible(false);rec1L4.setVisible(false);rec1L5.setVisible(false);rec1L6.setVisible(false);
        rec1.setVisible(false);rec2.setVisible(false);rec2L1.setVisible(false);rec2L2.setVisible(false);
        rec2L3.setVisible(false);rec2L4.setVisible(false);rec2L5.setVisible(false);rec2L6.setVisible(false);
        rec2.setVisible(false);rec3.setVisible(false);rec3L1.setVisible(false);rec3L2.setVisible(false);
        rec3L3.setVisible(false);rec3L4.setVisible(false);rec3L5.setVisible(false);rec3L6.setVisible(false);
        rec3.setVisible(false);rec4.setVisible(false);rec4L1.setVisible(false);rec4L2.setVisible(false);
        rec4L3.setVisible(false);rec4L4.setVisible(false);rec4L5.setVisible(false);rec4L6.setVisible(false);
        rec4.setVisible(false);rec5.setVisible(false);rec5L1.setVisible(false);rec5L2.setVisible(false);
        rec5L3.setVisible(false);rec5L4.setVisible(false);rec5L5.setVisible(false);rec5L6.setVisible(false);
        arrow1.setVisible(false);arrow1down.setVisible(false);arrow1up.setVisible(false);
        arrow2.setVisible(false);arrow2down.setVisible(false);arrow2up.setVisible(false);
        arrow3.setVisible(false);arrow3down.setVisible(false);arrow3up.setVisible(false);
        arrow4.setVisible(false);arrow4down.setVisible(false);arrow4up.setVisible(false);
        arrow5.setVisible(false);arrow5down.setVisible(false);arrow5up.setVisible(false);
        lastChance.setVisible(false);chance.setText( i +" Chances Left");chanceRec.setVisible(true); chance.setVisible(true);
        txtGuess.setDisable(false);
        guessButton.setDisable(false);
        rec1img1.setVisible(false);rec2img2.setVisible(false);rec3img3.setVisible(false);
        rec4img4.setVisible(false);rec5img5.setVisible(false);
        Game.rand = Game.rand();
        Game.chosenMovie();

    }
    @FXML
    public void onExitButton(ActionEvent event){
        System.exit(0);
    }
}