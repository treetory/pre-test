/*
    Array 의 built-in 함수로서 reduce() 의 시그니처는 다음과 같다.
    // Array.prototype.reduce
    arr.reduce(iterator [, initialValue]);

    iterator는 다음과 같은 인자를 받는다.
    accumulator(
        accumulated,    // 콜백에서 반환한 누적값 (타입 상관없음)
        currentValue,   // 배열에서 순회중인 현재 값 (타입 상관없음)
        currentIndex,   // 배열에서 순회중인 현재 인덱스
        context         // reduce() 를 호출한 현재 배열
    )
*/

/*
    reduce 함수를 이용하여 1부터 10까지 합을 구한 것 -> 누산기의 원리를 이용함.
    acc 의 값 
    01회차 :  0 +  1 =  1
    02회차 :  1 +  2 =  3
    03회차 :  3 +  3 =  6
    04회차 :  6 +  4 = 10
    05회차 : 10 +  5 = 15
    06회차 : 15 +  6 = 21
    07회차 : 21 +  7 = 28
    08회차 : 28 +  8 = 36
    09회차 : 36 +  9 = 45
    10회차 : 45 + 10 = 55
*/
const numbers = [1,2,3,4,5,6,7,8,9,10];
const initAcc = 0;
const sum = numbers.reduce((acc, cur, curIdx, array) => {
    return acc + cur;
}, initAcc)

console.log(sum);

/*
    Array.prototype.filter 를 reduce로 구현한 예제
*/
const isEven = val => val%2 === 0;
let filtered = [ 2, 4, 5, 6, 8 ].filter(isEven);
console.log(filtered);
let reduced = [ 2, 4, 5, 6, 8 ].reduce((acc, cur, i, a) => {
        if (cur%2 === 0) {
            acc.push(cur);
        }
        return acc;
    }
    , []);
console.log(reduced); 

/*
    타입 변환
*/
const saids = [ 'ko', '안녕', 'en', 'hello', 'ja', 'こんにちは' ];

let converted = saids.reduce((acc, val, index, orig) => {
    (index === 0 || index%2 === 0) ? 
        acc[val] = orig[index + 1] : acc, acc
}, {});
console.log(converted);
