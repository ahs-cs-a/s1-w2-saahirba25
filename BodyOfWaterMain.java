public class BodyOfWaterMain {
    public static void main(String[] args) {
        BodyOfWater b = new BodyOfWater("Chad",400000,180,false);
        BodyOfWater b1 = new BodyOfWater("Chad",180.0);
        System.out.println(b.getname());
        System.out.println(b.getlargestDiameter());
        System.out.println(b.getAverageDepth());
        System.out.println(b.getisSaltWater());
        System.out.println(b1.getname());
        System.out.println(b1.getAverageDepth());
        b1.setname("Superior");
        b1.setAvgDepth(406.0);
        System.out.println(b1.getname());
        System.out.println(b1.getAverageDepth());
    }
}
