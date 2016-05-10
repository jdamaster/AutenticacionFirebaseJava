/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maven_firebase;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Autenticator {
    private final String FB_SECRET="Iz0jgNOaHJyBeQaQdQgU95UctzutLhzKXg8sUf0g";
     private final String Personal_SECRET="Zf7OVWIFJlfChJXcNKR6orBdDMhxEp1NYpdjNXlV";
    public boolean validarToken(String token){
        try{
            
            Claims claims = Jwts.parser().setSigningKey(FB_SECRET.getBytes("UTF-8")).parseClaimsJws(token).getBody();
            Date issuedDate = claims.getIssuedAt();
            //System.out.println("Expiration date: "+ claims.getExpiration().toString());
            System.out.println("issued date: "+ claims.getIssuedAt().toString());
            System.out.println("Subject: "+ claims.getSubject());
            System.out.println("ID: "+ claims.getId());
            System.out.println("Isuer: "+ claims.getIssuer());
            boolean hechoAntesDeAhora=issuedDate.before(new Date());
            if(hechoAntesDeAhora){
                return true;
            }else{
                System.out.println("Mierda nos ingresaron un token elaborado en el futuro!!!!");
                return false;
            }
            
        
        }catch(io.jsonwebtoken.SignatureException e){
            System.out.println("este no es el secreto pa ese token");
               
        } catch (UnsupportedEncodingException ex) {
            System.out.println("codificacion erronea");
            
        } catch (io.jsonwebtoken.MalformedJwtException ex) {
            System.out.println("codificacion erronea");
            
        }catch (NullPointerException ex) {
            System.out.println("lamento decirte que no es valido(token nulo o falta la fecha)");
            
        }
        return false; 
    }
    
}
