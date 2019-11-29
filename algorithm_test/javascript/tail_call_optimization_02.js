/**
 * Tail recursion 의 올바른 예
 *  -> 삼항 연산자는 JS 스펙에 정의된 콜스택에 메모리가 잡히지 않는 연산자입니다.
 */
const factorial_good = (x, acc=1) => {
    return ( x <= 1 ? acc : factorial_good(x-1, x*acc));
}

//console.log(factorial_good(5, 1));

/**
 * Tail recursin 의 틀린 예
 *  -> 삼항 연산자는 JS 스펙에 정의된 콜스택에 메모리가 잡히지 않는 연산자입니다.
 */
const factorial_bad = (x) => {
    return (x <= 0 ? 1 : x * factorial_bad(x-1));
}

console.log(factorial_bad(100, 1));