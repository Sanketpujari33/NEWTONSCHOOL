console.log("This is tutorial 4");
// Regular Expressions:
// Basic functions
// Metacharacter Symbols

// const regex = /^h/i;

// Character Sets - We use []
let regex = /S[a-z]nket/; // can be any character from a to z
regex = /S[atyn]nket/; // can be an a, t or y
regex = /S[^gvh]nket/; // cannot be any of a, t or y
regex = /S[^mlbj]nk[t]/; // cannot be any of a, t or y + can be a u or y
regex = /S[a-zA-Z]nk[tu0-9][0-9]/; // we can have as many character sets as we want

// Quantifiers - We use {}
regex = /sank{2}t/; // r can occur exactly 2 times
regex = /har{0,2}y/; // r can occur exactly 0 to 2 (0 or 1 or 2) times

// Groupings  - We use paranthesis for groupings ()
regex = /(San){2}([0-9]t){3}/;

// const str = "Sanket9 bhau";
// str = "Sankeet Bhau";
str = "Sanket1t4t5t bhau";

let result = regex.exec(str);
console.log("The result from exec is ", result);

if (regex.test(str)) {
  console.log(`The string ${str} matches the expression ${regex.source}`);
} else {
  console.log(
    `The string ${str} does not match the expression ${regex.source}`
  );
}
