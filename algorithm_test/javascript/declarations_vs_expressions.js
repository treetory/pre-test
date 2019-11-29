/**
 * Function Declarations
 */
function funcDeclarations() {
    return "An example of function declaration";
}

console.log(funcDeclarations());

/**
 * Function Expressions
 */
var funcExpression = function() {
    return "An example of function expression";
}

console.log(funcExpression());

/**
 * Differences between Declarations and Expression
 *  -> be impacted on hoisting of function in script file.
 */

/**
 * example 1
 */

// before execute
/*
console.log(logMessage());
console.log(sumNumbers());

function logMessage() {
  return 'worked';
}

var sumNumbers = function () {
  return 10 + 20;
};
*/
// -> be occured an error tha sumNumbers is not a function

// when executed, hoisting the function named 'logMessage' to upward.
// but, sumNumbers is not hoisted.
/*
function logMessage() {
    return 'worked';
}
  
var sumNumbers;
  
logMessage(); // 'worked'
sumNumbers(); // Uncaught TypeError: sumNumbers is not a function
  
sumNumbers = function () {
    return 10 + 20;
};
*/
/**
 * Expressions is not impacted by hoisting the functions.
 * And expressions are used as clousure and callback.
 */

/**
 * example 2 - using clousure
 */
function tabsHandler(index) {
    return function tabClickEvent(event) {
        // 바깥 함수인 tabsHandler() 의 index 인자를 여기서 접근할 수 있다.
        //console.log(index); // 탭을 클릭할 때 마다 해당 탭의 index 값을 표시
        return index;
    };
}

var tabs = [];
var i;

for (i = 0; i < 3; i += 1) {
    let temp = {};
    temp.onclick = tabsHandler(i);
    tabs.push(temp);
}

for (i = 0; i < tabs.length; i += 1) {
    console.log(tabs[i].onclick());
}