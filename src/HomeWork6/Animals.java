package HomeWork6;

public abstract class Animals {

    protected String view;
    protected String name;
    protected int distance;


    public Animals(String view, String name, int distance) {
        this.view = view;
        this.name = name;
        this.distance = distance;
    }


    public abstract void run ();

    public abstract void toSail ();





}




