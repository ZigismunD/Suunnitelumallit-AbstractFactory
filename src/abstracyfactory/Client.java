/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracyfactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author zigis
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        Class c = null;
        VaateTehdas tehdas = null;

        Properties properties = new Properties();
        try {
            properties.load(
                    new FileInputStream("tehdas.properties"));
            //System.out.println(properties.getProperty("tehdas"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            //luetaan toteuttava tehdas properties-tiedostosta
            c = Class.forName(properties.getProperty("tehdas"));
            tehdas = (VaateTehdas) c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        VaateTehdas jasper  = tehdas;
        jasper.luoFarkut();
        jasper.luoLippis();
        jasper.luoKengat();
        jasper.luoPaita();
        System.out.println("Jasperilla on päällään: " + jasper);

    }

}
