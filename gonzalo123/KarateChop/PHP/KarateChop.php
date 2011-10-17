<?php
class KarateChop
{
    public function chop($int, array $arrayOfInt)
    {
        if (!in_array($int, $arrayOfInt))
            return -1;
        else
            foreach ($arrayOfInt as $key => $value)
                if ($value == $int)
                    return $key;
    }
}
