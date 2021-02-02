package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {
    public BalancedBracketsTest(){

    }
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void leftHalfBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void rightHalfBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void bracketsWithCharReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[abcdefg]"));
    }
    @Test
    public void bracketsWithNumbersReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[123456]"));
    }

    @Test
    public void bracketsWithNumbersAndCharReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[abc123]"));
    }

    @Test
    public void curlyBracesReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("{}"));
    }

    @Test
    public void parenthesesReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("()"));
    }

    @Test
    public void doubleClosedBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void bracketsWithParenthesesReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[()]"));
    }

    @Test
    public void bracketsWithCurlyBracesReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[{}]"));
    }

    @Test
    public void bracketsWithSymbolsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[!@#$%^&*]"));
    }


}
