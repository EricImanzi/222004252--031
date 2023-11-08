interface BuildingMaterial {
    void describeMaterial();
}


class Brick implements BuildingMaterial {
    private String material;
    private int width;
    private int height;
    private int length;

    public Brick(String material, int width, int height, int length) {
        this.material = material;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    
    public void describeMaterial() {
        System.out.println("Brick Material: " + material);
        System.out.println("Brick Dimensions (in mm):");
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Length: " + length);
    }
}


class Wood implements BuildingMaterial {
    private String material;
    private double length;
    private double width;

    public Wood(String material, double length, double width) {
        this.material = material;
        this.length = length;
        this.width = width;
    }

   
    public void describeMaterial() {
        System.out.println("Wood Material: " + material);
        System.out.println("Wood Dimensions (in mm):");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
}


class Concrete implements BuildingMaterial {
    private String material;
    private double density;

    public Concrete(String material, double density) {
        this.material = material;
        this.density = density;
    }

    
    public void describeMaterial() {
        System.out.println("Concrete Material: " + material);
        System.out.println("Concrete Density: " + density + " kg/m^3");
    }
}

public class building {
    public static void main(String[] args) {
        
        BuildingMaterial brick = new Brick("Clay", 75, 45, 230);
        BuildingMaterial wood = new Wood("Oak", 2400, 120);
        BuildingMaterial concrete = new Concrete("Reinforced", 2400);

        
        brick.describeMaterial();
        wood.describeMaterial();
        concrete.describeMaterial();
    }
}
