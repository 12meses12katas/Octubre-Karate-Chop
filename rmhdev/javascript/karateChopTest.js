
function KarateChopTest() {}
registerTestSuite(KarateChopTest);

KarateChopTest.prototype.chopEmptyListShouldReturnMinus = function () {
    expectThat(karateChop.simpleChop(3, []), equals(-1));
}
KarateChopTest.prototype.chopNonExistingItemFromSimpleListShouldReturnMinus = function () {
    expectThat(karateChop.simpleChop(3, [1]), equals(-1));
}
KarateChopTest.prototype.chopExistingItemFromSimpleListShouldReturnPosition = function () {
    expectThat(karateChop.simpleChop(1, [1]), equals(0));
}

KarateChopTest.prototype.chopFirstItemFromThreeItemListShouldReturnPosition = function () {
    expectThat(karateChop.simpleChop(1, [1, 3, 5]), equals(0));
}
KarateChopTest.prototype.chopSecondItemFromThreeItemListShouldReturnPosition = function () {
    expectThat(karateChop.simpleChop(3, [1, 3, 5]), equals(1));
}
KarateChopTest.prototype.chopLastItemFromThreeItemListShouldReturnPosition = function () {
    expectThat(karateChop.simpleChop(5, [1, 3, 5]), equals(2));
}
KarateChopTest.prototype.chopNonExistingItem0FromThreeItemListShouldReturnMinus = function () {
    expectThat(karateChop.simpleChop(0, [1, 3, 5]), equals(-1));
}
KarateChopTest.prototype.chopNonExistingItem2FromThreeItemListShouldReturnMinus = function () {
    expectThat(karateChop.simpleChop(2, [1, 3, 5]), equals(-1));
}
KarateChopTest.prototype.chopNonExistingItem4FromThreeItemListShouldReturnMinus = function () {
    expectThat(karateChop.simpleChop(4, [1, 3, 5]), equals(-1));
}
KarateChopTest.prototype.chopNonExistingItem6FromThreeItemListShouldReturnMinus = function () {
    expectThat(karateChop.simpleChop(6, [1, 3, 5]), equals(-1));
}

KarateChopTest.prototype.chopFirstItemFromFourItemListShouldReturnPosition = function() {
    expectThat(karateChop.simpleChop(1, [1, 3, 5, 7]), equals(0));
}
KarateChopTest.prototype.chopSecondItemFromFourItemListShouldReturnPosition = function() {
    expectThat(karateChop.simpleChop(3, [1, 3, 5, 7]), equals(1));
}
KarateChopTest.prototype.chopThirdItemFromFourItemListShouldReturnPosition = function() {
    expectThat(karateChop.simpleChop(5, [1, 3, 5, 7]), equals(2));
}
KarateChopTest.prototype.chopLastItemFromFourItemListShouldReturnPosition = function() {
    expectThat(karateChop.simpleChop(7, [1, 3, 5, 7]), equals(3));
}
KarateChopTest.prototype.chopNonExistingItem0FromFourItemListShouldReturnMinus = function() {
    expectThat(karateChop.simpleChop(0, [1, 3, 5, 7]), equals(-1));
}
KarateChopTest.prototype.chopNonExistingItem2FromFourItemListShouldReturnMinus = function() {
    expectThat(karateChop.simpleChop(2, [1, 3, 5, 7]), equals(-1));
}
KarateChopTest.prototype.chopNonExistingItem4FromFourItemListShouldReturnMinus = function() {
    expectThat(karateChop.simpleChop(4, [1, 3, 5, 7]), equals(-1));
}
KarateChopTest.prototype.chopNonExistingItem6FromFourItemListShouldReturnMinus = function() {
    expectThat(karateChop.simpleChop(6, [1, 3, 5, 7]), equals(-1));
}
KarateChopTest.prototype.chopNonExistingItem8FromFourItemListShouldReturnMinus = function() {
    expectThat(karateChop.simpleChop(8, [1, 3, 5, 7]), equals(-1));
}

