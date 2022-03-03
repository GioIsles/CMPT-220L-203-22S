package base;
public class Plant {
    boolean needsWatering;
    String plantFamily;
    String name;

    public Plant(boolean needsWatering2, String plantFamily2, String name2) {
    }

    void wateringInstructions(){
        System.out.println("Use 12oz of water.");
    }

    void sunlightRequirements(){
        System.out.println("Get 8 hours of sun.");
    }

    void PlantPrint(){
        System.out.println("Plant Information:");
        System.out.println("Needs Watering: " + needsWatering);
        System.out.println(plantFamily);
        System.out.println(name);
    }
}