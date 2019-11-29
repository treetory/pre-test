/**
 * 가장 직관적인 1 부터 n 까지의 합을 구하는 함수
 */
function sum(n) {
    if (n < 2)
        return n;
    return n + sum(n-1);
}
// 1. 경우의 수가 작으므로 실행이 금방 됨
//console.log(sum(5));

/**
 * 반복문을 사용한 1 부터 n 까지의 합을 구하는 함수
 */
function sumLoop(n) {
    let accmulator = 0;
    while(n) {
        accmulator += n--;
    }
    return accmulator;
}
// 1. 반복 회수가 입력받은 n번 이하이므로, 반복을 계속해도 함수 호출에 의해 Stack 에 추가되는 것은 없다. -> 빨라짐
//console.log(sumLoop(100));

/**
 * 꼬리호출을 이용하여 1 부터 n 까지의 합을 구하는 함수
 */
function sumTailRecursion(n) {
    if (n < 2)
        return n;
    return n + sumTailRecursion(n - 1);
}

//console.log(sumTailRecursion(100));

/**
 * 꼬리호출 최적화를 이용하여 1 부터 n 까지의 합을 구하는 함수
 */
function sumOptimizedTailRecursion(n, acc) {
    if (n === 0)
        return acc;
    acc += n;
    return sumOptimizedTailRecursion(--n, acc);
}

console.log(sumOptimizedTailRecursion(100, 0));