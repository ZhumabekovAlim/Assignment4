public class Main {
    public static void main(String[] args) {

        PointBoosterItem soulBooster = PointBoosterFactory.craftingItem(1);
        soulBooster.craft();

        PointBoosterItem skadi = PointBoosterFactory.craftingItem(2);
        skadi.craft();

        PointBoosterItem aghanim = PointBoosterFactory.craftingItem(3);
        aghanim.craft();
    }
}