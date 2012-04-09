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

class RecursiveChopper {

	public function chop(
		$number,
		$vector
	) {
		$count = count($vector);
		if ($count == 0)
			return -1;
		if ($count == 1)
			return ($vector[0] == $number) ? 0 : -1;
		$mid = round($count / 2);
		if ($number < $vector[$mid])
			return $this->chop($number, array_slice($vector, 0, $mid));
		$right = $this->chop($number, array_slice($vector, $mid));
		return ($right == -1) ? -1 : $mid + $right;
	}

}

class RecursiveIterativeChopper {

	public function _chop(
		$number,
		$vector,
		$left,
		$right
	) {
		if ($left > $right)
			return -1;
		$mid = round(($right + $left) / 2);
		if ($vector[$mid] == $number)
			return $mid;
		if ($vector[$mid] < $number)
			return $this->_chop($number, $vector, $mid + 1, $right);
		else
			return $this->_chop($number, $vector, $left, $mid - 1);
	}

	public function chop(
		$number,
		$vector
	) {
		return $this->_chop($number, $vector, 0, count($vector) - 1);
	}


}
