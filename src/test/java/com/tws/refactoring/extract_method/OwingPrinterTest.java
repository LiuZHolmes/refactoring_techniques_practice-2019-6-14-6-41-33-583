package com.tws.refactoring.extract_method;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void printOwing() {
        // given
        String name = "name";
        double amount = 13.0;
        OwingPrinter owingPrinter = new OwingPrinter();
        Order order = new Order(amount);
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(order);
        // when
        owingPrinter.printOwing(name, orders);

    }
}