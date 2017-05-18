/**
 * Created by Dawid Tomasiewicz on 18.05.17.
 */
abstract class User {
    private int presentResult;
    private Game selectedGame;
    void setGame(Game game){
        this.selectedGame = game;
    }
    public void setPresentResult(int result){
        this.presentResult = result;
    }
    abstract void info();
}
