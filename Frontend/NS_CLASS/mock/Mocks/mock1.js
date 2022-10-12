// Write code in js to find out the most frequent item of an array.
//And also try to find out which numbers are prime and which are even,
// also find out vowels and consonants from the same array
// input is [ 2, 6, 8, 3, 5, 7, a, b, e, u, y, z, i, o, 8, 8]

function countAllType(arr) {
    let vowels = [];
    let consonants = [];
    let evenNumber = [];
    let oddNumber = [];
    let prime = [];

    
    for (let index = 0; index < arr.length; index++) {
        let ch = arr[index];
        if (ch === 'a' || ch === "e" || ch === "i" || ch === "o" || ch === "u") {
            vowels.push(ch)
        } else if (typeof (ch) === 'string') {
            consonants.push(ch);
    }
}
    function isPrime(item) {
        for (let i = 0; i < item.length; i++) {
            let flag = 0;
            for (let index = 2; index < item[i]; index++) {
                if ((item[index] % index) === 0) {
                    flag = 1;
                    break;
                }
            }
            if (item[i] > 1 && flag == 0) {
                prime.push(item[i]);
            }
        }
    }

    isPrime(arr)
    for (let index = 0; index < arr.length; index++) {
        if (arr[index] % 2 === 0) {
            evenNumber.push(arr[index])
        } else if (typeof (arr[index]) === "number") {
            oddNumber.push(arr[index]);
        }
    }
    console.log('even Number:- ', evenNumber);
    console.log('odd Number:- ', oddNumber);
    console.log('Prime Number:- ', prime);
    console.log('Vowels Charecter:-', vowels);
    console.log('consonants Charecter:- ', consonants);
}
let arr = [2, 6, 8, 3, 5, 7, 'a', 'b', 'e', 'u', 'y', 'z', 'i', 'o', 8, 8];
countAllType(arr)