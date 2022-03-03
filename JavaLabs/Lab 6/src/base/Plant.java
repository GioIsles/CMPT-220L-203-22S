package base;
public class Plant {
    boolean needsWatering;
    String plantFamily;
    String name;
    public int var1;
    public int var2;


    public Plant(boolean needsWatering2, String plantFamily2, String name2, int var1, int var2) {
    }

    void wateringInstructions(){
        System.out.println("Use " + var1 + "oz of water.");
    }

    void sunlightRequirements(){
        System.out.println("Get " + var2 + " hours of sun.");
    }

    void PlantPrint(){
        System.out.println("Plant Information:");
        System.out.println("Needs Watering: " + needsWatering);
        System.out.println(plantFamily);
        System.out.println(name);
    }
}