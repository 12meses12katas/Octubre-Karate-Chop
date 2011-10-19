class KarateChop
  validate: ->
    if @index >= @arrayOfInt.length
      -1
    else
      if @arrayOfInt[@index] isnt @int
        @index++
        @validate()
      else 
        @index

  chop: (@int, @arrayOfInt) ->
    @index = 0
    @validate()

exports.KarateChop = KarateChop
