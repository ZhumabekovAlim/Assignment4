public class PointBoosterFactory {
    public static PointBoosterItem craftingItem(int type){
        switch (type) {
            case 1:
                return new SoulBooster();
            case 2:
                return new Skadi();
            case 3:
                return new AghanimScepter();
            default:
                throw new IllegalArgumentException("Not this item in shop!");
        }
    }
}
