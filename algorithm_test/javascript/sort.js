let selectionSort = function(array) {
    console.log("원본 : ["+array+"]");
    let arr = array;
    let pos = array.length-1;
    let sort = function(arr, pos) {
        let _last = arr[pos];
        let _max = arr[0];
        let _idx = 0;
        if (pos > 0) {
            for (let i=0; i<=pos; i++) {
                if (arr[i]>_max) {
                    _idx = i;
                    _max = arr[i];
                }
            }
            console.log("MAX : ["+_max+"] 제일 큰 값의 위치 : ["+_idx+"]");
            arr[pos] = _max;
            arr[_idx] = _last;
            //console.log(arr);
            return sort(arr, --pos);
        } else {
            console.log("리턴할 결과 값 : ["+arr+"]");
            return arr;
        }
    }
    return sort(arr, pos);
}

//console.log(selectionSort([29, 10, 14, 37, 13]));

let bubbleSort = function(array) {
    console.log("원본 : ["+array+"]");
    let arr = array;
    let pos = array.length-1;
    let sort = function(arr, pos) {
        for (let i=1; i<=pos; i++) {
            let _pre = arr[i-1];
            let _cur = arr[i];
            // swap
            if (_pre>_cur) {
                arr[i-1] = _cur;
                arr[i] = _pre;
            }
        }
        console.log("반복시행차수 : ["+pos+"] 버블정렬 결과 : ["+arr+"]");
        return (pos > 0 ? sort(arr, --pos) : arr);
    }
    return sort(arr, pos);
}

//console.log(bubbleSort([29, 10, 14, 37, 13]));

let insertionSort = function(array) {

    console.log("원본 : ["+array+"]");
    let _length = array.length;
    for (let i=1; i<_length; i++) {
        let key = array[i]; //현재값 저장
        let j = i -1; // 정렬된 부분의 현재 인덱스
        // swap 규칙 : 좌측 값이 현재 값보다 클 때
        while (j >= 0 && array[j] > key) {
            console.log( array[j] + " ---> "+array[j+1] + " | " + key + " ---> " + array[j] );
            array[j+1] = array[j];
            j = j -1;
        }
        // 현재값을 정렬된 부분의 인덱스에 저장한다. -> swap 을 했는지 안했는지와 상관없이 진행된다.
        array[j+1] = key;
    }
    return array;
}

//console.log(insertionSort([15, 12, 13, 10, 14, 11]));
