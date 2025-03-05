/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classa;

class A {
    void callThis(){
        System.out.println("Inside Class A's Method!");
    }
    
}

class B extends A{
    void callThis(){
        System.out.println("Inside Class B's Method!");
    }
    
}

class C extends A {
    void callThis(){
        System.out.println("Inside Class C's Method!");
    }
    
}
