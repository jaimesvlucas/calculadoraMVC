/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author DAW-B
 */
public class Calculadora {
    private double op1,op2;
    private String operacion;

    public Calculadora() {
    }

    public Calculadora(double op1, double op2, String operacion) {
        this.op1 = op1;
        this.op2 = op2;
        this.operacion = operacion;
    }

    public double getOp1() {
        return op1;
    }

    public void setOp1(double op1) {
        this.op1 = op1;
    }

    public double getOp2() {
        return op2;
    }

    public void setOp2(double op2) {
        this.op2 = op2;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
    
    public double getResultado(){
        double resultado = 0;
        switch(this.operacion){
            case "+":
                resultado = this.op1+this.op2;
                break;
            case "-":
                resultado = this.op1-this.op2;
                break;
            case "*":
                resultado = this.op1*this.op2;
                break;
            case "/":
                resultado = this.op1/this.op2;
                break;
        }
        return resultado;
    }
}
