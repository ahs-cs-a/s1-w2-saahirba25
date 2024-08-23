public class BodyOfWater{
    private String name;
    private double largestDiameter;
    private double AvgDepth;
    private boolean isSaltwater;

    public BodyOfWater(String n, double ld, double ad, boolean s){
        name = n;
        largestDiameter = ld;
        AvgDepth = ad;
        isSaltwater = s;
    }
    public BodyOfWater(String n, double ad){
        name = n;
        AvgDepth = ad;
    }
    public String getname(){
        return name;
    }
    public double getlargestDiameter(){
        return largestDiameter;
    }
    public double getAverageDepth(){
        return AvgDepth;
    }
    public boolean getisSaltWater(){
        return isSaltwater;
    }
    public void setname(String n){
        name = n;
    }
    public void setAvgDepth(double ad){
        AvgDepth = ad;
    }
}
