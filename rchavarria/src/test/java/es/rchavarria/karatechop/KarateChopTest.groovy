package es.rchavarria.karatechop;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

class KarateChopTest {

    private karate
    
    @Before
    public void setUp() throws Exception {
        karate = new IterativeChop()
    }

    @Test
    void testEmptyArray() {
        assert -1 == karate.chop(3, [])
    }
    
    @Test
    void testOneElementArray() {
        assert -1 == karate.chop(0, [1])
        assert 0 == karate.chop(1, [1])
        assert -1 == karate.chop(3, [1])
    }
    
    @Test
    void testTwoElementsArray() {
        assert 0 == karate.chop(1, [1,3])
        assert 1 == karate.chop(3, [1,3])
        assert -1 == karate.chop(0, [1, 3])
        assert -1 == karate.chop(2, [1, 3])
        assert -1 == karate.chop(4, [1, 3])
    }

    @Test
    void testThreeElementsArray() {
        assert 0 == karate.chop(1, [1, 3, 5])
        assert 1 == karate.chop(3, [1, 3, 5])
        assert 2 == karate.chop(5, [1, 3, 5])
        assert -1 == karate.chop(0, [1, 3, 5])
        assert -1 == karate.chop(2, [1, 3, 5])
        assert -1 == karate.chop(4, [1, 3, 5])
        assert -1 == karate.chop(6, [1, 3, 5])
    }

    @Test
    void testFourOrMoreElementsArray() {
        assert 0 == karate.chop(1, [1, 3, 5, 7])
        assert 1 == karate.chop(3, [1, 3, 5, 7])
        assert 2 == karate.chop(5, [1, 3, 5, 7])
        assert 3 == karate.chop(7, [1, 3, 5, 7])
        
        assert 4 == karate.chop(9, [1, 3, 5, 7, 9, 11, 13])
        
        assert -1 == karate.chop(0, [1, 3, 5, 7, 9, 11, 13])
        assert -1 == karate.chop(4, [1, 3, 5, 7, 9, 11, 13])
        assert -1 == karate.chop(8, [1, 3, 5, 7, 9, 11, 13])
        assert -1 == karate.chop(14, [1, 3, 5, 7, 9, 11, 13])
        
        assert 7 == karate.chop(15, [1, 3, 5, 7, 9, 11, 13, 15, 17, 19])
        
        def zeroTo99 = [0..99]
        
        zeroTo99.eachWithIndex { item, idx ->
            assert idx == karate.chop(item, zeroTo99)
        }
    }
}
