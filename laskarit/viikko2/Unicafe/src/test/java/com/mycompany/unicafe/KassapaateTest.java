/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unicafe;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author leo
 */
public class KassapaateTest {
    
    Kassapaate kassapaate;
    Maksukortti maksukortti;
    
    public KassapaateTest() {
    }
    
    @Before
    public void setUp() {
        kassapaate = new Kassapaate();
        maksukortti = new Maksukortti(400);
    }
    
    @Test
    public void alussaOikeatLuvut() {
        
        assertThat(kassapaate.kassassaRahaa(), is(equalTo(100000)));
        assertThat(kassapaate.maukkaitaLounaitaMyyty(), is(equalTo(0)));
        assertThat(kassapaate.edullisiaLounaitaMyyty(), is(equalTo(0)));
    }
    
    // Käteisostoja testaavat testit; prefixoitu k:lla.
    
    @Test
    public void kEdullinenSaaMaksun() {
        kassapaate.syoEdullisesti(240);
        assertThat(kassapaate.kassassaRahaa(), is(equalTo(100240)));
    }
    
    @Test
    public void kEdullinenLasketaan() {
        kassapaate.syoEdullisesti(240);
        assertThat(kassapaate.edullisiaLounaitaMyyty(), is(equalTo(1)));
    }
    
    @Test
    public void kEdullinenOikeaVaihtoraha() {
        assertThat(kassapaate.syoEdullisesti(241), is(equalTo(1)));
    }
    
    @Test
    public void kEdullinenEiMyydaJosRahatEiRiita() {
        assertThat(kassapaate.syoEdullisesti(1), is(equalTo(1)));
        assertThat(kassapaate.kassassaRahaa(), is(equalTo(100000)));
    }
    
    @Test
    public void kMaukasSaaMaksun() {
        kassapaate.syoMaukkaasti(400);
        assertThat(kassapaate.kassassaRahaa(), is(equalTo(100400)));
    }
    
    @Test
    public void kMaukasLasketaan() {
        kassapaate.syoMaukkaasti(400);
        assertThat(kassapaate.maukkaitaLounaitaMyyty(), is(equalTo(1)));
    }
    
    @Test
    public void kMaukasOikeaVaihtoraha() {
        assertThat(kassapaate.syoMaukkaasti(401), is(equalTo(1)));
    }
    
    @Test
    public void kMaukasEiMyydaJosRahatEiRiita() {
        assertThat(kassapaate.syoMaukkaasti(1), is(equalTo(1)));
        assertThat(kassapaate.kassassaRahaa(), is(equalTo(100000)));
    }
    
    // Maksukorttimaksujen testit; prefixoitu m:llä;
    
    @Test
    public void mKassaEiMuutu() {
        maksukortti.lataaRahaa(240);
        kassapaate.syoEdullisesti(maksukortti);
        kassapaate.syoMaukkaasti(maksukortti);
        assertThat(kassapaate.kassassaRahaa(), is(equalTo(100000)));
    }
    
    @Test
    public void mKortilleLatautuuRahaa() {
        kassapaate.lataaRahaaKortille(maksukortti, 1);
        assertThat(maksukortti.saldo(), is(equalTo(401)));
    }
    @Test
    public void mKortilleLataaminenLisaaKassaan() {
        kassapaate.lataaRahaaKortille(maksukortti, 1);
        assertThat(kassapaate.kassassaRahaa(), is(equalTo(100001)));
    }
    
    @Test
    public void mKortilleEiVoiLadataNegatiivista() {
        kassapaate.lataaRahaaKortille(maksukortti, -1);
        assertThat(maksukortti.saldo(), is(equalTo(400)));
        assertThat(kassapaate.kassassaRahaa(), is(equalTo(100000)));
    }
    
    @Test
    public void mEdullinenLasketaan() {
        kassapaate.syoEdullisesti(maksukortti);
        assertThat(kassapaate.edullisiaLounaitaMyyty(), is(equalTo(1)));
    }
    
    @Test
    public void mEdullinenEiMyydaJosRahatEiRiita() {
        kassapaate.syoEdullisesti(maksukortti);
	assertThat(kassapaate.syoEdullisesti(maksukortti), is(not(true)));
        assertThat(maksukortti.saldo(), is(equalTo(400-240)));
        assertThat(kassapaate.edullisiaLounaitaMyyty(), is(equalTo(1)));
    }
    
    @Test
    public void mEdullinenVahentaaKortilta() {
        kassapaate.syoEdullisesti(maksukortti);
	assertThat(maksukortti.saldo(), is(equalTo(400-240)));
    }
    
    @Test
    public void mMaukasLasketaan() {
        kassapaate.syoMaukkaasti(maksukortti);
        assertThat(kassapaate.maukkaitaLounaitaMyyty(), is(equalTo(1)));
    }
    
    @Test
    public void mMaukasEiMyydaJosRahatEiRiita() {
        kassapaate.syoMaukkaasti(maksukortti);
	assertThat(kassapaate.syoMaukkaasti(maksukortti), is(not(true)));
        assertThat(maksukortti.saldo(), is(equalTo(0)));
        assertThat(kassapaate.maukkaitaLounaitaMyyty(), is(equalTo(1)));
    }
    
    @Test
    public void mMaukasVahentaaKortilta() {
        kassapaate.syoMaukkaasti(maksukortti);
	assertThat(maksukortti.saldo(), is(equalTo(0)));
    }
}
