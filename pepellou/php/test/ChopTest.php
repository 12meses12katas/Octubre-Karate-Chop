<?php

require_once 'src/Chop.php';

class ChopperTest extends PHPUnit_Framework_TestCase {

	public function data_test(
	) {
		return array(
			"empty array" => array(-1, 3, array()),
			"element not found (a)" => array(-1, 3, array(1)),
			"unique element" => array(0,  1, array(1)),
			"first of three" => array(0,  1, array(1, 3, 5)),
			"second of three" => array(1,  3, array(1, 3, 5)),
			"third of three" => array(2,  5, array(1, 3, 5)),
			"element not found (b)" => array(-1, 0, array(1, 3, 5)),
			"element not found (c)" => array(-1, 2, array(1, 3, 5)),
			"element not found (d)" => array(-1, 4, array(1, 3, 5)),
			"element not found (e)" => array(-1, 6, array(1, 3, 5)),
			"first of four" => array(0,  1, array(1, 3, 5, 7)),
			"second of four" => array(1,  3, array(1, 3, 5, 7)),
			"third of four" => array(2,  5, array(1, 3, 5, 7)),
			"fourth of four" => array(3,  7, array(1, 3, 5, 7)),
			"element not found (f)" => array(-1, 0, array(1, 3, 5, 7)),
			"element not found (g)" => array(-1, 2, array(1, 3, 5, 7)),
			"element not found (h)" => array(-1, 4, array(1, 3, 5, 7)),
			"element not found (i)" => array(-1, 6, array(1, 3, 5, 7)),
			"element not found (j)" => array(-1, 8, array(1, 3, 5, 7))
		);
	}

	/**
	 * @dataProvider data_test
	*/
	public function test_iterative(
		$result,
		$number,
		$vector
	) {
		$chopper = new IterativeChopper();
		$this->assertEquals($result, $chopper->chop($number, $vector));
	}

	/**
	 * @dataProvider data_test
	*/
	public function test_recursive(
		$result,
		$number,
		$vector
	) {
		$chopper = new RecursiveChopper();
		$this->assertEquals($result, $chopper->chop($number, $vector));
	}

}

?>
