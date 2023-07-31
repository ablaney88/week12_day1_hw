public class WaterBottle {
    private int volume;
    private int drink;
    private int empty;
    private int bottleEmpty;

    public WaterBottle(int volume, int drink, int empty, int bottleEmpty){
        this.volume = volume;
        this.drink = drink;
        this.empty = empty;
        this.bottleEmpty = bottleEmpty;
    }

    public int getVolume(){
        return this.volume;
    }

    public int emptyBottle(){
        return this.volume - this.empty;
    }

    public int takeDrink(){
        return this.volume - this.drink;
    }

    public int fillBackUp(){
        return this.bottleEmpty + this.volume;
    }
}
