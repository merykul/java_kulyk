package tasks8;

public class MusicianFirst implements Piano {
    public MusicianFirst(String name){
        this.name = name;
    }
    @Override
    public String sound(){
        return getName() + " can play on " + Piano.super.sound();
    }

   private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
