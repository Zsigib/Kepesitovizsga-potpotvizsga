package hu.nive.ujratervezes.kepesitovizsga_pot_potvizsga.zoo;

public abstract class ZooAnimal {

    protected String name;
    protected  int length;
    protected int weight;

    public abstract long getWeight();

    public abstract int getLength();

    public abstract String getName();

    public abstract short getType();
}
