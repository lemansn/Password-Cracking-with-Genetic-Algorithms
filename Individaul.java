/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geneticalgorithm;

/**
 *
 * @author leman
 */
import java.util.ArrayList;

public class Individaul {
    private int b;
    private ArrayList<ArrayList> a;
    public Individaul(ArrayList<ArrayList> a, int b) {
        this.b=b;
        this.a=a;
    }

    @Override
    public String toString(){

        return getA()+String.valueOf(getB()) ;
    }


    public void printArr(){
        System.out.println(getA());

    }
    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * @return the a
     */
    public ArrayList getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(ArrayList a) {
        this.a = a;
    }


}
