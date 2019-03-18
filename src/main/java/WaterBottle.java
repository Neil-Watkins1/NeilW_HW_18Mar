public class WaterBottle {
    int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int drink() {
        return volume - 10;
    }


    public int empty() {
        return 0;
    }

    public int fill() {
        return 100;
    }
}



//    Create a water bottle class with a volume property.
//        The volume should start at 100.
//        Add a drink function that takes 10 from the volume each time it is called.
//        Create an empty function that brings the volume down to 0.
//        Create a fill function that fills the volume back to 100.


