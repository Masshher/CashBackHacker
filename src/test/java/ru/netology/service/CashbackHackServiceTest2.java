package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest2 {
    @Test
    public void purchaseAmountLessThan1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void purchaseAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void purchaseAmountOver1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void purchaseAmount0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        Assertions.assertEquals(actual, expected);
    }

}