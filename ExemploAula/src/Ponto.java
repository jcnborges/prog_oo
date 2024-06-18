/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Ponto {
    private float x;
    private float y;

    public Ponto() {
        this.x = 0;
        this.y = 0;
    }

    public Ponto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getX() {
        return x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("x = %f, y = %f", this.x, this.y);
    }
    
    public float distancia() {
        return (float) Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
    
    public float distancia(Ponto pt) {
        return (float) Math.sqrt(Math.pow(this.x - pt.getX(), 2) + Math.pow(this.y - pt.getY(), 2));
    }
    
}
