// You have to create a variable which is a link you are interested in.
// you have to fetch all the links from a given page contains this text


let str = 'Java';
let link = document.links;
console.logO(link);
let href;
Array.from(link).forEach((element) => {
    href = element.href;
    if (href.includes(str)) {
        console.log(href);
    }
});