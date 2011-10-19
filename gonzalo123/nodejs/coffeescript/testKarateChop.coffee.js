var KarateChop = require('./KarateChop.cs.js').KarateChop;

exports["testChop"] = function(test){
    var karateChop = new KarateChop();
    test.equal(-1, karateChop.chop(3, []));
    test.equal(-1, karateChop.chop(3, [1]));
    test.equal(0,  karateChop.chop(1, [1]));

    test.equal(0,  karateChop.chop(1, [1, 3, 5]));
    test.equal(1,  karateChop.chop(3, [1, 3, 5]));
    test.equal(2,  karateChop.chop(5, [1, 3, 5]));
    test.equal(-1, karateChop.chop(0, [1, 3, 5]));
    test.equal(-1, karateChop.chop(2, [1, 3, 5]));
    test.equal(-1, karateChop.chop(4, [1, 3, 5]));
    test.equal(-1, karateChop.chop(6, [1, 3, 5]));
    
    test.equal(0,  karateChop.chop(1, [1, 3, 5, 7]));
    test.equal(1,  karateChop.chop(3, [1, 3, 5, 7]));
    test.equal(2,  karateChop.chop(5, [1, 3, 5, 7]));
    test.equal(3,  karateChop.chop(7, [1, 3, 5, 7]));
    test.equal(-1, karateChop.chop(0, [1, 3, 5, 7]));
    test.equal(-1, karateChop.chop(2, [1, 3, 5, 7]));
    test.equal(-1, karateChop.chop(4, [1, 3, 5, 7]));
    test.equal(-1, karateChop.chop(6, [1, 3, 5, 7]));
    test.equal(-1, karateChop.chop(8, [1, 3, 5, 7]));


    test.done();
};


