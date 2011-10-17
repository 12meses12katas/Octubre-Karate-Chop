package es.rchavarria.karatechop

class RecursiveChop {

    public chop(def target, def values){
        if(!values){
            return -1
        }
        
        chopNotEmptyArray(target, values, 0, values.size() - 1)
    }
    
    private chopNotEmptyArray(def target, def values, def left, def right) {
        def middle = left + (1 + right - left) / 2 as Integer
        
        if(left != right){
            if(target < values[middle]){
                right = middle - 1
            } else {
                left = middle
            }
            return chopNotEmptyArray (target, values, left, right)
        }
        
        target == values[left] ? left: -1
    }
}
