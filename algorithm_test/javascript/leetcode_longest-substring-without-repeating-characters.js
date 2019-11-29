/**
 * 
3. Longest Substring without repeating characters

Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

--> 메모이제이션, 동적계획법(Dynamic Programming) 을 사용해 보라는 말들이 많음
--> 우리가 스터디했던 함수형을 바탕으로 한다면, 메모이제이션을 쓰는 것이 맞는 것 같음
 * 
 */

/**
 * 958개 테스트 케이스 중 95개 통과, 걸린 부분이 "cdd" 
 *  -> 문제를 풀기위한 접근 방법을 처음부터 다시 가야할 것 같음
 *  -> 내가 푼 것은 substring 의 delimeter 가 되는 문자의 길이를 구한 것인데..
 *  -> delimeter 가 될 문자의 기준을 수립하는 방식이 달라서 발생한 것으로 보임
 * 
 *  -> 현재 풀이 방식은 같은 문자가 나오는 시점부터 앞의 것을 버리는 방식을 취함
 *  -> 이게 문제임... "cdd" 는 expected 가 2 인데 반해, 현재 구현한 코드는 1을 반환함
 *  -> 그 이유는 반복이 발생된 시점에서 버리기 때문에 cd 가 들어있던 acc 는 초기화되고, acc에 다시 d 를 쌓았기 때문임
 *  -> 문제는 cd 와 d 가 있을 때, 둘 중 더 긴 delimeter 문자는 cd 이기 때문에 2가 반환되어야 한다는 것임
 * 
 *  -> 지금 코드의 문제는 acc 에 담긴 것을 초기화 한다는 것 그럼 이부분만 해결하면 되려나...?
 *  -> 일단 쌓여있던 것과 남은 것의 길이를 비교해서, 쌓여있던 것이 많으면 버리지 않으면 되려나...
 * 
var lengthOfLongestSubstring = (function() {
    let _func = function(_s, _acc = new Array(), _preState = false, switchCnt = 0) {
        let _strs = _s;
        if (_s.length < 1) {
            return _acc.join("").length; 
        } else {
            let _str = _strs.charAt(0);
            _strs = _s.substring(1, _strs.length);
            let _curState = _acc.includes(_str);
            if (!_acc.includes(_str)) {
                _acc.push(_str);
            } else {
                if (switchCnt < 1) {
                    if ((!_preState && _curState) || (_preState && !_curState)) {
                        _acc.splice(0, _acc.length);
                        _acc.push(_str);
                        ++switchCnt;
                    }
                }
            }
            return _func(_strs, _acc, _curState, switchCnt);
        }
    };
    return _func;
})();
 */

/**
 * 
 * 958개 테스트 케이스 중 205개 통과, 걸린 부분이 "ckilbkd" 
 *  -> 문제를 풀기위한 접근 방법을 처음부터 다시 가야할 것 같음
 *  -> 문제가 발생하는 부분이 substring 을 한다고 쳤을 때, delimeter 포함 구분되는 String 의 개수가 3개가 안될 때 문제가 되는 것 같음
 *  -> 이 문제는 delimeter 가 반복된 문자가 있지 않는 조건하에 가장 길게 뽑히는 것을 찾아야 함
 * 
 *  -> 상기 test case 는 "ckilb" 와 "kd" 둘로 나뉘고, 이렇게 delimeter 포함 2개로만 쪼개질 때는 남은 것 둘 중 긴 것을 취하게 해야 하는 것 같음
 *  -> 그럼 이제 컨셉을 바꿔봐야겠음
 * 

var lengthOfLongestSubstring = (function() {
    let _func = function(_s, _acc = new Array()) {
        let _strs = _s;
        if (_s.length < 1) {
            return _acc.join("").length; 
        } else {
            let _str = _strs.charAt(0);
            _strs = _s.substring(1, _strs.length);
            let _curState = _acc.includes(_str);
            console.log("--- ["+_str+"] ["+_acc+"] ["+_strs+"]");
            if (!_acc.includes(_str)) {
                _acc.push(_str);
            } else {
                console.log(">>> ["+_str+"] ["+_acc+"] ["+_strs+"] : "+_acc.lastIndexOf(_str));
                if (_acc.length < _strs.length) {
                    _acc.splice(0, _acc.length);
                    _acc.push(_str);
                }
                console.log(">>> ["+_str+"] ["+_acc+"] ["+_strs+"] : "+_acc.lastIndexOf(_str));
            }
            return _func(_strs, _acc);
        }
    };
    return _func;
})();
 */

/**
 * 958개 테스트 케이스 중 107 통과, 걸린 부분이 "dvdf" 
 * --> 또 다시 문제를 풀기위한 접근 방법을 엎어야 할 것 같음
 * --> "d" 와 "vdf" 로 나눠야 하나 "dv" 와 "df" 로 나누는 문제가 발생함

var lengthOfLongestSubstring = (function() {
    let _func = function(_s, _accD = new Array(), _accS = new Array(), _preState = false) {
        let _strs = _s;
        if (_s.length < 1) {
            // _accS 에 쌓인 것인 3개 일 때, 가운데 것이 substring 을 위한 delimeter 문자열
            // _accS 에 쌓인 것인 2개 일 때, 둘 중 긴 것이 delimeter 문자열?
            console.log("["+_accS+"] ["+_accD+"] ["+_preState+"]");
            if (_accD.length > 0 && !_preState) {
                _accS.push(_accD.join(""));
            }
            console.log("["+_accS+"] ["+_accD+"] ");
            return _accS.length == 3 ? _accS[1].length : (_accS.length == 2 ? Math.max(_accS[0].length, _accS[1].length) : (_accS.length == 1 ? _accS[0].length : 0));
        } else {
            let _str = _strs.charAt(0);
            _strs = _s.substring(1, _strs.length);
            let _curState = _accD.includes(_str);
            if (!_curState) {
                _accD.push(_str);
            } else {
                // 이 구간이 완전히 바뀔 예정
                if ((!_preState && _curState)) {
                    _accS.push(_accD.join(""));
                    _accD.splice(0, _accD.length);
                }
                _accD.push(_str);
            }
            console.log("--- ["+_str+"] ["+_accD+"] ["+_accS+"]");
            return _func(_strs, _accD, _accS, _curState);
        }
    };
    return _func;
})();
 */
/*
var lengthOfLongestSubstring = (function() {
    let _func = function(_string, _acc = new Array()) {
        let _s = _string;
        if (_s.length < 1) {
            return _acc;
        } else {
            let _char = _s.charAt(_s.length-1);
            _s = _s.slice(0, _s.length-1);
            _acc.push(_char);
            return _func(_s, _acc);
        }
    };
    return _func;
})();
*/

var lengthOfLongestSubstring = (function() {
    let _func = function(_s, _accD = new Array(), _accS = new Array(), _preState = false) {
        let _strs = _s;
        if (_s.length < 1) {
            // _accS 에 쌓인 것인 3개 일 때, 가운데 것이 substring 을 위한 delimeter 문자열
            // _accS 에 쌓인 것인 2개 일 때, 둘 중 긴 것이 delimeter 문자열?
            console.log("["+_accS+"] ["+_accD+"] ["+_preState+"]");
            if (_accD.length > 0 && !_preState) {
                _accS.push(_accD.join(""));
            }
            console.log("["+_accS+"] ["+_accD+"] ");
            return _accS.length == 3 ? _accS[1].length : (_accS.length == 2 ? Math.max(_accS[0].length, _accS[1].length) : (_accS.length == 1 ? _accS[0].length : 0));
        } else {
            let _str = _strs.charAt(0);
            _strs = _s.substring(1, _strs.length);
            let _curState = _accD.includes(_str);
            if (!_curState) {
                _accD.push(_str);
            } else {
                // 이 구간이 완전히 바뀔 예정
                if ((!_preState && _curState)) {
                    _accS.push(_accD.join(""));
                    _accD.splice(0, _accD.length);
                }
                _accD.push(_str);
            }
            console.log("--- ["+_str+"] ["+_accD+"] ["+_accS+"]");
            return _func(_strs, _accD, _accS, _curState);
        }
    };
    return _func;
})();

console.log("Expected : 3 >>> Output : "+lengthOfLongestSubstring("abcabcbb"));
console.log("Expected : 1 >>> Output : "+lengthOfLongestSubstring("bbbbb"));
console.log("Expected : 3 >>> Output : "+lengthOfLongestSubstring("pwwkew"));
console.log("Expected : 1 >>> Output : "+lengthOfLongestSubstring(" "));
console.log("Expected : 0 >>> Output : "+lengthOfLongestSubstring(""));
console.log("Expected : 2 >>> Output : "+lengthOfLongestSubstring("au"));
console.log("Expected : 2 >>> Output : "+lengthOfLongestSubstring("cdd"));
console.log("Expected : 2 >>> Output : "+lengthOfLongestSubstring("aab"));
console.log("Expected : 3 >>> Output : "+lengthOfLongestSubstring("dvdf"));
console.log("Expected : 5 >>> Output : "+lengthOfLongestSubstring("ckilbkd"));
