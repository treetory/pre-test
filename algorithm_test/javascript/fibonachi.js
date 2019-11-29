/**
 * 피보나치 수열(0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...) 
 * -> 입력받은 순서의 피보나치 수를 구하라
 * 
 * @param {*} n     n 번째 피보나치 수
 */

/**
 * 가장 직관적인 fibonachi 의 수를 구하는 함수
 */
function fibonachi(n) {
    if (n<2)
        return n;
    return fibonachi(n-1) + fibonachi(n-2);
}
// 1. 경우의 수가 작으므로 실행이 금방 됨 -> 함수 호출 횟수 25회
//console.log(fibonachi(6));
// 2. 경우의 수가 크므로 실행이 매우 오래 걸림 -> 함수 호출 횟수 354,224,848,179,261,915,075 회
//console.log(fibonachi(100));

/**
 * 반복문을 사용한 fibonachi 의 수를 구하는 함수
 */
function fibonachiLoop(n) {
    let cur, pre = 1, prepre = 0;
    if (n<2)
        return n;
    for (let i=2; i<=n; i++) {
        // 이번 반복의 피보나치 수
        cur = pre + prepre;
        // 다음번 반복을 위해 앞의 피보나치 수를 한칸 미룸
        prepre = pre;
        // 다음번 반복을 위해 현재의 피노바치 수를 앞의 피보나치 수로 한칸 미룸
        pre = cur;
    }
    return cur;
}
// 1. 반복 회수가 입력받은 n번 이하이므로, 반복을 계속해도 함수 호출에 의해 Stack 에 추가되는 것은 없다. -> 빨라짐
//console.log(fibonachiLoop(100));

/**
 * Tail Call -> 
 * 함수를 호출해서 값을 반환받은 후, 아무일도 하지 않고 바로 반환하게 하기 위해
 * 논리적으로 가장 마지막(꼬리) 위치에서 함수를 호출하는 방식
 * 
 * Tail Call Optimization ->
 * 꼬리호출 방식으로 코드를 짜면 Stack을 새로 만들지 않고 이미 있는 Stack 속의 값만
 * 대체해서 Stack 을 재사용하는 방식으로 동작하도록 최적화 한다. 이를 꼬리호출 최적화라 한다.
 * 꼬리호출 최적화는 언어의 실행 환경에서 지원해줘야 한다.
 * 
 * 꼬리호출을 이용하여 finobachi 의 수를 구하는 함수
 */
function fibonachiTailRecursion(n, pre, prepre) {
    let cur;
    if (n < 2)
        return n + pre;
    // 이번 반복의 피보나치 수
    cur = pre + prepre;
    // 다음번 반복을 위해 앞의 피보나치 수를 한칸 미룸
    prepre = pre;
    // 다음번 반복을 위해 현재의 피노바치 수를 앞의 피보나치 수로 한칸 미룸
    pre = cur;
    return fibonachiTailRecursion(n-1, pre, prepre);
}

// 1. 함수 호출 횟수가 100회 임 -> 재귀호출을 두겹에서 한겹으로 줄였기 때문
//console.log(fibonachiTailRecursion(100, 1, 0));

/**
 * 상기 함수를 더 다듬은 것 (refactoring)
 * f(n) = f(n-1) +f(n-2) ====> f(n, fibo1, fibo2) = f(n-1, fibo1+fibo2, fibo1)
 */
function fibonachiTailRecursionCompact(n, pre, prepre) {
    if (n < 2)
        return n + pre;
    return fibonachiTailRecursionCompact(n - 1, pre + prepre, pre);
}

console.log(fibonachiTailRecursionCompact(100, 1, 0));