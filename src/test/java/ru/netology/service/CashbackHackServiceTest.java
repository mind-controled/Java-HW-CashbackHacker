package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void shouldReturn1000for0() {
        assertEquals(service.remain(0), 1000);
    }

    @org.testng.annotations.Test
    public void shouldReturn100For900() {
        assertEquals(service.remain(100), 900);
    }

    @org.testng.annotations.Test
    public void shouldReturn999For1() {
        assertEquals(service.remain(1), 999);
    }

    @org.testng.annotations.Test
    public void shouldReturn999For1001() {
        assertEquals(service.remain(1001), 999);
    }

    @org.testng.annotations.Test
    public void shouldReturn0For1000() {
        assertEquals(service.remain(1000), 0);
    }
}