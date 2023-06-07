package DTO;

import java.util.Scanner;

public class Painting extends Item {

    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting() {
        super();
    }

    public Painting(int value, String creator, int height, int width, boolean isWatercolour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isWatercolour() {
        return isWatercolour;
    }

    public boolean isFramed() {
        return isFramed;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setWatercolour(boolean watercolour) {
        isWatercolour = watercolour;
    }

    public void setFramed(boolean framed) {
        isFramed = framed;
    }

    public void outputPainting() {
        super.output();

        System.out.println("Height: " + this.height);
        System.out.println("Width: " + this.width);
        System.out.println("Is Watercolour: " + this.isWatercolour);
        System.out.println("Is Framed: " + this.isFramed);
    }

    public void inputPainting() {
        super.input();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter height: ");
        this.height = sc.nextInt();

        System.out.println("Enter width: ");
        this.width = sc.nextInt();

        System.out.println("Is it a watercolour painting? (true/false): ");
        this.isWatercolour = sc.nextBoolean();

        System.out.println("Is it framed? (true/false): ");
        this.isFramed = sc.nextBoolean();
    }
}
