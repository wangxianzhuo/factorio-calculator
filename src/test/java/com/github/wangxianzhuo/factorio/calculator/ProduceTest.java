package com.github.wangxianzhuo.factorio.calculator;

import com.github.wangxianzhuo.factorio.calculator.model.Recipe;
import com.github.wangxianzhuo.factorio.calculator.model.factory.machine.AssemblingMachine;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class ProduceTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void produce() {
        Produce produce = new Produce(new Recipe("", new ArrayList<>(), 1, 1, new AssemblingMachine()), 0.5);
        produce.produce();
    }

    @Test
    void printPlan() {
    }
}