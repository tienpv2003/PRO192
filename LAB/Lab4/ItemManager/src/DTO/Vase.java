package DTO;

import java.util.Scanner;

public class Vase extends Item {

    private int height;
    private String material;

    public Vase() {
        super();
    }

    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void outputVase() {
        super.output();

        System.out.println("Height: " + this.height);
        System.out.println("Material: " + this.material);
    }

    public void inputVase() {
        super.input();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter height: ");
        this.height = sc.nextInt();

        System.out.println("Enter material: ");
        sc.nextLine(); 
        this.material = sc.nextLine();
    }
}
