<?php

interface Chopper {

	public function chop($number, $vector);

}

class IterativeChopper {

	public function chop(
		$number,
		$vector
	) {
		return -1;
	}

}
