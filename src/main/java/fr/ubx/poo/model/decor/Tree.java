package fr.ubx.poo.model.decor;

public class Tree extends Decor {
    @Override
    public String toString() {
        return "Tree";
    }

    @Override
    public Boolean canBePicked() {
        return false;
    }
}
