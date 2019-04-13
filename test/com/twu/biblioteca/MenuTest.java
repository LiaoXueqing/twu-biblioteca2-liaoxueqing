package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MenuTest {

    private Map<Integer, String> menuOptions;
    private Menu menu;

    @Before
    public void setUp() throws Exception {
        menuOptions = new HashMap<Integer, String>(){
            {
                put(2, "Checkout book");
                put(1, "List of books");
                put(0, "Exit");
            }
        };
        menu = new Menu(menuOptions);
    }

    @Test
    public void checkResultRight() {
        boolean result = menu.checkResult(1);
        assertTrue(result);
    }

    @Test
    public void checkResultError() {
        boolean result = menu.checkResult(9);
        assertFalse(result);
    }
}