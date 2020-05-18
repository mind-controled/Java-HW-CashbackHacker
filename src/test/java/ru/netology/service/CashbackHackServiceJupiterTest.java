package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceJupiterTest {

    @org.junit.Test
    public void shouldReturn1000for0() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(1000, service.remain(0));
    }

    @org.junit.Test
    public void shouldReturn100For900() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(900, service.remain(100));
    }

    @org.junit.Test
    public void shouldReturn999For1() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(999, service.remain(1));
    }

    @org.junit.Test
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