/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract_Class;

/**
 *
 * @author PhạmVinhTiến
 */
public abstract class shapes {
    abstract public double circumstance();
    abstract public double area();
    
}
class Circle extends shapes{
    double r;

    public Circle(double rr) {
        r =rr;
    }
    public double circumstance() {
        return 2*Math.PI*r*r;
    }
    public double area(){
        return Math.PI*r*r;
    }
}

class Rect extends shapes{
    double l,w;
    public Rect (double ll, double ww){
        l = ll; w= ww;
    }
    public double circumstance(){
        return 2*(l+w);
    }
    public double area(){
        return l*w;
    }
}


