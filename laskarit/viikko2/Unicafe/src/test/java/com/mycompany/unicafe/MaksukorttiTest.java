package com.mycompany.unicafe;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MaksukorttiTest {

    Maksukortti kortti;

    @Before
    public void setUp() {
        kortti = new Maksukortti(10);
    }

    @Test
    public void luotuKorttiOlemassa() {
        assertTrue(kortti!=null);      
    }
    
    @Test
    public void alkuSaldoOikein() {
        assertEquals(10, kortti.saldo());
    }
    
    @Test
    public void lisaaminenKasvattaaSaldoa() {
        kortti.lataaRahaa(10);
        assertEquals(20, kortti.saldo());
    }
    
    @Test
    public void ottaminenVahentaaSaldoa() {
        kortti.otaRahaa(10);
        assertEquals(0, kortti.saldo());
    }
    
    @Test
    public void kortinSaldonTaytyyRiittaa() {
        kortti.otaRahaa(11);
        assertEquals(10, kortti.saldo());
    }
        
    @Test
    public void ottaminenPalauttaaTotuusarvon() {
        assertTrue(kortti.otaRahaa(10));
        assertFalse(kortti.otaRahaa(1));
    }
}
