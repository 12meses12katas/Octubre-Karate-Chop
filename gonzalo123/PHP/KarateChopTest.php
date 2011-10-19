<?php
include('KarateChop.php');
class KarateChopTest extends PHPUnit_Framework_TestCase
{
    public function testChop()
    {
        $karateChop = new KarateChop;
        $this->assertEquals(-1, $karateChop->chop(3, array()));
        $this->assertEquals(-1, $karateChop->chop(3, array(1)));
        $this->assertEquals(0,  $karateChop->chop(1, array(1)));

        $this->assertEquals(0,  $karateChop->chop(1, array(1, 3, 5)));
        $this->assertEquals(1,  $karateChop->chop(3, array(1, 3, 5)));
        $this->assertEquals(2,  $karateChop->chop(5, array(1, 3, 5)));
        $this->assertEquals(-1, $karateChop->chop(0, array(1, 3, 5)));
        $this->assertEquals(-1, $karateChop->chop(2, array(1, 3, 5)));
        $this->assertEquals(-1, $karateChop->chop(4, array(1, 3, 5)));
        $this->assertEquals(-1, $karateChop->chop(6, array(1, 3, 5)));
        
        $this->assertEquals(0,  $karateChop->chop(1, array(1, 3, 5, 7)));
        $this->assertEquals(1,  $karateChop->chop(3, array(1, 3, 5, 7)));
        $this->assertEquals(2,  $karateChop->chop(5, array(1, 3, 5, 7)));
        $this->assertEquals(3,  $karateChop->chop(7, array(1, 3, 5, 7)));
        $this->assertEquals(-1, $karateChop->chop(0, array(1, 3, 5, 7)));
        $this->assertEquals(-1, $karateChop->chop(2, array(1, 3, 5, 7)));
        $this->assertEquals(-1, $karateChop->chop(4, array(1, 3, 5, 7)));
        $this->assertEquals(-1, $karateChop->chop(6, array(1, 3, 5, 7)));
        $this->assertEquals(-1, $karateChop->chop(8, array(1, 3, 5, 7)));
    }
}
