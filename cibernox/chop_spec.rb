require './chop.rb'

shared_examples_for 'Chop' do

  it "#search should return the index of the element if it finds it, or -1 if it doesn't" do
    subject.chop(1, [1, 3, 5, 7]).should == 0
    subject.chop(3, [1, 3, 5, 7]).should == 1
    subject.chop(5, [1, 3, 5, 7]).should == 2

    subject.chop(7, [1, 3, 5, 7]).should == 3
    subject.chop(0, [1, 3, 5, 7]).should == -1
    subject.chop(2, [1, 3, 5, 7]).should == -1
    subject.chop(4, [1, 3, 5, 7]).should == -1
    subject.chop(6, [1, 3, 5, 7]).should == -1
    subject.chop(8, [1, 3, 5, 7]).should == -1
    #
    subject.chop(1, [1, 3, 5]).should == 0
    subject.chop(3, [1, 3, 5]).should == 1
    subject.chop(5, [1, 3, 5]).should == 2
    subject.chop(0, [1, 3, 5]).should == -1
    subject.chop(2, [1, 3, 5]).should == -1
    subject.chop(4, [1, 3, 5]).should == -1
    subject.chop(6, [1, 3, 5]).should == -1
    #
    subject.chop(3, [ ]).should == -1
    subject.chop(3, [1]).should == -1
    subject.chop(1, [1]).should == 0
    
  end
  
end

describe RecursiveChop do
  it_should_behave_like 'Chop'
end

# describe IterativeChop do
#   it_should_behave_like 'Chop'
# end