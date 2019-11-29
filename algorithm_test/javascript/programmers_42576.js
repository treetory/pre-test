function solution(participant, completion) {
    let answer = '';
    
    /* 풀이 첫번째 시도
    let _pArr = participant;
    let _cArr = completion;

    while(_cArr.length > 0) {
        let position = _cArr.length-1;
        let _c = _cArr[position];
        _cArr.splice(position, 1);
        PARTICIPENT : for (let i=0; i<_pArr.length; i++) {
            _cArr.splice(position, 1);
            if (_c == _pArr[i]) {
                _pArr.splice(i, 1);
                break PARTICIPENT;
            }
        }
    }

    answer = _pArr[0];
    */

    /* 풀이 두번째 시도
    let _pArr = participant.sort();
    let _cArr = completion.sort();

    let _flag = true;
    while(_flag) {
        let _p = _pArr[0];
        let _c = _cArr[0];
        
        if (_p == _c) {
            _pArr.shift();
            _cArr.shift();
        } else {
            answer = _p;
            _flag = false;
        }
        //console.log(_p+" ---> "+_c+" ---> "+answer);
    }
    */

    /* 풀이 세번째 시도 */
    let _pArr = participant;
    let _cArr = completion;
    
    let _flag = true;
    while(_flag) {
        let _p = _pArr.pop();
        let _filterd = _cArr.filter((value, index, array) => {
            //console.log(_cArr+" ---> "+value+" ---> "+_p);
            if (value == _p) {
                array = _cArr.splice(index, 1);
            }
            return value == _p;
        });
        
        if (_filterd.length == 0) {
            answer = _p;
            _flag = false;
        }
    }

    return answer;
}

console.log(solution(["leo", "kiki", "eden"], ["eden", "kiki"]));
console.log(solution(["mislav", "stanko", "mislav", "ana"], ["stanko", "ana", "mislav"]));
console.log(solution(["marina", "josipa", "nikola", "vinko", "filipa"], ["josipa", "filipa", "marina", "nikola"]));