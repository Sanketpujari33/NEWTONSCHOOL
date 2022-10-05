function objectEx() {
    var person = {
        firstName: "John",
        lastName: "Doe",
        age: 26,
        getFullName: function() {
            return this.firstName + " " + this.lastName;
        },
        address: {
            bulding: "Villa Apartments",
            road: "Rue La Roi",
            city: "Paris",
        },
    };
    console.log("person -> ", person);
    console.log("person.firstName -> ", person.firstName);
    console.log("person['lastName']-> ", person["lastName"]);

    for (var prop in person) {
        console.log("Key:- ", prop, "  ::: Value:-", person[prop]);
    }
}
objectEx();