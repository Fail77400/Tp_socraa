package com.epita.socra.app;

import com.epita.socra.app.tools.Roman;
import com.epita.socra.app.tools.ToInt;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.epita.socra.app.tools.IOAdapter;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void givenAMock_WhenRunningMain_ThenCheckOuputs() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("TEST");
        App app = new App(mock);
        app.run();

        verify(mock).write("Hello, what's your name ?");
        verify(mock).write(argThat(message -> message.contains("TEST")));

    }


    @Test
    public void test2999toRomanOutput() {
        int nb = 2999;
        Roman r = new Roman();
        assert r.toRoman(nb).equals("MMCMXCIX");
    }

    @Test
    public void test3000toRomanOutput() {
        int nb = 3000;
        Roman r = new Roman();
        assert r.toRoman(nb).equals("MMM");
    }

    @Test
    public void test1toRomanOutput(){
        int nb = 1;
        Roman r = new Roman();
        assert r.toRoman(nb).equals("I");
    }

    @Test
    public void test135toRomanOutput(){
        int nb = 135;
        Roman r = new Roman();
        assert r.toRoman(nb).equals("CXXXV");
    }

    @Test
    public void test344toRomanOutput(){
        int nb = 344;
        Roman r = new Roman();
        assert r.toRoman(nb).equals("CCCXLIV");
    }

    @Test
    public void test5toRomanOutput(){
        int nb = 5;
        Roman r = new Roman();
        assert r.toRoman(nb).equals("V");
    }

    @Test
    public void test10toRomanOutput(){
        int nb = 10;
        Roman r = new Roman();
        assert r.toRoman(nb).equals("X");
    }

    @Test
    public void test50toRomanOutput(){
        int nb = 50;
        Roman r = new Roman();
        assert r.toRoman(nb).equals("L");
    }

    @Test
    public void test100toRomanOutput(){
        int nb = 100;
        Roman r = new Roman();
        assert r.toRoman(nb).equals("C");
    }

    @Test
    public void test500toRomanOutput(){
        int nb = 500;
        Roman r = new Roman();
        assert r.toRoman(nb).equals("D");
    }

    @Test
    public void test1000toRomanOutput(){
        int nb = 1000;
        Roman r = new Roman();
        assert r.toRoman(nb).equals("M");
    }

    @Test
    public void testItoInt_Outpout()
    {
        String nb = "I";
        ToInt i = new ToInt();
        assert Integer.toString(i.toint(nb)).equals("1");
    }

    @Test
    public void testVtoInt_Outpout()
    {
        String nb = "V";
        ToInt i = new ToInt();
        assert Integer.toString(i.toint(nb)).equals("5");
    }

    @Test
    public void testXtoInt_Outpout()
    {
        String nb = "X";
        ToInt i = new ToInt();
        assert Integer.toString(i.toint(nb)).equals("10");
    }

    @Test
    public void testLtoInt_Outpout()
    {
        String nb = "L";
        ToInt i = new ToInt();
        assert Integer.toString(i.toint(nb)).equals("50");
    }

    @Test
    public void testCtoInt_Outpout()
    {
        String nb = "C";
        ToInt i = new ToInt();
        assert Integer.toString(i.toint(nb)).equals("100");
    }

    @Test
    public void testDtoInt_Outpout()
    {
        String nb = "D";
        ToInt i = new ToInt();
        assert Integer.toString(i.toint(nb)).equals("500");
    }

    @Test
    public void testMtoInt_Outpout()
    {
        String nb = "M";
        ToInt i = new ToInt();
        assert Integer.toString(i.toint(nb)).equals("1000");
    }



}
