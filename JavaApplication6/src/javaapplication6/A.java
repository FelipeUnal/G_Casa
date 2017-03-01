/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author Estudiante
 */
public class A {
    
    private B[] bs;
    private int Con;
    public A(){
        bs =  new B[5];
        this.Con = 0;
    }
    
    public A(B[] bs){
        if(bs.length < 5){
            this.bs = bs;
        }
    }
    
    public void addB(B b){
        if(this.Con<5){
            this.bs[Con] = b; 
        }
    }
    
    public static void main(String[] args){
        
        
    }
    
}
