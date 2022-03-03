package base;
public class Plant {
    boolean needsWatering;
    String plantFamily;
    String name;
    public int var1;
    public int var2;


    public Plant(boolean needsWatering, String plantFamily, String name, int var1, int var2) {
    this.needsWatering = needsWatering;
    this.plantFamily = plantFamily;
    this.name = name;
    this.var1 = var1;
    this.var2 = var2;
    PlantPrint();
    wateringInstructions();
    sunlightRequirements();
    }

    void wateringInstructions(){
        System.out.println("Watering Instructions: Use " + var1 + "oz of water.");
    }

    void sunlightRequirements(){
        System.out.println("Sunlight Requirements: Get " + var2 + " hours of sun.");
    }

    void PlantPrint(){
        System.out.println(name + " Information ->");
        System.out.println("Needs Watering: " + needsWatering);
        System.out.println("Plant Family: " + plantFamily);
        System.out.println("Plant Name: " + name);
    }
}