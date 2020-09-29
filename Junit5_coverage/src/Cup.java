public class Cup {

    private String liquidType;
    private double percentfull;

    public Cup(String liquidType, double percentfull){
        this.liquidType = liquidType;
        this.percentfull = percentfull;
    }

    public String getLiquidType() {
        return liquidType;
    }

    public void setLiquidType(String liquidType) {
        this.liquidType = liquidType;
    }

    public double getPercentfull() {
        return percentfull;
    }

    public void setPercentfull(double percentfull) {
        this.percentfull = percentfull;
    }
}
