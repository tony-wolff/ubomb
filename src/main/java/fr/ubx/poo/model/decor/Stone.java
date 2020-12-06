package fr.ubx.poo.model.decor;

public class Stone extends Decor {
    @Override
    public String toString() {
        return "Stone";
    }

    @Override
    public Boolean canBePicked() {
        return false;
    }
}
