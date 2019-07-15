//test 1: no parameters
/*
function that the first test is based on
var test1 = function test1() {
    console.log("Test 1");
};
*/

//ES6
var test1 = () => { console.log("Test 1"); };
test1();

//test 2: multiple parameters

/*
function that the second test is based on
var multiplyES5 = function(x, y) {
  return x * y;
};
*/

var x = 7;
var y = 4;
var result = 0;
const multiplyES6 = (x, y) => { return x * y };
result = multiplyES6(x, y);
console.log(result);

//test 3: a use case for an arrow function
const array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15];

/*
function that the third test is based on
var divisibleByThrreeES5 = array.filter(function (v){
  return v % 3 === 0;
});
*/

// 
const divisibleByThreeES6 = array.filter(v => v % 3 === 0);

console.log(divisibleByThreeES6); // [3, 6, 9, 12, 15]