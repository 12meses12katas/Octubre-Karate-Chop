<?php

interface Chopper {

	public function chop($number, $vector);

}

class IterativeChopper {

	public function chop(
		$number,
		$vector
	) {
		$left = 0;
		$right = count($vector) - 1;
	
		while ($left <= $right) {
			$mid = round(($right + $left) / 2);
			if ($vector[$mid] == $number)
				return $mid;
			if ($vector[$mid] < $number)
				$left = $mid + 1;
			else
				$right = $mid - 1;
		}

		return -1;
	}

}
