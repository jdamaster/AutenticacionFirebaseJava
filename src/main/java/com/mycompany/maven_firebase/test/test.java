/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maven_firebase.test;

import com.mycompany.maven_firebase.Autenticator;

/**
 *
 * @author Usuario
 */
public class test {
    static Autenticator autenticador= new Autenticator();
    public static void main(String[] args) {
        // TODO code application logic here
        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ2IjowLCJkIjp7InByb3ZpZGVyIjoicGFzc3dvcmQiLCJ1aWQiOiI2MzZmNmE0ZC0xMGJjLTQ0MDAtYTU2MS1lYTMxODMyY2U1Y2YifSwiaWF0IjoxNDYyMTQ4NjU2fQ.Hx8tbI2ooYVAwJ9dPx0yAVjEtGMKJ67W4aTkOHch_zU";
        String token2 = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ2IjowLCJkIjp7InByb3ZpZGVyIjoicGFzc3dvcmQiLCJ1aWQiOiI2MzZmNmE0ZC0xMGJjLTQ0MDAtYTU2MS1lYTMxODMyY2U1Y2YifSwiaWF0IjoxnDYyMTQ4NjU2fQ.Hx8tbI2ooYVAwJ9dPx0yAVjEtGMKJ67W4aTkOHch_zU";
        boolean valido=autenticador.validarToken(token);
        if (valido){
            System.out.println("Token valido");
        }else{
            System.out.println("Token no valido");
        }
    }
}
