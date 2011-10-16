# class IterativeChop
#   def chop(value, ary)

#   end
# end
class RecursiveChop
  def chop(value, ary)
    pivot = ary.size/2
    if ary[pivot].nil? || (ary.size == 1 &&  ary[pivot] != value)
      -1
    elsif ary[pivot] == value
      pivot
    elsif ary[pivot] < value
      rec = chop(value, ary[pivot+1..ary.size-1])
      rec == -1 ? -1 : pivot + rec + 1
    else
      chop(value, ary[0..pivot-1])
    end
  end    
end
