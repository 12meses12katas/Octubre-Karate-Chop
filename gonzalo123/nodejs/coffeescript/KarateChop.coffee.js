var KarateChop;
KarateChop = (function() {
  function KarateChop() {}
  KarateChop.prototype.validate = function() {
    if (this.index >= this.arrayOfInt.length) {
      return -1;
    } else {
      if (this.arrayOfInt[this.index] !== this.int) {
        this.index++;
        return this.validate();
      } else {
        return this.index;
      }
    }
  };
  KarateChop.prototype.chop = function(int, arrayOfInt) {
    this.int = int;
    this.arrayOfInt = arrayOfInt;
    this.index = 0;
    return this.validate();
  };
  return KarateChop;
})();
exports.KarateChop = KarateChop;
