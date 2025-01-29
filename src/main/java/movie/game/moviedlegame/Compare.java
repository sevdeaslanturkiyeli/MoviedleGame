package movie.game.moviedlegame;
public class Compare {
    static int sayac=0;
    public static boolean compareTitle(Movie chosen,Movie guess){
        if((chosen.getTitle()).equalsIgnoreCase(guess.getTitle())){
            sayac++;
            return true;}
        else{
            return false;}
    }
    public static int compareYear(Movie chosen,Movie guess){
        if(chosen.getYear().equals(guess.getYear())){
            sayac++;
            return 0;}
        else {
            int a = Integer.parseInt(chosen.getYear());
            int b = Integer.parseInt(guess.getYear());

            if (a < b){
                return 1;}
            else{
                return -1;}
        }
    }
    public static boolean compareGenre(Movie chosen,Movie guess) {
        if (chosen.getGenre().equals(guess.getGenre())) {
            sayac++;
            return true;
        }
        else
            return false;
    }
    public static boolean compareOrigin(Movie chosen,Movie guess){
        if(chosen.getOrigin().equals(guess.getOrigin())){
            sayac++;
            return true;}
        else
            return false;
    }
    public static boolean compareDirector(Movie chosen,Movie guess){
        if(chosen.getDirector().equals(guess.getDirector())){
            sayac++;
            return true;}
        else
            return false;
    }
    public static boolean compareStar(Movie chosen,Movie guess){
        if(chosen.getStar().equals(guess.getStar())){
            sayac++;
            return true;}
        else
            return false;
    }
}

