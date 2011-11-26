describe('Karate Chop!', function(){

    describe('resolved iteratively', function(){
    
        it('finds a number', function(){
            var iterative = new Iterative();
            
            expect(iterative.chop(3,  [])).toEqual(-1);
            expect(iterative.chop(3, [1])).toEqual(-1);
            expect(iterative.chop(1, [1])).toEqual(0);
            
            expect(iterative.chop(1, [1, 3, 5])).toEqual(0);
            expect(iterative.chop(3, [1, 3, 5])).toEqual(1);
            expect(iterative.chop(5, [1, 3, 5])).toEqual(2);
            expect(iterative.chop(0, [1, 3, 5])).toEqual(-1);
            expect(iterative.chop(2, [1, 3, 5])).toEqual(-1);
            expect(iterative.chop(4, [1, 3, 5])).toEqual(-1);
            expect(iterative.chop(6, [1, 3, 5])).toEqual(-1);
            
            expect(iterative.chop(1, [1, 3, 5, 7])).toEqual(0);
            expect(iterative.chop(3, [1, 3, 5, 7])).toEqual(1);
            expect(iterative.chop(5, [1, 3, 5, 7])).toEqual(2);
            expect(iterative.chop(7, [1, 3, 5, 7])).toEqual(3);
            expect(iterative.chop(0, [1, 3, 5, 7])).toEqual(-1);
            expect(iterative.chop(2, [1, 3, 5, 7])).toEqual(-1);
            expect(iterative.chop(4, [1, 3, 5, 7])).toEqual(-1);
            expect(iterative.chop(6, [1, 3, 5, 7])).toEqual(-1);
            expect(iterative.chop(8, [1, 3, 5, 7])).toEqual(-1);
        });
    });


});