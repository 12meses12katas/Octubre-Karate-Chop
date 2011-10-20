package es.rchavarria.karatechop

import java.util.concurrent.Callable 
import java.util.concurrent.ExecutorService 
import java.util.concurrent.Executors 
import java.util.concurrent.Future 

class ConcurrentMatcher implements Callable<Integer> {
    def target
    def left
    def right
    def values
    
    public Integer call(){
        if(left == right){
            return target == values[left] ? left : -1
        }
        
        def halfPoint = (1 + right - left) / 2 as Integer
        def middle = left + halfPoint
    
        def cmLeft = new ConcurrentMatcher(target:target, left:0, right:middle - 1, values:values)
        def cmRight = new ConcurrentMatcher(target:target, left:middle, right:right, values:values)
        
        ExecutorService exe = Executors.newCachedThreadPool()
        List<Future<Integer>> futures = exe.invokeAll([cmLeft, cmRight])
    
        def result = -1
        futures.each {
            def futureResult = it.get()
            if(futureResult != -1)
                result = futureResult
        }
    
        return result
    }
}
