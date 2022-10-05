function arrayExample() {
    var student = [
        "Anurag",
        "Nimish",
        "Naman",
        "Rohit",
        "Rajesh",
        "Akash",
        "Arshad",
        "Ram",
        "Ravan",
        "Lakshimn",
    ];
    console.log(student);
    console.log(student[5]);
    console.log(typeof student);
    printArrayContents(student);
}
// arrayExample();

function printArrayContents(arr) {
    console.log("Array with size:- ", arr.length, "add Elements are", arr);
}

function pushAndPopFromEnd() {
    var students = ["Anurag", "Nimish", "Naman", "hamsa"];
    students.push("deepak");
    students.push("keshav");
    printArrayContents(students);


    students.pop();
    students.pop();
    console.log("************** After deletion - From End *********************");
    printArrayContents(students);
}
// pushAndPopFromEnd();

function unshiftAndShiftElementFromBeginning() {
    var students = ["Anurag", "Nimish", "Naman", "hamsa"];
    students.unshift("Gokul");
    students.unshift("Thilak");
    printArrayContents(students);

    console.log(
        "************** After deletion - From beginning *********************"
    );
    students.shift();
    students.shift();
    printArrayContents(students);
}
// unshiftAndShiftElementFromBeginning();

function arrJoin() {
    var students = ["Anurag", "Nimish", "Naman", "Hamsa"];
    console.log(students.join("~~~"));
}

// arrJoin();

function deleteMethod() {
    var students = ["Anurag", "Nimish", "Naman", "Hamsa"];
    delete students[0];
    console.log(
        "************** After deletion - using delete students[2] *********************"
    );
    printArrayContents(students);
}
// deleteMethod();

function margeArrays() {
    var arr1 = ["Bangalore", "Mysore"];
    var arr2 = ["Chennai", "Mumbai"];
    var city = arr1.concat(arr2);
    console.log("margeTwoArray-> ", city);

}
// margeArrays();

function spliceExamples() {
    var cities = [
        "Bangalore",
        "Mysore",
        "Chennai",
        "Mumbai",
        "Kolkota",
        "Hyderabad",
        "Delhi",
    ];
    printArrayContents(cities);

    // Params ->
    //     1 -> pos where new elements are added
    //     2 -> how many elements needs to be removed
    //     3 and ... -> new elements to be added

    //Both Removal and addition
    cities.splice(3, 3, "kerala", "Gujarat");
    console.log("After splice(3, 3, 'Kerala', 'Gujurat'):- ", cities);

    //Only Removal case
    cities.splice(3, 2);
    console.log("After splice(3, 2) :- ", cities);

    //only addition case
    cities.splice(0, 0, "Lucknow", "Madhya Pradesh");
    console.log("After splice(0,0, 'Luk', 'MP') :- ", cities);
}
// spliceExamples();

function sliceMethods() {
    var cities = [
        "Bangalore",
        "Mysore",
        "Chennai",
        "Mumbai",
        "Kolkota",
        "Hyderabad",
        "Delhi",
    ];
    console.log("cities.slice(0, 3) :- ", cities.slice(0, 3));
}

// sliceMethods();