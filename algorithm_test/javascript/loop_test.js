let fruit = ['pear', 'banana', 'orange', 'apple', 'pineapple'];

let print = function(item, index, object) { console.log(item); console.log(index); }

//전통적인 함수전달을 통한 결과 값 출력
//fruit.forEach( print );

//arrow function을 통한 결과 값 출력(multiple attribute 전달)
//fruit.forEach((item, index, object) => { console.log(item, index, object); });

//arrow function을 통한 결과 값 출력(single attribute 전달)
//fruit.forEach(item => console.log(item));

/*
let numbers1 = [0,1,2,3,4,5,6,7];
let result1 = numbers1.every(value => value < 10);
console.log(result1);
*/

/*
let numbers2 = [0,1,256,3,4,5,6,7];
let result2 = numbers2.every(value => value < 10);
console.log(result2);
*/

/*
let result3 = numbers2.every(value => value++ < 10);
console.log(result3);
console.log(numbers2);
*/

/*
let numbers4 = [0,10,2,3,4,5,6,7];
let condition = value => value <10;
let some = numbers4.some(condition);
let every = numbers4.every(condition);
console.log(some);
console.log(every);
*/

/*
let numbers = [0,10,2,3,4,5,6,7];
let condition = value => value < 10;
let filtered = numbers.filter(condition);
console.log(filtered);
console.log(numbers);
*/

/*
let numbers = [0,1,256,3,4,5,6,7];
let result = numbers.map(value => value = value + 1);
console.log(result);
console.log(numbers);
*/

/*
const numbers = [1,2,4];
const R = (accumulator, currentValue) => accumulator + currentValue;
console.log(numbers.reduce(R));
*/

/*
Reducers And Updating Object Properties / Database Entry
After the database API round trip you may want to update the application view. But why update all objects everywhere, when you can “reduce” which object properties should be affected, without having to copy the entire object.

Let’s say your car listing management application has a button that updates the price of a particular vehicle. The user sets a new price and clicks on the button. An action is dispatched to update the vehicle in the database. Then the callback function returns containing the object with all properties for that vehicle ID. But, we only need to update the price. A reducer can make sure to update only the price not the entire object. The object is then sent back to the database and application view is updated.

Creating Your Own Object Iterables With [Symbol.iterator]
In some advanced cases you might be interested in this pattern for creating your own iterable object. To be honest though I can’t think of anything practical. If you know anything about this or have practical experience with Symbol.iterator post a comment perhaps then I can update the tutorial.
*/

let iterable = {
  [Symbol.iterator]() {
      return {
        i : 0,
        next() {
          if (this.i < 3)
            return { value : this.i++, done : false }
          return { value : 1, done : true }
        }
      }
  }
}

for (let value of iterable)
  console.log(value);
