package sample.Instructions;

public class Pen implements VecInstruction {


    private int colour;
    private Instruction type;

    public Pen(Instruction type,String colour) {
        this.type = type;
        this.colour = Integer.parseInt(colour, 16);
    }

    public int getColour() {
        return this.colour;
    }

    @Override
    public String toString() {
        return String.format("%s %s",this.type.toString(),Integer.toHexString(this.colour).toUpperCase());
    }
}
