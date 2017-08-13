package models;

public class Crop {
    private String cropName;
    private String cropDescription;
    private String cropFamily;
    private String cropVariety;
    private String cropScientificName;
    private int cropDaysToMaturity;
    private String cropNotes;
    private boolean cropFrostHardy;
    private int cropSpacingRowPerBed;
    private int cropRowSpacing;
    private float cropYieldPerLinearFoot;
    private int cropYieldPerWeek;
    private int cropYieldNumberOfDays;
    private String cropYieldUnit;
    private float cropUnitValue;
    private String cropKeywords;
    private int cropId;

    private boolean directSeed;
    private boolean transplant;
    private String traySize;
    private boolean heatMatRequired;
    private int heatMatTemp;
    private boolean potMoveOnUp;

    private int seedsPerUnit;
    private float seedsPerDirectFoot;
    private float seedPerTray;
    private String seedUnit;


    // constructor

    public Crop(String cropName) {
        this.cropName = cropName;
        this.cropDescription = cropDescription;
        this.cropFamily = cropFamily;
        this.cropVariety = cropVariety;
        this.cropScientificName = cropScientificName;
        this.cropDaysToMaturity = cropDaysToMaturity;
        this.cropNotes = cropNotes;
        this.cropFrostHardy = cropFrostHardy;
        this.cropSpacingRowPerBed = cropSpacingRowPerBed;
        this.cropRowSpacing = cropRowSpacing;
        this.cropYieldPerLinearFoot = cropYieldPerLinearFoot;
        this.cropYieldPerWeek = cropYieldPerWeek;
        this.cropYieldNumberOfDays = cropYieldNumberOfDays;
        this.cropYieldUnit = cropYieldUnit;
        this.cropUnitValue = cropUnitValue;
        this.cropKeywords = cropKeywords;
        this.cropId = cropId;
        this.directSeed = directSeed;
        this.transplant = transplant;
        this.traySize = traySize;
        this.heatMatRequired = heatMatRequired;
        this.heatMatTemp = heatMatTemp;
        this.potMoveOnUp = potMoveOnUp;
        this.seedsPerUnit = seedsPerUnit;
        this.seedsPerDirectFoot = seedsPerDirectFoot;
        this.seedPerTray = seedPerTray;
        this.seedUnit = seedUnit;
    }


    // getters nad setters


    public int getCropId() {
        return cropId;
    }

    public void setCropId(int cropId) {
        this.cropId = cropId;
    }

    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

    public String getCropDescription() {
        return cropDescription;
    }

    public void setCropDescription(String cropDescription) {
        this.cropDescription = cropDescription;
    }

    public String getCropFamily() {
        return cropFamily;
    }

    public void setCropFamily(String cropFamily) {
        this.cropFamily = cropFamily;
    }

    public String getCropVariety() {
        return cropVariety;
    }

    public void setCropVariety(String cropVariety) {
        this.cropVariety = cropVariety;
    }

    public String getCropScientificName() {
        return cropScientificName;
    }

    public void setCropScientificName(String cropScientificName) {
        this.cropScientificName = cropScientificName;
    }

    public int getCropDaysToMaturity() {
        return cropDaysToMaturity;
    }

    public void setCropDaysToMaturity(int cropDaysToMaturity) {
        this.cropDaysToMaturity = cropDaysToMaturity;
    }

    public String getCropNotes() {
        return cropNotes;
    }

    public void setCropNotes(String cropNotes) {
        this.cropNotes = cropNotes;
    }

    public boolean isCropFrostHardy() {
        return cropFrostHardy;
    }

    public void setCropFrostHardy(boolean cropFrostHardy) {
        this.cropFrostHardy = cropFrostHardy;
    }

    public int getCropSpacingRowPerBed() {
        return cropSpacingRowPerBed;
    }

    public void setCropSpacingRowPerBed(int cropSpacingRowPerBed) {
        this.cropSpacingRowPerBed = cropSpacingRowPerBed;
    }

    public int getCropRowSpacing() {
        return cropRowSpacing;
    }

    public void setCropRowSpacing(int cropRowSpacing) {
        this.cropRowSpacing = cropRowSpacing;
    }

    public float getCropYieldPerLinearFoot() {
        return cropYieldPerLinearFoot;
    }

    public void setCropYieldPerLinearFoot(float cropYieldPerLinearFoot) {
        this.cropYieldPerLinearFoot = cropYieldPerLinearFoot;
    }

    public int getCropYieldPerWeek() {
        return cropYieldPerWeek;
    }

    public void setCropYieldPerWeek(int cropYieldPerWeek) {
        this.cropYieldPerWeek = cropYieldPerWeek;
    }

    public int getCropYieldNumberOfDays() {
        return cropYieldNumberOfDays;
    }

    public void setCropYieldNumberOfDays(int cropYieldNumberOfDays) {
        this.cropYieldNumberOfDays = cropYieldNumberOfDays;
    }

    public String getCropYieldUnit() {
        return cropYieldUnit;
    }

    public void setCropYieldUnit(String cropYieldUnit) {
        this.cropYieldUnit = cropYieldUnit;
    }

    public float getCropUnitValue() {
        return cropUnitValue;
    }

    public void setCropUnitValue(float cropUnitValue) {
        this.cropUnitValue = cropUnitValue;
    }

    public String getCropKeywords() {
        return cropKeywords;
    }

    public void setCropKeywords(String cropKeywords) {
        this.cropKeywords = cropKeywords;
    }

    public boolean isDirectSeed() {
        return directSeed;
    }

    public void setDirectSeed(boolean directSeed) {
        this.directSeed = directSeed;
    }

    public boolean isTransplant() {
        return transplant;
    }

    public void setTransplant(boolean transplant) {
        this.transplant = transplant;
    }

    public String getTraySize() {
        return traySize;
    }

    public void setTraySize(String traySize) {
        this.traySize = traySize;
    }

    public boolean isHeatMatRequired() {
        return heatMatRequired;
    }

    public void setHeatMatRequired(boolean heatMatRequired) {
        this.heatMatRequired = heatMatRequired;
    }

    public int getHeatMatTemp() {
        return heatMatTemp;
    }

    public void setHeatMatTemp(int heatMatTemp) {
        this.heatMatTemp = heatMatTemp;
    }

    public boolean isPotMoveOnUp() {
        return potMoveOnUp;
    }

    public void setPotMoveOnUp(boolean potMoveOnUp) {
        this.potMoveOnUp = potMoveOnUp;
    }

    public int getSeedsPerUnit() {
        return seedsPerUnit;
    }

    public void setSeedsPerUnit(int seedsPerUnit) {
        this.seedsPerUnit = seedsPerUnit;
    }

    public float getSeedsPerDirectFoot() {
        return seedsPerDirectFoot;
    }

    public void setSeedsPerDirectFoot(float seedsPerDirectFoot) {
        this.seedsPerDirectFoot = seedsPerDirectFoot;
    }

    public float getSeedPerTray() {
        return seedPerTray;
    }

    public void setSeedPerTray(float seedPerTray) {
        this.seedPerTray = seedPerTray;
    }

    public String getSeedUnit() {
        return seedUnit;
    }

    public void setSeedUnit(String seedUnit) {
        this.seedUnit = seedUnit;
    }



}
