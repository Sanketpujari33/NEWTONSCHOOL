function indexMethods() {
    var str = "hello world"
    console.log("Length :-", str.length);
    console.log("IndexOf :-", str.indexOf("world"));
    str = "hellw world hello javaScript hello";
    console.log("lastIndexOf:-", str.lastIndexOf("hello"));
    console.log("lastIndexOf:-", str.lastIndexOf("l"));
}
// indexMethods();

/*
Length :- 11
IndexOf :- 6
lastIndexOf:- 29
lastIndexOf:- 32
*/
function subStringAndSubstr() {
    var str = "my favorite contry in India";
    //first param -> starting index, second-> end index
    console.log("str.substring(3, 11) -> ", str.substring(3, 11));

    //first param -> start index, second -> length
    console.log("str.substr(3, 11) -> ", str.substr(3, 11));
}
// subStringAndSubstr();
/*
str.substring(3, 11) ->  favorite
VM67:7 str.substr(3, 11) ->  favorite co
*/

function replaceMethod() {
    var str =
        "my faverite city is Ahmednager and bangalore is a nice place to hang out!";
    var out = str.replace(/bangalore/g, 'pune');
    console.log("str.replace(/bangalore/g,'pune')", out);
}
// replaceMethod();
/*str.replace(/bangalore/g,'pune') my faverite city is Ahmednager and pune is a nice place to hang out!*/

function sliceMethod() {
    var str = "my favorite contry is INDIA";
    console.log("str.slice(12,19) :- ", str.slice(12, 19));
}

sliceMethod();