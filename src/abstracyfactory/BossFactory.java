/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracyfactory;

/**
 *
 * @author zigis
 */
public class BossFactory implements AbstractFactory {
    AbstractFarkut farkut = null;
    AbstractLippis lippis = null;
    AbstractKengat kengat = null;
    AbstractPaita paita = null;

    @Override
    public void luoFarkut() {
        farkut = new BossFarkut();
    }

    @Override
    public void luoLippis() {
        lippis = new BossLippis();
    }

    @Override
    public void luoKengat() {
        kengat = new BossKengat();
    }

    @Override
    public void luoPaita() {
        paita = new BossPaita();
    }
    
    public String toString() {
        return farkut + ", " + lippis + ", " + paita + " sekä " + kengat;
    }
    
}
