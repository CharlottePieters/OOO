package Domain;

public interface State {
    String verwijder();
    String leenUit();
    String brengTerug(boolean beschadigd);
    String herstel();
}
