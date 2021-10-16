/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab_3;

/**
 *
 * @author 88017
 */
public class smartPhone {
    String name,camera;
    int price;
    smartPhone(){
        name="Redmi note5";
        camera="20mpxl";
        price=12000;
        
        System.out.println("FOR NON-PARAMETERIZED: ");
        System.out.println("Name= "+name);
        System.out.println("Camera "+camera);
        System.out.println("Price= "+price);
    }
    smartPhone(String name,String camera,int price){
        this.name=name;
        this.camera=camera;
        this.price=price;
        System.out.println("FOR PARAMETERIZED: ");
        System.out.println("Name= "+name);
        System.out.println("Camera= "+camera);
        System.out.println("Price= "+price);
    }
}
