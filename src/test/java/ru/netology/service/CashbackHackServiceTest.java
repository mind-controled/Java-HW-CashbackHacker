package ru.netology.service;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void shouldReturn1000for0() {
        assertEquals(1000, service.remain(0));
    }

    @org.junit.Test
    public void shouldReturn100For900() {
        assertEquals(900, service.remain(100));
    }

    @org.junit.Test
    public void shouldReturn999For1() {
        assertEquals(999, service.remain(1));
    }

    @org.junit.Test
    public void shouldReturn999For1001() {
        assertEquals(999, service.remain(1001));
    }

    @org.junit.Test
    public void shouldReturn0For1000() {
        assertEquals(0, service.remain(1000));
    }
}