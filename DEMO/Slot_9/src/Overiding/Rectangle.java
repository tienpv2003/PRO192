package Overiding;


public class Rectangle {
    protected int length = 0, width =0;

    public void setValue(int l) {
        length = l>0?l:0;}
    public void setValue(int l, int w) {
        length = l>0?l:0;
        width = w>0?w:0;}
    
    @Override
    public String toString()
    {
        return "[" + length +"," + width + "]";
    }
    }

    
    

