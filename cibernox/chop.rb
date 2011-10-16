class IterativeChop

  def chop(value, ary)
    inicio = pivot = 0
    fin = ary.size
    while inicio != fin
      pivot = (inicio + fin)/2
      return pivot if ary[pivot] == value
      ary[pivot] > value ? fin = pivot : inicio = pivot + 1
    end
    ary[pivot] == value ? pivot : -1
  end

end

class RecursiveChop
  def chop(value, ary)
    pivot = ary.size/2
    if ary[pivot] == value
      pivot
    elsif ary[pivot].nil? || ary.size == 1
      -1
    elsif ary[pivot] < value
      rec = chop(value, ary[pivot+1..ary.size-1])
      rec == -1 ? -1 : pivot + rec + 1
    else
      chop(value, ary[0..pivot-1])
    end
  end    
end

class PseudoRecursiveChop
  def chop(value, ary, displacement = 0)
    pivot = (displacement > 0 ? ary.size + displacement + 1 : ary.size)/2
    if ary[pivot] == value
      pivot
    elsif ary[pivot].nil? || ary.size == 1
      -1
    elsif ary[pivot] < value
      chop(value, ary, pivot)
    else
      chop(value, ary[0..pivot-1])
    end
  end    
end
