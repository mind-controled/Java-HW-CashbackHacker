package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn1000for0() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(1000, service.remain(0));
    }

    @Test
    public void shouldReturn100For900() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(900, service.remain(100));
    }

    @Test
    public void shouldReturn999For1() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(999, service.remain(1));
    }

    @Test
    public void shouldReturn999For1001() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(999, service.remain(1001));
    }

    @Test
    public void shouldReturn0For1000() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(0, service.remain(1000));
    }
}